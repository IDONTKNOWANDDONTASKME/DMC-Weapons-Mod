package mod.azure.dmcweapons.util;

import mod.azure.dmcweapons.DMCWeaponsMod;
import mod.azure.dmcweapons.items.ItemBaseSword;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBow;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber
public class DMCItems {

	public static Item devilsworddante;

	@SubscribeEvent
	public static void registerItems(final RegistryEvent.Register<Item> event) {

		event.getRegistry().registerAll(devilsworddante = new ItemBaseSword("devilsworddante", 9),
				new ItemBaseSword("rebellion", 9), new ItemBaseSword("redqueen", 9), new ItemBaseSword("yamato", 9),
				new ItemBaseSword("spada", 9), new ItemBow().setCreativeTab(DMCTabs.SWORDS)
						.setTranslationKey("coyote-a").setRegistryName(location("coyote-a")));
	}

	public static ResourceLocation location(String name) {
		return new ResourceLocation(DMCWeaponsMod.MODID, name);
	}
}