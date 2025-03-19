
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.monkeysquad.retailnightmare.init;

import net.neoforged.neoforge.client.event.RegisterMenuScreensEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.monkeysquad.retailnightmare.client.gui.PackagerGUIScreen;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class RetailnightmareModScreens {
	@SubscribeEvent
	public static void clientLoad(RegisterMenuScreensEvent event) {
		event.register(RetailnightmareModMenus.PACKAGER_GUI.get(), PackagerGUIScreen::new);
	}
}
