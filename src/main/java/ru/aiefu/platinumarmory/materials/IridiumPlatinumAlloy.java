package ru.aiefu.platinumarmory.materials;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import ru.aiefu.platinumarmory.PlatinumArmory;

public class IridiumPlatinumAlloy implements ArmorMaterial {
    private static final int[] BASE_DURABILITY = new int[] {17, 30, 25, 21};
    private static final int[] PROTECTION_VALUES = new int[] {4, 9, 8, 4};

    @Override
    public int getDurability(EquipmentSlot slot) {
        return BASE_DURABILITY[slot.getEntitySlotId()] * 40;
    }

    @Override
    public int getProtectionAmount(EquipmentSlot slot) {
        return PROTECTION_VALUES[slot.getEntitySlotId()];
    }

    @Override
    public int getEnchantability() {
        return 28;
    }

    @Override
    public SoundEvent getEquipSound() {
        return SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(PlatinumArmory.PLATINUM_IRIDIUM_ALLOY_SMELTED, PlatinumArmory.DIAMOND_PLATE);
    }

    @Override
    public String getName() {
        return "plat_ir";
    }

    @Override
    public float getToughness() {
        return 2.0F;
    }

    @Override
    public float getKnockbackResistance() {
        return 1.75F;
    }
}
