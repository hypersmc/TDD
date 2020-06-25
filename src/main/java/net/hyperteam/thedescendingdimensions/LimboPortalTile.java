/**
 * This mod element is always locked. Enter your code in the methods below.
 * If you don't need some of these methods, you can remove them as they
 * are overrides of the base class TheDescendingDimensionsModElements.ModElement.
 *
 * You can register new events in this class too.
 *
 * As this class is loaded into mod element list, it NEEDS to extend
 * ModElement class. If you remove this extend statement or remove the
 * constructor, the compilation will fail.
 *
 * If you want to make a plain independent class, create it in
 * "Workspace" -> "Source" menu.
 *
 * If you change workspace package, modid or prefix, you will need
 * to manually adapt this file to these changes or remake it.
*/
package net.hyperteam.thedescendingdimensions;

import net.minecraft.util.Direction;
import net.minecraft.tileentity.EndPortalTileEntity;

public class LimboPortalTile extends EndPortalTileEntity {
	public boolean shouldRenderFace(Direction p_184313_1_) {
		if (this.getWorld() == null) {
			return true;
		}
		return true;
	}
}
