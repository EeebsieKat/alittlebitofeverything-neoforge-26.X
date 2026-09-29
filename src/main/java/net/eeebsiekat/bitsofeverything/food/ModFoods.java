package net.eeebsiekat.bitsofeverything.food;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.component.Consumable;
import net.minecraft.world.item.component.Consumables;
import net.minecraft.world.item.consume_effects.ApplyStatusEffectsConsumeEffect;

public class ModFoods {
    public static final FoodProperties FROMAGE = new FoodProperties.Builder()
            .nutrition(1)
            .saturationModifier(0.2f)
            .build();
    public static final FoodProperties SINTERED_FROMAGE = new FoodProperties.Builder()
            .nutrition(3)
            .saturationModifier(0.5f)
            .build();

    public static final Consumable FROMAGE_CONSUMABLE = Consumables.defaultFood()
            .consumeSeconds(0.5f)
            .onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.HASTE, 60), 0.2f))
            .build();
    public static final Consumable SINTERED_FROMAGE_CONSUMABLE = Consumables.defaultFood()
            .consumeSeconds(0.5f)
            .onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.HASTE, 100), 1.0f))
            .build();
}
