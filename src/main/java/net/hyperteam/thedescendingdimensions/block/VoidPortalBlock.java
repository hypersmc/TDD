
package net.hyperteam.thedescendingdimensions.block;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.storage.loot.LootContext;
import net.minecraft.world.World;
import net.minecraft.world.IBlockReader;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.BlockItem;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.BlockState;
import net.minecraft.block.Block;

import net.hyperteam.thedescendingdimensions.procedures.VoidPortalEntityCollidesInTheBlockProcedure;
import net.hyperteam.thedescendingdimensions.itemgroup.TTDblocksItemGroup;
import net.hyperteam.thedescendingdimensions.TheDescendingDimensionsModElements;

import java.util.List;
import java.util.Collections;

@TheDescendingDimensionsModElements.ModElement.Tag
public class VoidPortalBlock extends TheDescendingDimensionsModElements.ModElement {
	@ObjectHolder("the_descending_dimensions:void_portal")
	public static final Block block = null;
	public VoidPortalBlock(TheDescendingDimensionsModElements instance) {
		super(instance, 44);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items.add(() -> new BlockItem(block, new Item.Properties().group(TTDblocksItemGroup.tab)).setRegistryName(block.getRegistryName()));
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public void clientLoad(FMLClientSetupEvent event) {
		RenderTypeLookup.setRenderLayer(block, RenderType.getCutout());
	}
	public static class CustomBlock extends Block {
		public CustomBlock() {
			super(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).hardnessAndResistance(2f, 4000f).lightValue(8).harvestLevel(1)
					.harvestTool(ToolType.PICKAXE).notSolid());
			setRegistryName("void_portal");
		}
		private static final VoxelShape BASE = makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 1.0D, 16.0D);
		protected static final VoxelShape SHAPE = VoxelShapes.or(makeCuboidShape(0.0D, 1.0D, 0.0D, 16.0D, 16.0D, 1.0D),
				makeCuboidShape(0.0D, 1.0D, 0.0D, 1.0D, 16.0D, 16.0D), makeCuboidShape(0.0D, 1.0D, 15.0D, 16.0D, 16.0D, 16.0D),
				makeCuboidShape(15.0D, 1.0D, 0.0D, 16.0D, 16.0D, 16.0D), BASE);
		@Override
		public boolean isNormalCube(BlockState state, IBlockReader worldIn, BlockPos pos) {
			return false;
		}

		@Override
		public boolean propagatesSkylightDown(BlockState state, IBlockReader reader, BlockPos pos) {
			return true;
		}

		public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
			return SHAPE;
		}

		public VoxelShape getRaytraceShape(BlockState state, IBlockReader worldIn, BlockPos pos) {
			return BASE;
		}

		@Override
		public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
			List<ItemStack> dropsOriginal = super.getDrops(state, builder);
			if (!dropsOriginal.isEmpty())
				return dropsOriginal;
			return Collections.singletonList(new ItemStack(this, 1));
		}

		@Override
		public void onEntityCollision(BlockState state, World world, BlockPos pos, Entity entity) {
			super.onEntityCollision(state, world, pos, entity);
			int x = pos.getX();
			int y = pos.getY();
			int z = pos.getZ();
			{
				java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
				$_dependencies.put("entity", entity);
				VoidPortalEntityCollidesInTheBlockProcedure.executeProcedure($_dependencies);
			}
		}
	}
}
