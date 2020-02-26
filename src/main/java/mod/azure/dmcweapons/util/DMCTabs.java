package mod.azure.dmcweapons.util;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class DMCTabs {

	public static final CreativeTabs SWORDS = (new CreativeTabs("swords") {
		@Override
		@SideOnly(Side.CLIENT)
		public ItemStack createIcon() {
			return new ItemStack(DMCItems.devilsworddante);
		}
	});
}