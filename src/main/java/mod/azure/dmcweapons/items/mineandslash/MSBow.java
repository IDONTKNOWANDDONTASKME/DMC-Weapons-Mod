package mod.azure.dmcweapons.items.mineandslash;

import com.robertx22.items.gearitems.weapons.ItemBow;

import mod.azure.dmcweapons.DMCWeaponsMod;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;

public class MSBow extends ItemBow {
	
	public MSBow(String name) {
		super();
		this.setTranslationKey(name);
		this.setRegistryName(new ResourceLocation(DMCWeaponsMod.modid, name));
		this.setCreativeTab(DMCWeaponsMod.tab);
	}

	public String getTranslationKey(ItemStack stack) {
		return super.getTranslationKey();
	}

}
