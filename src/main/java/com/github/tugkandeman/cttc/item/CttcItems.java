package com.github.tugkandeman.cttc.item;

import com.github.tugkandeman.cttc.util.Registration;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;

public class CttcItems {

    public static final RegistryObject<Item> DEOBFUSCATOR =
            Registration.ITEMS.register("deobfuscator",
                    () -> new Item(new Item.Properties().group(CttcItemGroup.CTTC_GROUP)));





    public static void register() { }



}
