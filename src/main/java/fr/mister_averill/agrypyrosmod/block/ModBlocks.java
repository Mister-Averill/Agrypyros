package fr.mister_averill.agrypyrosmod.block;

import fr.mister_averill.agrypyrosmod.AgrypyrosMod;
import fr.mister_averill.agrypyrosmod.block.crops.BarleyCropBlock;
import fr.mister_averill.agrypyrosmod.block.crops.GrapeCropBlock;
import fr.mister_averill.agrypyrosmod.item.ModCreativeModeTab;
import fr.mister_averill.agrypyrosmod.item.ModItems;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, AgrypyrosMod.MOD_ID);

    public static final RegistryObject<Block> SILVER_ORE = registerBlock("silver_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(3.0F, 3.0F).requiresCorrectToolForDrops(), UniformInt.of(1, 4)));
    public static final RegistryObject<Block> DEEPSLATE_SILVER_ORE = registerBlock("deepslate_silver_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(3.0F, 3.0F).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE), UniformInt.of(1, 4)));
    public static final RegistryObject<Block> SILVER_BLOCK = registerBlock("silver_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.METAL)
                    .strength(4.0F, 5.0F).requiresCorrectToolForDrops().sound(SoundType.METAL)));
    public static final RegistryObject<Block> TIN_ORE = registerBlock("tin_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(3.0F, 3.0F).requiresCorrectToolForDrops(), UniformInt.of(1, 4)));
    public static final RegistryObject<Block> DEEPSLATE_TIN_ORE = registerBlock("deepslate_tin_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(3.0F, 3.0F).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE), UniformInt.of(1, 4)));
    public static final RegistryObject<Block> TIN_BLOCK = registerBlock("tin_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.METAL)
                    .strength(3.0F, 6.0F).requiresCorrectToolForDrops().sound(SoundType.METAL)));
    public static final RegistryObject<Block> BRONZE_BLOCK = registerBlock("bronze_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_ORANGE)
                    .strength(5.0F, 6.0F).requiresCorrectToolForDrops().sound(SoundType.METAL)));
    public static final RegistryObject<Block> ZINC_ORE = registerBlock("zinc_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(3.0F, 3.0F).requiresCorrectToolForDrops(), UniformInt.of(1, 2)));
    public static final RegistryObject<Block> DEEPSLATE_ZINC_ORE = registerBlock("deepslate_zinc_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(3.0F, 3.0F).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE), UniformInt.of(1, 2)));
    public static final RegistryObject<Block> ZINC_BLOCK = registerBlock("zinc_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.METAL)
                    .strength(4.0F, 5.0F).requiresCorrectToolForDrops().sound(SoundType.METAL)));
    public static final RegistryObject<Block> BRASS_BLOCK = registerBlock("brass_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.METAL)
                    .strength(4.0F, 5.0F).requiresCorrectToolForDrops().sound(SoundType.METAL)));
    public static final RegistryObject<Block> LIMESTONE = registerBlock("limestone",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.SNOW)
                    .strength(3.0F, 3.0F).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> LIMESTONE_BRICKS = registerBlock("limestone_bricks",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.SNOW)
                    .strength(3.0F, 3.0F).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CHISELED_LIMESTONE = registerBlock("chiseled_limestone",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.SNOW)
                    .strength(3.0F, 3.0F).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> MOSSY_LIMESTONE_BRICKS = registerBlock("mossy_limestone_bricks",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.SNOW)
                    .strength(3.0F, 3.0F).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CLAY_TILES = registerBlock("clay_tiles",
            () -> new Block(BlockBehaviour.Properties.of(Material.CLAY, MaterialColor.COLOR_BROWN)));
    public static final RegistryObject<Block> WHITE_CLAY_TILES = registerBlock("white_clay_tiles",
            () -> new Block(BlockBehaviour.Properties.of(Material.CLAY, MaterialColor.SNOW)));
    public static final RegistryObject<Block> ORANGE_CLAY_TILES = registerBlock("orange_clay_tiles",
            () -> new Block(BlockBehaviour.Properties.of(Material.CLAY, MaterialColor.COLOR_ORANGE)));
    public static final RegistryObject<Block> MAGENTA_CLAY_TILES = registerBlock("magenta_clay_tiles",
            () -> new Block(BlockBehaviour.Properties.of(Material.CLAY, MaterialColor.COLOR_MAGENTA)));
    public static final RegistryObject<Block> LIGHT_BLUE_CLAY_TILES = registerBlock("light_blue_clay_tiles",
            () -> new Block(BlockBehaviour.Properties.of(Material.CLAY, MaterialColor.COLOR_LIGHT_BLUE)));
    public static final RegistryObject<Block> YELLOW_CLAY_TILES = registerBlock("yellow_clay_tiles",
            () -> new Block(BlockBehaviour.Properties.of(Material.CLAY, MaterialColor.COLOR_YELLOW)));
    public static final RegistryObject<Block> LIME_CLAY_TILES = registerBlock("lime_clay_tiles",
            () -> new Block(BlockBehaviour.Properties.of(Material.CLAY, MaterialColor.COLOR_LIGHT_GREEN)));
    public static final RegistryObject<Block> PINK_CLAY_TILES = registerBlock("pink_clay_tiles",
            () -> new Block(BlockBehaviour.Properties.of(Material.CLAY, MaterialColor.COLOR_PINK)));
    public static final RegistryObject<Block> GRAY_CLAY_TILES = registerBlock("gray_clay_tiles",
            () -> new Block(BlockBehaviour.Properties.of(Material.CLAY, MaterialColor.COLOR_GRAY)));
    public static final RegistryObject<Block> LIGHT_GRAY_CLAY_TILES = registerBlock("light_gray_clay_tiles",
            () -> new Block(BlockBehaviour.Properties.of(Material.CLAY, MaterialColor.COLOR_LIGHT_GRAY)));
    public static final RegistryObject<Block> CYAN_CLAY_TILES = registerBlock("cyan_clay_tiles",
            () -> new Block(BlockBehaviour.Properties.of(Material.CLAY, MaterialColor.COLOR_CYAN)));
    public static final RegistryObject<Block> PURPLE_CLAY_TILES = registerBlock("purple_clay_tiles",
            () -> new Block(BlockBehaviour.Properties.of(Material.CLAY, MaterialColor.COLOR_PURPLE)));
    public static final RegistryObject<Block> BLUE_CLAY_TILES = registerBlock("blue_clay_tiles",
            () -> new Block(BlockBehaviour.Properties.of(Material.CLAY, MaterialColor.COLOR_BLUE)));
    public static final RegistryObject<Block> BROWN_CLAY_TILES = registerBlock("brown_clay_tiles",
            () -> new Block(BlockBehaviour.Properties.of(Material.CLAY, MaterialColor.COLOR_BROWN)));
    public static final RegistryObject<Block> GREEN_CLAY_TILES = registerBlock("green_clay_tiles",
            () -> new Block(BlockBehaviour.Properties.of(Material.CLAY, MaterialColor.COLOR_GREEN)));
    public static final RegistryObject<Block> RED_CLAY_TILES = registerBlock("red_clay_tiles",
            () -> new Block(BlockBehaviour.Properties.of(Material.CLAY, MaterialColor.COLOR_RED)));
    public static final RegistryObject<Block> BLACK_CLAY_TILES = registerBlock("black_clay_tiles",
            () -> new Block(BlockBehaviour.Properties.of(Material.CLAY, MaterialColor.COLOR_BLACK)));
    public static final RegistryObject<Block> OAK_WOOD_WALL = registerBlock("oak_wood_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> SPRUCE_WOOD_WALL = registerBlock("spruce_wood_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS)));
    public static final RegistryObject<Block> BIRCH_WOOD_WALL = registerBlock("birch_wood_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BIRCH_PLANKS)));
    public static final RegistryObject<Block> JUNGLE_WOOD_WALL = registerBlock("jungle_wood_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.JUNGLE_PLANKS)));
    public static final RegistryObject<Block> ACACIA_WOOD_WALL = registerBlock("acacia_wood_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.ACACIA_PLANKS)));
    public static final RegistryObject<Block> DARK_OAK_WOOD_WALL = registerBlock("dark_oak_wood_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.DARK_OAK_PLANKS)));
    public static final RegistryObject<Block> MANGROVE_WOOD_WALL = registerBlock("mangrove_wood_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.MANGROVE_PLANKS)));
    public static final RegistryObject<Block> LIMESTONE_STAIRS = registerBlock("limestone_stairs",
            () -> new StairBlock(LIMESTONE.get().defaultBlockState(),BlockBehaviour.Properties.of(Material.STONE, MaterialColor.SNOW)
                    .strength(3.0F, 3.0F).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> LIMESTONE_BRICKS_STAIRS = registerBlock("limestone_bricks_stairs",
            () -> new StairBlock(LIMESTONE_BRICKS.get().defaultBlockState(),BlockBehaviour.Properties.of(Material.STONE, MaterialColor.SNOW)
                    .strength(3.0F, 3.0F).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> LIMESTONE_SLAB = registerBlock("limestone_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.SNOW)
                    .strength(3.0F, 3.0F).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> LIMESTONE_BRICKS_SLAB = registerBlock("limestone_bricks_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.SNOW)
                    .strength(3.0F, 3.0F).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> HAY_STAIRS = registerBlock("hay_stairs",
            () -> new StairBlock(Blocks.HAY_BLOCK.defaultBlockState(),BlockBehaviour.Properties.of(Material.GRASS, MaterialColor.COLOR_YELLOW)
                    .strength(0.5F).sound(SoundType.GRASS)));
    public static final RegistryObject<Block> HAY_SLAB = registerBlock("hay_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.GRASS, MaterialColor.COLOR_YELLOW)
                    .strength(0.5F).sound(SoundType.GRASS)));

    public static final RegistryObject<Block> BARLEY_CROP = BLOCKS.register("barley",
            () -> new BarleyCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT)));
    public static final RegistryObject<Block> GRAPE_CROP = BLOCKS.register("grape",
            () -> new GrapeCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT)));

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block){
        RegistryObject<T> toReturn = BLOCKS.register(name,block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block){
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }
}
