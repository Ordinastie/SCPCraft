package netz.mods.scp.item.armor;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import netz.mods.scp.SCPCraft;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemArmorClassD extends ItemArmor
{
	@SideOnly(Side.CLIENT)
	private IIcon[] icons;
	public int armorType = 0;

	public ItemArmorClassD(ArmorMaterial par1ArmorMaterial, int par2, int par3)
	{
		super(par1ArmorMaterial, par2, par3);
		this.armorType = par3;
		this.setCreativeTab(SCPCraft.tabSCP);
	}

	public boolean getIsRepairable(ItemStack par1ItemStack, ItemStack par2ItemStack)
	{
		return false;
	}

	@SideOnly(Side.CLIENT)
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, int layer)
	{
		String textureLoc = "scp:textures/models/armor/classd_layer_";
		return this.armorType == 2 ? (textureLoc + "2.png") : (textureLoc + "1.png");
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerIcons(IIconRegister iconRegister)
	{
		icons = new IIcon[4];
		icons[0] = iconRegister.registerIcon("scp:gasMask");
		icons[1] = iconRegister.registerIcon("scp:classDShirt");
		icons[2] = iconRegister.registerIcon("scp:classDPants");
		icons[3] = iconRegister.registerIcon("scp:classDBoots");
	}

	@Override
	public IIcon getIcon(ItemStack stack, int pass)
	{
		return armorType <= 3 ? icons[armorType] : icons[0];
	}
}