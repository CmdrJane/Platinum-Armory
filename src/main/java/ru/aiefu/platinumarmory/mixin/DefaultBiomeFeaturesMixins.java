package ru.aiefu.platinumarmory.mixin;

import net.minecraft.world.biome.GenerationSettings;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.feature.DefaultBiomeFeatures;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import ru.aiefu.platinumarmory.PlatinumArmory;

@Mixin(DefaultBiomeFeatures.class)
public class DefaultBiomeFeaturesMixins {
	@Inject(method = "addDefaultOres(Lnet/minecraft/world/biome/GenerationSettings$Builder;)V", at = @At(value = "TAIL"))
	private static void platinumArmoryOreFeatures(GenerationSettings.Builder builder, CallbackInfo ci) {
		builder.feature(GenerationStep.Feature.UNDERGROUND_ORES, PlatinumArmory.ORE_PLATINUM_OVERWORLD);
		builder.feature(GenerationStep.Feature.UNDERGROUND_ORES, PlatinumArmory.ORE_IRIDIUM_OVERWORLD);
		builder.feature(GenerationStep.Feature.UNDERGROUND_ORES, PlatinumArmory.ORE_IRIDIUM_END);
	}
}
