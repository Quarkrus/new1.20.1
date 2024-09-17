package com.github.L_Ender.cataclysm.client.model.item;// Made with Blockbench 3.9.3
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports


import com.github.L_Ender.lionfishapi.client.model.tools.AdvancedEntityModel;
import com.github.L_Ender.lionfishapi.client.model.tools.AdvancedModelBox;
import com.github.L_Ender.lionfishapi.client.model.tools.BasicModelPart;
import com.google.common.collect.ImmutableList;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.world.entity.Entity;

public class ModelBlack_Steel_Targe extends AdvancedEntityModel<Entity> {
	private final AdvancedModelBox root;
	private final AdvancedModelBox plate;
	private final AdvancedModelBox handle;

	public ModelBlack_Steel_Targe() {
		texWidth = 64;
		texHeight = 64;

		root = new AdvancedModelBox(this);
		root.setRotationPoint(0.0F, 24.0F, 0.0F);


		plate = new AdvancedModelBox(this);
		plate.setRotationPoint(0.0F, -24.0F, -0.5F);
		root.addChild(plate);
		plate.setTextureOffset(0, 0).addBox(-8.0F, -8.0F, -2.0F, 16.0F, 16.0F, 2.0F, 0.0F, false);
		plate.setTextureOffset(17, 19).addBox(-3.0F, -3.0F, -3.0F, 6.0F, 6.0F, 1.0F, 0.0F, false);

		handle = new AdvancedModelBox(this);
		handle.setRotationPoint(0.0F, -24.0F, 0.5F);
		root.addChild(handle);
		handle.setTextureOffset(0, 19).addBox(-1.0F, -3.0F, -1.0F, 2.0F, 6.0F, 6.0F, 0.0F, false);
	}



	@Override
	public void renderToBuffer(PoseStack matrixStack, VertexConsumer buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		root.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(AdvancedModelBox AdvancedModelBox, float x, float y, float z) {
		AdvancedModelBox.rotateAngleX = x;
		AdvancedModelBox.rotateAngleY = y;
		AdvancedModelBox.rotateAngleZ = z;
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public Iterable<AdvancedModelBox> getAllParts() {
		return ImmutableList.of(
				root,
				plate,
				handle
		);
	}

	@Override
	public Iterable<BasicModelPart> parts() {
		return ImmutableList.of(root);
	}
}