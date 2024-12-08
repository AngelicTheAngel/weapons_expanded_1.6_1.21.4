package net.angelic.weaponsexpanded.datagen;

import net.angelic.weaponsexpanded.item.ModItems;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.client.data.BlockStateModelGenerator;
import net.minecraft.client.data.ItemModelGenerator;
import net.minecraft.client.data.Models;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.WOODEN_BROADSWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.GOLDEN_BROADSWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.STONE_BROADSWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.IRON_BROADSWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.DIAMOND_BROADSWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.NETHERITE_BROADSWORD, Models.HANDHELD);
    }
}
