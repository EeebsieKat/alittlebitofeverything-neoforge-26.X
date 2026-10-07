package net.eeebsiekat.bitsofeverything.datagen;

import net.eeebsiekat.bitsofeverything.block.ModBlocks;
import net.eeebsiekat.bitsofeverything.item.ModItems;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.AlternativesEntry;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.entries.LootPoolEntryContainer;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;

import java.util.Set;

public class ModBlockLootTableProvider extends BlockLootSubProvider {
    public ModBlockLootTableProvider(HolderLookup.Provider registries) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), registries);
    }

    @Override
    protected void generate() {
        dropSelf(ModBlocks.ROSE_SPAR_BLOCK.get());
        dropSelf(ModBlocks.ROSE_SPAR_SHARD_BLOCK.get());
        dropSelf(ModBlocks.TEAL_SPAR_BLOCK.get());
        dropSelf(ModBlocks.TEAL_SPAR_SHARD_BLOCK.get());
        dropSelf(ModBlocks.FROMAGE_SPAR_BLOCK.get());
        dropSelf(ModBlocks.FROMAGE_SPAR_SHARD_BLOCK.get());
        dropSelf(ModBlocks.CARBON_BLOCK.get());
        dropSelf(ModBlocks.CARBON_BRECCIA_ORE.get());
        dropSelf(ModBlocks.CARBON_SINTERED_BRECCIA_ORE.get());
        dropSelf(ModBlocks.CHROMITE_SINTERED_BRECCIA_ORE.get());
        dropSelf(ModBlocks.CHROMITE_ROSE_SPAR_ORE.get());
        dropSelf(ModBlocks.SINTERED_BRECCIA.get());
        dropSelf(ModBlocks.BRECCIA.get());
        dropSelf(ModBlocks.POLISHED_SINTERED_BRECCIA.get());
        dropSelf(ModBlocks.POLISHED_BRECCIA.get());
        dropSelf(ModBlocks.BRECCIA_STAIRS.get());
        dropSelf(ModBlocks.SINTERED_BRECCIA_STAIRS.get());
        dropSelf(ModBlocks.BRECCIA_PRESSURE_PLATE.get());
        dropSelf(ModBlocks.BRECCIA_BUTTON.get());
        dropSelf(ModBlocks.BRECCIA_FENCE.get());
        dropSelf(ModBlocks.BRECCIA_FENCE_GATE.get());
        dropSelf(ModBlocks.BRECCIA_WALL.get());
        dropSelf(ModBlocks.BRECCIA_TRAPDOR.get());

        dropSelf(ModBlocks.CHROMITE_LAMP.get());

        add(ModBlocks.BRECCIA_DOR.get(), this::createDoorTable);
        add(ModBlocks.BRECCIA_SLAB.get(), this::createSlabItemTable);
        add(ModBlocks.SINTERED_BRECCIA_SLAB.get(), this::createSlabItemTable);

        add(ModBlocks.OLIVINE_ROSE_SPAR_ORE.get(),
                createMultipleOreDrops(ModBlocks.OLIVINE_ROSE_SPAR_ORE.get(),
                        ModItems.RAW_OLIVINE.get(), 2, 5));
        add(ModBlocks.PIGEONITE_ROSE_SPAR_ORE.get(),
                createMultipleOreDrops(ModBlocks.PIGEONITE_ROSE_SPAR_ORE.get(),
                        ModItems.RAW_PIGEONITE.get(), 2, 5));
        add(ModBlocks.ROSE_SPAR_STONE.get(),
                createMultipleOreDrops(ModBlocks.ROSE_SPAR_STONE.get(),
                        ModItems.ROSE_SPAR_SHARD.get(), 4, 7));

        add(ModBlocks.CHROMITE_BRECCIA_ORE.get(),
                createMultipleFourOreDrops(ModBlocks.CHROMITE_BRECCIA_ORE.get(),
                        ModItems.ROSE_SPAR_SHARD.get(), 0, 3,
                        ModItems.TEAL_SPAR_SHARD.get(), 0, 3,
                        ModItems.FROMAGE_SPAR_SHARD.get(), 0, 3,
                        ModItems.CHROMITE_SHARD.get(), 2, 5));

        dropSelf(ModBlocks.FOOD_PRINTER.get());
    }

    protected LootTable.Builder createMultipleOreDrops(Block block, Item item, float minDrops, float maxDrops) {
        HolderLookup.RegistryLookup<Enchantment> enchantments = this.registries.lookupOrThrow(Registries.ENCHANTMENT);
        return this.createSilkTouchDispatchTable(block, (LootPoolEntryContainer.Builder)this.applyExplosionDecay(block,
                        LootItem.lootTableItem(item)
                                .apply(SetItemCountFunction.setCount(UniformGenerator.between(minDrops, maxDrops)))
                                .apply(ApplyBonusCount.addOreBonusCount(enchantments.getOrThrow(Enchantments.FORTUNE)))));
    }

    protected LootTable.Builder createMultipleFourOreDrops(
            Block block,
            Item item1, float min1, float max1,
            Item item2, float min2, float max2,
            Item item3, float min3, float max3,
            Item item4, float min4, float max4) {

        HolderLookup.RegistryLookup<Enchantment> enchantments = this.registries.lookupOrThrow(Registries.ENCHANTMENT);

        return this.createSilkTouchDispatchTable(
                block,
                this.applyExplosionDecay(block,
                        LootItem.lootTableItem(item1).setWeight(1)
                                .apply(SetItemCountFunction.setCount(UniformGenerator.between(min1, max1)))
                                .apply(ApplyBonusCount.addOreBonusCount(enchantments.getOrThrow(Enchantments.FORTUNE)))
                ).then(
                        this.applyExplosionDecay(block, LootItem.lootTableItem(item2).setWeight(1)
                                .apply(SetItemCountFunction.setCount(UniformGenerator.between(min2, max2)))
                                .apply(ApplyBonusCount.addOreBonusCount(enchantments.getOrThrow(Enchantments.FORTUNE)))
                        )
                ).then(
                        this.applyExplosionDecay(block, LootItem.lootTableItem(item3).setWeight(1)
                                .apply(SetItemCountFunction.setCount(UniformGenerator.between(min3, max3)))
                                .apply(ApplyBonusCount.addOreBonusCount(enchantments.getOrThrow(Enchantments.FORTUNE)))
                        )
                ).then(
                        this.applyExplosionDecay(block, LootItem.lootTableItem(item4).setWeight(1)
                                .apply(SetItemCountFunction.setCount(UniformGenerator.between(min4, max4)))
                                .apply(ApplyBonusCount.addOreBonusCount(enchantments.getOrThrow(Enchantments.FORTUNE)))
                        )
                )
        );
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(Holder::value)::iterator;
    }
}
