package mod.azure.dmcweapons.items.defaultweapons;

import mod.azure.dmcweapons.DMCWeaponsMod;
import net.minecraft.item.ItemBow;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;

public class ItemBaseGun extends ItemBow {

	public ItemBaseGun(String name) {
		super();
		this.setTranslationKey(name);
		this.setRegistryName(new ResourceLocation(DMCWeaponsMod.modid, name));
		this.setCreativeTab(DMCWeaponsMod.tab);
	}

	public String getTranslationKey(ItemStack stack) {
		return super.getTranslationKey();
	}
}