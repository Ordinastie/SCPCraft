package netz.mods.scp.init;
import static netz.mods.scp.init.SCPItems.registerItem;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import netz.mods.scp.SCPCraft;
import netz.mods.scp.item.armor.ItemArmorClassD;
public class SCPArmors
{
	public static void init()
	{
		initArmor();
	}
	
	private static void initArmor()
	{
		registerItem(new ItemArmorClassD(ArmorMaterial.CLOTH, SCPCraft.proxy.addArmor("classd"), 0).setUnlocalizedName("gasMask"));
		registerItem(new ItemArmorClassD(ArmorMaterial.CLOTH, SCPCraft.proxy.addArmor("classd"), 1).setUnlocalizedName("classDShirt").setTextureName("scp:classDShirt"));
		registerItem(new ItemArmorClassD(ArmorMaterial.CLOTH, SCPCraft.proxy.addArmor("classd"), 2).setUnlocalizedName("classDPants").setTextureName("scp:classDPants"));
		registerItem(new ItemArmorClassD(ArmorMaterial.CLOTH, SCPCraft.proxy.addArmor("classd"), 3).setUnlocalizedName("classDBoots").setTextureName("scp:classDBoots"));
	}
}
