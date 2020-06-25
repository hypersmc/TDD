
package net.hyperteam.thedescendingdimensions.block;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.storage.loot.LootContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.BlockItem;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.BlockState;
import net.minecraft.block.Block;

import net.hyperteam.thedescendingdimensions.itemgroup.TTDblocksItemGroup;
import net.hyperteam.thedescendingdimensions.TheDescendingDimensionsModElements;

import java.util.List;
import java.util.Collections;

@TheDescendingDimensionsModElements.ModElement.Tag
public class FurnaceCasingBlock extends TheDescendingDimensionsModElements.ModElement {
	@ObjectHolder("the_descending_dimensions:furnace_casing")
	public static final Block block = null;
	public FurnaceCasingBlock(TheDescendingDimensionsModElements instance) {
		super(instance, 24);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items.add(() -> new BlockItem(block, new Item.Properties().group(TTDblocksItemGroup.tab)).setRegistryName(block.getRegistryName()));
	}
	public static class CustomBlock extends Block {
		public CustomBlock() {
			super(Block.Properties.create(Material.ROCK).sound(SoundType.METAL).hardnessAndResistance(3f, 50f).lightValue(0));
			setRegistryName("furnace_casing");
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
