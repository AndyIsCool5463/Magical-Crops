package dev.andyiscool5463.magicalcrops.items.essence;

import java.util.List;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class EssenceAccio extends EssenceBase {
	
	public EssenceAccio(CreativeTabs tab) {
		super("essence_accio", tab);
	}
	@Override
	public void	addInformation(ItemStack stack, World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
		tooltip.add("Minicio -> Accio");
	}
}
