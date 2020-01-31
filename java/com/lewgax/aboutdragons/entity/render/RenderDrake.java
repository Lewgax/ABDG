package com.lewgax.aboutdragons.entity.render;

import com.lewgax.aboutdragons.entity.EntityDrake;
import com.lewgax.aboutdragons.entity.model.DrakeModel;
import com.lewgax.aboutdragons.util.Reference;

import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderDrake  extends RenderLiving<EntityDrake>
{

	public static final ResourceLocation TEXTURES = new ResourceLocation(Reference.MODID + ":textures/entity/drake.png");
	
	public RenderDrake(RenderManager manager) 
	{
		super(manager, new DrakeModel(), 0.5F);

	}
	@Override
	protected ResourceLocation getEntityTexture(EntityDrake entity)
	{

		return TEXTURES; 
	}
	@Override
	protected void applyRotations(EntityDrake entityLiving, float p_77043_2_, float rotationYaw, float partialTicks) 
	{
		super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
	}

}
 