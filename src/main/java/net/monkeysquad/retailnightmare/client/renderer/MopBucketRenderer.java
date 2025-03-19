
package net.monkeysquad.retailnightmare.client.renderer;

import net.monkeysquad.retailnightmare.entity.MopBucketEntity;
import net.monkeysquad.retailnightmare.client.model.Modelmop_bucket;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

public class MopBucketRenderer extends MobRenderer<MopBucketEntity, Modelmop_bucket<MopBucketEntity>> {
	public MopBucketRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelmop_bucket<MopBucketEntity>(context.bakeLayer(Modelmop_bucket.LAYER_LOCATION)), 0.3f);
	}

	@Override
	public ResourceLocation getTextureLocation(MopBucketEntity entity) {
		return ResourceLocation.parse("retailnightmare:textures/entities/mop_bucket.png");
	}
}
