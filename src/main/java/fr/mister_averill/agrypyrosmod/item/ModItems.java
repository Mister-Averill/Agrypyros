package fr.mister_averill.agrypyrosmod.item;

import fr.mister_averill.agrypyrosmod.AgrypyrosMod;
import fr.mister_averill.agrypyrosmod.block.ModBlocks;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemNameBlockItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, AgrypyrosMod.MOD_ID);

    public static final RegistryObject<Item> RAW_SILVER = ITEMS.register("raw_silver",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.AGRYPYROS_TAB)));
    public static final RegistryObject<Item> SILVER_INGOT = ITEMS.register("silver_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.AGRYPYROS_TAB)));
    public static final RegistryObject<Item> RAW_TIN = ITEMS.register("raw_tin",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.AGRYPYROS_TAB)));
    public static final RegistryObject<Item> TIN_INGOT = ITEMS.register("tin_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.AGRYPYROS_TAB)));

    public static final RegistryObject<Item> BARLEY_SEEDS = ITEMS.register("barley_seeds",
            () -> new ItemNameBlockItem(ModBlocks.BARLEY_CROP.get(),
                    new Item.Properties().tab(ModCreativeModeTab.AGRYPYROS_TAB)));
    public static final RegistryObject<Item> BARLEY = ITEMS.register("barley",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.AGRYPYROS_TAB)));
    public static final RegistryObject<Item> GRAPE_SEEDS = ITEMS.register("grape_seeds",
            () -> new ItemNameBlockItem(ModBlocks.GRAPE_CROP.get(),
                    new Item.Properties().tab(ModCreativeModeTab.AGRYPYROS_TAB)));
    public static final RegistryObject<Item> GRAPE = ITEMS.register("grape",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.AGRYPYROS_TAB).food(new FoodProperties.Builder().nutrition(2).saturationMod(0.2F).build())));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
