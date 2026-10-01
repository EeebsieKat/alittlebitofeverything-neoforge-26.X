package net.eeebsiekat.bitsofeverything.item.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;

public class DatapadItem extends Item {
    public DatapadItem(Properties properties) {
        super(properties);
    }

    @Override
    public InteractionResult useOn(UseOnContext context) {
        Level level = context.getLevel();
        BlockPos positionClicked = context.getClickedPos();
        Player player = context.getPlayer();

        if(!level.isClientSide()) {
            BlockState blockState = level.getBlockState(positionClicked);

            outputBlockCoordinates(positionClicked, player, blockState.getBlock());
        }

        return InteractionResult.SUCCESS;
    }

    private void outputBlockCoordinates(BlockPos position, Player player, Block block) {
        player.sendSystemMessage(Component.literal("Found ")
                .append(block.getName())
                .append(Component.literal(" at [" + position.getX() + ", " + position.getY() + ", " + position.getZ() + "]")));
    }
}
