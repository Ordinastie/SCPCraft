package netz.mods.scp.entity;

import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAvoidEntity;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class EntityClassDGuy extends SCPEntityD
{
	public boolean isVerminGod;

	public EntityClassDGuy(World par1World)
	{
		super(par1World);
		//texture = "/SCPCraft/textures/mobs/ClassDGuy.png";
		super.setSize(0.9F, 1.3F);
		getNavigator().setAvoidsWater(true);
		//moveSpeed = 0.4F;
		this.tasks.addTask(0, new EntityAISwimming(this));
		tasks.addTask(0, new EntityAIWatchClosest(this, EntityPlayer.class, 10F));
		tasks.addTask(1, new EntityAIWatchClosest(this, EntityClassDGuy.class, 10F));
		tasks.addTask(2, new EntityAIWatchClosest(this, EntitySCP173.class, 10F));
		tasks.addTask(3, new EntityAIWatchClosest(this, EntitySCP111.class, 10F));
		this.tasks.addTask(1, new EntityAIAvoidEntity(this, SCPEntity.class, 9.0F, 0.4F, 0.3F));
	}

	@Override
	protected void applyEntityAttributes()
	{
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.followRange).setAttribute(16.0D);
		this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setAttribute(0.4D);
		this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setAttribute(2.0D);
		this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setAttribute(30.0D);
	}

	protected void updateAITasks()
	{
		super.updateAITasks();
	}

	public void onLivingUpdate()
	{
		super.onLivingUpdate();
	}

	public void onUpdate()
	{
		super.onUpdate();
	}

	public boolean isAIEnabled()
	{
		return true;
	}

	protected boolean canDespawn()
	{
		return false;
	}

}