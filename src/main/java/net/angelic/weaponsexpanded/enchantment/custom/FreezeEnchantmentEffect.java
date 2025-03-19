package net.angelic.weaponsexpanded.enchantment.custom;

import com.mojang.serialization.MapCodec;
import net.angelic.weaponsexpanded.effect.ModEffects;
import net.minecraft.enchantment.EnchantmentEffectContext;
import net.minecraft.enchantment.effect.EnchantmentEntityEffect;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.Vec3d;

public record FreezeEnchantmentEffect() implements EnchantmentEntityEffect {
    public static final MapCodec<FreezeEnchantmentEffect> CODEC = MapCodec.unit(FreezeEnchantmentEffect::new);

    @Override
    public void apply(ServerWorld world, int level, EnchantmentEffectContext context, Entity user, Vec3d pos) {
        if (user instanceof LivingEntity) {
            StatusEffectInstance frostbiteEffect = new StatusEffectInstance(ModEffects.FROSTBITE, 100, 0);
            ((LivingEntity) user).addStatusEffect(frostbiteEffect);
        }
    }

    @Override
    public MapCodec<? extends EnchantmentEntityEffect> getCodec() {
        return CODEC;
    }
}