package com.lewgax.aboutdragons.enchantments;



import com.lewgax.aboutdragons.init.EnchantmentInit;
import com.lewgax.aboutdragons.init.Keybinds;
import com.lewgax.aboutdragons.util.Reference;

import net.minecraft.client.Minecraft;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnumEnchantmentType;
import net.minecraft.init.Enchantments;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundCategory;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.InputEvent.KeyInputEvent;



public class EnchantmentFlapping extends Enchantment 
{

	public EnchantmentFlapping()
	{
		super(Rarity.VERY_RARE, EnumEnchantmentType.ARMOR_CHEST, new EntityEquipmentSlot[] {EntityEquipmentSlot.CHEST});
        this.setName("flapping");
        this.setRegistryName(new ResourceLocation(Reference.MODID + ":flapping" ));
		
        EnchantmentInit.ENCHANTMENTS.add(this);
	}
	
	@Override
	public int getMinEnchantability(int enchantmentLevel) 
	{
		return 90 * enchantmentLevel;
	}
	
	@Override
	public int getMaxEnchantability(int enchantmentLevel)
	{
  		return this.getMinEnchantability(enchantmentLevel) + 90;
	}
	{
		
	}
	@Override
	public int getMaxLevel()
	{
		return 3;
	}
	@Override
	protected boolean canApplyTogether(Enchantment ench) {
	
		return super.canApplyTogether(ench) && ench != Enchantments.MENDING;
		
		
	}
	@Override
	public boolean canApplyAtEnchantingTable(ItemStack stack) {
		
		return false;

	}
	@SubscribeEvent
    public void Flappingflap(KeyInputEvent event)
    
    
    {
      if (Minecraft.getMinecraft().player.isElytraFlying())
            {

               if (Keybinds.flap.isPressed())
                       { 
                          Minecraft.getMinecraft().player.moveRelative(0, 0, 1, 1.5f);
                          Minecraft.getMinecraft().world.playSound(Minecraft.getMinecraft().player.getPosition(),SoundEvents.ENTITY_ENDERDRAGON_FLAP ,SoundCategory.PLAYERS, 1f, 1f, false);
                      }
            }
  }
}
	
	


	
		
	
	
		
		
			

			

		



		
	
