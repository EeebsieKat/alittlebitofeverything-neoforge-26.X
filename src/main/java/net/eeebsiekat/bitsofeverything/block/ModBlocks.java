package net.eeebsiekat.bitsofeverything.block;

import net.eeebsiekat.bitsofeverything.ALittleBitofEverything;
import net.eeebsiekat.bitsofeverything.item.ModItems;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Function;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(ALittleBitofEverything.MOD_ID);

    public static final DeferredBlock<Block> LONSDALEITE_CUBE = registerBlock("lonsdaleite_cube",
            properties -> new Block(properties.strength(4f)
                    .requiresCorrectToolForDrops().sound(SoundType.IRON)));
    public static final DeferredBlock<Block> LONSDALEITE_FRAGMENT_CUBE = registerBlock("lonsdaleite_fragment_cube",
            properties -> new Block(properties.strength(2f)
                    .requiresCorrectToolForDrops().sound(SoundType.IRON)));

    public static final DeferredBlock<Block> METEORITE_STONE = registerBlock("meteorite_stone",
            properties -> new DropExperienceBlock(UniformInt.of(3, 7), properties.strength(3f)
                    .requiresCorrectToolForDrops().sound(SoundType.STONE)));
        public static final DeferredBlock<Block> METEORITE_STRATA = registerBlock("meteorite_strata",
            properties -> new DropExperienceBlock(UniformInt.of(5, 11), properties.strength(4f)
                    .requiresCorrectToolForDrops().sound(SoundType.STONE)));

    public static final DeferredBlock<Block> OLIVINE = registerBlock("olivine_block",
            properties -> new Block(properties.strength(3f)
                    .requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final DeferredBlock<Block> PIGEONITE = registerBlock("pigeonite_block",
            properties -> new Block(properties.strength(3f)
                    .requiresCorrectToolForDrops().sound(SoundType.STONE)));


    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Function<BlockBehaviour.Properties, T> function) {
        DeferredBlock<T> toReturn = BLOCKS.registerBlock(name, function);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        ModItems.ITEMS.registerItem(name, properties -> new BlockItem(block.get(), properties.useBlockDescriptionPrefix()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
