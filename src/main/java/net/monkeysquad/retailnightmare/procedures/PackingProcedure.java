package net.monkeysquad.retailnightmare.procedures;

import net.neoforged.neoforge.items.IItemHandler;
import net.neoforged.neoforge.common.extensions.ILevelExtension;
import net.neoforged.neoforge.capabilities.Capabilities;

import net.monkeysquad.retailnightmare.init.RetailnightmareModItems;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.component.CustomData;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.component.DataComponents;
import net.minecraft.core.BlockPos;

import java.util.function.Supplier;
import java.util.Map;

public class PackingProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		ItemStack box = ItemStack.EMPTY;
		double i = 0;
		boolean packed = false;
		box = new ItemStack(RetailnightmareModItems.BOX.get()).copy();
		i = 0;
		for (int index0 = 0; index0 < 3; index0++) {
			if (!((new Object() {
				public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
					if (world instanceof ILevelExtension _ext) {
						IItemHandler _itemHandler = _ext.getCapability(Capabilities.ItemHandler.BLOCK, pos, null);
						if (_itemHandler != null)
							return _itemHandler.getStackInSlot(slotid).copy();
					}
					return ItemStack.EMPTY;
				}
			}.getItemStack(world, BlockPos.containing(x, y, z), (int) i)).getItem() == Blocks.AIR.asItem())) {
				{
					final String _tagName = ("row" + i);
					final String _tagValue = ((new Object() {
						public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
							if (world instanceof ILevelExtension _ext) {
								IItemHandler _itemHandler = _ext.getCapability(Capabilities.ItemHandler.BLOCK, pos, null);
								if (_itemHandler != null)
									return _itemHandler.getStackInSlot(slotid).getCount();
							}
							return 0;
						}
					}.getAmount(world, BlockPos.containing(x, y, z), (int) i)) + "" + ("x" + ((new Object() {
						public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
							if (world instanceof ILevelExtension _ext) {
								IItemHandler _itemHandler = _ext.getCapability(Capabilities.ItemHandler.BLOCK, pos, null);
								if (_itemHandler != null)
									return _itemHandler.getStackInSlot(slotid).copy();
							}
							return ItemStack.EMPTY;
						}
					}.getItemStack(world, BlockPos.containing(x, y, z), (int) i)).getDisplayName().getString())));
					CustomData.update(DataComponents.CUSTOM_DATA, box, tag -> tag.putString(_tagName, _tagValue));
				}
				if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
					((Slot) _slots.get((int) i)).set(ItemStack.EMPTY);
					_player.containerMenu.broadcastChanges();
				}
				packed = true;
			}
			i = i + 1;
		}
		if (packed) {
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.note_block.pling")), SoundSource.NEUTRAL, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.note_block.pling")), SoundSource.NEUTRAL, 1, 1, false);
				}
			}
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.END_ROD, (x + 0.5), (y + 1), (z + 0.5), 15, 0.25, 0.25, 0.25, 0.01);
			if (world instanceof ServerLevel _level) {
				ItemEntity entityToSpawn = new ItemEntity(_level, x, (y + 1.5), z, box);
				entityToSpawn.setPickUpDelay(10);
				_level.addFreshEntity(entityToSpawn);
			}
		} else {
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.generic.extinguish_fire")), SoundSource.NEUTRAL, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.generic.extinguish_fire")), SoundSource.NEUTRAL, 1, 1, false);
				}
			}
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.ELECTRIC_SPARK, (x + 0.5), (y + 1), (z + 0.5), 15, 0.25, 0.25, 0.25, 0.01);
		}
		if (entity instanceof Player _player)
			_player.closeContainer();
	}
}
