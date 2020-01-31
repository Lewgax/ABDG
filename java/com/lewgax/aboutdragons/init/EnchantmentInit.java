package com.lewgax.aboutdragons.init;

import java.util.ArrayList;
import java.util.List;

import com.lewgax.aboutdragons.enchantments.EnchantmentFlapping;
import com.lewgax.aboutdragons.util.Reference;

import net.minecraft.enchantment.Enchantment;
import net.minecraftforge.fml.common.Mod;





@Mod.EventBusSubscriber(modid=Reference.MODID)
public class EnchantmentInit
{

	public static final List<Enchantment> ENCHANTMENTS = new ArrayList<Enchantment>();
	
	public static final Enchantment FLAPPING = new EnchantmentFlapping();
	
	

 
	
}


	
	
	
//	@SubscribeEvent
//	public static void flappingflap(RightClickItem event)
//	{ 
//		Object jumpper = event.getItemStack();
//		if(jumpper instanceof EntityPlayer)
//		{
//			EntityPlayer entityJumpper = (EntityPlayer)jumpper;
//		int level = EnchantmentHelper.getEnchantmentLevel(FLAPPING, entityJumpper.getHeldItemOffhand());
//		if(!entityJumpper.getEntityWorld().isRemote && level > 0)
//			{
//				float floatLevel = (float)level;
//				entityJumpper.moveForward = 5f;
//				{
//					
//				}
	//		}
			
			
			
	//	}
		
		
		
	
 // }


