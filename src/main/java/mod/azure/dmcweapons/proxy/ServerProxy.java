package mod.azure.dmcweapons.proxy;

import static net.minecraftforge.fml.relauncher.Side.SERVER;

import mod.azure.dmcweapons.DMCWeaponsMod;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = DMCWeaponsMod.MODID, value = SERVER)
public class ServerProxy extends IProxy {

	
	public void preInit() {
		
    }

	public void init() {
		
	}
	
	public void postInit() {
	}
}