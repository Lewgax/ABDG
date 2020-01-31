package com.lewgax.aboutdragons.util.handlers;

import com.lewgax.aboutdragons.entity.EntityDrake;
import com.lewgax.aboutdragons.entity.render.RenderDrake;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class RenderHandler 
{
	public static void registerEntityRenders()
	{
		RenderingRegistry.registerEntityRenderingHandler(EntityDrake.class, new IRenderFactory<EntityDrake>()
				{

					@Override
					public Render<? super EntityDrake> createRenderFor(RenderManager manager) 
					{

						return new RenderDrake(manager);
					}
			
				});
	}
}
	


