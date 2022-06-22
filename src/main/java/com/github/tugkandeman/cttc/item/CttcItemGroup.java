package com.github.tugkandeman.cttc.item;

import com.github.tugkandeman.cttc.Cttc;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class CttcItemGroup {

    public static final ItemGroup CTTC_GROUP = new ItemGroup("cttcModTab")
    {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(CttcItems.DEOBFUSCATOR.get());
        }
    };
}
