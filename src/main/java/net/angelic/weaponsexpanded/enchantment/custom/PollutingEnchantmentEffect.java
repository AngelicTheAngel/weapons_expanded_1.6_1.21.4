package net.angelic.weaponsexpanded.enchantment.custom;

import com.mojang.serialization.MapCodec;
import net.minecraft.enchantment.EnchantmentEffectContext;
import net.minecraft.enchantment.effect.EnchantmentEntityEffect;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.Vec3d;

public record PollutingEnchantmentEffect() implements EnchantmentEntityEffect {
    public static final MapCodec<PollutingEnchantmentEffect> CODEC = MapCodec.unit(PollutingEnchantmentEffect::new);

    @Override
    public void apply(ServerWorld world, int level, EnchantmentEffectContext context, Entity user, Vec3d pos) {
        if (user instanceof LivingEntity) {
            StatusEffectInstance pollutingEffectL1 = new StatusEffectInstance(StatusEffects.POISON, 160, 0);
            StatusEffectInstance pollutingEffectL2 = new StatusEffectInstance(StatusEffects.POISON, 300, 0);
            if (level == 1) {
                ((LivingEntity) user).addStatusEffect(pollutingEffectL1);
            }
            if (level == 2) {
                ((LivingEntity) user).addStatusEffect(pollutingEffectL2);
            }
        }
    }

    @Override
    public MapCodec<? extends EnchantmentEntityEffect> getCodec() {
        return CODEC;
    }
}