package netz.mods.scp.helpers;

import java.util.HashMap;

import net.minecraft.entity.player.EntityPlayer;

import com.google.common.collect.Maps;

public class EntityPlayerHelper
{
	public static HashMap<EntityPlayer, EntityPlayerHelper> map = Maps.newHashMap();
	public static EntityPlayerHelper helper;
	public static void add(EntityPlayer player, EntityPlayerHelper helper) throws Exception
	{
		if (map.containsKey(player)) throw new Exception("Player is already registered");
		else map.put(player, helper);
	}

	public static EntityPlayerHelper get(EntityPlayer player) throws Exception
	{
		helper = new EntityPlayerHelper();
		if (helper == null)
		{
		if (!map.containsKey(player))
			add(player, new EntityPlayerHelper());
		}
		return map.get(player);
	}
	public boolean is096Target;
	public int time;

	private boolean hasHeard513;
	public boolean hasEntityHeard513()
	{
		return this.hasHeard513;
	}

	public static int blinkSpeed = 2;
	public int setBlinkSpeed(int m)
	{
		return blinkSpeed = m;
	}
	public int getBlinkSpeed()
	{
		return blinkSpeed;
	}

	/**
	 * Blink mechanic
	 */
	public int blink;

	public int getBlink()
	{
		return this.blink;
	}

	public void setBlink(int par1)
	{
		this.blink = par1;
	}

	public void decreaseBlinkSupply(int par1)
	{
		blink = blink - par1;
	}

	//private double score;

	//public void setScore(double score)
	//{
	//	this.score = score;
	//}

	//public double getScore()
	//{
	//	return score;
	//}

	//public EntityPlayerHelper(double score)
	//{
	//	this.score = score;
	//}
}
//Helper.get(player).getScore() for example