package net.eeebsiekat.bitsofeverything.item;

import com.google.common.collect.Maps;
import net.eeebsiekat.bitsofeverything.ALittleBitofEverything;
import net.eeebsiekat.bitsofeverything.tags.ModTags;
import net.minecraft.core.Registry;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.equipment.ArmorMaterial;
import net.minecraft.world.item.equipment.ArmorType;
import net.minecraft.world.item.equipment.EquipmentAsset;

import java.util.Map;


public class ModArmorMaterials {
    public static final ResourceKey<? extends Registry<EquipmentAsset>> ROOT_ID = ResourceKey.createRegistryKey(Identifier.withDefaultNamespace("equipment_asset"));
    public static final ResourceKey<EquipmentAsset> CHROMITE_KEY = ResourceKey.create(ROOT_ID, Identifier.fromNamespaceAndPath(ALittleBitofEverything.MOD_ID, "chromite"));

    public static final ArmorMaterial CHROMITE_ARMOR_MATERIAL = new ArmorMaterial(1200,
            makeDefense(3, 6, 8, 3, 19), 25, SoundEvents.ARMOR_EQUIP_NETHERITE, 3.0f, 0.1f, ModTags.Items.CHROMITE_REPAIRABLES, CHROMITE_KEY);

    private static Map<ArmorType, Integer> makeDefense(int boots, int legs, int chest, int helm, int body) {
        return Maps.newEnumMap(Map.of(ArmorType.BOOTS, boots, ArmorType.LEGGINGS, legs, ArmorType.CHESTPLATE, chest, ArmorType.HELMET, helm, ArmorType.BODY, body));
    }

}
