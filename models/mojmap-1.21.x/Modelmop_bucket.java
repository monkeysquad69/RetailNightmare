// Made with Blockbench 4.12.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelmop_bucket<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "mop_bucket"), "main");
	private final ModelPart body;

	public Modelmop_bucket(ModelPart root) {
		this.body = root.getChild("body");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition body = partdefinition.addOrReplaceChild("body",
				CubeListBuilder.create().texOffs(30, 22)
						.addBox(-1.0F, 0.0F, -8.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(34, 22)
						.addBox(-1.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(24, 24)
						.addBox(-7.0F, -6.0F, -8.0F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(0, 30)
						.addBox(-1.0F, -6.0F, -8.0F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(32, 33)
						.addBox(-6.0F, -6.0F, -8.0F, 5.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 24)
						.addBox(-7.0F, -4.0F, -3.0F, 7.0F, 1.0F, 5.0F, new CubeDeformation(0.01F)).texOffs(32, 36)
						.addBox(-7.0F, 0.0F, -8.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(36, 36)
						.addBox(-7.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(30, 10)
						.addBox(-7.0F, -9.0F, -3.0F, 7.0F, 5.0F, 1.0F, new CubeDeformation(0.01F)).texOffs(30, 16)
						.addBox(-7.0F, -8.0F, 1.0F, 7.0F, 4.0F, 1.0F, new CubeDeformation(0.01F)).texOffs(16, 30)
						.addBox(-1.0F, -9.0F, -2.0F, 1.0F, 5.0F, 3.0F, new CubeDeformation(0.01F)).texOffs(24, 33)
						.addBox(-7.0F, -9.0F, -2.0F, 1.0F, 5.0F, 3.0F, new CubeDeformation(0.01F)).texOffs(36, 0)
						.addBox(0.0F, -13.0F, 0.0F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 10)
						.addBox(-7.0F, -4.0F, -8.0F, 7.0F, 4.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offset(3.5F, 23.0F, 4.0F));

		PartDefinition cube_r1 = body.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(36, 7).addBox(-0.5F, -2.0F, -0.5F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.01F)),
				PartPose.offsetAndRotation(0.5F, -12.75F, 0.5F, -0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r2 = body.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(0, 0).addBox(-5.0F, -2.0F, -8.0F, 9.0F, 1.0F, 9.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.0F, -2.0F, -2.0F, -0.3054F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}