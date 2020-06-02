
package net.hyperteam.thedescendingdimensions.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import net.hyperteam.thedescendingdimensions.TheDescendingDimensionsModElements;

@TheDescendingDimensionsModElements.ModElement.Tag
public class BedrockSlagItem extends TheDescendingDimensionsModElements.ModElement {
	@ObjectHolder("the_descending_dimensions:bedrock_slag")
	public static final Item block = null;
	public BedrockSlagItem(TheDescendingDimensionsModElements instance) {
		super(instance, 17);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(ItemGroup.MISC).maxStackSize(64));
			setRegistryName("bedrock_slag");
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
