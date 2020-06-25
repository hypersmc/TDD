package net.hyperteam.thedescendingdimensions.procedures;

@TheDescendingDimensionsModElements.ModElement.Tag
public class VoidlandsPlayerEntersDimensionProcedure extends TheDescendingDimensionsModElements.ModElement {

	public VoidlandsPlayerEntersDimensionProcedure(TheDescendingDimensionsModElements instance) {
		super(instance, 45);

	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure VoidlandsPlayerEntersDimension!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure VoidlandsPlayerEntersDimension!");
			return;
		}

		Entity entity = (Entity) dependencies.get("entity");
		World world = (World) dependencies.get("world");

		world.setBlockState(new BlockPos((int) (entity.getPosX()), (int) (entity.getPosY()), (int) (entity.getPosZ())), Blocks.AIR.getDefaultState(),
				3);
		world.setBlockState(new BlockPos((int) (entity.getPosX()), (int) ((entity.getPosY()) + 1), (int) (entity.getPosZ())),
				Blocks.AIR.getDefaultState(), 3);
		world.setBlockState(new BlockPos((int) (entity.getPosX()), (int) ((entity.getPosY()) - 1), (int) (entity.getPosZ())),
				Blocks.AIR.getDefaultState(), 3);
		world.setBlockState(new BlockPos((int) (entity.getPosX()), (int) ((entity.getPosY()) - 2), (int) (entity.getPosZ())),
				WeatheredBedrockItem.block.getDefaultState(), 3);

	}

}
