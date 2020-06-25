package net.hyperteam.thedescendingdimensions.procedures;

import net.minecraft.util.DamageSource;
import net.minecraft.entity.Entity;

import net.hyperteam.thedescendingdimensions.TheDescendingDimensionsModElements;

@TheDescendingDimensionsModElements.ModElement.Tag
public class HeatSandEntityWalksOnTheBlockProcedure extends TheDescendingDimensionsModElements.ModElement {
	public HeatSandEntityWalksOnTheBlockProcedure(TheDescendingDimensionsModElements instance) {
		super(instance, 23);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure HeatSandEntityWalksOnTheBlock!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		entity.attackEntityFrom(DamageSource.ON_FIRE, (float) 1);
	}
}
