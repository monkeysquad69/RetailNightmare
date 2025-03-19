
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.monkeysquad.retailnightmare.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.common.extensions.IMenuTypeExtension;

import net.monkeysquad.retailnightmare.world.inventory.PackagerGUIMenu;
import net.monkeysquad.retailnightmare.RetailnightmareMod;

import net.minecraft.world.inventory.MenuType;
import net.minecraft.core.registries.Registries;

public class RetailnightmareModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(Registries.MENU, RetailnightmareMod.MODID);
	public static final DeferredHolder<MenuType<?>, MenuType<PackagerGUIMenu>> PACKAGER_GUI = REGISTRY.register("packager_gui", () -> IMenuTypeExtension.create(PackagerGUIMenu::new));
}
