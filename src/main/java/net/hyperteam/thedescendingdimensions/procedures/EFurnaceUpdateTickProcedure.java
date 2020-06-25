package net.hyperteam.thedescendingdimensions.procedures;

import net.minecraftforge.items.IItemHandlerModifiable;
import net.minecraftforge.items.CapabilityItemHandler;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.Direction;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.state.DirectionProperty;
import net.minecraft.item.crafting.IRecipeType;
import net.minecraft.item.ItemStack;
import net.minecraft.inventory.Inventory;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.block.Blocks;
import net.minecraft.block.BlockState;

import net.hyperteam.thedescendingdimensions.block.HeatingElementBlock;
import net.hyperteam.thedescendingdimensions.block.FurnaceCasingBlock;
import net.hyperteam.thedescendingdimensions.TheDescendingDimensionsModVariables;
import net.hyperteam.thedescendingdimensions.TheDescendingDimensionsModElements;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicInteger;

@TheDescendingDimensionsModElements.ModElement.Tag
public class EFurnaceUpdateTickProcedure extends TheDescendingDimensionsModElements.ModElement {
	public EFurnaceUpdateTickProcedure(TheDescendingDimensionsModElements instance) {
		super(instance, 35);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure EFurnaceUpdateTick!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure EFurnaceUpdateTick!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure EFurnaceUpdateTick!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure EFurnaceUpdateTick!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		if ((((TheDescendingDimensionsModVariables.MapVariables.get(world).efurnacefacing)).equals("north"))) {
			TheDescendingDimensionsModVariables.MapVariables.get(world).efurnacefacing = (String) "readyfornewblock";
			TheDescendingDimensionsModVariables.MapVariables.get(world).syncData(world);
		}
		if ((((TheDescendingDimensionsModVariables.MapVariables.get(world).efurnacefacing)).equals("east"))) {
			try {
				BlockState _bs = world.getBlockState(new BlockPos((int) x, (int) y, (int) z));
				world.setBlockState(new BlockPos((int) x, (int) y, (int) z),
						_bs.with((DirectionProperty) _bs.getBlock().getStateContainer().getProperty("facing"), Direction.EAST), 3);
			} catch (Exception e) {
			}
			TheDescendingDimensionsModVariables.MapVariables.get(world).efurnacefacing = (String) "readyfornewblock";
			TheDescendingDimensionsModVariables.MapVariables.get(world).syncData(world);
		}
		if ((((TheDescendingDimensionsModVariables.MapVariables.get(world).efurnacefacing)).equals("south"))) {
			try {
				BlockState _bs = world.getBlockState(new BlockPos((int) x, (int) y, (int) z));
				world.setBlockState(new BlockPos((int) x, (int) y, (int) z),
						_bs.with((DirectionProperty) _bs.getBlock().getStateContainer().getProperty("facing"), Direction.SOUTH), 3);
			} catch (Exception e) {
			}
			TheDescendingDimensionsModVariables.MapVariables.get(world).efurnacefacing = (String) "readyfornewblock";
			TheDescendingDimensionsModVariables.MapVariables.get(world).syncData(world);
		}
		if ((((TheDescendingDimensionsModVariables.MapVariables.get(world).efurnacefacing)).equals("west"))) {
			try {
				BlockState _bs = world.getBlockState(new BlockPos((int) x, (int) y, (int) z));
				world.setBlockState(new BlockPos((int) x, (int) y, (int) z),
						_bs.with((DirectionProperty) _bs.getBlock().getStateContainer().getProperty("facing"), Direction.WEST), 3);
			} catch (Exception e) {
			}
			TheDescendingDimensionsModVariables.MapVariables.get(world).efurnacefacing = (String) "readyfornewblock";
			TheDescendingDimensionsModVariables.MapVariables.get(world).syncData(world);
		}
		if ((((((world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) (z + 1)))).getBlock() == Blocks.AIR.getDefaultState()
				.getBlock())
				|| (((world.getBlockState(new BlockPos((int) (x - 0), (int) (y - 1), (int) (z + 1)))).getBlock() == Blocks.AIR.getDefaultState()
						.getBlock())
						|| ((world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 1), (int) (z + 1)))).getBlock() == Blocks.AIR
								.getDefaultState().getBlock())))
				|| ((((world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) (z + 0)))).getBlock() == Blocks.AIR.getDefaultState()
						.getBlock())
						|| (((world.getBlockState(new BlockPos((int) (x + 0), (int) (y - 1), (int) (z + 0)))).getBlock() == Blocks.AIR
								.getDefaultState().getBlock())
								|| ((world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 1), (int) (z + 0)))).getBlock() == Blocks.AIR
										.getDefaultState().getBlock())))
						|| (((world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) (z - 1)))).getBlock() == Blocks.AIR
								.getDefaultState().getBlock())
								|| (((world.getBlockState(new BlockPos((int) (x + 0), (int) (y - 1), (int) (z - 1)))).getBlock() == Blocks.AIR
										.getDefaultState().getBlock())
										|| ((world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 1), (int) (z - 1)))).getBlock() == Blocks.AIR
												.getDefaultState().getBlock())))))
				|| (((((world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) (z + 1)))).getBlock() == Blocks.AIR.getDefaultState()
						.getBlock())
						|| (((world.getBlockState(new BlockPos((int) (x - 0), (int) (y + 1), (int) (z + 1)))).getBlock() == Blocks.AIR
								.getDefaultState().getBlock())
								|| ((world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 1), (int) (z + 1)))).getBlock() == Blocks.AIR
										.getDefaultState().getBlock())))
						|| ((((world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) (z + 0)))).getBlock() == Blocks.AIR
								.getDefaultState().getBlock())
								|| (((world.getBlockState(new BlockPos((int) (x + 0), (int) (y + 1), (int) (z + 0)))).getBlock() == Blocks.AIR
										.getDefaultState().getBlock())
										|| ((world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 1), (int) (z + 0)))).getBlock() == Blocks.AIR
												.getDefaultState().getBlock())))
								|| (((world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) (z - 1)))).getBlock() == Blocks.AIR
										.getDefaultState().getBlock())
										|| (((world.getBlockState(new BlockPos((int) (x + 0), (int) (y + 1), (int) (z - 1)))).getBlock() == Blocks.AIR
												.getDefaultState().getBlock())
												|| ((world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 1), (int) (z - 1))))
														.getBlock() == Blocks.AIR.getDefaultState().getBlock())))))
						|| ((((world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 0), (int) (z + 1)))).getBlock() == Blocks.AIR
								.getDefaultState().getBlock())
								|| (((world.getBlockState(new BlockPos((int) (x - 0), (int) (y - 0), (int) (z + 1)))).getBlock() == Blocks.AIR
										.getDefaultState().getBlock())
										|| ((world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 0), (int) (z + 1)))).getBlock() == Blocks.AIR
												.getDefaultState().getBlock())))
								|| ((((world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 0), (int) (z + 0)))).getBlock() == Blocks.AIR
										.getDefaultState().getBlock())
										|| ((world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 0), (int) (z + 0)))).getBlock() == Blocks.AIR
												.getDefaultState().getBlock()))
										|| (((world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 0), (int) (z - 1)))).getBlock() == Blocks.AIR
												.getDefaultState().getBlock())
												|| (((world.getBlockState(new BlockPos((int) (x + 0), (int) (y - 0), (int) (z - 1))))
														.getBlock() == Blocks.AIR.getDefaultState().getBlock())
														|| ((world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 0), (int) (z - 1))))
																.getBlock() == Blocks.AIR.getDefaultState().getBlock())))))))) {
			world.setBlockState(new BlockPos((int) (x - 1), (int) (y - 1), (int) (z - 1)), Blocks.AIR.getDefaultState(), 3);
			world.setBlockState(new BlockPos((int) (x - 0), (int) (y - 1), (int) (z - 1)), Blocks.AIR.getDefaultState(), 3);
			world.setBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) (z - 1)), Blocks.AIR.getDefaultState(), 3);
			world.setBlockState(new BlockPos((int) (x - 1), (int) (y - 1), (int) (z + 0)), Blocks.AIR.getDefaultState(), 3);
			world.setBlockState(new BlockPos((int) (x - 0), (int) (y - 1), (int) (z + 0)), Blocks.AIR.getDefaultState(), 3);
			world.setBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) (z + 0)), Blocks.AIR.getDefaultState(), 3);
			world.setBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) (z + 1)), Blocks.AIR.getDefaultState(), 3);
			world.setBlockState(new BlockPos((int) (x + 0), (int) (y - 1), (int) (z + 1)), Blocks.AIR.getDefaultState(), 3);
			world.setBlockState(new BlockPos((int) (x - 1), (int) (y - 1), (int) (z + 1)), Blocks.AIR.getDefaultState(), 3);
			world.setBlockState(new BlockPos((int) (x - 1), (int) (y - 0), (int) (z - 1)), Blocks.AIR.getDefaultState(), 3);
			world.setBlockState(new BlockPos((int) (x - 0), (int) (y - 0), (int) (z - 1)), Blocks.AIR.getDefaultState(), 3);
			world.setBlockState(new BlockPos((int) (x + 1), (int) (y - 0), (int) (z - 1)), Blocks.AIR.getDefaultState(), 3);
			world.setBlockState(new BlockPos((int) (x - 1), (int) (y - 0), (int) (z + 0)), Blocks.AIR.getDefaultState(), 3);
			world.setBlockState(new BlockPos((int) (x - 0), (int) (y - 0), (int) (z + 0)), Blocks.AIR.getDefaultState(), 3);
			world.setBlockState(new BlockPos((int) (x + 1), (int) (y - 0), (int) (z + 0)), Blocks.AIR.getDefaultState(), 3);
			world.setBlockState(new BlockPos((int) (x + 1), (int) (y - 0), (int) (z + 1)), Blocks.AIR.getDefaultState(), 3);
			world.setBlockState(new BlockPos((int) (x + 0), (int) (y - 0), (int) (z + 1)), Blocks.AIR.getDefaultState(), 3);
			world.setBlockState(new BlockPos((int) (x - 1), (int) (y - 0), (int) (z + 1)), Blocks.AIR.getDefaultState(), 3);
			world.setBlockState(new BlockPos((int) (x - 1), (int) (y + 1), (int) (z - 1)), Blocks.AIR.getDefaultState(), 3);
			world.setBlockState(new BlockPos((int) (x - 0), (int) (y + 1), (int) (z - 1)), Blocks.AIR.getDefaultState(), 3);
			world.setBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) (z - 1)), Blocks.AIR.getDefaultState(), 3);
			world.setBlockState(new BlockPos((int) (x - 1), (int) (y + 1), (int) (z + 0)), Blocks.AIR.getDefaultState(), 3);
			world.setBlockState(new BlockPos((int) (x - 0), (int) (y + 1), (int) (z + 0)), Blocks.AIR.getDefaultState(), 3);
			world.setBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) (z + 0)), Blocks.AIR.getDefaultState(), 3);
			world.setBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) (z + 1)), Blocks.AIR.getDefaultState(), 3);
			world.setBlockState(new BlockPos((int) (x + 0), (int) (y + 1), (int) (z + 1)), Blocks.AIR.getDefaultState(), 3);
			world.setBlockState(new BlockPos((int) (x - 1), (int) (y + 1), (int) (z + 1)), Blocks.AIR.getDefaultState(), 3);
			for (int index0 = 0; index0 < (int) (25); index0++) {
				if (!world.isRemote) {
					ItemEntity entityToSpawn = new ItemEntity(world, x, y, z, new ItemStack(FurnaceCasingBlock.block, (int) (1)));
					entityToSpawn.setPickupDelay(10);
					world.addEntity(entityToSpawn);
				}
			}
			if (!world.isRemote) {
				ItemEntity entityToSpawn = new ItemEntity(world, x, y, z, new ItemStack(HeatingElementBlock.block, (int) (1)));
				entityToSpawn.setPickupDelay(10);
				world.addEntity(entityToSpawn);
			}
		}
		if (((world.getRecipeManager().getRecipe(IRecipeType.SMELTING, new Inventory((new Object() {
			public ItemStack getItemStack(BlockPos pos, int sltid) {
				AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
				TileEntity _ent = world.getTileEntity(pos);
				if (_ent != null) {
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						_retval.set(capability.getStackInSlot(sltid).copy());
					});
				}
				return _retval.get();
			}
		}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (0)))), world).isPresent()) == (true))) {
			if (((new Object() {
				public int getAmount(BlockPos pos, int sltid) {
					AtomicInteger _retval = new AtomicInteger(0);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null) {
						_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
							_retval.set(capability.getStackInSlot(sltid).getCount());
						});
					}
					return _retval.get();
				}
			}.getAmount(new BlockPos((int) x, (int) y, (int) z), (int) (1))) <= 63)) {
				if ((((new Object() {
					public ItemStack getItemStack(BlockPos pos, int sltid) {
						AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
						TileEntity _ent = world.getTileEntity(pos);
						if (_ent != null) {
							_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
								_retval.set(capability.getStackInSlot(sltid).copy());
							});
						}
						return _retval.get();
					}
				}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (1))).getItem() == new ItemStack(Blocks.AIR, (int) (1)).getItem())
						|| ((world.getRecipeManager().getRecipe(IRecipeType.SMELTING, new Inventory((new Object() {
							public ItemStack getItemStack(BlockPos pos, int sltid) {
								AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
								TileEntity _ent = world.getTileEntity(pos);
								if (_ent != null) {
									_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
										_retval.set(capability.getStackInSlot(sltid).copy());
									});
								}
								return _retval.get();
							}
						}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (0)))), world).isPresent()
								? world.getRecipeManager().getRecipe(IRecipeType.SMELTING, new Inventory((new Object() {
									public ItemStack getItemStack(BlockPos pos, int sltid) {
										AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
										TileEntity _ent = world.getTileEntity(pos);
										if (_ent != null) {
											_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
												_retval.set(capability.getStackInSlot(sltid).copy());
											});
										}
										return _retval.get();
									}
								}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (0)))), world).get().getRecipeOutput().copy()
								: ItemStack.EMPTY).getItem() == (new Object() {
									public ItemStack getItemStack(BlockPos pos, int sltid) {
										AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
										TileEntity _ent = world.getTileEntity(pos);
										if (_ent != null) {
											_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
												_retval.set(capability.getStackInSlot(sltid).copy());
											});
										}
										return _retval.get();
									}
								}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (1))).getItem()))) {
					if (!world.isRemote) {
						BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
						TileEntity _tileEntity = world.getTileEntity(_bp);
						BlockState _bs = world.getBlockState(_bp);
						if (_tileEntity != null)
							_tileEntity.getTileData().putDouble("cookingtime", ((new Object() {
								public double getValue(BlockPos pos, String tag) {
									TileEntity tileEntity = world.getTileEntity(pos);
									if (tileEntity != null)
										return tileEntity.getTileData().getDouble(tag);
									return -1;
								}
							}.getValue(new BlockPos((int) x, (int) y, (int) z), "cookingtime")) + 1));
						world.notifyBlockUpdate(_bp, _bs, _bs, 3);
					}
					if (((new Object() {
						public double getValue(BlockPos pos, String tag) {
							TileEntity tileEntity = world.getTileEntity(pos);
							if (tileEntity != null)
								return tileEntity.getTileData().getDouble(tag);
							return -1;
						}
					}.getValue(new BlockPos((int) x, (int) y, (int) z), "cookingtime")) >= 100)) {
						if (!world.isRemote) {
							BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
							TileEntity _tileEntity = world.getTileEntity(_bp);
							BlockState _bs = world.getBlockState(_bp);
							if (_tileEntity != null)
								_tileEntity.getTileData().putDouble("cookingtime", 0);
							world.notifyBlockUpdate(_bp, _bs, _bs, 3);
						}
						{
							TileEntity _ent = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
							if (_ent != null) {
								final int _sltid = (int) (1);
								final ItemStack _setstack = (world.getRecipeManager().getRecipe(IRecipeType.SMELTING, new Inventory((new Object() {
									public ItemStack getItemStack(BlockPos pos, int sltid) {
										AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
										TileEntity _ent = world.getTileEntity(pos);
										if (_ent != null) {
											_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
												_retval.set(capability.getStackInSlot(sltid).copy());
											});
										}
										return _retval.get();
									}
								}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (0)))), world).isPresent()
										? world.getRecipeManager().getRecipe(IRecipeType.SMELTING, new Inventory((new Object() {
											public ItemStack getItemStack(BlockPos pos, int sltid) {
												AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
												TileEntity _ent = world.getTileEntity(pos);
												if (_ent != null) {
													_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
														_retval.set(capability.getStackInSlot(sltid).copy());
													});
												}
												return _retval.get();
											}
										}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (0)))), world).get().getRecipeOutput().copy()
										: ItemStack.EMPTY);
								_setstack.setCount((int) ((new Object() {
									public int getAmount(BlockPos pos, int sltid) {
										AtomicInteger _retval = new AtomicInteger(0);
										TileEntity _ent = world.getTileEntity(pos);
										if (_ent != null) {
											_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
												_retval.set(capability.getStackInSlot(sltid).getCount());
											});
										}
										return _retval.get();
									}
								}.getAmount(new BlockPos((int) x, (int) y, (int) z), (int) (1))) + 1));
								_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
									if (capability instanceof IItemHandlerModifiable) {
										((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
									}
								});
							}
						}
						{
							TileEntity _ent = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
							if (_ent != null) {
								final int _sltid = (int) (0);
								final int _amount = (int) 1;
								_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
									if (capability instanceof IItemHandlerModifiable) {
										ItemStack _stk = capability.getStackInSlot(_sltid).copy();
										_stk.shrink(_amount);
										((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _stk);
									}
								});
							}
						}
					}
				}
			}
		}
	}
}
