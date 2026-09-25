package net.eeebsiekat.bitsofeverything.datagen;

import net.eeebsiekat.bitsofeverything.ALittleBitofEverything;
import net.eeebsiekat.bitsofeverything.block.ModBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.neoforged.fml.common.Mod;
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
                .add(ModBlocks.LONSDALEITE_CUBE.get())
                .add(ModBlocks.LONSDALEITE_FRAGMENT_CUBE.get())
                .add(ModBlocks.METEORITE_STONE.get())
                .add(ModBlocks.METEORITE_STRATA.get())
                .add(ModBlocks.OLIVINE.get())
                .add(ModBlocks.PIGEONITE.get());

        tag(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.METEORITE_STONE.get())
                .add(ModBlocks.OLIVINE.get())
                .add(ModBlocks.PIGEONITE.get());
        tag(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.LONSDALEITE_CUBE.get())
                .add(ModBlocks.LONSDALEITE_FRAGMENT_CUBE.get());
        tag(Tags.Blocks.NEEDS_NETHERITE_TOOL)
                .add(ModBlocks.METEORITE_STRATA.get());
    }
}
