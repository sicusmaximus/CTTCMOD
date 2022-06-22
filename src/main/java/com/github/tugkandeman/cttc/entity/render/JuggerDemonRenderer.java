package com.github.tugkandeman.cttc.entity.render;

import com.github.tugkandeman.cttc.entity.JuggerDemonEntity;
import com.github.tugkandeman.cttc.entity.model.JuggerDemonModel;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.util.ResourceLocation;
import software.bernie.example.client.renderer.entity.layer.GeoExampleLayer;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class JuggerDemonRenderer extends GeoEntityRenderer<JuggerDemonEntity> {
    public JuggerDemonRenderer(EntityRendererManager renderManager) {
        super(renderManager, new JuggerDemonModel());
        this.addLayer(new GeoExampleLayer(this));
        this.shadowSize = 0.25f;
    }

    @Override
    public ResourceLocation getEntityTexture(JuggerDemonEntity entity) {
        return null;
    }
}
