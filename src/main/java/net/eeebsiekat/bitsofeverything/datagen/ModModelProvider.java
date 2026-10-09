package net.eeebsiekat.bitsofeverything.datagen;

import net.eeebsiekat.bitsofeverything.ALittleBitofEverything;
import net.eeebsiekat.bitsofeverything.block.ModBlocks;
import net.eeebsiekat.bitsofeverything.block.custom.ChromiteLampBlock;
import net.eeebsiekat.bitsofeverything.item.ModArmorMaterials;
import net.eeebsiekat.bitsofeverything.item.ModItems;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.ModelProvider;
import net.minecraft.client.data.models.blockstates.MultiVariantGenerator;
import net.minecraft.client.data.models.model.*;
import net.minecraft.client.renderer.item.ClientItem;
import net.minecraft.client.renderer.item.ItemModel;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.Item;

import java.util.Optional;

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
        itemModels.generateFlatItem(ModItems.CHROMITE_BAR.get(), ModelTemplates.FLAT_ITEM);

        itemModels.generateFlatItem(ModItems.RAW_OLIVINE.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.OLIVINE.get(), ModelTemplates.FLAT_ITEM);

        itemModels.generateFlatItem(ModItems.RAW_PIGEONITE.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.PIGEONITE.get(), ModelTemplates.FLAT_ITEM);

        itemModels.generateFlatItem(ModItems.METAL_DETECTOR.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(ModItems.DATAPAD.get(), ModelTemplates.FLAT_HANDHELD_ITEM);

        itemModels.generateFlatItem(ModItems.FROMAGE.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.SINTERED_FROMAGE.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.SUSPICIOUS_FROMAGE.get(), ModelTemplates.FLAT_ITEM);

        itemModels.generateFlatItem(ModItems.CARBON.get(), ModelTemplates.FLAT_ITEM);

        itemModels.generateFlatItem(ModItems.CHROMITE_SABRE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(ModItems.CHROMITE_PICKAXE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(ModItems.CHROMITE_AXE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(ModItems.CHROMITE_SHOVEL.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(ModItems.CHROMITE_HOE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateSpear(ModItems.CHROMITE_SPEAR.get());
        generateLance(itemModels, ModItems.CHROMITE_LANCE.get());
        generateGreatsword(itemModels, ModItems.CHROMITE_GREATSWORD.get());
        generateGreatsword(itemModels, ModItems.CHROMITE_HALBERD.get());

        itemModels.generateTrimmableItem(ModItems.CHROMITE_HELMET.get(), ModArmorMaterials.CHROMITE_KEY, ItemModelGenerators.TRIM_PREFIX_HELMET, false);
        itemModels.generateTrimmableItem(ModItems.CHROMITE_CHESTPLATE.get(), ModArmorMaterials.CHROMITE_KEY, ItemModelGenerators.TRIM_PREFIX_CHESTPLATE, false);
        itemModels.generateTrimmableItem(ModItems.CHROMITE_LEGGINGS.get(), ModArmorMaterials.CHROMITE_KEY, ItemModelGenerators.TRIM_PREFIX_LEGGINGS, false);
        itemModels.generateTrimmableItem(ModItems.CHROMITE_BOOTS.get(), ModArmorMaterials.CHROMITE_KEY, ItemModelGenerators.TRIM_PREFIX_BOOTS, false);

        itemModels.generateFlatItem(ModItems.CHROMITE_HORSE_ARMOR.get(), ModelTemplates.FLAT_ITEM);

        // NOTE: Make 32x32 _in_hand texture for this later
        itemModels.createFlatItemModel(ModItems.CHROMITE_SCYTHIA.get(), ModelTemplates.BOW);
        itemModels.generateBow(ModItems.CHROMITE_SCYTHIA.get());


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
                .slab(ModBlocks.BRECCIA_SLAB.get())
                .pressurePlate(ModBlocks.BRECCIA_PRESSURE_PLATE.get())
                .button(ModBlocks.BRECCIA_BUTTON.get())
                .fence(ModBlocks.BRECCIA_FENCE.get())
                .fenceGate(ModBlocks.BRECCIA_FENCE_GATE.get())
                .wall(ModBlocks.BRECCIA_WALL.get())
                .door(ModBlocks.BRECCIA_DOR.get())
                .trapdoor(ModBlocks.BRECCIA_TRAPDOR.get());

        blockModels.family(ModBlocks.SINTERED_BRECCIA.get())
                .stairs(ModBlocks.SINTERED_BRECCIA_STAIRS.get())
                .slab(ModBlocks.SINTERED_BRECCIA_SLAB.get());

        blockModels.blockStateOutput.accept(
                MultiVariantGenerator.dispatch(ModBlocks.CHROMITE_LAMP.get()).with(BlockModelGenerators.createBooleanModelDispatch(ChromiteLampBlock.CLICKED,
                        BlockModelGenerators.plainVariant(blockModels.createSuffixedVariant(ModBlocks.CHROMITE_LAMP.get(), "_on", ModelTemplates.CUBE_ALL, TextureMapping::cube)),
                        BlockModelGenerators.plainVariant(TexturedModel.CUBE.create(ModBlocks.CHROMITE_LAMP.get(), blockModels.modelOutput))))
        );
    }

    private static final ModelTemplate LANCE_IN_HAND = new ModelTemplate(
            Optional.of(Identifier.fromNamespaceAndPath("alittlebitofeverything", "item/lance_in_hand")),
            Optional.empty(),
            TextureSlot.LAYER0
    );
    private static final ModelTemplate GREATSWORD_IN_HAND = new ModelTemplate(
            Optional.of(Identifier.fromNamespaceAndPath("alittlebitofeverything", "item/greatsword_in_hand")),
            Optional.empty(),
            TextureSlot.LAYER0
    );

    public void generateLance(ItemModelGenerators itemModels, Item item) {
        ItemModel.Unbaked flatModel = ItemModelUtils.plainModel(itemModels.createFlatItemModel(item, ModelTemplates.FLAT_ITEM));

        Identifier inHandModelLoc = ModelLocationUtils.getModelLocation(item, "_in_hand");
        ItemModel.Unbaked inHandModel = ItemModelUtils.plainModel(LANCE_IN_HAND.create(inHandModelLoc,
                        TextureMapping.layer0(TextureMapping.getItemTexture(item, "_in_hand")), itemModels.modelOutput));

        itemModels.itemModelOutput.accept(item, ItemModelGenerators.createFlatModelDispatch(flatModel, inHandModel),
                new ClientItem.Properties(true, false, 1.0F));
    }

    public void generateGreatsword(ItemModelGenerators itemModels, Item item) {
        ItemModel.Unbaked flatModel = ItemModelUtils.plainModel(itemModels.createFlatItemModel(item, ModelTemplates.FLAT_ITEM));

        Identifier inHandModelLoc = ModelLocationUtils.getModelLocation(item, "_in_hand");
        ItemModel.Unbaked inHandModel = ItemModelUtils.plainModel(GREATSWORD_IN_HAND.create(inHandModelLoc,
                        TextureMapping.layer0(TextureMapping.getItemTexture(item, "_in_hand")), itemModels.modelOutput));

        itemModels.itemModelOutput.accept(item, ItemModelGenerators.createFlatModelDispatch(flatModel, inHandModel),
                new ClientItem.Properties(true, false, 1.0F)
        );
    }
}
