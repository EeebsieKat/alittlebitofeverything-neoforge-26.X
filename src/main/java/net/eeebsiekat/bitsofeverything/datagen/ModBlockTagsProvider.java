package net.eeebsiekat.bitsofeverything.datagen;

import net.eeebsiekat.bitsofeverything.ALittleBitofEverything;
import net.eeebsiekat.bitsofeverything.block.ModBlocks;
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
                .add(ModBlocks.SINTERED_BRECCIA.get())
                .add(ModBlocks.CHRONDITE_STRATA.get())
                .add(ModBlocks.OLIVINE.get())
                .add(ModBlocks.PIGEONITE.get());

        tag(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.SINTERED_BRECCIA.get())
                .add(ModBlocks.OLIVINE.get())
                .add(ModBlocks.PIGEONITE.get());
        tag(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.ROSE_SPAR_BLOCK.get())
                .add(ModBlocks.ROSE_SPAR_SHARD_BLOCK.get());
        tag(Tags.Blocks.NEEDS_NETHERITE_TOOL)
                .add(ModBlocks.CHRONDITE_STRATA.get());
    }
}
