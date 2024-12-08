package net.angelic.weaponsexpanded.datagen;

import net.angelic.weaponsexpanded.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(ItemTags.SWORD_ENCHANTABLE)
                .add(ModItems.WOODEN_BROADSWORD)
                .add(ModItems.GOLDEN_BROADSWORD)
                .add(ModItems.STONE_BROADSWORD)
                .add(ModItems.IRON_BROADSWORD)
                .add(ModItems.DIAMOND_BROADSWORD)
                .add(ModItems.NETHERITE_BROADSWORD);
        getOrCreateTagBuilder(ItemTags.DURABILITY_ENCHANTABLE)
                .add(ModItems.WOODEN_BROADSWORD)
                .add(ModItems.GOLDEN_BROADSWORD)
                .add(ModItems.STONE_BROADSWORD)
                .add(ModItems.IRON_BROADSWORD)
                .add(ModItems.DIAMOND_BROADSWORD)
                .add(ModItems.NETHERITE_BROADSWORD);
        getOrCreateTagBuilder(ItemTags.WEAPON_ENCHANTABLE)
                .add(ModItems.WOODEN_BROADSWORD)
                .add(ModItems.GOLDEN_BROADSWORD)
                .add(ModItems.STONE_BROADSWORD)
                .add(ModItems.IRON_BROADSWORD)
                .add(ModItems.DIAMOND_BROADSWORD)
                .add(ModItems.NETHERITE_BROADSWORD);
        getOrCreateTagBuilder(ItemTags.FIRE_ASPECT_ENCHANTABLE)
                .add(ModItems.WOODEN_BROADSWORD)
                .add(ModItems.GOLDEN_BROADSWORD)
                .add(ModItems.STONE_BROADSWORD)
                .add(ModItems.IRON_BROADSWORD)
                .add(ModItems.DIAMOND_BROADSWORD)
                .add(ModItems.NETHERITE_BROADSWORD);
        getOrCreateTagBuilder(ItemTags.SHARP_WEAPON_ENCHANTABLE)
                .add(ModItems.WOODEN_BROADSWORD)
                .add(ModItems.GOLDEN_BROADSWORD)
                .add(ModItems.STONE_BROADSWORD)
                .add(ModItems.IRON_BROADSWORD)
                .add(ModItems.DIAMOND_BROADSWORD)
                .add(ModItems.NETHERITE_BROADSWORD);
        getOrCreateTagBuilder(ItemTags.SWORDS)
                .add(ModItems.WOODEN_BROADSWORD)
                .add(ModItems.GOLDEN_BROADSWORD)
                .add(ModItems.STONE_BROADSWORD)
                .add(ModItems.IRON_BROADSWORD)
                .add(ModItems.DIAMOND_BROADSWORD)
                .add(ModItems.NETHERITE_BROADSWORD);
    }
}