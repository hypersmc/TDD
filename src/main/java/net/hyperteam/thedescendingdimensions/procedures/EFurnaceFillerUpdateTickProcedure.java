package net.hyperteam.thedescendingdimensions.procedures;

@TheDescendingDimensionsModElements.ModElement.Tag
public class EFurnaceFillerUpdateTickProcedure extends TheDescendingDimensionsModElements.ModElement {

	public EFurnaceFillerUpdateTickProcedure(TheDescendingDimensionsModElements instance) {
		super(instance, 36);

	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies){
		if(dependencies.get("x")==null){
			System.err.println("Failed to load dependency x for procedure EFurnaceFillerUpdateTick!");
			return;
		}
		if(dependencies.get("y")==null){
			System.err.println("Failed to load dependency y for procedure EFurnaceFillerUpdateTick!");
			return;
		}
		if(dependencies.get("z")==null){
			System.err.println("Failed to load dependency z for procedure EFurnaceFillerUpdateTick!");
			return;
		}
		if(dependencies.get("world")==null){
			System.err.println("Failed to load dependency world for procedure EFurnaceFillerUpdateTick!");
			return;
		}

            int x =(int)dependencies.get("x" );
            int y =(int)dependencies.get("y" );
            int z =(int)dependencies.get("z" );
            World world =(World)dependencies.get("world" );

		if (((new Object(){
public boolean getValue(BlockPos pos, String tag) {
		TileEntity tileEntity=world.getTileEntity(pos);
		if(tileEntity!=null)
			return tileEntity.getTileData().getBoolean(tag);
		return false;
	}
}.getValue(new BlockPos((int)x,(int)y,(int)z), "coreblockfound"))!=(true))) {if(!world.isRemote) {
	BlockPos _bp = new BlockPos((int)x,(int)y,(int)z);
	TileEntity _tileEntity=world.getTileEntity(_bp);
	BlockState _bs = world.getBlockState(_bp);
	if(_tileEntity!=null)
		_tileEntity.getTileData().putDouble("coreblockX", );
	world.notifyBlockUpdate(_bp, _bs, _bs, 3);
}if(!world.isRemote) {
	BlockPos _bp = new BlockPos((int)x,(int)y,(int)z);
	TileEntity _tileEntity=world.getTileEntity(_bp);
	BlockState _bs = world.getBlockState(_bp);
	if(_tileEntity!=null)
		_tileEntity.getTileData().putDouble("coreblockY", );
	world.notifyBlockUpdate(_bp, _bs, _bs, 3);
}if(!world.isRemote) {
	BlockPos _bp = new BlockPos((int)x,(int)y,(int)z);
	TileEntity _tileEntity=world.getTileEntity(_bp);
	BlockState _bs = world.getBlockState(_bp);
	if(_tileEntity!=null)
		_tileEntity.getTileData().putDouble("coreblockZ", );
	world.notifyBlockUpdate(_bp, _bs, _bs, 3);
}if(!world.isRemote){
	BlockPos _bp = new BlockPos((int)x,(int)y,(int)z);
	TileEntity _tileEntity=world.getTileEntity(_bp);
	BlockState _bs = world.getBlockState(_bp);
	if(_tileEntity != null)
		_tileEntity.getTileData().putBoolean("coreblockfound", (true));
	world.notifyBlockUpdate(_bp, _bs, _bs, 3);
}if ((>=26)) {}}if (((new Object(){
public boolean getValue(BlockPos pos, String tag) {
		TileEntity tileEntity=world.getTileEntity(pos);
		if(tileEntity!=null)
			return tileEntity.getTileData().getBoolean(tag);
		return false;
	}
}.getValue(new BlockPos((int)x,(int)y,(int)z), "changed0"))==(true))) {{
	TileEntity _ent = world.getTileEntity(new BlockPos((int)(new Object(){
public double getValue(BlockPos pos, String tag){
		TileEntity tileEntity=world.getTileEntity(pos);
if(tileEntity!=null) return tileEntity.getTileData().getDouble(tag);
return -1;
}
}.getValue(new BlockPos((int)x,(int)y,(int)z), "coreblockX")),(int)(new Object(){
public double getValue(BlockPos pos, String tag){
		TileEntity tileEntity=world.getTileEntity(pos);
if(tileEntity!=null) return tileEntity.getTileData().getDouble(tag);
return -1;
}
}.getValue(new BlockPos((int)x,(int)y,(int)z), "coreblockY")),(int)(new Object(){
public double getValue(BlockPos pos, String tag){
		TileEntity tileEntity=world.getTileEntity(pos);
if(tileEntity!=null) return tileEntity.getTileData().getDouble(tag);
return -1;
}
}.getValue(new BlockPos((int)x,(int)y,(int)z), "coreblockZ"))));
	if (_ent != null) {
		final int _sltid = (int)(0);
		final ItemStack _setstack = (new Object() {
	public ItemStack getItemStack(BlockPos pos, int sltid) {
		AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
		TileEntity _ent = world.getTileEntity(pos);
		if (_ent != null) {
			_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
				_retval.set(capability.getStackInSlot(sltid).copy());
			});
		}
		return _retval.get();
	}
}.getItemStack(new BlockPos((int)x,(int)y,(int)z),(int)(0)))
;
		_setstack.setCount((int) (new Object(){
	public int getAmount(BlockPos pos,int sltid) {
		AtomicInteger _retval = new AtomicInteger(0);
		TileEntity _ent = world.getTileEntity(pos);
		if (_ent != null) {
			_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
				_retval.set(capability.getStackInSlot(sltid).getCount());
			});
		}
		return _retval.get();
	}
}.getAmount(new BlockPos((int)x,(int)y,(int)z),(int)(0)))
);
		_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
			if (capability instanceof IItemHandlerModifiable) {
				((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
			}
		});
	}
}
if(!world.isRemote){
	BlockPos _bp = new BlockPos((int)x,(int)y,(int)z);
	TileEntity _tileEntity=world.getTileEntity(_bp);
	BlockState _bs = world.getBlockState(_bp);
	if(_tileEntity != null)
		_tileEntity.getTileData().putBoolean("changed0", (false));
	world.notifyBlockUpdate(_bp, _bs, _bs, 3);
}}if (((new Object(){
public boolean getValue(BlockPos pos, String tag) {
		TileEntity tileEntity=world.getTileEntity(pos);
		if(tileEntity!=null)
			return tileEntity.getTileData().getBoolean(tag);
		return false;
	}
}.getValue(new BlockPos((int)x,(int)y,(int)z), "changed1"))==(true))) {{
	TileEntity _ent = world.getTileEntity(new BlockPos((int)(new Object(){
public double getValue(BlockPos pos, String tag){
		TileEntity tileEntity=world.getTileEntity(pos);
if(tileEntity!=null) return tileEntity.getTileData().getDouble(tag);
return -1;
}
}.getValue(new BlockPos((int)x,(int)y,(int)z), "coreblockX")),(int)(new Object(){
public double getValue(BlockPos pos, String tag){
		TileEntity tileEntity=world.getTileEntity(pos);
if(tileEntity!=null) return tileEntity.getTileData().getDouble(tag);
return -1;
}
}.getValue(new BlockPos((int)x,(int)y,(int)z), "coreblockY")),(int)(new Object(){
public double getValue(BlockPos pos, String tag){
		TileEntity tileEntity=world.getTileEntity(pos);
if(tileEntity!=null) return tileEntity.getTileData().getDouble(tag);
return -1;
}
}.getValue(new BlockPos((int)x,(int)y,(int)z), "coreblockZ"))));
	if (_ent != null) {
		final int _sltid = (int)(1);
		final ItemStack _setstack = (new Object() {
	public ItemStack getItemStack(BlockPos pos, int sltid) {
		AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
		TileEntity _ent = world.getTileEntity(pos);
		if (_ent != null) {
			_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
				_retval.set(capability.getStackInSlot(sltid).copy());
			});
		}
		return _retval.get();
	}
}.getItemStack(new BlockPos((int)x,(int)y,(int)z),(int)(1)))
;
		_setstack.setCount((int) (new Object(){
	public int getAmount(BlockPos pos,int sltid) {
		AtomicInteger _retval = new AtomicInteger(0);
		TileEntity _ent = world.getTileEntity(pos);
		if (_ent != null) {
			_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
				_retval.set(capability.getStackInSlot(sltid).getCount());
			});
		}
		return _retval.get();
	}
}.getAmount(new BlockPos((int)x,(int)y,(int)z),(int)(1)))
);
		_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
			if (capability instanceof IItemHandlerModifiable) {
				((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
			}
		});
	}
}
if(!world.isRemote){
	BlockPos _bp = new BlockPos((int)x,(int)y,(int)z);
	TileEntity _tileEntity=world.getTileEntity(_bp);
	BlockState _bs = world.getBlockState(_bp);
	if(_tileEntity != null)
		_tileEntity.getTileData().putBoolean("changed1", (false));
	world.notifyBlockUpdate(_bp, _bs, _bs, 3);
}}{
	TileEntity _ent = world.getTileEntity(new BlockPos((int)x,(int)y,(int)z));
	if (_ent != null) {
		final int _sltid = (int)(1);
		final ItemStack _setstack = (new Object() {
	public ItemStack getItemStack(BlockPos pos, int sltid) {
		AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
		TileEntity _ent = world.getTileEntity(pos);
		if (_ent != null) {
			_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
				_retval.set(capability.getStackInSlot(sltid).copy());
			});
		}
		return _retval.get();
	}
}.getItemStack(new BlockPos((int)(new Object(){
public double getValue(BlockPos pos, String tag){
		TileEntity tileEntity=world.getTileEntity(pos);
if(tileEntity!=null) return tileEntity.getTileData().getDouble(tag);
return -1;
}
}.getValue(new BlockPos((int)x,(int)y,(int)z), "coreblockX")),(int)(new Object(){
public double getValue(BlockPos pos, String tag){
		TileEntity tileEntity=world.getTileEntity(pos);
if(tileEntity!=null) return tileEntity.getTileData().getDouble(tag);
return -1;
}
}.getValue(new BlockPos((int)x,(int)y,(int)z), "coreblockY")),(int)(new Object(){
public double getValue(BlockPos pos, String tag){
		TileEntity tileEntity=world.getTileEntity(pos);
if(tileEntity!=null) return tileEntity.getTileData().getDouble(tag);
return -1;
}
}.getValue(new BlockPos((int)x,(int)y,(int)z), "coreblockZ"))),(int)(1)))
;
		_setstack.setCount((int) (new Object(){
	public int getAmount(BlockPos pos,int sltid) {
		AtomicInteger _retval = new AtomicInteger(0);
		TileEntity _ent = world.getTileEntity(pos);
		if (_ent != null) {
			_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
				_retval.set(capability.getStackInSlot(sltid).getCount());
			});
		}
		return _retval.get();
	}
}.getAmount(new BlockPos((int)(new Object(){
public double getValue(BlockPos pos, String tag){
		TileEntity tileEntity=world.getTileEntity(pos);
if(tileEntity!=null) return tileEntity.getTileData().getDouble(tag);
return -1;
}
}.getValue(new BlockPos((int)x,(int)y,(int)z), "coreblockX")),(int)(new Object(){
public double getValue(BlockPos pos, String tag){
		TileEntity tileEntity=world.getTileEntity(pos);
if(tileEntity!=null) return tileEntity.getTileData().getDouble(tag);
return -1;
}
}.getValue(new BlockPos((int)x,(int)y,(int)z), "coreblockY")),(int)(new Object(){
public double getValue(BlockPos pos, String tag){
		TileEntity tileEntity=world.getTileEntity(pos);
if(tileEntity!=null) return tileEntity.getTileData().getDouble(tag);
return -1;
}
}.getValue(new BlockPos((int)x,(int)y,(int)z), "coreblockZ"))),(int)(1)))
);
		_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
			if (capability instanceof IItemHandlerModifiable) {
				((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
			}
		});
	}
}
{
	TileEntity _ent = world.getTileEntity(new BlockPos((int)x,(int)y,(int)z));
	if (_ent != null) {
		final int _sltid = (int)(0);
		final ItemStack _setstack = (new Object() {
	public ItemStack getItemStack(BlockPos pos, int sltid) {
		AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
		TileEntity _ent = world.getTileEntity(pos);
		if (_ent != null) {
			_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
				_retval.set(capability.getStackInSlot(sltid).copy());
			});
		}
		return _retval.get();
	}
}.getItemStack(new BlockPos((int)(new Object(){
public double getValue(BlockPos pos, String tag){
		TileEntity tileEntity=world.getTileEntity(pos);
if(tileEntity!=null) return tileEntity.getTileData().getDouble(tag);
return -1;
}
}.getValue(new BlockPos((int)x,(int)y,(int)z), "coreblockX")),(int)(new Object(){
public double getValue(BlockPos pos, String tag){
		TileEntity tileEntity=world.getTileEntity(pos);
if(tileEntity!=null) return tileEntity.getTileData().getDouble(tag);
return -1;
}
}.getValue(new BlockPos((int)x,(int)y,(int)z), "coreblockY")),(int)(new Object(){
public double getValue(BlockPos pos, String tag){
		TileEntity tileEntity=world.getTileEntity(pos);
if(tileEntity!=null) return tileEntity.getTileData().getDouble(tag);
return -1;
}
}.getValue(new BlockPos((int)x,(int)y,(int)z), "coreblockZ"))),(int)(0)))
;
		_setstack.setCount((int) (new Object(){
	public int getAmount(BlockPos pos,int sltid) {
		AtomicInteger _retval = new AtomicInteger(0);
		TileEntity _ent = world.getTileEntity(pos);
		if (_ent != null) {
			_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
				_retval.set(capability.getStackInSlot(sltid).getCount());
			});
		}
		return _retval.get();
	}
}.getAmount(new BlockPos((int)(new Object(){
public double getValue(BlockPos pos, String tag){
		TileEntity tileEntity=world.getTileEntity(pos);
if(tileEntity!=null) return tileEntity.getTileData().getDouble(tag);
return -1;
}
}.getValue(new BlockPos((int)x,(int)y,(int)z), "coreblockX")),(int)(new Object(){
public double getValue(BlockPos pos, String tag){
		TileEntity tileEntity=world.getTileEntity(pos);
if(tileEntity!=null) return tileEntity.getTileData().getDouble(tag);
return -1;
}
}.getValue(new BlockPos((int)x,(int)y,(int)z), "coreblockY")),(int)(new Object(){
public double getValue(BlockPos pos, String tag){
		TileEntity tileEntity=world.getTileEntity(pos);
if(tileEntity!=null) return tileEntity.getTileData().getDouble(tag);
return -1;
}
}.getValue(new BlockPos((int)x,(int)y,(int)z), "coreblockZ"))),(int)(0)))
);
		_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
			if (capability instanceof IItemHandlerModifiable) {
				((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
			}
		});
	}
}


	}

}
