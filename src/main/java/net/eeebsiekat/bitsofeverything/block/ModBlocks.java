package net.eeebsiekat.bitsofeverything.block;

import net.eeebsiekat.bitsofeverything.ALittleBitofEverything;
import net.eeebsiekat.bitsofeverything.block.custom.FoodPrinterBlock;
import net.eeebsiekat.bitsofeverything.item.ModItems;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.component.TooltipDisplay;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Consumer;
import java.util.function.Function;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(ALittleBitofEverything.MOD_ID);

    public static final DeferredBlock<Block> ROSE_SPAR_BLOCK = registerBlock("rose_spar_block",
            properties -> new Block(properties.strength(3f)
                    .requiresCorrectToolForDrops().sound(SoundType.AMETHYST)));
    public static final DeferredBlock<Block> ROSE_SPAR_SHARD_BLOCK = registerBlock("rose_spar_shard_block",
            properties -> new Block(properties.strength(2f)
                    .requiresCorrectToolForDrops().sound(SoundType.AMETHYST)));

    public static final DeferredBlock<Block> TEAL_SPAR_BLOCK = registerBlock("teal_spar_block",
            properties -> new Block(properties.strength(3f)
                    .requiresCorrectToolForDrops().sound(SoundType.AMETHYST)));
    public static final DeferredBlock<Block> TEAL_SPAR_SHARD_BLOCK = registerBlock("teal_spar_shard_block",
            properties -> new Block(properties.strength(2f)
                    .requiresCorrectToolForDrops().sound(SoundType.AMETHYST)));

    public static final DeferredBlock<Block> FROMAGE_SPAR_BLOCK = registerBlock("fromage_spar_block",
            properties -> new Block(properties.strength(3f)
                    .requiresCorrectToolForDrops().sound(SoundType.AMETHYST)));
    public static final DeferredBlock<Block> FROMAGE_SPAR_SHARD_BLOCK = registerBlock("fromage_spar_shard_block",
            properties -> new Block(properties.strength(2f)
                    .requiresCorrectToolForDrops().sound(SoundType.AMETHYST)));

    public static final DeferredBlock<Block> CARBON_BLOCK = registerBlock("carbon_block",
            properties -> new Block(properties.strength(3f)
                    .requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final DeferredBlock<Block> CARBON_BRECCIA_ORE = registerBlock("carbon_breccia_ore",
            properties -> new Block(properties.strength(3f)
                    .requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)));
    public static final DeferredBlock<Block> CARBON_SINTERED_BRECCIA_ORE = registerBlock("carbon_sintered_breccia_ore",
            properties -> new Block(properties.strength(5f)
                    .requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)));

    public static final DeferredBlock<Block> SINTERED_BRECCIA = registerBlock("sintered_breccia",
            properties -> new Block(properties.strength(5f)
                    .requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)));
    public static final DeferredBlock<Block> BRECCIA = registerBlock("breccia",
            properties -> new Block(properties.strength(3f)
                    .requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)));
    public static final DeferredBlock<Block> ROSE_SPAR_STONE = registerBlock("rose_spar_stone",
            properties -> new Block(properties.strength(3f)
                    .requiresCorrectToolForDrops().sound(SoundType.AMETHYST)));
    public static final DeferredBlock<Block> CHROMITE_BRECCIA_ORE = registerBlock("chromite_breccia_ore",
            properties -> new Block(properties.strength(3f)
                    .requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)));
    public static final DeferredBlock<Block> CHROMITE_SINTERED_BRECCIA_ORE = registerBlock("chromite_sintered_breccia_ore",
            properties -> new Block(properties.strength(5f)
                    .requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)));
    public static final DeferredBlock<Block> CHROMITE_ROSE_SPAR_ORE = registerBlock("chromite_rose_spar_ore",
            properties -> new Block(properties.strength(5f)
                    .requiresCorrectToolForDrops().sound(SoundType.AMETHYST)));

    public static final DeferredBlock<Block> POLISHED_SINTERED_BRECCIA = registerBlock("polished_sintered_breccia",
            properties -> new Block(properties.strength(5f)
                    .requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)));
    public static final DeferredBlock<Block> POLISHED_BRECCIA = registerBlock("polished_breccia",
            properties -> new Block(properties.strength(3f)
                    .requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)));

    public static final DeferredBlock<Block> OLIVINE_ROSE_SPAR_ORE = registerBlock("olivine_rose_spar_ore",
            properties -> new Block(properties.strength(3f)
                    .requiresCorrectToolForDrops().sound(SoundType.AMETHYST)));
    public static final DeferredBlock<Block> PIGEONITE_ROSE_SPAR_ORE = registerBlock("pigeonite_rose_spar_ore",
            properties -> new Block(properties.strength(3f)
                    .requiresCorrectToolForDrops().sound(SoundType.AMETHYST)));

    public static final DeferredBlock<Block> FOOD_PRINTER = registerBlock("food_printer",
            properties -> new FoodPrinterBlock(properties.strength(3f)
                    .requiresCorrectToolForDrops().sound(SoundType.IRON)), Component.translatable("tooltip.alittlebitofeverything.food_printer.tooltip"));

    public static final DeferredBlock<Block> SINTERED_BRECCIA_STAIRS = registerBlock("sintered_breccia_stairs",
            properties -> new StairBlock(ModBlocks.SINTERED_BRECCIA.get().defaultBlockState(), properties.strength(3f)
                    .requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)));
    public static final DeferredBlock<Block> SINTERED_BRECCIA_SLAB = registerBlock("sintered_breccia_slab",
            properties -> new SlabBlock(properties.strength(3f)
                    .requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)));

    public static final DeferredBlock<Block> BRECCIA_STAIRS = registerBlock("breccia_stairs",
            properties -> new StairBlock(ModBlocks.BRECCIA.get().defaultBlockState(), properties.strength(3f)
                    .requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)));
    public static final DeferredBlock<Block> BRECCIA_SLAB = registerBlock("breccia_slab",
            properties -> new SlabBlock(properties.strength(3f)
                    .requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)));


    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Function<BlockBehaviour.Properties, T> function, Component... components) {
        DeferredBlock<T> toReturn = BLOCKS.registerBlock(name, function);
        registerBlockItem(name, toReturn, components);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block, Component... components) {
        ModItems.ITEMS.registerItem(name, properties -> new BlockItem(block.get(), properties.useBlockDescriptionPrefix()) {
            @Override
            public void appendHoverText(ItemStack itemStack, TooltipContext context, TooltipDisplay display, Consumer<Component> builder, TooltipFlag tooltipFlag) {
                for(var component : components) {
                    builder.accept(component);
                }
                super.appendHoverText(itemStack, context, display, builder, tooltipFlag);
            }
        });
    }

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
