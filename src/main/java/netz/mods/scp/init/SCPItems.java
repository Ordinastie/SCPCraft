package netz.mods.scp.init;

import net.minecraft.item.Item;
import cpw.mods.fml.common.registry.GameRegistry;

public class SCPItems
{
	public static void init()
	{
		
	}

	public static void registerItem(Item item)
	{
		GameRegistry.registerItem(item, item.getUnlocalizedName().replace("item.", ""));
	}
}
