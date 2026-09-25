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
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.LONSDALEITE.get()))
                    .withTabsAfter(Identifier.fromNamespaceAndPath(ALittleBitofEverything.MOD_ID, "everything_blocks_tab"))
                    .title(Component.translatable("creativetab.alittlebitofeverything.everything_items"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.LONSDALEITE);
                        output.accept(ModItems.LONSDALEITE_FRAGMENT);
                        output.accept(ModItems.RAW_OLIVINE);
                        output.accept(ModItems.OLIVINE);
                        output.accept(ModItems.RAW_PIGEONITE);
                        output.accept(ModItems.PIGEONITE);
                    })

                    .build());

    public static final Supplier<CreativeModeTab> EVERYTHING_BLOCKS_TAB = CREATIVE_MODE_TABS.register("everything_blocks_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.LONSDALEITE_CUBE.get()))
                    .title(Component.translatable("creativetab.alittlebitofeverything.everything_blocks"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModBlocks.LONSDALEITE_CUBE);
                        output.accept(ModBlocks.LONSDALEITE_FRAGMENT_CUBE);
                        output.accept(ModBlocks.METEORITE_STONE);
                        output.accept(ModBlocks.METEORITE_STRATA);
                        output.accept(ModBlocks.OLIVINE);
                        output.accept(ModBlocks.PIGEONITE);
                    })

                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
