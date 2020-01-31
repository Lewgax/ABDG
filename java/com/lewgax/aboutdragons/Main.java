package com.lewgax.aboutdragons;

import com.lewgax.aboutdragons.init.Keybinds;
import com.lewgax.aboutdragons.proxy.CommonProxy;
import com.lewgax.aboutdragons.util.Reference;
import com.lewgax.aboutdragons.util.handlers.KeyInputHandler;
import com.lewgax.aboutdragons.util.handlers.RegistryHandler;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;


@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)
public class Main {
	
	@Instance
	public static Main instance;
	
	
	@SidedProxy(clientSide=  Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
    public static CommonProxy proxy;

	@EventHandler
	public static void PreIni(FMLPreInitializationEvent event)
	{
		RegistryHandler.preInitRegistries();
		Keybinds.register();
		MinecraftForge.EVENT_BUS.register(new KeyInputHandler());
	}
	
	@EventHandler
	public static void Postinit(FMLPostInitializationEvent event)
	{
	
		
	}
		
		
}
