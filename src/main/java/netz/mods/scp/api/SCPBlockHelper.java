package netz.mods.scp.api;

import net.minecraft.block.Block;
import cpw.mods.fml.common.registry.GameRegistry;

public class SCPBlockHelper
{
	public static Block get(String name)
	{
		return GameRegistry.findBlock("scp", name);
	}
}
