package fr.mister_averill.agrypyrosmod;

import com.mojang.logging.LogUtils;
import fr.mister_averill.agrypyrosmod.block.ModBlocks;
import fr.mister_averill.agrypyrosmod.item.ModCreativeModeTab;
import fr.mister_averill.agrypyrosmod.item.ModItems;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(AgrypyrosMod.MOD_ID)
public class AgrypyrosMod
{
    // Define mod id in a common place for everything to reference
    public static final String MOD_ID = "agrypyrosmod";
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();

    public AgrypyrosMod()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);

        // Register the commonSetup method for modloading
        modEventBus.addListener(this::commonSetup);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);

        modEventBus.addListener(this::addCreative);
    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {

    }

    private void addCreative(CreativeModeTabEvent.BuildContents event){
        if(event.getTab() == CreativeModeTabs.BUILDING_BLOCKS){
            event.accept(ModBlocks.SILVER_BLOCK);
            event.accept(ModBlocks.TIN_BLOCK);
            event.accept(ModBlocks.ZINC_BLOCK);
            event.accept(ModBlocks.BRASS_BLOCK);
            event.accept(ModBlocks.BRONZE_BLOCK);
            event.accept(ModBlocks.LIMESTONE_BRICKS);
            event.accept(ModBlocks.LIMESTONE_SLAB);
            event.accept(ModBlocks.LIMESTONE_STAIRS);
            event.accept(ModBlocks.LIMESTONE_BRICKS_SLAB);
            event.accept(ModBlocks.LIMESTONE_BRICKS_STAIRS);
            event.accept(ModBlocks.CLAY_TILES);
            event.accept(ModBlocks.HAY_SLAB);
            event.accept(ModBlocks.HAY_STAIRS);
        }

        if(event.getTab() == CreativeModeTabs.COLORED_BLOCKS){
            event.accept(ModBlocks.CLAY_TILES);
            event.accept(ModBlocks.WHITE_CLAY_TILES);
            event.accept(ModBlocks.ORANGE_CLAY_TILES);
            event.accept(ModBlocks.MAGENTA_CLAY_TILES);
            event.accept(ModBlocks.LIGHT_BLUE_CLAY_TILES);
            event.accept(ModBlocks.YELLOW_CLAY_TILES);
            event.accept(ModBlocks.LIME_CLAY_TILES);
            event.accept(ModBlocks.PINK_CLAY_TILES);
            event.accept(ModBlocks.GRAY_CLAY_TILES);
            event.accept(ModBlocks.LIGHT_GRAY_CLAY_TILES);
            event.accept(ModBlocks.CYAN_CLAY_TILES);
            event.accept(ModBlocks.PURPLE_CLAY_TILES);
            event.accept(ModBlocks.BLUE_CLAY_TILES);
            event.accept(ModBlocks.BROWN_CLAY_TILES);
            event.accept(ModBlocks.GREEN_CLAY_TILES);
            event.accept(ModBlocks.RED_CLAY_TILES);
            event.accept(ModBlocks.BLACK_CLAY_TILES);
        }

        if(event.getTab() == CreativeModeTabs.NATURAL_BLOCKS){
            event.accept(ModBlocks.SILVER_ORE);
            event.accept(ModBlocks.DEEPSLATE_SILVER_ORE);
            event.accept(ModBlocks.TIN_ORE);
            event.accept(ModBlocks.DEEPSLATE_TIN_ORE);
            event.accept(ModBlocks.ZINC_ORE);
            event.accept(ModBlocks.DEEPSLATE_ZINC_ORE);
            event.accept(ModBlocks.LIMESTONE);
            event.accept(ModBlocks.OAK_WOOD_WALL);
            event.accept(ModBlocks.SPRUCE_WOOD_WALL);
            event.accept(ModBlocks.BIRCH_WOOD_WALL);
            event.accept(ModBlocks.JUNGLE_WOOD_WALL);
            event.accept(ModBlocks.ACACIA_WOOD_WALL);
            event.accept(ModBlocks.DARK_OAK_WOOD_WALL);
            event.accept(ModBlocks.MANGROVE_WOOD_WALL);
            event.accept(ModItems.BARLEY_SEEDS);
            event.accept(ModItems.BARLEY);
            event.accept(ModItems.GRAPE_SEEDS);
            event.accept(ModItems.GRAPE);
        }

        if(event.getTab() == CreativeModeTabs.TOOLS_AND_UTILITIES){
            event.accept(ModItems.COPPER_SHOVEL);
            event.accept(ModItems.COPPER_PICKAXE);
            event.accept(ModItems.COPPER_AXE);
            event.accept(ModItems.COPPER_HOE);
            event.accept(ModItems.BRONZE_SHOVEL);
            event.accept(ModItems.BRONZE_PICKAXE);
            event.accept(ModItems.BRONZE_AXE);
            event.accept(ModItems.BRONZE_HOE);
        }

        if(event.getTab() == CreativeModeTabs.COMBAT){
            event.accept(ModItems.COPPER_SWORD);
            event.accept(ModItems.BRONZE_SWORD);
            event.accept(ModItems.BRASS_HELMET);
            event.accept(ModItems.BRASS_CHESTPLATE);
            event.accept(ModItems.BRASS_CHESTPLATE);
            event.accept(ModItems.BRASS_BOOTS);
            event.accept(ModItems.BRONZE_HELMET);
            event.accept(ModItems.BRONZE_CHESTPLATE);
            event.accept(ModItems.BRONZE_LEGGINGS);
            event.accept(ModItems.BRONZE_BOOTS);
        }

        if(event.getTab() == CreativeModeTabs.FOOD_AND_DRINKS){
            event.accept(ModItems.RAW_BOAR);
            event.accept(ModItems.COOKED_BOAR);
        }

        if(event.getTab() == CreativeModeTabs.INGREDIENTS){
            event.accept(ModItems.RAW_SILVER);
            event.accept(ModItems.SILVER_INGOT);
            event.accept(ModItems.RAW_TIN);
            event.accept(ModItems.TIN_INGOT);
            event.accept(ModItems.RAW_ZINC);
            event.accept(ModItems.ZINC_INGOT);
            event.accept(ModItems.RAW_BRASS);
            event.accept(ModItems.BRASS_INGOT);
            event.accept(ModItems.RAW_BRONZE);
            event.accept(ModItems.BRONZE_INGOT);
            event.accept(ModItems.CHALK);
            event.accept(ModItems.OBOL);
            event.accept(ModItems.DRACHMA);
        }

        if(event.getTab() == ModCreativeModeTab.AGRYPYROS_TAB){
            event.accept(ModBlocks.ZINC_BLOCK);
            event.accept(ModBlocks.BRASS_BLOCK);
            event.accept(ModBlocks.BRONZE_BLOCK);
            event.accept(ModBlocks.SILVER_ORE);
            event.accept(ModBlocks.DEEPSLATE_SILVER_ORE);
            event.accept(ModBlocks.TIN_ORE);
            event.accept(ModBlocks.DEEPSLATE_TIN_ORE);
            event.accept(ModBlocks.ZINC_ORE);
            event.accept(ModBlocks.DEEPSLATE_ZINC_ORE);
            event.accept(ModBlocks.LIMESTONE);
            event.accept(ModBlocks.LIMESTONE_SLAB);
            event.accept(ModBlocks.LIMESTONE_STAIRS);
            event.accept(ModBlocks.LIMESTONE_BRICKS);
            event.accept(ModBlocks.LIMESTONE_BRICKS_SLAB);
            event.accept(ModBlocks.LIMESTONE_BRICKS_STAIRS);
            event.accept(ModBlocks.CHISELED_LIMESTONE);
            event.accept(ModBlocks.MOSSY_LIMESTONE_BRICKS);
            event.accept(ModBlocks.HAY_SLAB);
            event.accept(ModBlocks.HAY_STAIRS);
            event.accept(ModBlocks.OAK_WOOD_WALL);
            event.accept(ModBlocks.SPRUCE_WOOD_WALL);
            event.accept(ModBlocks.BIRCH_WOOD_WALL);
            event.accept(ModBlocks.JUNGLE_WOOD_WALL);
            event.accept(ModBlocks.ACACIA_WOOD_WALL);
            event.accept(ModBlocks.DARK_OAK_WOOD_WALL);
            event.accept(ModBlocks.MANGROVE_WOOD_WALL);
            event.accept(ModBlocks.CLAY_TILES);
            event.accept(ModBlocks.WHITE_CLAY_TILES);
            event.accept(ModBlocks.ORANGE_CLAY_TILES);
            event.accept(ModBlocks.MAGENTA_CLAY_TILES);
            event.accept(ModBlocks.LIGHT_BLUE_CLAY_TILES);
            event.accept(ModBlocks.YELLOW_CLAY_TILES);
            event.accept(ModBlocks.LIME_CLAY_TILES);
            event.accept(ModBlocks.PINK_CLAY_TILES);
            event.accept(ModBlocks.GRAY_CLAY_TILES);
            event.accept(ModBlocks.LIGHT_GRAY_CLAY_TILES);
            event.accept(ModBlocks.CYAN_CLAY_TILES);
            event.accept(ModBlocks.PURPLE_CLAY_TILES);
            event.accept(ModBlocks.BLUE_CLAY_TILES);
            event.accept(ModBlocks.BROWN_CLAY_TILES);
            event.accept(ModBlocks.GREEN_CLAY_TILES);
            event.accept(ModBlocks.RED_CLAY_TILES);
            event.accept(ModBlocks.BLACK_CLAY_TILES);
            event.accept(ModItems.BARLEY_SEEDS);
            event.accept(ModItems.BARLEY);
            event.accept(ModItems.GRAPE_SEEDS);
            event.accept(ModItems.GRAPE);
            event.accept(ModItems.COPPER_SHOVEL);
            event.accept(ModItems.COPPER_PICKAXE);
            event.accept(ModItems.COPPER_AXE);
            event.accept(ModItems.COPPER_HOE);
            event.accept(ModItems.BRONZE_SHOVEL);
            event.accept(ModItems.BRONZE_PICKAXE);
            event.accept(ModItems.BRONZE_AXE);
            event.accept(ModItems.BRONZE_HOE);
            event.accept(ModItems.COPPER_SWORD);
            event.accept(ModItems.BRONZE_SWORD);
            event.accept(ModItems.BRASS_HELMET);
            event.accept(ModItems.BRASS_CHESTPLATE);
            event.accept(ModItems.BRASS_CHESTPLATE);
            event.accept(ModItems.BRASS_BOOTS);
            event.accept(ModItems.BRONZE_HELMET);
            event.accept(ModItems.BRONZE_CHESTPLATE);
            event.accept(ModItems.BRONZE_LEGGINGS);
            event.accept(ModItems.BRONZE_BOOTS);
            event.accept(ModItems.RAW_BOAR);
            event.accept(ModItems.COOKED_BOAR);
            event.accept(ModItems.RAW_SILVER);
            event.accept(ModItems.SILVER_INGOT);
            event.accept(ModItems.RAW_TIN);
            event.accept(ModItems.TIN_INGOT);
            event.accept(ModItems.RAW_ZINC);
            event.accept(ModItems.ZINC_INGOT);
            event.accept(ModItems.RAW_BRASS);
            event.accept(ModItems.BRASS_INGOT);
            event.accept(ModItems.RAW_BRONZE);
            event.accept(ModItems.BRONZE_INGOT);
            event.accept(ModItems.CHALK);
            event.accept(ModItems.OBOL);
            event.accept(ModItems.DRACHMA);
        }
    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {

        }
    }
}
