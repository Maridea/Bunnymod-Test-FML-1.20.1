package net.maribunny.funnybunnymod.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class BunnyFoods {
    public static final FoodProperties STRAWBERRY = new FoodProperties.Builder().nutrition(2).fast()
            .saturationMod(2).effect(()-> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 200), 0.1f).build();


}
