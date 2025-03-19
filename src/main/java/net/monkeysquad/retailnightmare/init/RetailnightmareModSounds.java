
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.monkeysquad.retailnightmare.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.monkeysquad.retailnightmare.RetailnightmareMod;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class RetailnightmareModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(Registries.SOUND_EVENT, RetailnightmareMod.MODID);
	public static final DeferredHolder<SoundEvent, SoundEvent> MOP_BUCKET_ROLLS = REGISTRY.register("mop_bucket_rolls", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("retailnightmare", "mop_bucket_rolls")));
}
