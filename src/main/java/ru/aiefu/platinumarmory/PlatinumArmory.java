package ru.aiefu.platinumarmory;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;
import net.minecraft.util.registry.Registry;

public class PlatinumArmory implements ModInitializer {

	public static final String MOD_ID = "platinumarmory";

	public static final Item PLATINUM_INGOT = new Item(new FabricItemSettings().group(ItemGroup.MISC));
	public static final Item PLATINUM_GOLDEN_ALLOY_RAW = new Item(new FabricItemSettings().group(ItemGroup.MISC));
	public static final Item PLATINUM_GOLDEN_ALLOY_SMELTED = new Item(new FabricItemSettings().group(ItemGroup.MISC));
	public static final Item DIAMOND_PLATE = new Item(new FabricItemSettings().group(ItemGroup.MISC));
	public static final Item IRIDIUM_INGOT = new Item(new FabricItemSettings().group(ItemGroup.MISC));
	public static final Item PLATINUM_IRIDIUM_ALLOY_RAW = new Item(new FabricItemSettings().group(ItemGroup.MISC));
	public static final Item PLATINUM_IRIDIUM_ALLOY_SMELTED = new Item(new FabricItemSettings().group(ItemGroup.MISC));


	@Override
	public void onInitialize() {
		Registry.register(Registry.ITEM, craftID("platinum_ingot"), PLATINUM_INGOT);
		Registry.register(Registry.ITEM, craftID("plat_gold_allow_raw"), PLATINUM_GOLDEN_ALLOY_RAW);
		Registry.register(Registry.ITEM, craftID("plat_gold_allow_smelted"), PLATINUM_GOLDEN_ALLOY_SMELTED);
		Registry.register(Registry.ITEM, craftID("diamond_plate"), DIAMOND_PLATE);
		Registry.register(Registry.ITEM, craftID("iridium_ingot"), IRIDIUM_INGOT);
		Registry.register(Registry.ITEM, craftID("plat_ir_allow_raw"), PLATINUM_IRIDIUM_ALLOY_RAW);
		Registry.register(Registry.ITEM, craftID("plat_ir_allow_smelted"), PLATINUM_IRIDIUM_ALLOY_SMELTED);
	}
	public Identifier craftID(String id){
		return new Identifier(MOD_ID, id);
	}
}
