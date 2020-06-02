package net.hyperteam.thedescendingdimensions.procedures;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.Hand;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.block.Blocks;

import net.hyperteam.thedescendingdimensions.item.BedrockShardItem;
import net.hyperteam.thedescendingdimensions.item.BedrockBreakerItem;
import net.hyperteam.thedescendingdimensions.TheDescendingDimensionsModElements;

@TheDescendingDimensionsModElements.ModElement.Tag
public class BedrockBreakerItemInInventoryTickProcedure extends TheDescendingDimensionsModElements.ModElement {
	public BedrockBreakerItemInInventoryTickProcedure(TheDescendingDimensionsModElements instance) {
		super(instance, 11);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure BedrockBreakerItemInInventoryTick!");
			return;
		}
		if (dependencies.get("itemstack") == null) {
			System.err.println("Failed to load dependency itemstack for procedure BedrockBreakerItemInInventoryTick!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure BedrockBreakerItemInInventoryTick!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
		World world = (World) dependencies.get("world");
		if ((((itemstack).getOrCreateTag().getBoolean("breaking")) == (true))) {
			if ((((itemstack).getOrCreateTag().getDouble("time")) <= 30)) {
				(itemstack).getOrCreateTag().putDouble("time", (((itemstack).getOrCreateTag().getDouble("time")) + 1));
			} else {
				world.destroyBlock(new BlockPos((int) ((itemstack).getOrCreateTag().getDouble("brx")),
						(int) ((itemstack).getOrCreateTag().getDouble("bry")), (int) ((itemstack).getOrCreateTag().getDouble("brz"))), false);
				if (!world.isRemote) {
					ItemEntity entityToSpawn = new ItemEntity(world, ((itemstack).getOrCreateTag().getDouble("brx")),
							((itemstack).getOrCreateTag().getDouble("bry")), ((itemstack).getOrCreateTag().getDouble("brz")),
							new ItemStack(BedrockShardItem.block, (int) (1)));
					entityToSpawn.setPickupDelay(10);
					world.addEntity(entityToSpawn);
				}
				(itemstack).getOrCreateTag().putBoolean("breaking", (false));
				if ((((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)
						.getItem() == new ItemStack(BedrockBreakerItem.block, (int) (1)).getItem())) {
					if (entity instanceof LivingEntity) {
						ItemStack _setstack = new ItemStack(Blocks.AIR, (int) (1));
						_setstack.setCount((int) 1);
						((LivingEntity) entity).setHeldItem(Hand.MAIN_HAND, _setstack);
						if (entity instanceof ServerPlayerEntity)
							((ServerPlayerEntity) entity).inventory.markDirty();
					}
				} else {
					if (entity instanceof PlayerEntity)
						((PlayerEntity) entity).inventory
								.clearMatchingItems(p -> new ItemStack(BedrockBreakerItem.block, (int) (1)).getItem() == p.getItem(), (int) 1);
				}
			}
		}
	}
}
