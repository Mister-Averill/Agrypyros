package fr.mister_averill.agrypyrosmod.item;

import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class ModTiers {
    public static final ForgeTier COPPER = new ForgeTier(1, 191, 5.0F, 1F, 10,
            BlockTags.NEEDS_STONE_TOOL, () -> Ingredient.of(Items.COPPER_INGOT));

    public static final ForgeTier BRONZE = new ForgeTier(2, 906, 7.0F, 2F, 12,
            BlockTags.NEEDS_IRON_TOOL, () -> Ingredient.of(ModItems.BRONZE_INGOT.get()));
}
