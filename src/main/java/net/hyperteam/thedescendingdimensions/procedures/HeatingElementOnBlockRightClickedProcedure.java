package net.hyperteam.thedescendingdimensions.procedures;

@TheDescendingDimensionsModElements.ModElement.Tag
public class HeatingElementOnBlockRightClickedProcedure extends TheDescendingDimensionsModElements.ModElement {

	public HeatingElementOnBlockRightClickedProcedure(TheDescendingDimensionsModElements instance) {
		super(instance, 34);

	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("direction") == null) {
			System.err.println("Failed to load dependency direction for procedure HeatingElementOnBlockRightClicked!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure HeatingElementOnBlockRightClicked!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure HeatingElementOnBlockRightClicked!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure HeatingElementOnBlockRightClicked!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure HeatingElementOnBlockRightClicked!");
			return;
		}

		Direction direction = (Direction) dependencies.get("direction");
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");

		if (((((world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) (z + 1)))).getBlock() == FurnaceCasingBlock.block
				.getDefaultState().getBlock())
				&& (((world.getBlockState(new BlockPos((int) (x - 0), (int) (y - 1), (int) (z + 1)))).getBlock() == FurnaceCasingBlock.block
						.getDefaultState().getBlock())
						&& ((world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 1), (int) (z + 1)))).getBlock() == FurnaceCasingBlock.block
								.getDefaultState().getBlock())))
				&& ((((world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) (z + 0)))).getBlock() == FurnaceCasingBlock.block
						.getDefaultState().getBlock())
						&& (((world.getBlockState(new BlockPos((int) (x + 0), (int) (y - 1), (int) (z + 0)))).getBlock() == FurnaceCasingBlock.block
								.getDefaultState().getBlock())
								&& ((world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 1), (int) (z + 0))))
										.getBlock() == FurnaceCasingBlock.block.getDefaultState().getBlock())))
						&& (((world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) (z - 1)))).getBlock() == FurnaceCasingBlock.block
								.getDefaultState().getBlock())
								&& (((world.getBlockState(new BlockPos((int) (x + 0), (int) (y - 1), (int) (z - 1))))
										.getBlock() == FurnaceCasingBlock.block.getDefaultState().getBlock())
										&& ((world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 1), (int) (z - 1))))
												.getBlock() == FurnaceCasingBlock.block.getDefaultState().getBlock())))))) {
			if ((((((world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 0), (int) (z + 1)))).getBlock() == FurnaceCasingBlock.block
					.getDefaultState().getBlock())
					&& (((world.getBlockState(new BlockPos((int) (x - 0), (int) (y - 0), (int) (z + 1)))).getBlock() == Blocks.AIR.getDefaultState()
							.getBlock())
							&& ((world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 0), (int) (z + 1))))
									.getBlock() == FurnaceCasingBlock.block.getDefaultState().getBlock())))
					&& ((((world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 0), (int) (z + 0)))).getBlock() == FurnaceCasingBlock.block
							.getDefaultState().getBlock())
							&& ((true) && ((world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 0), (int) (z + 0))))
									.getBlock() == FurnaceCasingBlock.block.getDefaultState().getBlock())))
							&& (((world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 0), (int) (z - 1))))
									.getBlock() == FurnaceCasingBlock.block.getDefaultState().getBlock())
									&& (((world.getBlockState(new BlockPos((int) (x + 0), (int) (y - 0), (int) (z - 1))))
											.getBlock() == FurnaceCasingBlock.block.getDefaultState().getBlock())
											&& ((world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 0), (int) (z - 1))))
													.getBlock() == FurnaceCasingBlock.block.getDefaultState().getBlock())))))
					|| (((((world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 0), (int) (z + 1)))).getBlock() == FurnaceCasingBlock.block
							.getDefaultState().getBlock())
							&& (((world.getBlockState(new BlockPos((int) (x - 0), (int) (y - 0), (int) (z + 1))))
									.getBlock() == FurnaceCasingBlock.block.getDefaultState().getBlock())
									&& ((world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 0), (int) (z + 1))))
											.getBlock() == FurnaceCasingBlock.block.getDefaultState().getBlock())))
							&& ((((world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 0), (int) (z + 0)))).getBlock() == Blocks.AIR
									.getDefaultState().getBlock())
									&& ((true) && ((world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 0), (int) (z + 0))))
											.getBlock() == FurnaceCasingBlock.block.getDefaultState().getBlock())))
									&& (((world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 0), (int) (z - 1))))
											.getBlock() == FurnaceCasingBlock.block.getDefaultState().getBlock())
											&& (((world.getBlockState(new BlockPos((int) (x + 0), (int) (y - 0), (int) (z - 1))))
													.getBlock() == FurnaceCasingBlock.block.getDefaultState().getBlock())
													&& ((world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 0), (int) (z - 1))))
															.getBlock() == FurnaceCasingBlock.block.getDefaultState().getBlock())))))
							|| (((((world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 0), (int) (z + 1))))
									.getBlock() == FurnaceCasingBlock.block.getDefaultState().getBlock())
									&& (((world.getBlockState(new BlockPos((int) (x - 0), (int) (y - 0), (int) (z + 1))))
											.getBlock() == FurnaceCasingBlock.block.getDefaultState().getBlock())
											&& ((world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 0), (int) (z + 1))))
													.getBlock() == FurnaceCasingBlock.block.getDefaultState().getBlock())))
									&& ((((world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 0), (int) (z + 0))))
											.getBlock() == FurnaceCasingBlock.block.getDefaultState().getBlock())
											&& ((true) && ((world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 0), (int) (z + 0))))
													.getBlock() == Blocks.AIR.getDefaultState().getBlock())))
											&& (((world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 0), (int) (z - 1))))
													.getBlock() == FurnaceCasingBlock.block.getDefaultState().getBlock())
													&& (((world.getBlockState(new BlockPos((int) (x + 0), (int) (y - 0), (int) (z - 1))))
															.getBlock() == FurnaceCasingBlock.block.getDefaultState().getBlock())
															&& ((world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 0), (int) (z - 1))))
																	.getBlock() == FurnaceCasingBlock.block.getDefaultState().getBlock())))))
									|| ((((world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 0), (int) (z + 1))))
											.getBlock() == FurnaceCasingBlock.block.getDefaultState().getBlock())
											&& (((world.getBlockState(new BlockPos((int) (x - 0), (int) (y - 0), (int) (z + 1))))
													.getBlock() == FurnaceCasingBlock.block.getDefaultState().getBlock())
													&& ((world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 0), (int) (z + 1))))
															.getBlock() == FurnaceCasingBlock.block.getDefaultState().getBlock())))
											&& ((((world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 0), (int) (z + 0))))
													.getBlock() == FurnaceCasingBlock.block.getDefaultState().getBlock())
													&& ((true) && ((world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 0), (int) (z + 0))))
															.getBlock() == FurnaceCasingBlock.block.getDefaultState().getBlock())))
													&& (((world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 0), (int) (z - 1))))
															.getBlock() == FurnaceCasingBlock.block.getDefaultState().getBlock())
															&& (((world.getBlockState(new BlockPos((int) (x + 0), (int) (y - 0), (int) (z - 1))))
																	.getBlock() == Blocks.AIR.getDefaultState().getBlock())
																	&& ((world
																			.getBlockState(new BlockPos((int) (x - 1), (int) (y - 0), (int) (z - 1))))
																					.getBlock() == FurnaceCasingBlock.block.getDefaultState()
																							.getBlock()))))))))) {
				if (((((world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) (z + 1)))).getBlock() == FurnaceCasingBlock.block
						.getDefaultState().getBlock())
						&& (((world.getBlockState(new BlockPos((int) (x - 0), (int) (y + 1), (int) (z + 1)))).getBlock() == FurnaceCasingBlock.block
								.getDefaultState().getBlock())
								&& ((world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 1), (int) (z + 1))))
										.getBlock() == FurnaceCasingBlock.block.getDefaultState().getBlock())))
						&& ((((world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) (z + 0)))).getBlock() == FurnaceCasingBlock.block
								.getDefaultState().getBlock())
								&& (((world.getBlockState(new BlockPos((int) (x + 0), (int) (y + 1), (int) (z + 0))))
										.getBlock() == FurnaceCasingBlock.block.getDefaultState().getBlock())
										&& ((world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 1), (int) (z + 0))))
												.getBlock() == FurnaceCasingBlock.block.getDefaultState().getBlock())))
								&& (((world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) (z - 1))))
										.getBlock() == FurnaceCasingBlock.block.getDefaultState().getBlock())
										&& (((world.getBlockState(new BlockPos((int) (x + 0), (int) (y + 1), (int) (z - 1))))
												.getBlock() == FurnaceCasingBlock.block.getDefaultState().getBlock())
												&& ((world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 1), (int) (z - 1))))
														.getBlock() == FurnaceCasingBlock.block.getDefaultState().getBlock())))))) {
					if ((direction == Direction.NORTH)) {
					}
					if ((direction == Direction.EAST)) {
					}
					if ((direction == Direction.SOUTH)) {
					}
					if ((direction == Direction.WEST)) {
					}
					world.setBlockState(new BlockPos((int) (x - 1), (int) (y - 1), (int) (z - 1)), EFurnaceFillerBlock.block.getDefaultState(), 3);
					world.setBlockState(new BlockPos((int) (x - 0), (int) (y - 1), (int) (z - 1)), EFurnaceFillerBlock.block.getDefaultState(), 3);
					world.setBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) (z - 1)), EFurnaceFillerBlock.block.getDefaultState(), 3);
					world.setBlockState(new BlockPos((int) (x - 1), (int) (y - 1), (int) (z + 0)), EFurnaceFillerBlock.block.getDefaultState(), 3);
					world.setBlockState(new BlockPos((int) (x - 0), (int) (y - 1), (int) (z + 0)), EFurnaceFillerBlock.block.getDefaultState(), 3);
					world.setBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) (z + 0)), EFurnaceFillerBlock.block.getDefaultState(), 3);
					world.setBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) (z + 1)), EFurnaceFillerBlock.block.getDefaultState(), 3);
					world.setBlockState(new BlockPos((int) (x + 0), (int) (y - 1), (int) (z + 1)), EFurnaceFillerBlock.block.getDefaultState(), 3);
					world.setBlockState(new BlockPos((int) (x - 1), (int) (y - 1), (int) (z + 1)), EFurnaceFillerBlock.block.getDefaultState(), 3);
					world.setBlockState(new BlockPos((int) (x - 1), (int) (y - 0), (int) (z - 1)), EFurnaceFillerBlock.block.getDefaultState(), 3);
					world.setBlockState(new BlockPos((int) (x - 0), (int) (y - 0), (int) (z - 1)), EFurnaceFillerBlock.block.getDefaultState(), 3);
					world.setBlockState(new BlockPos((int) (x + 1), (int) (y - 0), (int) (z - 1)), EFurnaceFillerBlock.block.getDefaultState(), 3);
					world.setBlockState(new BlockPos((int) (x - 1), (int) (y - 0), (int) (z + 0)), EFurnaceFillerBlock.block.getDefaultState(), 3);
					world.setBlockState(new BlockPos((int) (x - 0), (int) (y - 0), (int) (z + 0)), EFurnaceBlock.block.getDefaultState(), 3);
					world.setBlockState(new BlockPos((int) (x + 1), (int) (y - 0), (int) (z + 0)), EFurnaceFillerBlock.block.getDefaultState(), 3);
					world.setBlockState(new BlockPos((int) (x + 1), (int) (y - 0), (int) (z + 1)), EFurnaceFillerBlock.block.getDefaultState(), 3);
					world.setBlockState(new BlockPos((int) (x + 0), (int) (y - 0), (int) (z + 1)), EFurnaceFillerBlock.block.getDefaultState(), 3);
					world.setBlockState(new BlockPos((int) (x - 1), (int) (y - 0), (int) (z + 1)), EFurnaceFillerBlock.block.getDefaultState(), 3);
					world.setBlockState(new BlockPos((int) (x - 1), (int) (y + 1), (int) (z - 1)), EFurnaceFillerBlock.block.getDefaultState(), 3);
					world.setBlockState(new BlockPos((int) (x - 0), (int) (y + 1), (int) (z - 1)), EFurnaceFillerBlock.block.getDefaultState(), 3);
					world.setBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) (z - 1)), EFurnaceFillerBlock.block.getDefaultState(), 3);
					world.setBlockState(new BlockPos((int) (x - 1), (int) (y + 1), (int) (z + 0)), EFurnaceFillerBlock.block.getDefaultState(), 3);
					world.setBlockState(new BlockPos((int) (x - 0), (int) (y + 1), (int) (z + 0)), EFurnaceFillerBlock.block.getDefaultState(), 3);
					world.setBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) (z + 0)), EFurnaceFillerBlock.block.getDefaultState(), 3);
					world.setBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) (z + 1)), EFurnaceFillerBlock.block.getDefaultState(), 3);
					world.setBlockState(new BlockPos((int) (x + 0), (int) (y + 1), (int) (z + 1)), EFurnaceFillerBlock.block.getDefaultState(), 3);
					world.setBlockState(new BlockPos((int) (x - 1), (int) (y + 1), (int) (z + 1)), EFurnaceFillerBlock.block.getDefaultState(), 3);
				}
			}
		}

	}

}
