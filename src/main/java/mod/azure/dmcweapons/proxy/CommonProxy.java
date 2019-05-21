package mod.azure.dmcweapons.proxy;

import mod.azure.dmcweapons.DMCWeaponsMod;
import mod.azure.dmcweapons.items.ItemBaseSword;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.registries.IForgeRegistry;

@Mod.EventBusSubscriber
public class CommonProxy {

	
	public void preInit() {
		
    }

	public void init() {
		
	}
	
	public void postInit() {
	}
	
	@Mod.EventBusSubscriber
	public static class RegistrationHandler {
		@SubscribeEvent
    	public static void registerItems(RegistryEvent.Register<Item> event) {
    		IForgeRegistry<Item> registry = event.getRegistry();
    		
    		for (Item item : itemList) {
    			registry.register(item);
    		}
    		
    		variantList = NonNullList.create();
    		for (Item item : itemList) {
    			item.getSubItems(DMCWeaponsMod.tab, variantList);
    		}
    	}
	}
	
	public static Item[] itemList = new Item[] {
			new ItemBaseSword("devilsworddante", 1),
			new ItemBaseSword("rebellion", 1),
			new ItemBaseSword("redqueen", 1),
			new ItemBaseSword("yamato", 1),
			new ItemBaseSword("spada", 1)
		    };
		    public static NonNullList<ItemStack> variantList;
}