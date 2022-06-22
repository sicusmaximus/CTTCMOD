package com.github.tugkandeman.cttc.block;

import com.github.tugkandeman.cttc.util.Registration;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;

import java.util.function.Supplier;

public class CttcBlocks
{
    public static final RegistryObject<Block> ADAMANTITE_BLOCK = register("adamantite_block",
            () -> new AdamantiteBlock(AbstractBlock.Properties.create(Material.IRON).hardnessAndResistance(50f, 100f).sound(SoundType.NETHERITE)));

    public static void register() { }

    private static <T extends Block>RegistryObject<T> register(String name, Supplier<T> block)
    {
        RegistryObject<T> toReturn = Registration.BLOCKS.register(name, block);
        Registration.ITEMS.register(name, () -> new BlockItem(toReturn.get(),
                new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
        return toReturn;
    }
}
