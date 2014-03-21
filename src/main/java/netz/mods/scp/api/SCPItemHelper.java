package netz.mods.scp.api;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import cpw.mods.fml.common.registry.GameRegistry;

public class SCPItemHelper
{
	public static ToolMaterial toolMaterialMud;
	public static ArmorMaterial armorMaterialMud;

	public static ToolMaterial toolMaterialAmethyst;
	public static ArmorMaterial armorClassD;

	public static ArmorMaterial armorMaterialUnprotective;

	public static Item get(String name)
	{
		return GameRegistry.findItem("scp", name);
	}
}
