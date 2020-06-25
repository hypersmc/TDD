package net.hyperteam.thedescendingdimensions.procedures;

@TheDescendingDimensionsModElements.ModElement.Tag
public class VoidPortalEntityCollidesInTheBlockProcedure extends TheDescendingDimensionsModElements.ModElement {

	public VoidPortalEntityCollidesInTheBlockProcedure(TheDescendingDimensionsModElements instance) {
		super(instance, 44);

	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure VoidPortalEntityCollidesInTheBlock!");
			return;
		}

		Entity entity = (Entity) dependencies.get("entity");

		{
			Entity _ent = entity;
			if (!_ent.world.isRemote && _ent instanceof ServerPlayerEntity) {
				DimensionType destinationType = VoidlandsDimension.type;

				ObfuscationReflectionHelper.setPrivateValue(ServerPlayerEntity.class, (ServerPlayerEntity) _ent, true, "field_184851_cj");

				ServerWorld nextWorld = _ent.getServer().getWorld(destinationType);

				((ServerPlayerEntity) _ent).connection.sendPacket(new SChangeGameStatePacket(4, 0));

				((ServerPlayerEntity) _ent).teleport(nextWorld, nextWorld.getSpawnPoint().getX(), nextWorld.getSpawnPoint().getY() + 1,
						nextWorld.getSpawnPoint().getZ(), _ent.rotationYaw, _ent.rotationPitch);

				((ServerPlayerEntity) _ent).connection.sendPacket(new SPlayerAbilitiesPacket(((ServerPlayerEntity) _ent).abilities));
				for (EffectInstance effectinstance : ((ServerPlayerEntity) _ent).getActivePotionEffects()) {
					((ServerPlayerEntity) _ent).connection.sendPacket(new SPlayEntityEffectPacket(_ent.getEntityId(), effectinstance));
				}
				((ServerPlayerEntity) _ent).connection.sendPacket(new SPlaySoundEventPacket(1032, BlockPos.ZERO, 0, false));
			}
		}

	}

}
