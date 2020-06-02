
package net.hyperteam.thedescendingdimensions.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.ActionResultType;
import net.minecraft.item.ItemUseContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.entity.player.PlayerEntity;

import net.hyperteam.thedescendingdimensions.world.dimension.BrimstonePitsDimension;
import net.hyperteam.thedescendingdimensions.itemgroup.TTDItemsItemGroup;

public class BrimstonePitsItem extends Item {
	@ObjectHolder("the_descending_dimensions:brimstone_pits")
	public static final Item block = null;
	public BrimstonePitsItem() {
		super(new Item.Properties().group(TTDItemsItemGroup.tab).maxDamage(64));
	}

	@Override
	public ActionResultType onItemUse(ItemUseContext context) {
		PlayerEntity entity = context.getPlayer();
		BlockPos pos = context.getPos().offset(context.getFace());
		ItemStack itemstack = context.getItem();
		World world = context.getWorld();
		if (!entity.canPlayerEdit(pos, context.getFace(), itemstack)) {
			return ActionResultType.FAIL;
		} else {
			if (world.isAirBlock(pos))
				BrimstonePitsDimension.portal.portalSpawn(world, pos);
			itemstack.damageItem(1, entity, c -> c.sendBreakAnimation(context.getHand()));
			return ActionResultType.SUCCESS;
		}
	}
}
