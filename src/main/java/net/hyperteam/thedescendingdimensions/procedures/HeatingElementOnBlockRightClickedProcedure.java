package net.hyperteam.thedescendingdimensions.procedures;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.Direction;
import net.minecraft.block.Blocks;

import net.hyperteam.thedescendingdimensions.block.FurnaceCasingBlock;
import net.hyperteam.thedescendingdimensions.block.EFurnaceFillerBlock;
import net.hyperteam.thedescendingdimensions.block.EFurnaceBlock;
import net.hyperteam.thedescendingdimensions.TheDescendingDimensionsModVariables;
import net.hyperteam.thedescendingdimensions.TheDescendingDimensionsModElements;

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
					TheDescendingDimensionsModVariables.MapVariables.get(world).EfurnaceX = (double) x;
					TheDescendingDimensionsModVariables.MapVariables.get(world).syncData(world);
					TheDescendingDimensionsModVariables.MapVariables.get(world).EfurnaceY = (double) y;
					TheDescendingDimensionsModVariables.MapVariables.get(world).syncData(world);
					TheDescendingDimensionsModVariables.MapVariables.get(world).EfurnaceZ = (double) z;
					TheDescendingDimensionsModVariables.MapVariables.get(world).syncData(world);
					if ((direction == Direction.NORTH)) {
						TheDescendingDimensionsModVariables.MapVariables.get(world).efurnacefacing = (String) "north";
						TheDescendingDimensionsModVariables.MapVariables.get(world).syncData(world);
					}
					if ((direction == Direction.EAST)) {
						TheDescendingDimensionsModVariables.MapVariables.get(world).efurnacefacing = (String) "east";
						TheDescendingDimensionsModVariables.MapVariables.get(world).syncData(world);
					}
					if ((direction == Direction.SOUTH)) {
						TheDescendingDimensionsModVariables.MapVariables.get(world).efurnacefacing = (String) "south";
						TheDescendingDimensionsModVariables.MapVariables.get(world).syncData(world);
					}
					if ((direction == Direction.WEST)) {
						TheDescendingDimensionsModVariables.MapVariables.get(world).efurnacefacing = (String) "west";
						TheDescendingDimensionsModVariables.MapVariables.get(world).syncData(world);
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
