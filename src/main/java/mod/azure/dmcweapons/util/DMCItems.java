package mod.azure.dmcweapons.util;

import mod.azure.dmcweapons.DMCWeaponsMod;
import mod.azure.dmcweapons.config.Config;
import net.minecraft.item.BowItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemTier;
import net.minecraft.item.SwordItem;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

public class DMCItems {
	public static Item rebellion;

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
	public static class RegistryEvents {
		@SubscribeEvent
		public static void registerItems(final RegistryEvent.Register<Item> event) {
			event.getRegistry().registerAll(
					new BowItem(new Item.Properties().group(DMCTabs.DMCItemGroup)
							.maxDamage(Config.SERVER.BOW_MAXDAMAGE.get())).setRegistryName(location("coyotea")),
					new BowItem(new Item.Properties().group(DMCTabs.DMCItemGroup)
							.maxDamage(Config.SERVER.BOW_MAXDAMAGE.get())).setRegistryName(location("ivory")),
					new BowItem(new Item.Properties().group(DMCTabs.DMCItemGroup)
							.maxDamage(Config.SERVER.BOW_MAXDAMAGE.get())).setRegistryName(location("ebony")),
					new BowItem(new Item.Properties().group(DMCTabs.DMCItemGroup)
							.maxDamage(Config.SERVER.BOW_MAXDAMAGE.get())).setRegistryName(location("kalinaann1")),
					new BowItem(new Item.Properties().group(DMCTabs.DMCItemGroup)
							.maxDamage(Config.SERVER.BOW_MAXDAMAGE.get())).setRegistryName(location("kalinaann2")),
					rebellion = new SwordItem(ItemTier.DIAMOND, 4, 6.0f,
							new Item.Properties().group(DMCTabs.DMCItemGroup)
									.maxDamage(Config.SERVER.SWORD_MAXDAMAGE.get()))
											.setRegistryName(location("rebellion")),
					new SwordItem(ItemTier.DIAMOND, 4, 6.0f,
							new Item.Properties().group(DMCTabs.DMCItemGroup)
									.maxDamage(Config.SERVER.SWORD_MAXDAMAGE.get()))
											.setRegistryName(location("redqueen")),
					new SwordItem(ItemTier.DIAMOND, 4, 6.0f,
							new Item.Properties().group(DMCTabs.DMCItemGroup)
									.maxDamage(Config.SERVER.SWORD_MAXDAMAGE.get())).setRegistryName(location("spada")),
					new SwordItem(ItemTier.DIAMOND, 4, 6.0f,
							new Item.Properties().group(DMCTabs.DMCItemGroup)
									.maxDamage(Config.SERVER.SWORD_MAXDAMAGE.get()))
											.setRegistryName(location("devilsworddante")),
					new SwordItem(ItemTier.DIAMOND, 4, 6.0f,
							new Item.Properties().group(DMCTabs.DMCItemGroup)
									.maxDamage(Config.SERVER.SWORD_MAXDAMAGE.get()))
											.setRegistryName(location("yamato")));
		}

		public static ResourceLocation location(String name) {
			return new ResourceLocation(DMCWeaponsMod.MODID, name);
		}
	}

}