package ru.aiefu.platinumarmory;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class PlatinumArmory implements ModInitializer {

	public static final Item PLATINUM_INGOT = new Item(new FabricItemSettings().group(ItemGroup.MISC));
	public static final Item PLATINUM_GOLDEN_ALLOY_RAW = new Item(new FabricItemSettings().group(ItemGroup.MISC));
	public static final Item PLATINUM_GOLDEN_ALLOY_SMELTED = new Item(new FabricItemSettings().group(ItemGroup.MISC));
	public static final Item DIAMOND_PLATE = new Item(new FabricItemSettings().group(ItemGroup.MISC));
	public static final Item IRIDIUM_INGOT = new Item(new FabricItemSettings().group(ItemGroup.MISC));
	public static final Item PLATINUM_IRIDIUM_ALLOY_RAW = new Item(new FabricItemSettings().group(ItemGroup.MISC));
	public static final Item PLATINUM_IRIDIUM_ALLOY_SMELTED = new Item(new FabricItemSettings().group(ItemGroup.MISC));


	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		System.out.println("Hello Fabric world!");
	}
}
