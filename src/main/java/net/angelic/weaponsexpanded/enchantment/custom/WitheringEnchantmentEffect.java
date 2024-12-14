package net.angelic.weaponsexpanded.enchantment.custom;

import com.mojang.serialization.MapCodec;
import net.minecraft.enchantment.EnchantmentEffectContext;
import net.minecraft.enchantment.effect.EnchantmentEntityEffect;
import net.minecraft.entity.Entity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.Vec3d;

public record WitheringEnchantmentEffect() implements EnchantmentEntityEffect {
    public static final MapCodec<WitheringEnchantmentEffect> CODEC = MapCodec.unit(WitheringEnchantmentEffect::new);

    @Override
    public void apply(ServerWorld world, int level, EnchantmentEffectContext context, Entity user, Vec3d pos) {
        if (level == 1) {
            user.kill(world);
        }
        if (level == 2) {
            user.setOnFireForTicks(20);
        }
    }

    @Override
    public MapCodec<? extends EnchantmentEntityEffect> getCodec() {
        return CODEC;
    }
}
