
package net.hyperteam.thedescendingdimensions.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import net.hyperteam.thedescendingdimensions.TheDescendingDimensionsModElements;

@TheDescendingDimensionsModElements.ModElement.Tag
public class DescentiumGemstoneItem extends TheDescendingDimensionsModElements.ModElement {
	@ObjectHolder("the_descending_dimensions:descentium_gemstone")
	public static final Item block = null;
	public DescentiumGemstoneItem(TheDescendingDimensionsModElements instance) {
		super(instance, 19);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(ItemGroup.MISC).maxStackSize(64));
			setRegistryName("descentium_gemstone");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}
	}
}
