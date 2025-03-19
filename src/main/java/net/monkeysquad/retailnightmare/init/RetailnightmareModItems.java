
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.monkeysquad.retailnightmare.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.monkeysquad.retailnightmare.item.MopBucketSpawnItem;
import net.monkeysquad.retailnightmare.item.DusterItem;
import net.monkeysquad.retailnightmare.item.BoxItem;
import net.monkeysquad.retailnightmare.RetailnightmareMod;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

public class RetailnightmareModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(RetailnightmareMod.MODID);
	public static final DeferredItem<Item> BOX = REGISTRY.register("box", BoxItem::new);
	public static final DeferredItem<Item> PACKAGER = block(RetailnightmareModBlocks.PACKAGER);
	public static final DeferredItem<Item> MOP_BUCKET_SPAWN = REGISTRY.register("mop_bucket_spawn", MopBucketSpawnItem::new);
	public static final DeferredItem<Item> DUST = block(RetailnightmareModBlocks.DUST);
	public static final DeferredItem<Item> DUSTER = REGISTRY.register("duster", DusterItem::new);

	// Start of user code block custom items
	// End of user code block custom items
	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
