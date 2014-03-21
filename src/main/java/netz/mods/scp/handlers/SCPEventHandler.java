package netz.mods.scp.handlers;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.event.ForgeSubscribe;
import net.minecraftforge.event.entity.living.LivingEvent.LivingUpdateEvent;
import netz.mods.scp.helpers.EntityPlayerHelper;

public class SCPEventHandler
{
	Minecraft mc = Minecraft.getMinecraft();
	EntityPlayerHelper eph = new EntityPlayerHelper();
	@ForgeSubscribe
	public void entityPlayerUpdate(LivingUpdateEvent event) throws Exception
	{
		if(event.entityLiving instanceof EntityPlayer)
		{	
			if(mc.thePlayer.isEntityAlive())
			{
				eph.setBlink(EntityPlayerHelper.get(mc.thePlayer).getBlink() - EntityPlayerHelper.get(mc.thePlayer).getBlinkSpeed());
				if (EntityPlayerHelper.get(mc.thePlayer).getBlink() <= 0)
				{
					eph.setBlink(300);
				}
			}
		}
	}
}
