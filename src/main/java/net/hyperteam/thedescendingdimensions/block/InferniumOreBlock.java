
package net.hyperteam.thedescendingdimensions.block;

import net.minecraft.block.material.Material;

@TheDescendingDimensionsModElements.ModElement.Tag
public class InferniumOreBlock extends TheDescendingDimensionsModElements.ModElement {

	@ObjectHolder("the_descending_dimensions:infernium_ore")
	public static final Block block = null;

	public InferniumOreBlock(TheDescendingDimensionsModElements instance) {
		super(instance, 22);

	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items.add(() -> new BlockItem(block, new Item.Properties().group(TDDOresItemGroup.tab)).setRegistryName(block.getRegistryName()));
	}

	public static class CustomBlock extends Block {

		public CustomBlock() {
			super(

					Block.Properties.create(Material.ROCK).sound(SoundType.STONE).hardnessAndResistance(4f, 40f).lightValue(5).harvestLevel(4)
							.harvestTool(ToolType.PICKAXE));

			setRegistryName("infernium_ore");
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
