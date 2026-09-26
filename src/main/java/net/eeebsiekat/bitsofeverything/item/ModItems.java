package net.eeebsiekat.bitsofeverything.item;

import net.eeebsiekat.bitsofeverything.ALittleBitofEverything;
import net.eeebsiekat.bitsofeverything.item.custom.MetalDetectorItem;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(ALittleBitofEverything.MOD_ID);

    public static final DeferredItem<Item> ROSE_SPAR = ITEMS.registerSimpleItem("rose_spar");
    public static final DeferredItem<Item> ROSE_SPAR_SHARD = ITEMS.registerSimpleItem("rose_spar_shard");
    public static final DeferredItem<Item> RAW_OLIVINE = ITEMS.registerSimpleItem("raw_olivine");
    public static final DeferredItem<Item> OLIVINE = ITEMS.registerSimpleItem("olivine");
    public static final DeferredItem<Item> RAW_PIGEONITE = ITEMS.registerSimpleItem("raw_pigeonite");
    public static final DeferredItem<Item> PIGEONITE = ITEMS.registerSimpleItem("pigeonite");

    public static final DeferredItem<Item> METAL_DETECTOR = ITEMS.registerItem("metal_detector",
            properties -> new MetalDetectorItem(properties.durability(64)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
