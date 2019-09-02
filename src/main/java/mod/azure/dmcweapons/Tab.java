package mod.azure.dmcweapons;

import mod.azure.dmcweapons.proxy.CommonProxy;
import mod.azure.dmcweapons.util.Register;
import net.minecraft.client.Minecraft;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@Mod.EventBusSubscriber(Side.CLIENT)
public class Tab extends CreativeTabs {

	private int nextTicks;

	private ItemStack stack;
	private int index;

	public Tab(String label) {
		super(label);
	}

	public String setTranslatedTabLabel() {
		return "tab." + DMCWeaponsMod.modid;
	}
	
	@Override
	public ItemStack getIcon() {
		int ticks = Minecraft.getMinecraft().ingameGUI.getUpdateCounter();
		if (ticks >= this.nextTicks) {
			this.nextTicks = ticks + 8;
			if (++this.index >= Register.variantList.size()) this.index = 0;
			
			this.stack = Register.variantList.get(this.index);
		}setBackgroundImageName("item_search.png");
		
		return this.createIcon();
	}

	@Override
	public ItemStack createIcon() {
		return this.stack;
	}
	
	@Override
	public boolean hasSearchBar() {
		return true;
	}

}
