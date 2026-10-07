package net.eeebsiekat.bitsofeverything.tab;

import net.eeebsiekat.bitsofeverything.ALittleBitofEverything;
import net.eeebsiekat.bitsofeverything.block.ModBlocks;
import net.eeebsiekat.bitsofeverything.item.ModItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ALittleBitofEverything.MOD_ID);

    public static final Supplier<CreativeModeTab> EVERYTHING_ITEMS_TAB = CREATIVE_MODE_TABS.register("everything_items_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.ROSE_SPAR.get()))
                    .withTabsAfter(Identifier.fromNamespaceAndPath(ALittleBitofEverything.MOD_ID, "everything_blocks_tab"))
                    .title(Component.translatable("creativetab.alittlebitofeverything.everything_items"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.ROSE_SPAR);
                        output.accept(ModItems.ROSE_SPAR_SHARD);

                        output.accept(ModItems.TEAL_SPAR);
                        output.accept(ModItems.TEAL_SPAR_SHARD);

                        output.accept(ModItems.FROMAGE_SPAR);
                        output.accept(ModItems.FROMAGE_SPAR_SHARD);

                        output.accept(ModItems.CHROMITE);
                        output.accept(ModItems.CHROMITE_SHARD);
                        output.accept(ModItems.CHROMITE_HELMET);
                        output.accept(ModItems.CHROMITE_CHESTPLATE);
                        output.accept(ModItems.CHROMITE_LEGGINGS);
                        output.accept(ModItems.CHROMITE_BOOTS);
                        output.accept(ModItems.CHROMITE_HORSE_ARMOR);
                        output.accept(ModItems.CHROMITE_BAR);
                        output.accept(ModItems.CHROMITE_SABRE);
                        output.accept(ModItems.CHROMITE_AXE);
                        output.accept(ModItems.CHROMITE_PICKAXE);
                        output.accept(ModItems.CHROMITE_SHOVEL);
                        output.accept(ModItems.CHROMITE_HOE);
                        output.accept(ModItems.CHROMITE_SPEAR);
                        output.accept(ModItems.CHROMITE_LANCE);
                        output.accept(ModItems.CHROMITE_GREATSWORD);
                        output.accept(ModItems.CHROMITE_HALBERD);

                        output.accept(ModItems.RAW_OLIVINE);
                        output.accept(ModItems.OLIVINE);

                        output.accept(ModItems.RAW_PIGEONITE);
                        output.accept(ModItems.PIGEONITE);

                        output.accept(ModItems.METAL_DETECTOR);
                        output.accept(ModItems.DATAPAD);

                        output.accept(ModItems.FROMAGE);
                        output.accept(ModItems.SINTERED_FROMAGE);
                        output.accept(ModItems.SUSPICIOUS_FROMAGE);

                        output.accept(ModItems.CARBON);
                    })

                    .build());

    public static final Supplier<CreativeModeTab> EVERYTHING_BLOCKS_TAB = CREATIVE_MODE_TABS.register("everything_blocks_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.ROSE_SPAR_BLOCK.get()))
                    .title(Component.translatable("creativetab.alittlebitofeverything.everything_blocks"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModBlocks.ROSE_SPAR_BLOCK);
                        output.accept(ModBlocks.ROSE_SPAR_SHARD_BLOCK);

                        output.accept(ModBlocks.TEAL_SPAR_BLOCK);
                        output.accept(ModBlocks.TEAL_SPAR_SHARD_BLOCK);

                        output.accept(ModBlocks.FROMAGE_SPAR_BLOCK);
                        output.accept(ModBlocks.FROMAGE_SPAR_SHARD_BLOCK);

                        output.accept(ModBlocks.CARBON_BLOCK);
                        output.accept(ModBlocks.CARBON_BRECCIA_ORE);
                        output.accept(ModBlocks.CARBON_SINTERED_BRECCIA_ORE);

                        output.accept(ModBlocks.SINTERED_BRECCIA);
                        output.accept(ModBlocks.CHROMITE_SINTERED_BRECCIA_ORE);
                        output.accept(ModBlocks.POLISHED_SINTERED_BRECCIA);
                        output.accept(ModBlocks.SINTERED_BRECCIA_STAIRS);
                        output.accept(ModBlocks.SINTERED_BRECCIA_SLAB);

                        output.accept(ModBlocks.BRECCIA);
                        output.accept(ModBlocks.CHROMITE_BRECCIA_ORE);
                        output.accept(ModBlocks.POLISHED_BRECCIA);
                        output.accept(ModBlocks.BRECCIA_STAIRS);
                        output.accept(ModBlocks.BRECCIA_SLAB);
                        output.accept(ModBlocks.BRECCIA_PRESSURE_PLATE);
                        output.accept(ModBlocks.BRECCIA_BUTTON);
                        output.accept(ModBlocks.BRECCIA_FENCE);
                        output.accept(ModBlocks.BRECCIA_FENCE_GATE);
                        output.accept(ModBlocks.BRECCIA_WALL);
                        output.accept(ModBlocks.BRECCIA_DOR);
                        output.accept(ModBlocks.BRECCIA_TRAPDOR);

                        output.accept(ModBlocks.ROSE_SPAR_STONE);
                        output.accept(ModBlocks.OLIVINE_ROSE_SPAR_ORE);
                        output.accept(ModBlocks.PIGEONITE_ROSE_SPAR_ORE);
                        output.accept(ModBlocks.CHROMITE_ROSE_SPAR_ORE);

                        output.accept(ModBlocks.CHROMITE_LAMP);

                        output.accept(ModBlocks.FOOD_PRINTER);
                    })

                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
