package net.eeebsiekat.bitsofeverything.datagen;

import net.eeebsiekat.bitsofeverything.ALittleBitofEverything;
import net.eeebsiekat.bitsofeverything.item.ModItems;
import net.eeebsiekat.bitsofeverything.tags.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.references.BlockItemIds;
import net.minecraft.references.ItemIds;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;
import net.neoforged.neoforge.common.data.ItemTagsProvider;

import java.util.concurrent.CompletableFuture;

public class ModItemTagsProvider extends ItemTagsProvider {
    public ModItemTagsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(output, lookupProvider, ALittleBitofEverything.MOD_ID);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(ModTags.Items.CARBON_LIKES)
                .add(ModItems.getRK(ModItems.CARBON.get()));

        tag(ModTags.Items.CHROMITE_REPAIRABLES)
                .add(ModItems.getRK(ModItems.CHROMITE.get()));

        tag(ItemTags.SWORDS)
                .add(ModItems.getRK(ModItems.CHROMITE_SABRE.get()));
        tag(ItemTags.PICKAXES)
                .add(ModItems.getRK(ModItems.CHROMITE_PICKAXE.get()));
        tag(ItemTags.AXES)
                .add(ModItems.getRK(ModItems.CHROMITE_AXE.get()));
        tag(ItemTags.SHOVELS)
                .add(ModItems.getRK(ModItems.CHROMITE_SHOVEL.get()));
        tag(ItemTags.HOES)
                .add(ModItems.getRK(ModItems.CHROMITE_HOE.get()));
        tag(ItemTags.SPEARS)
                .add(ModItems.getRK(ModItems.CHROMITE_SPEAR.get()));
        tag(ModTags.Items.LANCES)
                .add(ModItems.getRK(ModItems.CHROMITE_LANCE.get()));
        tag(ModTags.Items.GREATSWORDS)
                .add(ModItems.getRK(ModItems.CHROMITE_GREATSWORD.get()));

        tag(ItemTags.HEAD_ARMOR).add(ModItems.getRK(ModItems.CHROMITE_HELMET.get()));
        tag(ItemTags.CHEST_ARMOR).add(ModItems.getRK(ModItems.CHROMITE_CHESTPLATE.get()));
        tag(ItemTags.LEG_ARMOR).add(ModItems.getRK(ModItems.CHROMITE_LEGGINGS.get()));
        tag(ItemTags.FOOT_ARMOR).add(ModItems.getRK(ModItems.CHROMITE_BOOTS.get()));

        tag(ItemTags.BOW_ENCHANTABLE).add(ModItems.getRK(ModItems.CHROMITE_SCYTHIA.get()));

        tag(ModTags.Items.GUN_BULLETS)
                .add(BlockItemIds.SKELETON_SKULL.item())
                .add(BlockItemIds.WITHER_SKELETON_SKULL.item());
    }
}
