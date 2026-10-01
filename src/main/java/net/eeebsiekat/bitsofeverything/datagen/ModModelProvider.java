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
        itemModels.generateFlatItem(ModItems.TEAL_SPAR.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.TEAL_SPAR_SHARD.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.FROMAGE_SPAR.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.FROMAGE_SPAR_SHARD.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.CHROMITE.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.CHROMITE_SHARD.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.RAW_OLIVINE.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.OLIVINE.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.RAW_PIGEONITE.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.PIGEONITE.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.METAL_DETECTOR.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.DATAPAD.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.FROMAGE.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.SINTERED_FROMAGE.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.SUSPICIOUS_FROMAGE.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.CARBON.get(), ModelTemplates.FLAT_ITEM);

        //Blocks
        blockModels.createTrivialCube(ModBlocks.ROSE_SPAR_BLOCK.get());
        blockModels.createTrivialCube(ModBlocks.ROSE_SPAR_SHARD_BLOCK.get());
        blockModels.createTrivialCube(ModBlocks.TEAL_SPAR_BLOCK.get());
        blockModels.createTrivialCube(ModBlocks.TEAL_SPAR_SHARD_BLOCK.get());
        blockModels.createTrivialCube(ModBlocks.FROMAGE_SPAR_BLOCK.get());
        blockModels.createTrivialCube(ModBlocks.FROMAGE_SPAR_SHARD_BLOCK.get());
        blockModels.createTrivialCube(ModBlocks.CARBON_BLOCK.get());
        blockModels.createTrivialCube(ModBlocks.CARBON_BRECCIA_ORE.get());
        blockModels.createTrivialCube(ModBlocks.CARBON_SINTERED_BRECCIA_ORE.get());
        // blockModels.createTrivialCube(ModBlocks.SINTERED_BRECCIA.get());
        // blockModels.createTrivialCube(ModBlocks.BRECCIA.get());
        blockModels.createTrivialCube(ModBlocks.POLISHED_SINTERED_BRECCIA.get());
        blockModels.createTrivialCube(ModBlocks.POLISHED_BRECCIA.get());
        blockModels.createTrivialCube(ModBlocks.ROSE_SPAR_STONE.get());
        blockModels.createTrivialCube(ModBlocks.CHROMITE_BRECCIA_ORE.get());
        blockModels.createTrivialCube(ModBlocks.CHROMITE_SINTERED_BRECCIA_ORE.get());
        blockModels.createTrivialCube(ModBlocks.CHROMITE_ROSE_SPAR_ORE.get());
        blockModels.createTrivialCube(ModBlocks.OLIVINE_ROSE_SPAR_ORE.get());
        blockModels.createTrivialCube(ModBlocks.PIGEONITE_ROSE_SPAR_ORE.get());
        blockModels.createTrivialCube(ModBlocks.FOOD_PRINTER.get());

        blockModels.family(ModBlocks.BRECCIA.get())
                .stairs(ModBlocks.BRECCIA_STAIRS.get())
                .slab(ModBlocks.BRECCIA_SLAB.get());

        blockModels.family(ModBlocks.SINTERED_BRECCIA.get())
                .stairs(ModBlocks.SINTERED_BRECCIA_STAIRS.get())
                .slab(ModBlocks.SINTERED_BRECCIA_SLAB.get());
    }
}
