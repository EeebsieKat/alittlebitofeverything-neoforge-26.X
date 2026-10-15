package net.eeebsiekat.bitsofeverything.datagen;

import net.eeebsiekat.bitsofeverything.ALittleBitofEverything;
import net.eeebsiekat.bitsofeverything.block.ModBlocks;
import net.eeebsiekat.bitsofeverything.tags.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.neoforged.neoforge.common.Tags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagsProvider extends BlockTagsProvider {
    public ModBlockTagsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(output, lookupProvider, ALittleBitofEverything.MOD_ID);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.getRK(ModBlocks.ROSE_SPAR_BLOCK.get()))
                .add(ModBlocks.getRK(ModBlocks.ROSE_SPAR_SHARD_BLOCK.get()))
                .add(ModBlocks.getRK(ModBlocks.TEAL_SPAR_BLOCK.get()))
                .add(ModBlocks.getRK(ModBlocks.TEAL_SPAR_SHARD_BLOCK.get()))
                .add(ModBlocks.getRK(ModBlocks.FROMAGE_SPAR_BLOCK.get()))
                .add(ModBlocks.getRK(ModBlocks.FROMAGE_SPAR_SHARD_BLOCK.get()))
                .add(ModBlocks.getRK(ModBlocks.CARBON_BLOCK.get()))
                .add(ModBlocks.getRK(ModBlocks.CARBON_BRECCIA_ORE.get()))
                .add(ModBlocks.getRK(ModBlocks.CARBON_SINTERED_BRECCIA_ORE.get()))
                .add(ModBlocks.getRK(ModBlocks.ROSE_SPAR_STONE.get()))
                .add(ModBlocks.getRK(ModBlocks.SINTERED_BRECCIA.get()))
                .add(ModBlocks.getRK(ModBlocks.BRECCIA.get()))
                .add(ModBlocks.getRK(ModBlocks.POLISHED_SINTERED_BRECCIA.get()))
                .add(ModBlocks.getRK(ModBlocks.POLISHED_BRECCIA.get()))
                .add(ModBlocks.getRK(ModBlocks.BRECCIA_STAIRS.get()))
                .add(ModBlocks.getRK(ModBlocks.BRECCIA_SLAB.get()))
                .add(ModBlocks.getRK(ModBlocks.SINTERED_BRECCIA_STAIRS.get()))
                .add(ModBlocks.getRK(ModBlocks.SINTERED_BRECCIA_SLAB.get()))
                .add(ModBlocks.getRK(ModBlocks.CHROMITE_BRECCIA_ORE.get()))
                .add(ModBlocks.getRK(ModBlocks.CHROMITE_SINTERED_BRECCIA_ORE.get()))
                .add(ModBlocks.getRK(ModBlocks.CHROMITE_ROSE_SPAR_ORE.get()))
                .add(ModBlocks.getRK(ModBlocks.OLIVINE_ROSE_SPAR_ORE.get()))
                .add(ModBlocks.getRK(ModBlocks.PIGEONITE_ROSE_SPAR_ORE.get()))
                .add(ModBlocks.getRK(ModBlocks.FOOD_PRINTER.get()))
                .add(ModBlocks.getRK(ModBlocks.CHROMITE_LAMP.get()))
                .add(ModBlocks.getRK(ModBlocks.BRASS_FLOWER.get()));

        tag(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.getRK(ModBlocks.OLIVINE_ROSE_SPAR_ORE.get()))
                .add(ModBlocks.getRK(ModBlocks.PIGEONITE_ROSE_SPAR_ORE.get()))
                .add(ModBlocks.getRK(ModBlocks.CHROMITE_ROSE_SPAR_ORE.get()))
                .add(ModBlocks.getRK(ModBlocks.ROSE_SPAR_STONE.get()))
                .add(ModBlocks.getRK(ModBlocks.BRECCIA.get()))
                .add(ModBlocks.getRK(ModBlocks.BRECCIA_STAIRS.get()))
                .add(ModBlocks.getRK(ModBlocks.BRECCIA_SLAB.get()))
                .add(ModBlocks.getRK(ModBlocks.CARBON_BRECCIA_ORE.get()))
                .add(ModBlocks.getRK(ModBlocks.CARBON_BLOCK.get()))
                .add(ModBlocks.getRK(ModBlocks.CHROMITE_BRECCIA_ORE.get()));
        tag(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.getRK(ModBlocks.SINTERED_BRECCIA.get()))
                .add(ModBlocks.getRK(ModBlocks.SINTERED_BRECCIA_STAIRS.get()))
                .add(ModBlocks.getRK(ModBlocks.SINTERED_BRECCIA_SLAB.get()))
                .add(ModBlocks.getRK(ModBlocks.CARBON_SINTERED_BRECCIA_ORE.get()))
                .add(ModBlocks.getRK(ModBlocks.CHROMITE_SINTERED_BRECCIA_ORE.get()))
                .add(ModBlocks.getRK(ModBlocks.ROSE_SPAR_BLOCK.get()))
                .add(ModBlocks.getRK(ModBlocks.ROSE_SPAR_SHARD_BLOCK.get()))
                .add(ModBlocks.getRK(ModBlocks.TEAL_SPAR_BLOCK.get()))
                .add(ModBlocks.getRK(ModBlocks.TEAL_SPAR_SHARD_BLOCK.get()))
                .add(ModBlocks.getRK(ModBlocks.FROMAGE_SPAR_BLOCK.get()))
                .add(ModBlocks.getRK(ModBlocks.FROMAGE_SPAR_SHARD_BLOCK.get()))
                .add(ModBlocks.getRK(ModBlocks.CHROMITE_LAMP.get()))
                .add(ModBlocks.getRK(ModBlocks.BRASS_FLOWER.get()));
        tag(Tags.Blocks.NEEDS_NETHERITE_TOOL);

        tag(ModTags.Blocks.NEEDS_CHROMITE_TOOL)
                .add(ModBlocks.getRK(ModBlocks.FOOD_PRINTER.get()))
                .addTag(BlockTags.NEEDS_DIAMOND_TOOL);
        tag(ModTags.Blocks.INCORRECT_FOR_CHROMITE_TOOL)
                .addTag(BlockTags.INCORRECT_FOR_DIAMOND_TOOL)
                .addTag(Tags.Blocks.NEEDS_NETHERITE_TOOL)
                .remove(ModTags.Blocks.NEEDS_CHROMITE_TOOL);

        tag(ModTags.Blocks.METAL_DETECTABLES)
                .addTag(Tags.Blocks.ORES)
                .add(ModBlocks.getRK(ModBlocks.OLIVINE_ROSE_SPAR_ORE.get()))
                .add(ModBlocks.getRK(ModBlocks.PIGEONITE_ROSE_SPAR_ORE.get()))
                .add(ModBlocks.getRK(ModBlocks.CHROMITE_BRECCIA_ORE.get()))
                .add(ModBlocks.getRK(ModBlocks.CHROMITE_SINTERED_BRECCIA_ORE.get()))
                .add(ModBlocks.getRK(ModBlocks.CHROMITE_ROSE_SPAR_ORE.get()));

        tag(BlockTags.STAIRS)
                .add(ModBlocks.getRK(ModBlocks.BRECCIA_STAIRS.get()))
                .add(ModBlocks.getRK(ModBlocks.SINTERED_BRECCIA_STAIRS.get()));
        tag(BlockTags.SLABS)
                .add(ModBlocks.getRK(ModBlocks.BRECCIA_SLAB.get()))
                .add(ModBlocks.getRK(ModBlocks.SINTERED_BRECCIA_SLAB.get()));
        tag(BlockTags.PRESSURE_PLATES)
                .add(ModBlocks.getRK(ModBlocks.BRECCIA_PRESSURE_PLATE.get()));
        tag(BlockTags.BUTTONS)
                .add(ModBlocks.getRK(ModBlocks.BRECCIA_BUTTON.get()));
        tag(BlockTags.FENCES)
                .add(ModBlocks.getRK(ModBlocks.BRECCIA_FENCE.get()));
        tag(BlockTags.FENCE_GATES)
                .add(ModBlocks.getRK(ModBlocks.BRECCIA_FENCE_GATE.get()));
        tag(BlockTags.WALLS)
                .add(ModBlocks.getRK(ModBlocks.BRECCIA_WALL.get()));
        tag(BlockTags.DOORS)
                .add(ModBlocks.getRK(ModBlocks.BRECCIA_DOR.get()));
        tag(BlockTags.TRAPDOORS)
                .add(ModBlocks.getRK(ModBlocks.BRECCIA_TRAPDOR.get()));

        tag(BlockTags.CROPS)
                .add(ModBlocks.getRK(ModBlocks.CUCUMBER_CROP.get()));
    }
}
