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

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
