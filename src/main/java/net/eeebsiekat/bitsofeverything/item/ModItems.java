package net.eeebsiekat.bitsofeverything.item;

import net.eeebsiekat.bitsofeverything.ALittleBitofEverything;
import net.eeebsiekat.bitsofeverything.food.ModFoods;
import net.eeebsiekat.bitsofeverything.item.custom.DatapadItem;
import net.eeebsiekat.bitsofeverything.item.custom.MetalDetectorItem;
import net.minecraft.core.component.DataComponents;
import net.minecraft.network.chat.Component;
import net.minecraft.world.food.Foods;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.component.SuspiciousStewEffects;
import net.minecraft.world.item.component.TooltipDisplay;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Consumer;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(ALittleBitofEverything.MOD_ID);

    public static final DeferredItem<Item> ROSE_SPAR = ITEMS.registerSimpleItem("rose_spar");
    public static final DeferredItem<Item> ROSE_SPAR_SHARD = ITEMS.registerSimpleItem("rose_spar_shard");
    public static final DeferredItem<Item> TEAL_SPAR = ITEMS.registerSimpleItem("teal_spar");
    public static final DeferredItem<Item> TEAL_SPAR_SHARD = ITEMS.registerSimpleItem("teal_spar_shard");
    public static final DeferredItem<Item> FROMAGE_SPAR = ITEMS.registerSimpleItem("fromage_spar");
    public static final DeferredItem<Item> FROMAGE_SPAR_SHARD = ITEMS.registerSimpleItem("fromage_spar_shard");
    public static final DeferredItem<Item> CHROMITE = ITEMS.registerSimpleItem("chromite");
    public static final DeferredItem<Item> CHROMITE_SHARD = ITEMS.registerSimpleItem("chromite_shard");
    public static final DeferredItem<Item> RAW_OLIVINE = ITEMS.registerSimpleItem("raw_olivine");
    public static final DeferredItem<Item> OLIVINE = ITEMS.registerSimpleItem("olivine");
    public static final DeferredItem<Item> RAW_PIGEONITE = ITEMS.registerSimpleItem("raw_pigeonite");
    public static final DeferredItem<Item> PIGEONITE = ITEMS.registerSimpleItem("pigeonite");

    public static final DeferredItem<Item> METAL_DETECTOR = ITEMS.registerItem("metal_detector",
            properties -> new MetalDetectorItem(properties.durability(64)));
    public static final DeferredItem<Item> DATAPAD = ITEMS.registerItem("datapad",
            properties -> new DatapadItem(properties.durability(0)));

    public static final DeferredItem<Item> FROMAGE = ITEMS.registerItem("fromage",
            properties -> new Item(properties.food(ModFoods.FROMAGE, ModFoods.FROMAGE_CONSUMABLE)));
    public static final DeferredItem<Item> SINTERED_FROMAGE = ITEMS.registerItem("sintered_fromage",
            properties -> new Item(properties.food(ModFoods.SINTERED_FROMAGE, ModFoods.SINTERED_FROMAGE_CONSUMABLE)));

    public static final DeferredItem<Item> CARBON = ITEMS.registerItem("carbon",
            properties -> new Item(properties.stacksTo(16)));

    public static final DeferredItem<Item> SUSPICIOUS_FROMAGE = ITEMS.registerItem("suspicious_fromage",
            properties -> new Item(properties
                    .stacksTo(1)
                    .food(Foods.SUSPICIOUS_STEW, ModFoods.SUSPICIOUS_FROMAGE_CONSUMABLE)
                    .component(DataComponents.SUSPICIOUS_STEW_EFFECTS, SuspiciousStewEffects.EMPTY)){
                @Override
                public void appendHoverText(ItemStack itemStack, TooltipContext context, TooltipDisplay display, Consumer<Component> builder, TooltipFlag tooltipFlag) {
                    builder.accept(Component.translatable("tooltip.alittlebitofeverything.suspicious_fromage.tooltip"));
                    super.appendHoverText(itemStack, context, display, builder, tooltipFlag);
                }
            });

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
