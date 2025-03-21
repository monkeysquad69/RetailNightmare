
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.monkeysquad.retailnightmare.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;

import net.monkeysquad.retailnightmare.block.StainBlock;
import net.monkeysquad.retailnightmare.block.PuddleBlock;
import net.monkeysquad.retailnightmare.block.PackagerBlock;
import net.monkeysquad.retailnightmare.block.DustBlock;
import net.monkeysquad.retailnightmare.RetailnightmareMod;

import net.minecraft.world.level.block.Block;

public class RetailnightmareModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(RetailnightmareMod.MODID);
	public static final DeferredBlock<Block> PACKAGER = REGISTRY.register("packager", PackagerBlock::new);
	public static final DeferredBlock<Block> DUST = REGISTRY.register("dust", DustBlock::new);
	public static final DeferredBlock<Block> PUDDLE = REGISTRY.register("puddle", PuddleBlock::new);
	public static final DeferredBlock<Block> STAIN = REGISTRY.register("stain", StainBlock::new);
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
