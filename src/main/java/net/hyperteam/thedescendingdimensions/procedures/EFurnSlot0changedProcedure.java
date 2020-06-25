package net.hyperteam.thedescendingdimensions.procedures;

@TheDescendingDimensionsModElements.ModElement.Tag
public class EFurnSlot0changedProcedure extends TheDescendingDimensionsModElements.ModElement {

	public EFurnSlot0changedProcedure(TheDescendingDimensionsModElements instance) {
		super(instance, 40);

	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure EFurnSlot0changed!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure EFurnSlot0changed!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure EFurnSlot0changed!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure EFurnSlot0changed!");
			return;
		}

		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");

		if (!world.isRemote) {
			BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
			TileEntity _tileEntity = world.getTileEntity(_bp);
			BlockState _bs = world.getBlockState(_bp);
			if (_tileEntity != null)
				_tileEntity.getTileData().putBoolean("changed0", (true));
			world.notifyBlockUpdate(_bp, _bs, _bs, 3);
		}

	}

}
