
package net.hyperteam.thedescendingdimensions.block;

import net.minecraft.block.material.Material;

@TheDescendingDimensionsModElements.ModElement.Tag
public class Bedrockbreak2Block extends TheDescendingDimensionsModElements.ModElement {

	@ObjectHolder("the_descending_dimensions:bedrockbreak_2")
	public static final Block block = null;

	public Bedrockbreak2Block(TheDescendingDimensionsModElements instance) {
		super(instance, 48);

	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items.add(() -> new BlockItem(block, new Item.Properties().group(null)).setRegistryName(block.getRegistryName()));
	}

	public static class CustomBlock extends Block {

		public CustomBlock() {
			super(

					Block.Properties.create(Material.ROCK).sound(SoundType.STONE).hardnessAndResistance(-1, 3600000).lightValue(0));

			setRegistryName("bedrockbreak_2");
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
