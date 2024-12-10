package net.angelic.weaponsexpanded.item;

import net.angelic.weaponsexpanded.WeaponsExpanded;
import net.angelic.weaponsexpanded.item.custom.KatanaItem;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item WOODEN_BROADSWORD = registerItem("wooden_broadsword", new SwordItem(ToolMaterial.WOOD, 2.0F, -2.1F,
            new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(WeaponsExpanded.MOD_ID,"wooden_broadsword")))));

    public static final Item GOLDEN_BROADSWORD = registerItem("golden_broadsword", new SwordItem(ToolMaterial.GOLD, 2.0F, -2.1F,
            new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(WeaponsExpanded.MOD_ID,"golden_broadsword")))));

    public static final Item STONE_BROADSWORD = registerItem("stone_broadsword", new SwordItem(ToolMaterial.STONE, 2.0F, -2.1F,
            new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(WeaponsExpanded.MOD_ID,"stone_broadsword")))));

    public static final Item IRON_BROADSWORD = registerItem("iron_broadsword", new SwordItem(ToolMaterial.IRON, 2.0F, -2.2F,
            new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(WeaponsExpanded.MOD_ID,"iron_broadsword")))));

    public static final Item DIAMOND_BROADSWORD = registerItem("diamond_broadsword", new SwordItem(ToolMaterial.DIAMOND, 2.0F, -2.2F,
            new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(WeaponsExpanded.MOD_ID,"diamond_broadsword")))));

    public static final Item NETHERITE_BROADSWORD = registerItem("netherite_broadsword", new SwordItem(ToolMaterial.NETHERITE, 2.0F, -2.2F,
            new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(WeaponsExpanded.MOD_ID,"netherite_broadsword")))));

    public static final Item WOODEN_SICKLE = registerItem("wooden_sickle", new SwordItem(ToolMaterial.WOOD, 2.5F, -2.3F,
            new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(WeaponsExpanded.MOD_ID,"wooden_sickle")))));

    public static final Item GOLDEN_SICKLE = registerItem("golden_sickle", new SwordItem(ToolMaterial.GOLD, 2.5F, -2.3F,
            new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(WeaponsExpanded.MOD_ID,"golden_sickle")))));

    public static final Item STONE_SICKLE = registerItem("stone_sickle", new SwordItem(ToolMaterial.STONE, 2.5F, -2.3F,
            new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(WeaponsExpanded.MOD_ID,"stone_sickle")))));

    public static final Item IRON_SICKLE = registerItem("iron_sickle", new SwordItem(ToolMaterial.IRON, 2.5F, -2.3F,
            new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(WeaponsExpanded.MOD_ID,"iron_sickle")))));

    public static final Item DIAMOND_SICKLE = registerItem("diamond_sickle", new SwordItem(ToolMaterial.DIAMOND, 2.5F, -2.3F,
            new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(WeaponsExpanded.MOD_ID,"diamond_sickle")))));

    public static final Item NETHERITE_SICKLE = registerItem("netherite_sickle", new SwordItem(ToolMaterial.NETHERITE, 2.5F, -2.3F,
            new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(WeaponsExpanded.MOD_ID,"netherite_sickle")))));

    public static final Item WOODEN_KATANA = registerItem("wooden_katana", new KatanaItem(ToolMaterial.WOOD, 4.0F, -2.2F,
            new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(WeaponsExpanded.MOD_ID,"wooden_katana")))));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(WeaponsExpanded.MOD_ID, name), item);
    }

    public static void registerModItems() {
        WeaponsExpanded.LOGGER.info("Registering Mod Items for " + WeaponsExpanded.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(entries -> {
            entries.add(WOODEN_BROADSWORD);
            entries.add(GOLDEN_BROADSWORD);
            entries.add(STONE_BROADSWORD);
            entries.add(IRON_BROADSWORD);
            entries.add(DIAMOND_BROADSWORD);
            entries.add(NETHERITE_BROADSWORD);
            entries.add(WOODEN_SICKLE);
            entries.add(GOLDEN_SICKLE);
            entries.add(STONE_SICKLE);
            entries.add(IRON_SICKLE);
            entries.add(DIAMOND_SICKLE);
            entries.add(NETHERITE_SICKLE);
            entries.add(WOODEN_KATANA);
        });
    }
}
