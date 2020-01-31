package com.lewgax.aboutdragons.init;

import java.util.ArrayList;
import java.util.List;

import com.lewgax.aboutdragons.items.ItemBase;


import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems {
	
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	//Materials
	public static final ToolMaterial MATERIAL_ANCIENT_SHARD = EnumHelper.addToolMaterial("material_ancient_shard",0, 59, 2.0F, 0.0F, 15);
	
	
	//items
	public static final Item ANCIENT_SHARD = new ItemBase("ancient_shard");

	//tools 
}
