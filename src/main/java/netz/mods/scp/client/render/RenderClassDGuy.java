
package netz.mods.scp.client.render;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;
import netz.mods.scp.entity.EntityClassDGuy;

import org.lwjgl.opengl.GL11;

public class RenderClassDGuy extends RenderLiving
{
	private static final ResourceLocation resourceLocation = new ResourceLocation("scp:textures/entity/classd_guy.png");

	public RenderClassDGuy(ModelBase modelbase, float f)
	{
		super(modelbase, f);
	}

	public void renderClassD(EntityClassDGuy EntityClassDGuy, double d, double d1, double d2, float f, float f1)
	{
		super.doRenderLiving(EntityClassDGuy, d, d1, d2, f, f1);
	}

	public void doRenderLiving(EntityLivingBase entityliving, double d, double d1, double d2, float f, float f1)
	{
		renderClassD((EntityClassDGuy) entityliving, d, d1, d2, f, f1);
	}

	public void doRender(Entity entity, double d, double d1, double d2, float f, float f1)
	{
		renderClassD((EntityClassDGuy) entity, d, d1, d2, f, f1);
	}

	protected void preRenderScale(EntityClassDGuy entity, float f)
	{
		GL11.glScalef(1.25F, 1.25F, 1.25F);
	}

	protected void preRenderCallback(EntityLivingBase entityliving, float f)
	{
		preRenderScale((EntityClassDGuy) entityliving, f);
	}

	protected void rotateAnimal(EntityLivingBase entityliving)
	{
		GL11.glRotatef(90F, -1F, 0.0F, 0.0F);
	}

	@Override
	protected ResourceLocation getEntityTexture(Entity entity)
	{
		return resourceLocation;
	}
}

