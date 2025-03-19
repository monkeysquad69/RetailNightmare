
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.monkeysquad.retailnightmare.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;

import net.monkeysquad.retailnightmare.block.PackagerBlock;
import net.monkeysquad.retailnightmare.RetailnightmareMod;

import net.minecraft.world.level.block.Block;

public class RetailnightmareModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(RetailnightmareMod.MODID);
	public static final DeferredBlock<Block> PACKAGER = REGISTRY.register("packager", PackagerBlock::new);
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
