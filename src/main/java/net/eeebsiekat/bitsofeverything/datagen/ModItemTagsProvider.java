package net.eeebsiekat.bitsofeverything.datagen;

import net.eeebsiekat.bitsofeverything.ALittleBitofEverything;
import net.eeebsiekat.bitsofeverything.item.ModItems;
import net.eeebsiekat.bitsofeverything.tags.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.ItemTags;
import net.neoforged.neoforge.common.data.ItemTagsProvider;

import java.util.concurrent.CompletableFuture;

public class ModItemTagsProvider extends ItemTagsProvider {
    public ModItemTagsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(output, lookupProvider, ALittleBitofEverything.MOD_ID);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(ModTags.Items.CARBON_LIKES)
                .add(ModItems.CARBON.get());

        tag(ModTags.Items.CHROMITE_REPAIRABLES)
                .add(ModItems.CHROMITE.get());

        tag(ItemTags.SWORDS)
                .add(ModItems.CHROMITE_SABRE.get());
        tag(ItemTags.PICKAXES)
                .add(ModItems.CHROMITE_PICKAXE.get());
        tag(ItemTags.AXES)
                .add(ModItems.CHROMITE_AXE.get());
        tag(ItemTags.SHOVELS)
                .add(ModItems.CHROMITE_SHOVEL.get());
        tag(ItemTags.HOES)
                .add(ModItems.CHROMITE_HOE.get());
        tag(ItemTags.SPEARS)
                .add(ModItems.CHROMITE_SPEAR.get());
    }
}
