package netz.mods.scp.init;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import netz.mods.scp.api.SCPBlockHelper;
import netz.mods.scp.api.SCPItemHelper;
import cpw.mods.fml.common.registry.GameRegistry;

public class SCPCrafting
{
	public SCPCrafting()
	{
		super();
	}
	
	public static void init()
	{
		initItem();
		initBlock();
	}
	
	private static void initItem()
	{
		GameRegistry.addRecipe(new ItemStack(SCPItemHelper.get("gas_mask")),		"xxx", "x x",			'x', (new ItemStack(Blocks.wool, 1, 15)));
		GameRegistry.addRecipe(new ItemStack(SCPItemHelper.get("classd_shirt")),	"x x", "xxx", "xxx",	'x', (new ItemStack(Blocks.wool, 1, 1)));
		GameRegistry.addRecipe(new ItemStack(SCPItemHelper.get("classd_pants")),	"xxx", "x x", "x x",	'x', (new ItemStack(Blocks.wool, 1, 1)));
		GameRegistry.addRecipe(new ItemStack(SCPItemHelper.get("classd_boots")),	"x x", "x x",			'x', (new ItemStack(Blocks.wool, 1, 1)));
	}
	
	private static void initBlock()
	{
		GameRegistry.addRecipe(new ItemStack(SCPBlockHelper.get("reinforced_steel")), " x ", "xcx", " x ", 'x', (new ItemStack(Items.iron_ingot)), 'c', (new ItemStack(Blocks.iron_block)));
	}
}
