
package net.hyperteam.thedescendingdimensions.world.dimension;

import net.minecraft.block.material.Material;

@TheDescendingDimensionsModElements.ModElement.Tag
public class VoidlandsDimension extends TheDescendingDimensionsModElements.ModElement {

	@ObjectHolder("the_descending_dimensions:voidlands")
	public static final ModDimension dimension = null;

	public static DimensionType type = null;

	private static Biome[] dimensionBiomes;

	public VoidlandsDimension(TheDescendingDimensionsModElements instance) {
		super(instance, 43);

		MinecraftForge.EVENT_BUS.register(this);
		FMLJavaModLoadingContext.get().getModEventBus().register(this);
	}

	@SubscribeEvent
	public void registerDimension(RegistryEvent.Register<ModDimension> event) {
		event.getRegistry().register(new CustomModDimension().setRegistryName("voidlands"));
	}

	@SubscribeEvent
	public void onRegisterDimensionsEvent(RegisterDimensionsEvent event) {
		if (DimensionType.byName(new ResourceLocation("the_descending_dimensions:voidlands")) == null) {
			DimensionManager.registerDimension(new ResourceLocation("the_descending_dimensions:voidlands"), dimension, null, false);
		}

		type = DimensionType.byName(new ResourceLocation("the_descending_dimensions:voidlands"));
	}

	@Override
	public void init(FMLCommonSetupEvent event) {
		dimensionBiomes = new Biome[]{};
	}

	public static class CustomModDimension extends ModDimension {

		@Override
		public BiFunction<World, DimensionType, ? extends Dimension> getFactory() {
			return CustomDimension::new;
		}

	}

	public static class CustomDimension extends Dimension {

		private BiomeProviderCustom biomeProviderCustom = null;

		public CustomDimension(World world, DimensionType type) {
			super(world, type, 0.5f);
			this.nether = true;
		}

		@Override public void calculateInitialWeather() {
		}

    	@Override public void updateWeather(Runnable defaultWeather) {
		}

		@Override public boolean canDoLightning(Chunk chunk) {
			return false;
		}

		@Override public boolean canDoRainSnowIce(Chunk chunk) {
			return false;
		}

		@Override @OnlyIn(Dist.CLIENT) public Vec3d getFogColor(float cangle, float ticks) {
			return new Vec3d(0,0,0);
		}

		@Override public ChunkGenerator<?> createChunkGenerator() {
			if(this.biomeProviderCustom == null) {
				this.biomeProviderCustom = new BiomeProviderCustom(this.world);
			}
			return new ChunkProviderModded(this.world, this.biomeProviderCustom);
		}

		@Override public boolean isSurfaceWorld() {
			return false;
		}

		@Override public boolean canRespawnHere() {
			return false;
		}

		@OnlyIn(Dist.CLIENT) @Override public boolean doesXZShowFog(int x, int z) {
			return false;
		}

		@Override public SleepResult canSleepAt(PlayerEntity player, BlockPos pos){
        	return SleepResult.BED_EXPLODES;
		}

		@Nullable public BlockPos findSpawn(ChunkPos chunkPos, boolean checkValid) {
   		   return null;
   		}

   		@Nullable public BlockPos findSpawn(int x, int z, boolean checkValid) {
   		   return null;
   		}

		@Override public boolean doesWaterVaporize() {
      		return false;
   		}

		@Override /* failed to load code for net.minecraft.world.dimension.OverworldDimension */

	}

	@SubscribeEvent
	public void onPlayerChangedDimensionEvent(PlayerEvent.PlayerChangedDimensionEvent event) {
		Entity entity = event.getPlayer();
		World world = entity.world;
		int x = (int) entity.getPosX();
		int y = (int) entity.getPosY();
		int z = (int) entity.getPosZ();

		if (event.getTo() == type) {
			{
				java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
				$_dependencies.put("entity", entity);
				$_dependencies.put("world", world);

				VoidlandsPlayerEntersDimensionProcedure.executeProcedure($_dependencies);
			}
		}
	}

	public static class ChunkProviderModded extends NetherChunkGenerator {

		public ChunkProviderModded(World world, BiomeProvider provider) {
			super(world, provider, new NetherGenSettings() {
				public BlockState getDefaultBlock() {
					return WeatheredBedrockItem.block.getDefaultState();
				}

				public BlockState getDefaultFluid() {
					return Blocks.LAVA.getDefaultState();
				}
			});
			this.randomSeed.skip(9716);
		}

		@Override
		public List<Biome.SpawnListEntry> getPossibleCreatures(EntityClassification creatureType, BlockPos pos) {
			return this.world.getBiome(pos).getSpawns(creatureType);
		}

	}

	public static class BiomeLayerCustom implements IC0Transformer {

		@Override
		public int apply(INoiseRandom context, int value) {
			return Registry.BIOME.getId(dimensionBiomes[context.random(dimensionBiomes.length)]);
		}

	}

	public static class BiomeProviderCustom extends BiomeProvider {

		private Layer genBiomes;

		public BiomeProviderCustom(World world) {
			super(new HashSet<Biome>(Arrays.asList(dimensionBiomes)));

			this.genBiomes = getBiomeLayer(world.getSeed());

		}

		public Biome getNoiseBiome(int x, int y, int z) {
			return this.genBiomes.func_215738_a(x, z);
		}

		private Layer getBiomeLayer(long seed) {
			LongFunction<IExtendedNoiseRandom<LazyArea>> contextFactory = l -> new LazyAreaLayerContext(25, seed, l);

			IAreaFactory<LazyArea> parentLayer = IslandLayer.INSTANCE.apply(contextFactory.apply(1));
			IAreaFactory<LazyArea> biomeLayer = (new BiomeLayerCustom()).apply(contextFactory.apply(200), parentLayer);

			biomeLayer = ZoomLayer.NORMAL.apply(contextFactory.apply(1000), biomeLayer);
			biomeLayer = ZoomLayer.NORMAL.apply(contextFactory.apply(1001), biomeLayer);
			biomeLayer = ZoomLayer.NORMAL.apply(contextFactory.apply(1002), biomeLayer);
			biomeLayer = ZoomLayer.NORMAL.apply(contextFactory.apply(1003), biomeLayer);
			biomeLayer = ZoomLayer.NORMAL.apply(contextFactory.apply(1004), biomeLayer);
			biomeLayer = ZoomLayer.NORMAL.apply(contextFactory.apply(1005), biomeLayer);

			return new Layer(biomeLayer);
		}

	}

}
