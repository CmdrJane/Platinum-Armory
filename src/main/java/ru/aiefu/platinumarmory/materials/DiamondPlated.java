package ru.aiefu.platinumarmory.materials;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import ru.aiefu.platinumarmory.PlatinumArmory;

public class DiamondPlated implements ArmorMaterial {
    private static final int[] BASE_DURABILITY = new int[] {13, 15, 16, 11};
    private static final int[] PROTECTION_VALUES = new int[] {3, 7, 7, 3};

    @Override
    public int getDurability(EquipmentSlot slot) {
        return BASE_DURABILITY[slot.getEntitySlotId() * 37];
    }

    @Override
    public int getProtectionAmount(EquipmentSlot slot) {
        return PROTECTION_VALUES[slot.getEntitySlotId()];
    }

    @Override
    public int getEnchantability() {
        return 23;
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
        return null;
    }

    @Override
    public float getToughness() {
        return 1.4F;
    }

    @Override
    public float getKnockbackResistance() {
        return 0.75F;
    }
}
