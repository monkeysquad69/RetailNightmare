package net.monkeysquad.retailnightmare.procedures;

import net.monkeysquad.retailnightmare.entity.MopBucketEntity;

import net.minecraft.world.entity.Entity;

public class MopBucketRightClickedOnEntityProcedure {
	public static void execute(Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if (!((entity instanceof MopBucketEntity _datEntS ? _datEntS.getEntityData().get(MopBucketEntity.DATA_follows) : "").equals(sourceentity.getStringUUID()))) {
			if (entity instanceof MopBucketEntity _datEntSetS)
				_datEntSetS.getEntityData().set(MopBucketEntity.DATA_follows, (sourceentity.getStringUUID()));
		} else if (entity.isShiftKeyDown()) {
			if (entity instanceof MopBucketEntity _datEntSetS)
				_datEntSetS.getEntityData().set(MopBucketEntity.DATA_follows, "no one");
		}
	}
}
