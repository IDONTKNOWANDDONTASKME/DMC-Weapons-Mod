package mod.azure.dmcweapons;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import mod.azure.dmcweapons.config.ModConfig;
import mod.azure.dmcweapons.proxy.IProxy;
import mod.azure.dmcweapons.util.LootHandler;
import mod.azure.dmcweapons.util.MineSlashHandler;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = DMCWeaponsMod.MODID)
public class DMCWeaponsMod {

	public static final String MODID = "dmcweapons";
	public static final String MODNAME = "Devil May Cry Weapons";
	public static final Logger LOGGER = LogManager.getLogger();

	@SidedProxy(clientSide = "mod.azure.dmcweapons.proxy.ClientProxy", serverSide = "mod.azure.dmcweapons.proxy.ServerProxy")
	public static IProxy proxy;

	@Mod.Instance
	public static DMCWeaponsMod instance;

	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent e) {
		proxy.preInit();
	}

	@Mod.EventHandler
	public void init(FMLInitializationEvent e) {
		proxy.init();
		MinecraftForge.EVENT_BUS.register(new LootHandler());
	}

	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent e) {
		proxy.postInit();
		if (Loader.isModLoaded("mmorpg") && ModConfig.USE_COMPATIBILITY_ITEMS) {
			MinecraftForge.EVENT_BUS.register(new MineSlashHandler());
		}
	}
}