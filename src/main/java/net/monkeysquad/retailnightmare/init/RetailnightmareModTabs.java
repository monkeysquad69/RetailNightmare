
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.monkeysquad.retailnightmare.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.monkeysquad.retailnightmare.RetailnightmareMod;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

public class RetailnightmareModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, RetailnightmareMod.MODID);
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> RETAIL_NIGHTMARE = REGISTRY.register("retail_nightmare",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.retailnightmare.retail_nightmare")).icon(() -> new ItemStack(RetailnightmareModItems.BOX.get())).displayItems((parameters, tabData) -> {
				tabData.accept(RetailnightmareModItems.BOX.get());
				tabData.accept(RetailnightmareModBlocks.PACKAGER.get().asItem());
				tabData.accept(RetailnightmareModItems.MOP_BUCKET_SPAWN.get());
			}).build());
}
