package com.lewgax.aboutdragons.entity;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.passive.EntityWolf;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;

public class EntityDrake extends EntityWolf 
{

	public EntityDrake(World worldIn) {
		super(worldIn);
		
	}
	
	@Override 
	public EntityWolf createChild(EntityAgeable ageable)
	{
		return new EntityDrake(world);
	}
	
	@Override 
	protected SoundEvent getAmbientSound() 
	{
		return super.getAmbientSound();
	}
	
	@Override
	protected SoundEvent getHurtSound(DamageSource source)
	{
		return super.getHurtSound(source);
	}
	
    @Override
	protected SoundEvent getDeathSound() 
    {
		return super.getDeathSound();
	}
    {
    
    	 
    	
    	
    }

}
