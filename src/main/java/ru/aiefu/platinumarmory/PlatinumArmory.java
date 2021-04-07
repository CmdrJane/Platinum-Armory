package ru.aiefu.platinumarmory;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.*;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.structure.rule.BlockMatchRuleTest;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.gen.decorator.Decorator;
import net.minecraft.world.gen.decorator.RangeDecoratorConfig;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import ru.aiefu.platinumarmory.materials.DiamondPlated;
import ru.aiefu.platinumarmory.materials.GoldPlatinumAlloy;
import ru.aiefu.platinumarmory.materials.IridiumPlatinumAlloy;

public class PlatinumArmory implements ModInitializer {

	public static final String MOD_ID = "platinumarmory";
	//Materials
	public static final ArmorMaterial PLATINUM_GOLD_MATERIAL = new GoldPlatinumAlloy();
	public static final ArmorMaterial DIAMOND_PLATED = new DiamondPlated();
	public static final ArmorMaterial PLATINUM_IRIDIUM_MATERIAL = new IridiumPlatinumAlloy();
	//Crafting Stuff
	public static final Item PLATINUM_INGOT = new Item(new FabricItemSettings().group(ItemGroup.MATERIALS));
	public static final Item PLATINUM_GOLDEN_ALLOY = new Item(new FabricItemSettings().group(ItemGroup.MATERIALS));
	public static final Item DIAMOND_PLATE = new Item(new FabricItemSettings().group(ItemGroup.MATERIALS));
	public static final Item IRIDIUM_INGOT = new Item(new FabricItemSettings().group(ItemGroup.MATERIALS));
	public static final Item PLATINUM_IRIDIUM_ALLOY = new Item(new FabricItemSettings().group(ItemGroup.MATERIALS));
	//Armor Plat-Gold
	public static final Item PLATINUM_GOLD_HELMET = new ArmorItem(PLATINUM_GOLD_MATERIAL, EquipmentSlot.HEAD, new Item.Settings().group(ItemGroup.COMBAT));
	public static final Item PLATINUM_GOLD_CHESTPLATE = new ArmorItem(PLATINUM_GOLD_MATERIAL, EquipmentSlot.CHEST, new Item.Settings().group(ItemGroup.COMBAT));
	public static final Item PLATINUM_GOLD_LEGGINGS = new ArmorItem(PLATINUM_GOLD_MATERIAL, EquipmentSlot.LEGS, new Item.Settings().group(ItemGroup.COMBAT));
	public static final Item PLATINUM_GOLD_BOOTS = new ArmorItem(PLATINUM_GOLD_MATERIAL, EquipmentSlot.FEET, new Item.Settings().group(ItemGroup.COMBAT));
	//Armor Diamond-Plated
	public static final Item DIAMOND_PLATED_HELMET = new ArmorItem(DIAMOND_PLATED, EquipmentSlot.HEAD, new Item.Settings().group(ItemGroup.COMBAT));
	public static final Item DIAMOND_PLATED_CHESTPLATE = new ArmorItem(DIAMOND_PLATED, EquipmentSlot.CHEST, new Item.Settings().group(ItemGroup.COMBAT));
	public static final Item DIAMOND_PLATED_LEGGINGS = new ArmorItem(DIAMOND_PLATED, EquipmentSlot.LEGS, new Item.Settings().group(ItemGroup.COMBAT));
	public static final Item DIAMOND_PLATED_BOOTS = new ArmorItem(DIAMOND_PLATED, EquipmentSlot.FEET, new Item.Settings().group(ItemGroup.COMBAT));
	//Armor Platinum-Iridium
	public static final Item PLATINUM_IRIDIUM_HELMET = new ArmorItem(PLATINUM_IRIDIUM_MATERIAL, EquipmentSlot.HEAD, new Item.Settings().group(ItemGroup.COMBAT));
	public static final Item PLATINUM_IRIDIUM_CHESTPLATE = new ArmorItem(PLATINUM_IRIDIUM_MATERIAL, EquipmentSlot.CHEST, new Item.Settings().group(ItemGroup.COMBAT));
	public static final Item PLATINUM_IRIDIUM_LEGGINGS = new ArmorItem(PLATINUM_IRIDIUM_MATERIAL, EquipmentSlot.LEGS, new Item.Settings().group(ItemGroup.COMBAT));
	public static final Item PLATINUM_IRIDIUM_BOOTS = new ArmorItem(PLATINUM_IRIDIUM_MATERIAL, EquipmentSlot.FEET, new Item.Settings().group(ItemGroup.COMBAT));
	//Ore
	public static final OreBlock PLATINUM_ORE = new OreBlock(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 2).requiresTool().strength(2.0f));
	public static final OreBlock IRIDIUM_ORE = new OreBlock(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 3).requiresTool().strength(6.0f));
	//Blocks
	public static final Block IRIDIUM_BLOCK = new Block(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 3).requiresTool().strength(5.0f));
	public static final Block PLATINUM_BLOCK = new Block(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 2).requiresTool().strength(1.5f));
	//Ore-Config-Feature
	public static final ConfiguredFeature<?, ?> ORE_PLATINUM_OVERWORLD = Feature.ORE.configure(new OreFeatureConfig(OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
			PLATINUM_ORE.getDefaultState(), 2)).decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(0, 0, 18))).spreadHorizontally().repeat(9);
	public static final ConfiguredFeature<?, ?> ORE_IRIDIUM_OVERWORLD = Feature.ORE.configure(new OreFeatureConfig(OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
			IRIDIUM_ORE.getDefaultState(), 1)).decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(0, 0, 24))).spreadHorizontally().repeat(2);
	public static final ConfiguredFeature<?, ?> ORE_IRIDIUM_END = Feature.ORE.configure(new OreFeatureConfig(new BlockMatchRuleTest(Blocks.END_STONE),
			IRIDIUM_ORE.getDefaultState(), 1)).decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(0, 0 /*min-Y*/, 128/*max-Y*/))).spreadHorizontally().repeat(4);

	@Override
	public void onInitialize() {
		Registry.register(Registry.ITEM, craftID("platinum_ingot"), PLATINUM_INGOT);
		Registry.register(Registry.ITEM, craftID("plat_gold_alloy"), PLATINUM_GOLDEN_ALLOY);
		Registry.register(Registry.ITEM, craftID("diamond_plate"), DIAMOND_PLATE);
		Registry.register(Registry.ITEM, craftID("iridium_ingot"), IRIDIUM_INGOT);
		Registry.register(Registry.ITEM, craftID("plat_ir_alloy"), PLATINUM_IRIDIUM_ALLOY);
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
		//Register Ore Blocks
		Registry.register(Registry.BLOCK, craftID("platinum_ore"), PLATINUM_ORE);
		Registry.register(Registry.BLOCK, craftID("iridium_ore"), IRIDIUM_ORE);
		//Register Blocks
		Registry.register(Registry.BLOCK, craftID("platinum_block"), PLATINUM_BLOCK);
		Registry.register(Registry.BLOCK, craftID("iridium_block"), IRIDIUM_BLOCK);
		//Register Items for Blocks
		Registry.register(Registry.ITEM, craftID("platinum_ore"), new BlockItem(PLATINUM_ORE, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
		Registry.register(Registry.ITEM, craftID("iridium_ore"), new BlockItem(IRIDIUM_ORE, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
		Registry.register(Registry.ITEM, craftID("platinum_block"), new BlockItem(PLATINUM_BLOCK, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
		Registry.register(Registry.ITEM, craftID("iridium_block"), new BlockItem(IRIDIUM_BLOCK, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
		//Register WorldGen Ore Feature
		Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, craftID("ore_platinum_overworld"), ORE_PLATINUM_OVERWORLD);
		Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, craftID("ore_iridium_overworld"), ORE_IRIDIUM_OVERWORLD);
		Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, craftID("ore_iridium_end"), ORE_IRIDIUM_END);
	}
	public Identifier craftID(String id){
		return new Identifier(MOD_ID, id);
	}
}
