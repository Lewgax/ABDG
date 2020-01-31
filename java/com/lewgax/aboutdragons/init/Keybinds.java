package com.lewgax.aboutdragons.init;

import org.lwjgl.input.Keyboard;

import net.minecraft.client.settings.KeyBinding;
import net.minecraftforge.fml.client.registry.ClientRegistry;

public class Keybinds
{
    public static KeyBinding flap;
 
    public static void register()
    {
        flap = new KeyBinding("key.flap", Keyboard.KEY_V, "key.categories.aboutdragons");
 
        ClientRegistry.registerKeyBinding(flap);
    }
    
    	
    
}