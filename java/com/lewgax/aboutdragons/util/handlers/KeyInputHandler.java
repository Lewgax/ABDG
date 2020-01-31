package com.lewgax.aboutdragons.util.handlers;

import com.lewgax.aboutdragons.init.Keybinds;

import net.minecraft.client.Minecraft;
import net.minecraft.init.SoundEvents;
import net.minecraft.util.SoundCategory;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.InputEvent.KeyInputEvent;

public class KeyInputHandler 
{


@SubscribeEvent
public void Flappingflap(KeyInputEvent event)
    
    
    {
      if (Minecraft.getMinecraft().player.isElytraFlying())
            {

               if (Keybinds.flap.isPressed())
                       { 
                          Minecraft.getMinecraft().player.moveRelative(0, 1, 1, 0.5f);
                          Minecraft.getMinecraft().world.playSound(Minecraft.getMinecraft().player.getPosition(),SoundEvents.ENTITY_ENDERDRAGON_FLAP ,SoundCategory.PLAYERS, 1f, 1f, false);
                      }
            }
    }
}
                   
            
  
