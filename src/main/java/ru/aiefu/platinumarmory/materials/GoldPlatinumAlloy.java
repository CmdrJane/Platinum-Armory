package ru.aiefu.platinumarmory.materials;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import ru.aiefu.platinumarmory.PlatinumArmory;

public class GoldPlatinumAlloy implements ArmorMaterial {

    private static final int[] BASE_DURABILITY = new int[] {13, 17, 16, 15};
    private static final int[] PROTECTION_VALUES = new int[] {2, 6, 7, 3};

    @Override
    public int getDurability(EquipmentSlot slot) {
        return BASE_DURABILITY[slot.getEntitySlotId()] * 27;
    }

    @Override
    public int getProtectionAmount(EquipmentSlot slot) {
        return PROTECTION_VALUES[slot.getEntitySlotId()];
    }

    @Override
    public int getEnchantability() {
        return 20;
    }

    @Override
    public SoundEvent getEquipSound() {
        return SoundEvents.ITEM_ARMOR_EQUIP_GOLD;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(PlatinumArmory.PLATINUM_GOLDEN_ALLOY);
    }

    @Override
    public String getName() {
        return "plat_gold";
    }

    @Override
    public float getToughness() {
        return 0.75F;
    }

    @Override
    public float getKnockbackResistance() {
        return 0.75F;
    }
}
