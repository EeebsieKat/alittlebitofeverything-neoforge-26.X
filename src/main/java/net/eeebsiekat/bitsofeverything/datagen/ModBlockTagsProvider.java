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
                .add(ModBlocks.ROSE_SPAR_BLOCK.get())
                .add(ModBlocks.ROSE_SPAR_SHARD_BLOCK.get())
                .add(ModBlocks.TEAL_SPAR_BLOCK.get())
                .add(ModBlocks.TEAL_SPAR_SHARD_BLOCK.get())
                .add(ModBlocks.FROMAGE_SPAR_BLOCK.get())
                .add(ModBlocks.FROMAGE_SPAR_SHARD_BLOCK.get())
                .add(ModBlocks.CARBON_BLOCK.get())
                .add(ModBlocks.CARBON_BRECCIA_ORE.get())
                .add(ModBlocks.CARBON_SINTERED_BRECCIA_ORE.get())
                .add(ModBlocks.ROSE_SPAR_STONE.get())
                .add(ModBlocks.SINTERED_BRECCIA.get())
                .add(ModBlocks.BRECCIA.get())
                .add(ModBlocks.POLISHED_SINTERED_BRECCIA.get())
                .add(ModBlocks.POLISHED_BRECCIA.get())
                .add(ModBlocks.BRECCIA_STAIRS.get())
                .add(ModBlocks.BRECCIA_SLAB.get())
                .add(ModBlocks.SINTERED_BRECCIA_STAIRS.get())
                .add(ModBlocks.SINTERED_BRECCIA_SLAB.get())
                .add(ModBlocks.CHROMITE_BRECCIA_ORE.get())
                .add(ModBlocks.CHROMITE_SINTERED_BRECCIA_ORE.get())
                .add(ModBlocks.CHROMITE_ROSE_SPAR_ORE.get())
                .add(ModBlocks.OLIVINE_ROSE_SPAR_ORE.get())
                .add(ModBlocks.PIGEONITE_ROSE_SPAR_ORE.get())
                .add(ModBlocks.FOOD_PRINTER.get());

        tag(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.OLIVINE_ROSE_SPAR_ORE.get())
                .add(ModBlocks.PIGEONITE_ROSE_SPAR_ORE.get())
                .add(ModBlocks.CHROMITE_ROSE_SPAR_ORE.get())
                .add(ModBlocks.ROSE_SPAR_STONE.get())
                .add(ModBlocks.BRECCIA.get())
                .add(ModBlocks.BRECCIA_STAIRS.get())
                .add(ModBlocks.BRECCIA_SLAB.get())
                .add(ModBlocks.CARBON_BRECCIA_ORE.get())
                .add(ModBlocks.CARBON_BLOCK.get())
                .add(ModBlocks.CHROMITE_BRECCIA_ORE.get());
        tag(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.SINTERED_BRECCIA.get())
                .add(ModBlocks.SINTERED_BRECCIA_STAIRS.get())
                .add(ModBlocks.SINTERED_BRECCIA_SLAB.get())
                .add(ModBlocks.CARBON_SINTERED_BRECCIA_ORE.get())
                .add(ModBlocks.CHROMITE_SINTERED_BRECCIA_ORE.get())
                .add(ModBlocks.ROSE_SPAR_BLOCK.get())
                .add(ModBlocks.ROSE_SPAR_SHARD_BLOCK.get())
                .add(ModBlocks.TEAL_SPAR_BLOCK.get())
                .add(ModBlocks.TEAL_SPAR_SHARD_BLOCK.get())
                .add(ModBlocks.FROMAGE_SPAR_BLOCK.get())
                .add(ModBlocks.FROMAGE_SPAR_SHARD_BLOCK.get());
        tag(Tags.Blocks.NEEDS_NETHERITE_TOOL);

        tag(ModTags.Blocks.METAL_DETECTABLES)
                .addTag(Tags.Blocks.ORES)
                .add(ModBlocks.OLIVINE_ROSE_SPAR_ORE.get())
                .add(ModBlocks.PIGEONITE_ROSE_SPAR_ORE.get())
                .add(ModBlocks.CHROMITE_BRECCIA_ORE.get())
                .add(ModBlocks.CHROMITE_SINTERED_BRECCIA_ORE.get())
                .add(ModBlocks.CHROMITE_ROSE_SPAR_ORE.get());

    }
}
