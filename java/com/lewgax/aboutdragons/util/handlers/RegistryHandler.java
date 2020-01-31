package com.lewgax.aboutdragons.util.handlers;

import com.lewgax.aboutdragons.init.EnchantmentInit;
import com.lewgax.aboutdragons.init.Entityinit;
import com.lewgax.aboutdragons.init.Keybinds;
import com.lewgax.aboutdragons.init.ModItems;
import com.lewgax.aboutdragons.util.IHasModel;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;


@EventBusSubscriber
public class RegistryHandler 
{

	@SubscribeEvent
	public static void onItemRegister(RegistryEvent.Register<Item> event)
	{
		event.getRegistry().registerAll(ModItems.ITEMS.toArray(new Item[0]));
		
	}
	
	

	@SubscribeEvent
	public static void onModelRegister(ModelRegistryEvent event)
	{
		for (Item item : ModItems.ITEMS)
		{

			if(item instanceof IHasModel)
			{
				((IHasModel)item).RegisterModel();
			}			
		}
	}
	
	public static void preInitRegistries()
	{
		Keybinds.register();
		Entityinit.registerEntities();
		RenderHandler.registerEntityRenders();
	}
	@SubscribeEvent
	public static void onEnchantRegister(RegistryEvent.Register<Enchantment> event)
	{
		event.getRegistry().registerAll(EnchantmentInit.ENCHANTMENTS.toArray(new Enchantment[0]));
		
	}

}



	
	