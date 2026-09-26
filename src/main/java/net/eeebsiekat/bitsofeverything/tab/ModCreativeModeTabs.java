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
                        output.accept(ModItems.RAW_OLIVINE);
                        output.accept(ModItems.OLIVINE);
                        output.accept(ModItems.RAW_PIGEONITE);
                        output.accept(ModItems.PIGEONITE);
                        output.accept(ModItems.METAL_DETECTOR);
                    })

                    .build());

    public static final Supplier<CreativeModeTab> EVERYTHING_BLOCKS_TAB = CREATIVE_MODE_TABS.register("everything_blocks_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.ROSE_SPAR_BLOCK.get()))
                    .title(Component.translatable("creativetab.alittlebitofeverything.everything_blocks"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModBlocks.ROSE_SPAR_BLOCK);
                        output.accept(ModBlocks.ROSE_SPAR_SHARD_BLOCK);
                        output.accept(ModBlocks.CHRONDITE_STRATA);
                        output.accept(ModBlocks.SINTERED_BRECCIA);
                        output.accept(ModBlocks.ROSE_SPAR_STONE);
                        output.accept(ModBlocks.OLIVINE);
                        output.accept(ModBlocks.PIGEONITE);
                    })

                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
