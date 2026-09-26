package net.eeebsiekat.bitsofeverything.datagen;

import net.eeebsiekat.bitsofeverything.ALittleBitofEverything;
import net.eeebsiekat.bitsofeverything.block.ModBlocks;
import net.eeebsiekat.bitsofeverything.item.ModItems;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.ModelProvider;
import net.minecraft.client.data.models.model.ModelTemplates;
import net.minecraft.data.PackOutput;

public class ModModelProvider extends ModelProvider {

    public ModModelProvider(PackOutput output) {
        super(output, ALittleBitofEverything.MOD_ID);
    }

    @Override
    protected void registerModels(BlockModelGenerators blockModels, ItemModelGenerators itemModels) {
        itemModels.generateFlatItem(ModItems.ROSE_SPAR.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.ROSE_SPAR_SHARD.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.RAW_OLIVINE.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.OLIVINE.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.RAW_PIGEONITE.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.PIGEONITE.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.METAL_DETECTOR.get(), ModelTemplates.FLAT_ITEM);

        //Blocks
        blockModels.createTrivialCube(ModBlocks.ROSE_SPAR_BLOCK.get());
        blockModels.createTrivialCube(ModBlocks.ROSE_SPAR_SHARD_BLOCK.get());
        blockModels.createTrivialCube(ModBlocks.SINTERED_BRECCIA.get());
        blockModels.createTrivialCube(ModBlocks.ROSE_SPAR_STONE.get());
        blockModels.createTrivialCube(ModBlocks.CHRONDITE_STRATA.get());
        blockModels.createTrivialCube(ModBlocks.OLIVINE.get());
        blockModels.createTrivialCube(ModBlocks.PIGEONITE.get());
    }
}
