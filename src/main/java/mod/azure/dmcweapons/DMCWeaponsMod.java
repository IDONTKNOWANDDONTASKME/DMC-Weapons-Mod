package mod.azure.dmcweapons;

import java.util.ArrayList;
import java.util.List;

import mod.azure.dmcweapons.proxy.CommonProxy;
import mod.azure.dmcweapons.util.LootHandler;
import mod.azure.dmcweapons.util.MMORPGHandler;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = DMCWeaponsMod.modid, version = DMCWeaponsMod.version, dependencies = DMCWeaponsMod.dependencies)
public class DMCWeaponsMod {

	public static final String modid = "dmcweapons";
	public static final String MODNAME = "Devil May Cry Weapons";
	public static final String version = "1.0.9";
	public static final String dependencies = "required-after:mmorpg";
	
	@SidedProxy(clientSide = "mod.azure.dmcweapons.proxy.ClientProxy", serverSide = "mod.azure.dmcweapons.proxy.CommonProxy")
    public static CommonProxy proxy;

	public static CreativeTabs tab = new Tab(modid);

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
        if(Loader.isModLoaded("mmorpg")) {
        	MinecraftForge.EVENT_BUS.register(new MMORPGHandler());
        }
    }  
}