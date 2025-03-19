package net.monkeysquad.retailnightmare.procedures;

import net.minecraft.world.item.component.CustomData;
import net.minecraft.world.item.ItemStack;
import net.minecraft.core.component.DataComponents;

public class BoxSpecialInformationProcedure {
	public static String execute(ItemStack itemstack) {
		String result = "";
		double i = 0;
		result = "Contains: ";
		i = 0;
		for (int index0 = 0; index0 < 3; index0++) {
			if (!(itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getString(("row" + i))).equals("")) {
				result = result + "" + itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getString(("row" + i));
				if (!(itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getString(("row" + (i + 1)))).equals("")) {
					result = result + ", ";
				}
			}
			i = i + 1;
		}
		return result;
	}
}
