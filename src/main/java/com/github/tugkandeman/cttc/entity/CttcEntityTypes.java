package com.github.tugkandeman.cttc.entity;

import com.github.tugkandeman.cttc.Cttc;
import com.github.tugkandeman.cttc.util.Registration;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.RegistryObject;

public class CttcEntityTypes
{
    public static final RegistryObject<EntityType<JuggerDemonEntity>> JUGGER = Registration.ENTITIES.register("jugger",
    () -> EntityType.Builder.create(JuggerDemonEntity::new, EntityClassification.MONSTER)
            .size(1.5f, 3f)
            .immuneToFire()
            .trackingRange(25)
            .build(new ResourceLocation(Cttc.MOD_ID + "jugger").toString()));

    public static void register() {}

}
