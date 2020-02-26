package mod.azure.dmcweapons.config;

import mod.azure.dmcweapons.DMCWeaponsMod;
import net.minecraftforge.common.config.Config;
import net.minecraftforge.common.config.ConfigManager;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Config(modid = DMCWeaponsMod.MODID)
@Config.LangKey("dmcweapons.config.title")
public class ModConfig {

	@Config.Name("Default Mine and Slash Stats")
	@Config.Comment("Auto Compat with Mine and Slash")
	public static boolean USE_COMPATIBILITY_ITEMS = true;

	@Mod.EventBusSubscriber(modid = DMCWeaponsMod.MODID)
	private static class EventHandler {

		@SubscribeEvent
		public static void onConfigChanged(final ConfigChangedEvent.OnConfigChangedEvent event) {
			if (event.getModID().equals(DMCWeaponsMod.MODID)) {
				ConfigManager.sync(DMCWeaponsMod.MODID, Config.Type.INSTANCE);
			}
		}
	}
}