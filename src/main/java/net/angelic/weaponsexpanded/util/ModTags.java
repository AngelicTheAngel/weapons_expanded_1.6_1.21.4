package net.angelic.weaponsexpanded.util;

import net.angelic.weaponsexpanded.WeaponsExpanded;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModTags {
    public static class items {

        private static TagKey<Item> createTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, Identifier.of(WeaponsExpanded.MOD_ID, name));
        }
    }
    public static class enchantments {

        private static TagKey<Enchantment> createTag(String name) {
            return TagKey.of(RegistryKeys.ENCHANTMENT, Identifier.of(WeaponsExpanded.MOD_ID, name));
        }
    }
}
