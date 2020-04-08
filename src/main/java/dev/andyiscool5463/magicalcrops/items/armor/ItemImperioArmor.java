package dev.andyiscool5463.magicalcrops.items.armor;

import dev.andyiscool5463.magicalcrops.items.ItemEssenceArmor;
import net.minecraft.inventory.EntityEquipmentSlot;

public class ItemImperioArmor extends ItemEssenceArmor {

	public ItemImperioArmor(ArmorMaterial materialIn, int armorType, EntityEquipmentSlot slot, String name) {
		super(materialIn, armorType, slot);
		setUnlocalizedName(name);
		setRegistryName(name);
		// TODO Auto-generated constructor stub
	}
}
