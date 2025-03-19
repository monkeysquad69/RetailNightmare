package net.monkeysquad.retailnightmare.procedures;

import net.monkeysquad.retailnightmare.entity.MopBucketEntity;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;

import java.util.List;
import java.util.Comparator;
import java.util.ArrayList;

public class MopBucketOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		boolean indistance = false;
		boolean followindistance = false;
		indistance = false;
		followindistance = false;
		{
			final Vec3 _center = new Vec3(x, y, z);
			List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(5 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
			for (Entity entityiterator : _entfound) {
				if ((entity instanceof MopBucketEntity _datEntS ? _datEntS.getEntityData().get(MopBucketEntity.DATA_follows) : "").equals(entityiterator.getStringUUID())) {
					indistance = true;
				}
			}
		}
		{
			final Vec3 _center = new Vec3(x, y, z);
			List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(35 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
			for (Entity entityiterator : _entfound) {
				if ((entity instanceof MopBucketEntity _datEntS ? _datEntS.getEntityData().get(MopBucketEntity.DATA_follows) : "").equals(entityiterator.getStringUUID())) {
					followindistance = true;
				}
			}
		}
		if (!indistance && followindistance) {
			for (Entity entityiterator : new ArrayList<>(world.players())) {
				if ((entity instanceof MopBucketEntity _datEntS ? _datEntS.getEntityData().get(MopBucketEntity.DATA_follows) : "").equals(entityiterator.getStringUUID())) {
					if (entity instanceof Mob _entity)
						_entity.getNavigation().moveTo((entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()), 0.95);
				}
			}
		}
	}
}
