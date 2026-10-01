package net.eeebsiekat.bitsofeverything.datagen;

import net.eeebsiekat.bitsofeverything.block.ModBlocks;
import net.eeebsiekat.bitsofeverything.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.DataMapProvider;
import net.neoforged.neoforge.registries.datamaps.builtin.FurnaceFuel;
import net.neoforged.neoforge.registries.datamaps.builtin.NeoForgeDataMaps;

import java.util.concurrent.CompletableFuture;

public class ModDataMapProvider extends DataMapProvider {
    public ModDataMapProvider(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(packOutput, lookupProvider);
    }

    @Override
    protected void gather(HolderLookup.Provider provider) {
        builder(NeoForgeDataMaps.FURNACE_FUELS)
                .add(ModItems.CARBON.getId(), new FurnaceFuel(6400), false)
                .add(ModBlocks.CARBON_BLOCK.getId(), new FurnaceFuel(57600), false);
    }
}
