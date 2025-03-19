package net.angelic.weaponsexpanded.item.custom;

import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.*;
import net.minecraft.util.Hand;
import net.minecraft.world.World;

public class TwoHandedSwordItem extends SwordItem {
    public TwoHandedSwordItem(ToolMaterial material, float attackDamage, float attackSpeed, Settings settings) {
        super(material, attackDamage, attackSpeed, settings);
    }

    @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
        if (selected) {
            if (entity instanceof PlayerEntity) {
                ItemStack offhandItem = ((PlayerEntity) entity).getStackInHand(Hand.OFF_HAND);
                ((PlayerEntity) entity).setStackInHand(Hand.OFF_HAND, ItemStack.EMPTY);
                ((PlayerEntity) entity).giveOrDropStack(offhandItem);
            }
        }
        super.inventoryTick(stack, world, entity, slot, selected);
    }
}
