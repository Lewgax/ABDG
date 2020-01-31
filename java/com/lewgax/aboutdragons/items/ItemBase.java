package com.lewgax.aboutdragons.items;

import com.lewgax.aboutdragons.Main;
import com.lewgax.aboutdragons.init.ModItems;
import com.lewgax.aboutdragons.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel {
	
	public ItemBase(String name) 
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.MATERIALS);
	
	    ModItems.ITEMS.add(this);
	
	}
	
	
	

	@Override
	public void RegisterModel() 
	{
           Main.proxy.registerItemRenderer(this, 0, "inventory");
           
		
	}
	
	
	
}


