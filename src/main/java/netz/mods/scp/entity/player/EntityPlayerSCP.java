package netz.mods.scp.entity.player;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ChatMessageComponent;
import net.minecraft.util.ChunkCoordinates;
import net.minecraft.world.World;

public class EntityPlayerSCP extends EntityPlayer
{

	public EntityPlayerSCP(World par1World, String par2Str)
	{
		super(par1World, par2Str);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void sendChatToPlayer(ChatMessageComponent chatmessagecomponent)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean canCommandSenderUseCommand(int i, String s)
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ChunkCoordinates getPlayerCoordinates()
	{
		// TODO Auto-generated method stub
		return null;
	}

}
