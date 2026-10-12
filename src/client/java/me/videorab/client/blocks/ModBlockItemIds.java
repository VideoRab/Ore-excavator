package me.videorab.client.blocks;

import me.videorab.OreExcavator;
import net.minecraft.references.BlockItemId;
import net.minecraft.resources.Identifier;

public class ModBlockItemIds {
    public static final BlockItemId TRANSPARENT_BLOCK = create("transparent_block");

    private static BlockItemId create(String name) {
        Identifier id = OreExcavator.id(name);
        return BlockItemId.create(id, id);
    }
}
