package com.github.tugkandeman.cttc.entity.model;

import com.github.tugkandeman.cttc.entity.JuggerDemonEntity;
import net.minecraft.util.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedTickingGeoModel;

public class JuggerDemonModel extends AnimatedTickingGeoModel<JuggerDemonEntity> {


    @Override
    public ResourceLocation getModelLocation(JuggerDemonEntity object) {
        return new ResourceLocation("cttc", "geo/jugger.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(JuggerDemonEntity object) {
        return new ResourceLocation("cttc", "textures/entity/jugger.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(JuggerDemonEntity animatable) {
        return new ResourceLocation("cttc", "animations/animations.jugger.json");
    }
}
