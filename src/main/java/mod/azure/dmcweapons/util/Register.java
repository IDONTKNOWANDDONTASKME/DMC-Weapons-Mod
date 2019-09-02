package mod.azure.dmcweapons.util;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import mod.azure.dmcweapons.items.defaultweapons.ItemBaseGun;
import mod.azure.dmcweapons.items.defaultweapons.ItemBaseSword;
import mod.azure.dmcweapons.items.mineandslash.MSBow;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraftforge.fml.common.Loader;

public class Register {

	private static final Logger LOGGER = LogManager.getLogger();
	
	public static Item[] itemList;
	public static NonNullList<ItemStack> variantList;
	static {
		List<Item> items = new ArrayList<Item>();
		items.add(new ItemBaseSword("devilsworddante", 9));
		items.add(new ItemBaseSword("rebellion", 9));
		items.add(new ItemBaseSword("redqueen", 9));
		items.add(new ItemBaseSword("yamato", 9));
		items.add(new ItemBaseSword("spada", 9));
		items.add(new ItemBaseGun("coyote-a"));
		LOGGER.debug("Registered Normal Items");
		if (Loader.isModLoaded("mmorpg")) {
			items.add(new MSBow("coyote-a"));
		} else {
			items.add(new ItemBaseGun("coyote-a"));
		}
		itemList = items.toArray(new Item[items.size()]);
	}
}
