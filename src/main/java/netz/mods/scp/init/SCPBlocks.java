package netz.mods.scp.init;

import net.minecraft.block.Block;
import net.minecraft.block.BlockCompressed;
import net.minecraft.block.material.MapColor;
import net.minecraft.item.ItemBlock;
import cpw.mods.fml.common.registry.GameRegistry;

public class SCPBlocks
{
	public static void init()
	{
		initBlocks();
	}
	
	private static void initBlocks()
	{
		registerBlock(new BlockCompressed(MapColor.field_151668_h).func_149663_c("reinforced_iron"));
	}
	public static void registerBlock(Block block)
	{
		//TODO: getUnlocalizedName()
		GameRegistry.registerBlock(block, block.func_149739_a().replace("tile.", ""));
	}

	public static void registerBlock(Block block, Class<? extends ItemBlock> itemBlockClass)
	{
		//TODO: getUnlocalizedName()
		GameRegistry.registerBlock(block, itemBlockClass, block.func_149739_a().replace("tile.", ""));
	}

	public static void registerBlock(Block block, Class<? extends ItemBlock> itemBlockClass, Object... constructorArgs)
	{
		//TODO: getUnlocalizedName()
		GameRegistry.registerBlock(block, itemBlockClass, block.func_149739_a().replace("tile.", ""), null, constructorArgs);
	}
}
