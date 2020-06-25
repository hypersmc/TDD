
package net.hyperteam.thedescendingdimensions.block;

import net.minecraft.block.material.Material;

@TheDescendingDimensionsModElements.ModElement.Tag
public class WeatheredBedrockBlock extends TheDescendingDimensionsModElements.ModElement {

	@ObjectHolder("the_descending_dimensions:weathered_bedrock")
	public static final Block block = null;

	public WeatheredBedrockBlock(TheDescendingDimensionsModElements instance) {
		super(instance, 42);

	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items.add(() -> new BlockItem(block, new Item.Properties().group(TTDblocksItemGroup.tab)).setRegistryName(block.getRegistryName()));
	}

	public static class CustomBlock extends Block {

		public CustomBlock() {
			super(

					Block.Properties.create(Material.ROCK).sound(SoundType.STONE).hardnessAndResistance(4f, 50000f).lightValue(0).harvestLevel(4)
							.harvestTool(ToolType.PICKAXE));

			setRegistryName("weathered_bedrock");
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
