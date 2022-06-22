package com.github.tugkandeman.cttc.util.registry;

import net.minecraft.client.audio.Sound;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.rmi.registry.Registry;

public class ModSoundEvents {
    public static final DeferredRegister<SoundEvent> MOD_SOUNDS;
    public static final RegistryObject<SoundEvent> JUGGER_ROAR;

    public ModSoundEvents() {
    }

    static {
        MOD_SOUNDS = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, "cttc");
        JUGGER_ROAR = MOD_SOUNDS.register("cttc.jugger_roar", () -> {
            return new SoundEvent(new ResourceLocation("cttc", "cttc.jugger_roar"));
        });

    }
}
