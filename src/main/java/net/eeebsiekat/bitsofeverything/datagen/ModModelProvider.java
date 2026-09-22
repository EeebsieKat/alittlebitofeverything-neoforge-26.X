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
        itemModels.generateFlatItem(ModItems.LONSDALEITE.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.LONSDALEITE_FRAGMENT.get(), ModelTemplates.FLAT_ITEM);

        //Blocks
        blockModels.createTrivialCube(ModBlocks.LONSDALEITE_CUBE.get());
        blockModels.createTrivialCube(ModBlocks.LONSDALEITE_FRAGMENT_CUBE.get());
        blockModels.createTrivialCube(ModBlocks.METEORITE_STONE.get());
        blockModels.createTrivialCube(ModBlocks.OLIVINE.get());
        blockModels.createTrivialCube(ModBlocks.PIGEONITE.get());
    }
}
