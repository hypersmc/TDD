
package net.hyperteam.thedescendingdimensions.world.biome;

import net.minecraft.block.material.Material;

@TheDescendingDimensionsModElements.ModElement.Tag
public class TheVoidBiome extends TheDescendingDimensionsModElements.ModElement {

	@ObjectHolder("the_descending_dimensions:the_void")
	public static final CustomBiome biome = null;

	public TheVoidBiome(TheDescendingDimensionsModElements instance) {
		super(instance, 43);
	}

	@Override
	public void initElements() {
		elements.biomes.add(() -> new CustomBiome());
	}

	@Override
	public void init(FMLCommonSetupEvent event) {
	}

	static class CustomBiome extends Biome {

		public CustomBiome() {
			super(new Biome.Builder().downfall(0.5f).depth(0.1f).scale(0.2f).temperature(0.5f).precipitation(Biome.RainType.RAIN)
					.category(Biome.Category.NONE).waterColor(-16777216).waterFogColor(-16777216)
					.surfaceBuilder(SurfaceBuilder.DEFAULT, new SurfaceBuilderConfig(WeatheredBedrockBlock.block.getDefaultState(),
							WeatheredBedrockBlock.block.getDefaultState(), WeatheredBedrockBlock.block.getDefaultState())));

			setRegistryName("the_void");

			DefaultBiomeFeatures.addCarvers(this);
			DefaultBiomeFeatures.addStructures(this);
			DefaultBiomeFeatures.addMonsterRooms(this);
			DefaultBiomeFeatures.addOres(this);

		}

		@OnlyIn(Dist.CLIENT)
		@Override
		public int getGrassColor(double posX, double posZ) {
			return -16777216;
		}

		@OnlyIn(Dist.CLIENT)
		@Override
		public int getFoliageColor() {
			return -16777216;
		}

		@OnlyIn(Dist.CLIENT)
		@Override
		public int getSkyColor() {
			return -16777216;
		}

	}

}
