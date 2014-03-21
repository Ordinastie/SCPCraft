package netz.mods.scp;

import net.minecraft.client.model.ModelBiped;
import netz.mods.scp.client.render.RenderClassDGuy;
import netz.mods.scp.entity.EntityClassDGuy;
import cpw.mods.fml.client.registry.RenderingRegistry;

public class ClientProxy extends CommonProxy
{
	public void initRender()
	{
		RenderingRegistry.registerEntityRenderingHandler(EntityClassDGuy.class, new RenderClassDGuy(new ModelBiped(), 0.5f));
	}
	
	public int addArmor(String armor) {
		return RenderingRegistry.addNewArmourRendererPrefix(armor);
	}
}
