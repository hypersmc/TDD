
package net.hyperteam.thedescendingdimensions.block;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.storage.loot.LootContext;
import net.minecraft.world.IBlockReader;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.BlockItem;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.BlockState;
import net.minecraft.block.BlockRenderType;
import net.minecraft.block.Block;

import net.hyperteam.thedescendingdimensions.itemgroup.TDDOresItemGroup;
import net.hyperteam.thedescendingdimensions.TheDescendingDimensionsModElements;
import net.hyperteam.thedescendingdimensions.LimboPortalTile;

import javax.annotation.Nullable;

import java.util.List;
import java.util.Collections;

@TheDescendingDimensionsModElements.ModElement.Tag
public class LimboPortalBlock extends TheDescendingDimensionsModElements.ModElement {
	@ObjectHolder("the_descending_dimensions:limbo_portal")
	public static final Block block = null;
	public LimboPortalBlock(TheDescendingDimensionsModElements instance) {
		super(instance, 26);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items.add(() -> new BlockItem(block, new Item.Properties().group(TDDOresItemGroup.tab)).setRegistryName(block.getRegistryName()));
	}
	public static class CustomBlock extends Block {
		public CustomBlock() {
			super(Block.Properties.create(Material.ROCK).sound(SoundType.GROUND).hardnessAndResistance(1f, 10f).lightValue(0));
			setRegistryName("limbo_portal");
		}

		public BlockRenderType getRenderType(BlockState p_149645_1_) {
			return BlockRenderType.ENTITYBLOCK_ANIMATED;
		}

		@Nullable
		public TileEntity createNewTileEntity(IBlockReader worldIn) {
			return new LimboPortalTile();
		}

		@Override
		public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
			List<ItemStack> dropsOriginal = super.getDrops(state, builder);
			if (!dropsOriginal.isEmpty())
				return dropsOriginal;
			return Collections.singletonList(new ItemStack(this, 1));
		}
	}
}
