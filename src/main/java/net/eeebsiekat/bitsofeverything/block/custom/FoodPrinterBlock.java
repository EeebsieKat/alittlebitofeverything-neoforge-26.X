package net.eeebsiekat.bitsofeverything.block.custom;

import net.eeebsiekat.bitsofeverything.item.ModItems;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Holder;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.tags.TagKey;
import net.minecraft.util.RandomSource;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;
import net.neoforged.neoforge.common.Tags;

public class FoodPrinterBlock extends Block {
    public FoodPrinterBlock(Properties properties) {
        super(properties);
    }

    @Override
    public void stepOn(Level level, BlockPos pos, BlockState onState, Entity entity) {

        if(entity instanceof ItemEntity itemEntity) {
            if(isValidItem(itemEntity.getItem())) {
                itemEntity.setItem(new ItemStack(getRandomItemFromTag(Tags.Items.FOODS), itemEntity.getItem().getCount()));
            }
        }

        super.stepOn(level, pos, onState, entity);
    }

    private boolean isValidItem(ItemStack item) {
        return item.is(ModItems.CARBON);
    }

    private Item getRandomItemFromTag(TagKey<Item> key) {
        return BuiltInRegistries.ITEM.getRandomElementOf(key, RandomSource.create()).map(Holder::value).orElse(Items.AIR);
    }
}
