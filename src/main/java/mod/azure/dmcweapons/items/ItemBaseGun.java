package mod.azure.dmcweapons.items;

import mod.azure.dmcweapons.DMCWeaponsMod;
import mod.azure.dmcweapons.util.IMultiType;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemBow;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraft.util.ResourceLocation;

public class ItemBaseGun extends ItemBow implements IMultiType {
	
	private final int maxTypes;

	public ItemBaseGun(String name, int maxTypes) {
		super();
		this.maxTypes = maxTypes;
		this.setTranslationKey(name);
		this.setRegistryName(new ResourceLocation(DMCWeaponsMod.modid, name));
		this.setCreativeTab(DMCWeaponsMod.tab);
	}

	public int getMaxTypes() {
		return this.maxTypes;
	}

	public int getType(ItemStack stack) {
		return stack.getItemDamage() + 1;
	}

	@Override
    public void getSubItems(CreativeTabs tab, NonNullList<ItemStack> variants) {
		if (this.isInCreativeTab(tab)) {
			for (int meta = 0; meta < this.getMaxTypes(); meta++) {
				variants.add(new ItemStack(this, 1, meta));
			}
		}
	}

	public String getTranslationKey(ItemStack stack) {
		return super.getTranslationKey();
	}
}