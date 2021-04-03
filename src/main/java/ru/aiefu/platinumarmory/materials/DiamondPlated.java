package ru.aiefu.platinumarmory.materials;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import ru.aiefu.platinumarmory.PlatinumArmory;

public class DiamondPlated implements ArmorMaterial {
    private static final int[] BASE_DURABILITY = new int[] {15, 25 , 19, 18};
    private static final int[] PROTECTION_VALUES = new int[] {4, 7, 7, 4};

    @Override
    public int getDurability(EquipmentSlot slot) {
        return BASE_DURABILITY[slot.getEntitySlotId()] * 37;
    }

    @Override
    public int getProtectionAmount(EquipmentSlot slot) {
        return PROTECTION_VALUES[slot.getEntitySlotId()];
    }

    @Override
    public int getEnchantability() {
        return 24;
    }

    @Override
    public SoundEvent getEquipSound() {
        return SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(PlatinumArmory.PLATINUM_GOLDEN_ALLOY_SMELTED, PlatinumArmory.DIAMOND_PLATE);
    }

    @Override
    public String getName() {
        return "diamond_plated";
    }

    @Override
    public float getToughness() {
        return 1.6F;
    }

    @Override
    public float getKnockbackResistance() {
        return 1.25F;
    }
}
