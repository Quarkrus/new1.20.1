package com.github.L_Ender.cataclysm.client.model.entity;

import com.github.L_Ender.lionfishapi.client.model.tools.AdvancedEntityModel;
import com.github.L_Ender.lionfishapi.client.model.tools.AdvancedModelPart;
import com.github.L_Ender.lionfishapi.client.model.tools.BasicModelPart;
import com.google.common.collect.ImmutableList;
import net.minecraft.world.entity.Entity;

public class ModelIgnis_Fireball extends AdvancedEntityModel<Entity> {

	private final AdvancedModelPart root;
	private final AdvancedModelPart core;
	private final AdvancedModelPart out_line;

	public ModelIgnis_Fireball()
	{
		this.texWidth = 64;
		this.texHeight = 64;
		root = new AdvancedModelPart(this);
		root.setRotationPoint(0.0F, 0.0F, 0.0F);


		core = new AdvancedModelPart(this);
		core.setRotationPoint(0.0F, 0.0F, 0.0F);
		root.addChild(core);
		core.setTextureOffset(20, 37).addBox(-4.0F, -4.0F, -1.0F, 8.0F, 8.0F, 2.0F, 0.0F, false);
		core.setTextureOffset(0, 31).addBox(-1.0F, -4.0F, -4.0F, 2.0F, 8.0F, 8.0F, 0.0F, false);
		core.setTextureOffset(0, 21).addBox(-4.0F, -1.0F, -4.0F, 8.0F, 2.0F, 8.0F, 0.0F, false);

		out_line = new AdvancedModelPart(this);
		out_line.setRotationPoint(0.0F, 0.0F, 0.0F);
		root.addChild(out_line);
		out_line.setTextureOffset(0, 0).addBox(-5.0F, -5.0F, -5.0F, 10.0F, 10.0F, 10.0F, 0.0F, false);
	}

	@Override
	public Iterable<AdvancedModelPart> getAllParts() {
		return ImmutableList.of(root,core,out_line);
	}

	@Override
	public Iterable<BasicModelPart> parts() {
		return ImmutableList.of(root);
	}

	@Override
	public void setupAnim(Entity entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch)
	{
		this.root.rotateAngleY = netHeadYaw * ((float) Math.PI / 180F);
		this.root.rotateAngleX = headPitch * ((float) Math.PI / 180F);
	}
}