package net.angelic.weaponsexpanded;

import net.angelic.weaponsexpanded.effect.ModEffects;
import net.angelic.weaponsexpanded.enchantment.ModEnchantmentEffects;
import net.angelic.weaponsexpanded.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WeaponsExpanded implements ModInitializer {
	public static final String MOD_ID = "weaponsexpanded";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
// Putting this here so I can commit.
	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModEnchantmentEffects.registerEnchantmentEffects();
		ModEffects.registerEffects();
	}
}