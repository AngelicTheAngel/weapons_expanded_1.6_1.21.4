package net.angelic.weaponsexpanded.enchantment;

import com.mojang.serialization.MapCodec;
import net.angelic.weaponsexpanded.WeaponsExpanded;
import net.angelic.weaponsexpanded.enchantment.custom.WitheringEnchantmentEffect;
import net.minecraft.enchantment.effect.EnchantmentEntityEffect;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModEnchantmentEffects {
    public static final MapCodec<? extends EnchantmentEntityEffect> WITHERING =
            registerEntityEffect("withering", WitheringEnchantmentEffect.CODEC);

    private static MapCodec<? extends EnchantmentEntityEffect> registerEntityEffect(String name, MapCodec<? extends EnchantmentEntityEffect> codec) {
        return Registry.register(Registries.ENCHANTMENT_ENTITY_EFFECT_TYPE, Identifier.of(WeaponsExpanded.MOD_ID, name), codec);
    }

    public static void registerEnchantmentEffects() {
        WeaponsExpanded.LOGGER.info("Registering enchantment effects for " + WeaponsExpanded.MOD_ID);
    }
}
