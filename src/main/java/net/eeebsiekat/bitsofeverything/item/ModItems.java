package net.eeebsiekat.bitsofeverything.item;

import net.eeebsiekat.bitsofeverything.ALittleBitofEverything;
import net.eeebsiekat.bitsofeverything.food.ModFoods;
import net.eeebsiekat.bitsofeverything.item.custom.DatapadItem;
import net.eeebsiekat.bitsofeverything.item.custom.MetalDetectorItem;
import net.minecraft.core.component.DataComponents;
import net.minecraft.network.chat.Component;
import net.minecraft.world.food.Foods;
import net.minecraft.world.item.*;
import net.minecraft.world.item.component.SuspiciousStewEffects;
import net.minecraft.world.item.component.SwingAnimation;
import net.minecraft.world.item.component.TooltipDisplay;
import net.minecraft.world.item.equipment.ArmorType;
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
    public static final DeferredItem<Item> CHROMITE_BAR = ITEMS.registerSimpleItem("chromite_bar");

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

    public static final DeferredItem<Item> CHROMITE_SABRE = ITEMS.registerItem("chromite_sabre",
            properties -> new Item(properties.sword(ModToolTiers.CHROMITE, 3.0f, -2.4f).fireResistant()));
    public static final DeferredItem<Item> CHROMITE_PICKAXE = ITEMS.registerItem("chromite_pickaxe",
            properties -> new Item(properties.pickaxe(ModToolTiers.CHROMITE, 1.0f, -2.8f).fireResistant()));
    public static final DeferredItem<Item> CHROMITE_SHOVEL = ITEMS.registerItem("chromite_shovel",
            properties -> new ShovelItem(ModToolTiers.CHROMITE, 1.5f, -3.0f, properties.fireResistant()));
    public static final DeferredItem<Item> CHROMITE_AXE = ITEMS.registerItem("chromite_axe",
            properties -> new AxeItem(ModToolTiers.CHROMITE, 6.0f, -3.2f, properties.fireResistant()));
    public static final DeferredItem<Item> CHROMITE_HOE = ITEMS.registerItem("chromite_hoe",
            properties -> new HoeItem(ModToolTiers.CHROMITE, 0f, -3.0f, properties.fireResistant()));
    public static final DeferredItem<Item> CHROMITE_SPEAR = ITEMS.registerItem("chromite_spear",
            properties -> new Item(properties.spear(ModToolTiers.CHROMITE, 0.5f, 1.7f, 0.3f,
                    3.5f, 13f, 8.5f, 5.1f, 13.37f, 4.67f).fireResistant()));

    public static final DeferredItem<Item> CHROMITE_LANCE = ITEMS.registerItem("chromite_lance",
            properties -> new Item(properties.spear(ModToolTiers.CHROMITE, 0.5f, 1.7f, 0.3f,
                    3.5f, 13f, 8.5f, 5.1f, 13.37f, 4.67f)
                    .component(DataComponents.SWING_ANIMATION, new SwingAnimation(SwingAnimationType.WHACK, 5)).fireResistant()));
    public static final DeferredItem<Item> CHROMITE_GREATSWORD = ITEMS.registerItem("chromite_greatsword",
            properties -> new Item(properties.sword(ModToolTiers.CHROMITE, 3.0f, -2.4f)
                    .component(DataComponents.SWING_ANIMATION, new SwingAnimation(SwingAnimationType.WHACK, 8)).fireResistant()));
    public static final DeferredItem<Item> CHROMITE_HALBERD = ITEMS.registerItem("chromite_halberd",
            properties -> new Item(properties.spear(ModToolTiers.CHROMITE, 1.0f, 3.5f, 0.3f,
                            3.5f, 13f, 8.5f, 5.1f, 13.37f, 4.67f)
                    .component(DataComponents.SWING_ANIMATION, new SwingAnimation(SwingAnimationType.STAB, 5)).fireResistant()));

    public static final DeferredItem<Item> CHROMITE_HELMET = ITEMS.registerItem("chromite_helmet",
            properties -> new Item(properties.humanoidArmor(ModArmorMaterials.CHROMITE_ARMOR_MATERIAL, ArmorType.HELMET).fireResistant()));
    public static final DeferredItem<Item> CHROMITE_CHESTPLATE = ITEMS.registerItem("chromite_chestplate",
            properties -> new Item(properties.humanoidArmor(ModArmorMaterials.CHROMITE_ARMOR_MATERIAL, ArmorType.CHESTPLATE).fireResistant()));
    public static final DeferredItem<Item> CHROMITE_LEGGINGS = ITEMS.registerItem("chromite_leggings",
            properties -> new Item(properties.humanoidArmor(ModArmorMaterials.CHROMITE_ARMOR_MATERIAL, ArmorType.LEGGINGS).fireResistant()));
    public static final DeferredItem<Item> CHROMITE_BOOTS = ITEMS.registerItem("chromite_boots",
            properties -> new Item(properties.humanoidArmor(ModArmorMaterials.CHROMITE_ARMOR_MATERIAL, ArmorType.BOOTS).fireResistant()));

    public static final DeferredItem<Item> CHROMITE_HORSE_ARMOR = ITEMS.registerItem("chromite_horse_armor",
            properties -> new Item(properties.horseArmor(ModArmorMaterials.CHROMITE_ARMOR_MATERIAL).fireResistant()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
