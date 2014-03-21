package netz.mods.scp;

import net.minecraft.creativetab.CreativeTabs;
import netz.mods.scp.creativetab.CreativeTabSCP;
import netz.mods.scp.creativetab.CreativeTabSCPBlock;
import netz.mods.scp.init.SCPBlocks;
import netz.mods.scp.init.SCPCrafting;
import netz.mods.scp.init.SCPItems;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid="scp")
public class SCPCraft
{
	@Instance("SCP")
	public static SCPCraft instance;
	@SidedProxy(modId="scp",
			clientSide="netz.mods.scp.ClientProxy",
			serverSide="netz.mods.scp.CommonProxy")
	public static CommonProxy proxy;
	public static CreativeTabs tabBlockSCP, tabSCP;
	public SCPCraft()
	{
		super();
	}

	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		tabBlockSCP =  (new CreativeTabSCPBlock(CreativeTabs.getNextID(), "tabBlockSCP"));
		tabSCP =  (new CreativeTabSCP(CreativeTabs.getNextID(), "tabSCP"));
		SCPItems.init();
		SCPBlocks.init();
		SCPCrafting.init();
	}

	@EventHandler
	public void init(FMLInitializationEvent event)
	{
		//TickRegistry.registerTickHandler(new SCPClientTickHandler(), Side.CLIENT);
		//MinecraftForge.EVENT_BUS.register(new SCPEventHandler());
		proxy.initRender();
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event){}

}
