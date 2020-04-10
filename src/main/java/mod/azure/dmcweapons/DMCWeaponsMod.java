package mod.azure.dmcweapons;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import mod.azure.dmcweapons.config.Config;
import mod.azure.dmcweapons.util.LootHandler;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.loading.FMLPaths;

@Mod("dmcweapons")
public class DMCWeaponsMod {
	public static DMCWeaponsMod instance;
	public static final String MODID = "dmcweapons";
	public static final Logger LOGGER = LogManager.getLogger(MODID);

	public DMCWeaponsMod() {
		instance = this;
		ModLoadingContext modLoadingContext = ModLoadingContext.get();
		IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
		modEventBus.addListener(this::setup);
		modLoadingContext.registerConfig(ModConfig.Type.SERVER, Config.SERVER_SPEC, "dmcweapons-config.toml");
		Config.loadConfig(Config.SERVER_SPEC, FMLPaths.CONFIGDIR.get().resolve("dmcweapons-config.toml").toString());
	}

	private void setup(final FMLCommonSetupEvent event) {
		if (Config.SERVER.USE_CHESTLOOTSYSTEM.get()) {
			MinecraftForge.EVENT_BUS.register(new LootHandler());
		}
	}
}