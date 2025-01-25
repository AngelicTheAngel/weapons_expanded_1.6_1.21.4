package net.angelic.weaponsexpanded.util;

import net.angelic.weaponsexpanded.WeaponsExpanded;
import net.minecraft.block.Block;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> NEEDS_MINELESS_WOOD_TOOL = createTag("needs_mineless_wood_tool");
        public static final TagKey<Block> INCORRECT_FOR_MINELESS_WOOD_TOOL = createTag("incorrect_for_mineless_wood_tool");
        public static final TagKey<Block> NEEDS_MINELESS_GOLD_TOOL = createTag("needs_mineless_gold_tool");
        public static final TagKey<Block> INCORRECT_FOR_MINELESS_GOLD_TOOL = createTag("incorrect_for_mineless_gold_tool");
        public static final TagKey<Block> NEEDS_MINELESS_STONE_TOOL = createTag("needs_mineless_stone_tool");
        public static final TagKey<Block> INCORRECT_FOR_MINELESS_STONE_TOOL = createTag("incorrect_for_mineless_stone_tool");
        public static final TagKey<Block> NEEDS_MINELESS_IRON_TOOL = createTag("needs_mineless_iron_tool");
        public static final TagKey<Block> INCORRECT_FOR_MINELESS_IRON_TOOL = createTag("incorrect_for_mineless_iron_tool");
        public static final TagKey<Block> NEEDS_MINELESS_DIAMOND_TOOL = createTag("needs_mineless_diamond_tool");
        public static final TagKey<Block> INCORRECT_FOR_MINELESS_DIAMOND_TOOL = createTag("incorrect_for_mineless_diamond_tool");
        public static final TagKey<Block> NEEDS_MINELESS_NETHERITE_TOOL = createTag("needs_mineless_netherite_tool");
        public static final TagKey<Block> INCORRECT_FOR_MINELESS_NETHERITE_TOOL = createTag("incorrect_for_mineless_netherite_tool");

        private static TagKey<Block> createTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, Identifier.of(WeaponsExpanded.MOD_ID, name));
        }
    }

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
