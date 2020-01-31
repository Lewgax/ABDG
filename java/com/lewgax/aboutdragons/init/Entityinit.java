package com.lewgax.aboutdragons.init;

import com.lewgax.aboutdragons.Main;
import com.lewgax.aboutdragons.entity.EntityDrake;
import com.lewgax.aboutdragons.util.Reference;

import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class Entityinit 
{
	public static void registerEntities()
	{
		registerEntity("drake", EntityDrake.class, Reference.ENTITY_DRAKE, 50, 11437146, 000000);
	}

	private static void registerEntity(String name, Class<? extends Entity> entity, int id, int range, int color1, int color2)
	{
		EntityRegistry.registerModEntity(new ResourceLocation(Reference.MODID + ":" + name), entity, name, id, Main.instance, range, 1, true, color1, color2);
	}
}
