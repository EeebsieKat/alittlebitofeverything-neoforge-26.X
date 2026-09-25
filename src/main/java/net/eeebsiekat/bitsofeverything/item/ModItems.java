package net.eeebsiekat.bitsofeverything.item;

import net.eeebsiekat.bitsofeverything.ALittleBitofEverything;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(ALittleBitofEverything.MOD_ID);

    public static final DeferredItem<Item> LONSDALEITE = ITEMS.registerSimpleItem("lonsdaleite");
    public static final DeferredItem<Item> LONSDALEITE_FRAGMENT = ITEMS.registerSimpleItem("lonsdaleite_fragment");
    public static final DeferredItem<Item> RAW_OLIVINE = ITEMS.registerSimpleItem("raw_olivine");
    public static final DeferredItem<Item> OLIVINE = ITEMS.registerSimpleItem("olivine");
    public static final DeferredItem<Item> RAW_PIGEONITE = ITEMS.registerSimpleItem("raw_pigeonite");
    public static final DeferredItem<Item> PIGEONITE = ITEMS.registerSimpleItem("pigeonite");

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
