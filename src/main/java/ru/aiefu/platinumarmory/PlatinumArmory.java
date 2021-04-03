package ru.aiefu.platinumarmory;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.Blocks;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import ru.aiefu.platinumarmory.materials.DiamondPlated;
import ru.aiefu.platinumarmory.materials.GoldPlatinumAlloy;
import ru.aiefu.platinumarmory.materials.IridiumPlatinumAlloy;

public class PlatinumArmory implements ModInitializer {

	public static final String MOD_ID = "platinumarmory";

	public static final ArmorMaterial PLATINUM_GOLD_ALLOY = new GoldPlatinumAlloy();
	public static final ArmorMaterial DIAMOND_PLATED = new DiamondPlated();
	public static final ArmorMaterial PLATINUM_IRIDIUM_ALLOY = new IridiumPlatinumAlloy();
	public static final Item PLATINUM_INGOT = new Item(new FabricItemSettings().group(ItemGroup.MISC));
	public static final Item PLATINUM_GOLDEN_ALLOY_RAW = new Item(new FabricItemSettings().group(ItemGroup.MISC));
	public static final Item PLATINUM_GOLDEN_ALLOY_SMELTED = new Item(new FabricItemSettings().group(ItemGroup.MISC));
	public static final Item DIAMOND_PLATE = new Item(new FabricItemSettings().group(ItemGroup.MISC));
	public static final Item IRIDIUM_INGOT = new Item(new FabricItemSettings().group(ItemGroup.MISC));
	public static final Item PLATINUM_IRIDIUM_ALLOY_RAW = new Item(new FabricItemSettings().group(ItemGroup.MISC));
	public static final Item PLATINUM_IRIDIUM_ALLOY_SMELTED = new Item(new FabricItemSettings().group(ItemGroup.MISC));
	public static final Item PLATINUM_GOLD_HELMET = new ArmorItem(PLATINUM_GOLD_ALLOY, EquipmentSlot.HEAD, new Item.Settings().group(ItemGroup.COMBAT));
	public static final Item PLATINUM_GOLD_CHESTPLATE = new ArmorItem(PLATINUM_GOLD_ALLOY, EquipmentSlot.CHEST, new Item.Settings().group(ItemGroup.COMBAT));
	public static final Item PLATINUM_GOLD_LEGGINGS = new ArmorItem(PLATINUM_GOLD_ALLOY, EquipmentSlot.LEGS, new Item.Settings().group(ItemGroup.COMBAT));
	public static final Item PLATINUM_GOLD_BOOTS = new ArmorItem(PLATINUM_GOLD_ALLOY, EquipmentSlot.FEET, new Item.Settings().group(ItemGroup.COMBAT));
	public static final Item DIAMOND_PLATED_HELMET = new ArmorItem(DIAMOND_PLATED, EquipmentSlot.HEAD, new Item.Settings().group(ItemGroup.COMBAT));
	public static final Item DIAMOND_PLATED_CHESTPLATE = new ArmorItem(DIAMOND_PLATED, EquipmentSlot.CHEST, new Item.Settings().group(ItemGroup.COMBAT));
	public static final Item DIAMOND_PLATED_LEGGINGS = new ArmorItem(DIAMOND_PLATED, EquipmentSlot.LEGS, new Item.Settings().group(ItemGroup.COMBAT));
	public static final Item DIAMOND_PLATED_BOOTS = new ArmorItem(DIAMOND_PLATED, EquipmentSlot.FEET, new Item.Settings().group(ItemGroup.COMBAT));
	public static final Item PLATINUM_IRIDIUM_HELMET = new ArmorItem(PLATINUM_IRIDIUM_ALLOY, EquipmentSlot.HEAD, new Item.Settings().group(ItemGroup.COMBAT));
	public static final Item PLATINUM_IRIDIUM_CHESTPLATE = new ArmorItem(PLATINUM_IRIDIUM_ALLOY, EquipmentSlot.CHEST, new Item.Settings().group(ItemGroup.COMBAT));
	public static final Item PLATINUM_IRIDIUM_LEGGINGS = new ArmorItem(PLATINUM_IRIDIUM_ALLOY, EquipmentSlot.LEGS, new Item.Settings().group(ItemGroup.COMBAT));
	public static final Item PLATINUM_IRIDIUM_BOOTS = new ArmorItem(PLATINUM_IRIDIUM_ALLOY, EquipmentSlot.FEET, new Item.Settings().group(ItemGroup.COMBAT));

	@Override
	public void onInitialize() {
		Registry.register(Registry.ITEM, craftID("platinum_ingot"), PLATINUM_INGOT);
		Registry.register(Registry.ITEM, craftID("plat_gold_allow_raw"), PLATINUM_GOLDEN_ALLOY_RAW);
		Registry.register(Registry.ITEM, craftID("plat_gold_allow_smelted"), PLATINUM_GOLDEN_ALLOY_SMELTED);
		Registry.register(Registry.ITEM, craftID("diamond_plate"), DIAMOND_PLATE);
		Registry.register(Registry.ITEM, craftID("iridium_ingot"), IRIDIUM_INGOT);
		Registry.register(Registry.ITEM, craftID("plat_ir_allow_raw"), PLATINUM_IRIDIUM_ALLOY_RAW);
		Registry.register(Registry.ITEM, craftID("plat_ir_allow_smelted"), PLATINUM_IRIDIUM_ALLOY_SMELTED);
		//Plat-Gold-Armor
		Registry.register(Registry.ITEM, craftID("plat_gold_helmet"), PLATINUM_GOLD_HELMET);
		Registry.register(Registry.ITEM, craftID("plat_gold_chestplate"), PLATINUM_GOLD_CHESTPLATE);
		Registry.register(Registry.ITEM, craftID("plat_gold_leggings"), PLATINUM_GOLD_LEGGINGS);
		Registry.register(Registry.ITEM, craftID("plat_gold_boots"), PLATINUM_GOLD_BOOTS);
		//Diamond-Plated-Armor
		Registry.register(Registry.ITEM, craftID("diamond_plated_helmet"), DIAMOND_PLATED_HELMET);
		Registry.register(Registry.ITEM, craftID("diamond_plated_chestplate"), DIAMOND_PLATED_CHESTPLATE);
		Registry.register(Registry.ITEM, craftID("diamond_plated_leggings"), DIAMOND_PLATED_LEGGINGS);
		Registry.register(Registry.ITEM, craftID("diamond_plated_boots"), DIAMOND_PLATED_BOOTS);
		//Plat-Iridium-Armor
		Registry.register(Registry.ITEM, craftID("plat_ir_helmet"), PLATINUM_IRIDIUM_HELMET);
		Registry.register(Registry.ITEM, craftID("plat_ir_chestplate"), PLATINUM_IRIDIUM_CHESTPLATE);
		Registry.register(Registry.ITEM, craftID("plat_ir_leggings"), PLATINUM_IRIDIUM_LEGGINGS);
		Registry.register(Registry.ITEM, craftID("plat_ir_boots"), PLATINUM_IRIDIUM_BOOTS);

	}
	public Identifier craftID(String id){
		return new Identifier(MOD_ID, id);
	}
}
