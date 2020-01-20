package tv.mapper.embellishcraftbop.init;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.DyeColor;
import net.minecraft.item.Item;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.registries.ObjectHolder;
import tv.mapper.embellishcraft.Constants;
import tv.mapper.embellishcraft.block.ChairBlock;
import tv.mapper.embellishcraft.block.CrateBlock;
import tv.mapper.embellishcraft.block.CustomBedBlock;
import tv.mapper.embellishcraft.block.CustomDoorBlock;
import tv.mapper.embellishcraft.block.FancyTableBlock;
import tv.mapper.embellishcraft.block.SuspendedStairsBlock;
import tv.mapper.embellishcraft.block.TableBlock;
import tv.mapper.embellishcraft.block.TerraceChairBlock;
import tv.mapper.embellishcraft.block.TerraceTableBlock;
import tv.mapper.embellishcraft.client.renderer.CustomBedItemStackTileEntityRenderer;
import tv.mapper.embellishcraft.init.ModBlocks;
import tv.mapper.embellishcraft.item.FuelBlockItem;
import tv.mapper.embellishcraft.item.ModItemGroups;
import tv.mapper.embellishcraft.util.WoodType;
import tv.mapper.embellishcraftbop.EmbellishCraftBOP;

@ObjectHolder(EmbellishCraftBOP.MODID)
@EventBusSubscriber(bus = Bus.MOD)
public class ECBoPBlocks
{
    public static final Block CHERRY_CHAIR = null;
    public static final Block DEAD_CHAIR = null;
    public static final Block ETHEREAL_CHAIR = null;
    public static final Block FIR_CHAIR = null;
    public static final Block HELLBARK_CHAIR = null;
    public static final Block JACARANDA_CHAIR = null;
    public static final Block MAGIC_CHAIR = null;
    public static final Block MAHOGANY_CHAIR = null;
    public static final Block PALM_CHAIR = null;
    public static final Block REDWOOD_CHAIR = null;
    public static final Block UMBRAN_CHAIR = null;
    public static final Block WILLOW_CHAIR = null;

    public static final Block CHERRY_TERRACE_CHAIR = null;
    public static final Block DEAD_TERRACE_CHAIR = null;
    public static final Block ETHEREAL_TERRACE_CHAIR = null;
    public static final Block FIR_TERRACE_CHAIR = null;
    public static final Block HELLBARK_TERRACE_CHAIR = null;
    public static final Block JACARANDA_TERRACE_CHAIR = null;
    public static final Block MAGIC_TERRACE_CHAIR = null;
    public static final Block MAHOGANY_TERRACE_CHAIR = null;
    public static final Block PALM_TERRACE_CHAIR = null;
    public static final Block REDWOOD_TERRACE_CHAIR = null;
    public static final Block UMBRAN_TERRACE_CHAIR = null;
    public static final Block WILLOW_TERRACE_CHAIR = null;

    public static final Block CHERRY_TABLE = null;
    public static final Block DEAD_TABLE = null;
    public static final Block ETHEREAL_TABLE = null;
    public static final Block FIR_TABLE = null;
    public static final Block HELLBARK_TABLE = null;
    public static final Block JACARANDA_TABLE = null;
    public static final Block MAGIC_TABLE = null;
    public static final Block MAHOGANY_TABLE = null;
    public static final Block PALM_TABLE = null;
    public static final Block REDWOOD_TABLE = null;
    public static final Block UMBRAN_TABLE = null;
    public static final Block WILLOW_TABLE = null;

    public static final Block CHERRY_FANCY_TABLE = null;
    public static final Block DEAD_FANCY_TABLE = null;
    public static final Block ETHEREAL_FANCY_TABLE = null;
    public static final Block FIR_FANCY_TABLE = null;
    public static final Block HELLBARK_FANCY_TABLE = null;
    public static final Block JACARANDA_FANCY_TABLE = null;
    public static final Block MAGIC_FANCY_TABLE = null;
    public static final Block MAHOGANY_FANCY_TABLE = null;
    public static final Block PALM_FANCY_TABLE = null;
    public static final Block REDWOOD_FANCY_TABLE = null;
    public static final Block UMBRAN_FANCY_TABLE = null;
    public static final Block WILLOW_FANCY_TABLE = null;

    public static final Block CHERRY_TERRACE_TABLE = null;
    public static final Block DEAD_TERRACE_TABLE = null;
    public static final Block ETHEREAL_TERRACE_TABLE = null;
    public static final Block FIR_TERRACE_TABLE = null;
    public static final Block HELLBARK_TERRACE_TABLE = null;
    public static final Block JACARANDA_TERRACE_TABLE = null;
    public static final Block MAGIC_TERRACE_TABLE = null;
    public static final Block MAHOGANY_TERRACE_TABLE = null;
    public static final Block PALM_TERRACE_TABLE = null;
    public static final Block REDWOOD_TERRACE_TABLE = null;
    public static final Block UMBRAN_TERRACE_TABLE = null;
    public static final Block WILLOW_TERRACE_TABLE = null;

    public static final Block CHERRY_FANCY_DOOR = null;
    public static final Block DEAD_FANCY_DOOR = null;
    public static final Block ETHEREAL_FANCY_DOOR = null;
    public static final Block FIR_FANCY_DOOR = null;
    public static final Block HELLBARK_FANCY_DOOR = null;
    public static final Block JACARANDA_FANCY_DOOR = null;
    public static final Block MAGIC_FANCY_DOOR = null;
    public static final Block MAHOGANY_FANCY_DOOR = null;
    public static final Block PALM_FANCY_DOOR = null;
    public static final Block REDWOOD_FANCY_DOOR = null;
    public static final Block UMBRAN_FANCY_DOOR = null;
    public static final Block WILLOW_FANCY_DOOR = null;

    public static final Block CHERRY_SUSPENDED_STAIRS = null;
    public static final Block DEAD_SUSPENDED_STAIRS = null;
    public static final Block ETHEREAL_SUSPENDED_STAIRS = null;
    public static final Block FIR_SUSPENDED_STAIRS = null;
    public static final Block HELLBARK_SUSPENDED_STAIRS = null;
    public static final Block JACARANDA_SUSPENDED_STAIRS = null;
    public static final Block MAGIC_SUSPENDED_STAIRS = null;
    public static final Block MAHOGANY_SUSPENDED_STAIRS = null;
    public static final Block PALM_SUSPENDED_STAIRS = null;
    public static final Block REDWOOD_SUSPENDED_STAIRS = null;
    public static final Block UMBRAN_SUSPENDED_STAIRS = null;
    public static final Block WILLOW_SUSPENDED_STAIRS = null;

    public static final Block CHERRY_WOODEN_CRATE = null;
    public static final Block DEAD_WOODEN_CRATE = null;
    public static final Block ETHEREAL_WOODEN_CRATE = null;
    public static final Block FIR_WOODEN_CRATE = null;
    public static final Block HELLBARK_WOODEN_CRATE = null;
    public static final Block JACARANDA_WOODEN_CRATE = null;
    public static final Block MAGIC_WOODEN_CRATE = null;
    public static final Block MAHOGANY_WOODEN_CRATE = null;
    public static final Block PALM_WOODEN_CRATE = null;
    public static final Block REDWOOD_WOODEN_CRATE = null;
    public static final Block UMBRAN_WOODEN_CRATE = null;
    public static final Block WILLOW_WOODEN_CRATE = null;

    public static final Block BROWN_CHERRY_FANCY_BED = null;
    public static final Block BLACK_CHERRY_FANCY_BED = null;
    public static final Block BLUE_CHERRY_FANCY_BED = null;
    public static final Block CYAN_CHERRY_FANCY_BED = null;
    public static final Block GRAY_CHERRY_FANCY_BED = null;
    public static final Block GREEN_CHERRY_FANCY_BED = null;
    public static final Block LIGHT_BLUE_CHERRY_FANCY_BED = null;
    public static final Block LIGHT_GRAY_CHERRY_FANCY_BED = null;
    public static final Block LIME_CHERRY_FANCY_BED = null;
    public static final Block MAGENTA_CHERRY_FANCY_BED = null;
    public static final Block ORANGE_CHERRY_FANCY_BED = null;
    public static final Block PINK_CHERRY_FANCY_BED = null;
    public static final Block PURPLE_CHERRY_FANCY_BED = null;
    public static final Block RED_CHERRY_FANCY_BED = null;
    public static final Block WHITE_CHERRY_FANCY_BED = null;
    public static final Block YELLOW_CHERRY_FANCY_BED = null;

    public static final Block BROWN_DEAD_FANCY_BED = null;
    public static final Block BLACK_DEAD_FANCY_BED = null;
    public static final Block BLUE_DEAD_FANCY_BED = null;
    public static final Block CYAN_DEAD_FANCY_BED = null;
    public static final Block GRAY_DEAD_FANCY_BED = null;
    public static final Block GREEN_DEAD_FANCY_BED = null;
    public static final Block LIGHT_BLUE_DEAD_FANCY_BED = null;
    public static final Block LIGHT_GRAY_DEAD_FANCY_BED = null;
    public static final Block LIME_DEAD_FANCY_BED = null;
    public static final Block MAGENTA_DEAD_FANCY_BED = null;
    public static final Block ORANGE_DEAD_FANCY_BED = null;
    public static final Block PINK_DEAD_FANCY_BED = null;
    public static final Block PURPLE_DEAD_FANCY_BED = null;
    public static final Block RED_DEAD_FANCY_BED = null;
    public static final Block WHITE_DEAD_FANCY_BED = null;
    public static final Block YELLOW_DEAD_FANCY_BED = null;

    public static final Block BROWN_ETHEREAL_FANCY_BED = null;
    public static final Block BLACK_ETHEREAL_FANCY_BED = null;
    public static final Block BLUE_ETHEREAL_FANCY_BED = null;
    public static final Block CYAN_ETHEREAL_FANCY_BED = null;
    public static final Block GRAY_ETHEREAL_FANCY_BED = null;
    public static final Block GREEN_ETHEREAL_FANCY_BED = null;
    public static final Block LIGHT_BLUE_ETHEREAL_FANCY_BED = null;
    public static final Block LIGHT_GRAY_ETHEREAL_FANCY_BED = null;
    public static final Block LIME_ETHEREAL_FANCY_BED = null;
    public static final Block MAGENTA_ETHEREAL_FANCY_BED = null;
    public static final Block ORANGE_ETHEREAL_FANCY_BED = null;
    public static final Block PINK_ETHEREAL_FANCY_BED = null;
    public static final Block PURPLE_ETHEREAL_FANCY_BED = null;
    public static final Block RED_ETHEREAL_FANCY_BED = null;
    public static final Block WHITE_ETHEREAL_FANCY_BED = null;
    public static final Block YELLOW_ETHEREAL_FANCY_BED = null;

    public static final Block BROWN_FIR_FANCY_BED = null;
    public static final Block BLACK_FIR_FANCY_BED = null;
    public static final Block BLUE_FIR_FANCY_BED = null;
    public static final Block CYAN_FIR_FANCY_BED = null;
    public static final Block GRAY_FIR_FANCY_BED = null;
    public static final Block GREEN_FIR_FANCY_BED = null;
    public static final Block LIGHT_BLUE_FIR_FANCY_BED = null;
    public static final Block LIGHT_GRAY_FIR_FANCY_BED = null;
    public static final Block LIME_FIR_FANCY_BED = null;
    public static final Block MAGENTA_FIR_FANCY_BED = null;
    public static final Block ORANGE_FIR_FANCY_BED = null;
    public static final Block PINK_FIR_FANCY_BED = null;
    public static final Block PURPLE_FIR_FANCY_BED = null;
    public static final Block RED_FIR_FANCY_BED = null;
    public static final Block WHITE_FIR_FANCY_BED = null;
    public static final Block YELLOW_FIR_FANCY_BED = null;

    public static final Block BROWN_HELLBARK_FANCY_BED = null;
    public static final Block BLACK_HELLBARK_FANCY_BED = null;
    public static final Block BLUE_HELLBARK_FANCY_BED = null;
    public static final Block CYAN_HELLBARK_FANCY_BED = null;
    public static final Block GRAY_HELLBARK_FANCY_BED = null;
    public static final Block GREEN_HELLBARK_FANCY_BED = null;
    public static final Block LIGHT_BLUE_HELLBARK_FANCY_BED = null;
    public static final Block LIGHT_GRAY_HELLBARK_FANCY_BED = null;
    public static final Block LIME_HELLBARK_FANCY_BED = null;
    public static final Block MAGENTA_HELLBARK_FANCY_BED = null;
    public static final Block ORANGE_HELLBARK_FANCY_BED = null;
    public static final Block PINK_HELLBARK_FANCY_BED = null;
    public static final Block PURPLE_HELLBARK_FANCY_BED = null;
    public static final Block RED_HELLBARK_FANCY_BED = null;
    public static final Block WHITE_HELLBARK_FANCY_BED = null;
    public static final Block YELLOW_HELLBARK_FANCY_BED = null;

    public static final Block BROWN_JACARANDA_FANCY_BED = null;
    public static final Block BLACK_JACARANDA_FANCY_BED = null;
    public static final Block BLUE_JACARANDA_FANCY_BED = null;
    public static final Block CYAN_JACARANDA_FANCY_BED = null;
    public static final Block GRAY_JACARANDA_FANCY_BED = null;
    public static final Block GREEN_JACARANDA_FANCY_BED = null;
    public static final Block LIGHT_BLUE_JACARANDA_FANCY_BED = null;
    public static final Block LIGHT_GRAY_JACARANDA_FANCY_BED = null;
    public static final Block LIME_JACARANDA_FANCY_BED = null;
    public static final Block MAGENTA_JACARANDA_FANCY_BED = null;
    public static final Block ORANGE_JACARANDA_FANCY_BED = null;
    public static final Block PINK_JACARANDA_FANCY_BED = null;
    public static final Block PURPLE_JACARANDA_FANCY_BED = null;
    public static final Block RED_JACARANDA_FANCY_BED = null;
    public static final Block WHITE_JACARANDA_FANCY_BED = null;
    public static final Block YELLOW_JACARANDA_FANCY_BED = null;

    public static final Block BROWN_MAGIC_FANCY_BED = null;
    public static final Block BLACK_MAGIC_FANCY_BED = null;
    public static final Block BLUE_MAGIC_FANCY_BED = null;
    public static final Block CYAN_MAGIC_FANCY_BED = null;
    public static final Block GRAY_MAGIC_FANCY_BED = null;
    public static final Block GREEN_MAGIC_FANCY_BED = null;
    public static final Block LIGHT_BLUE_MAGIC_FANCY_BED = null;
    public static final Block LIGHT_GRAY_MAGIC_FANCY_BED = null;
    public static final Block LIME_MAGIC_FANCY_BED = null;
    public static final Block MAGENTA_MAGIC_FANCY_BED = null;
    public static final Block ORANGE_MAGIC_FANCY_BED = null;
    public static final Block PINK_MAGIC_FANCY_BED = null;
    public static final Block PURPLE_MAGIC_FANCY_BED = null;
    public static final Block RED_MAGIC_FANCY_BED = null;
    public static final Block WHITE_MAGIC_FANCY_BED = null;
    public static final Block YELLOW_MAGIC_FANCY_BED = null;

    public static final Block BROWN_MAHOGANY_FANCY_BED = null;
    public static final Block BLACK_MAHOGANY_FANCY_BED = null;
    public static final Block BLUE_MAHOGANY_FANCY_BED = null;
    public static final Block CYAN_MAHOGANY_FANCY_BED = null;
    public static final Block GRAY_MAHOGANY_FANCY_BED = null;
    public static final Block GREEN_MAHOGANY_FANCY_BED = null;
    public static final Block LIGHT_BLUE_MAHOGANY_FANCY_BED = null;
    public static final Block LIGHT_GRAY_MAHOGANY_FANCY_BED = null;
    public static final Block LIME_MAHOGANY_FANCY_BED = null;
    public static final Block MAGENTA_MAHOGANY_FANCY_BED = null;
    public static final Block ORANGE_MAHOGANY_FANCY_BED = null;
    public static final Block PINK_MAHOGANY_FANCY_BED = null;
    public static final Block PURPLE_MAHOGANY_FANCY_BED = null;
    public static final Block RED_MAHOGANY_FANCY_BED = null;
    public static final Block WHITE_MAHOGANY_FANCY_BED = null;
    public static final Block YELLOW_MAHOGANY_FANCY_BED = null;

    public static final Block BROWN_PALM_FANCY_BED = null;
    public static final Block BLACK_PALM_FANCY_BED = null;
    public static final Block BLUE_PALM_FANCY_BED = null;
    public static final Block CYAN_PALM_FANCY_BED = null;
    public static final Block GRAY_PALM_FANCY_BED = null;
    public static final Block GREEN_PALM_FANCY_BED = null;
    public static final Block LIGHT_BLUE_PALM_FANCY_BED = null;
    public static final Block LIGHT_GRAY_PALM_FANCY_BED = null;
    public static final Block LIME_PALM_FANCY_BED = null;
    public static final Block MAGENTA_PALM_FANCY_BED = null;
    public static final Block ORANGE_PALM_FANCY_BED = null;
    public static final Block PINK_PALM_FANCY_BED = null;
    public static final Block PURPLE_PALM_FANCY_BED = null;
    public static final Block RED_PALM_FANCY_BED = null;
    public static final Block WHITE_PALM_FANCY_BED = null;
    public static final Block YELLOW_PALM_FANCY_BED = null;

    public static final Block BROWN_REDWOOD_FANCY_BED = null;
    public static final Block BLACK_REDWOOD_FANCY_BED = null;
    public static final Block BLUE_REDWOOD_FANCY_BED = null;
    public static final Block CYAN_REDWOOD_FANCY_BED = null;
    public static final Block GRAY_REDWOOD_FANCY_BED = null;
    public static final Block GREEN_REDWOOD_FANCY_BED = null;
    public static final Block LIGHT_BLUE_REDWOOD_FANCY_BED = null;
    public static final Block LIGHT_GRAY_REDWOOD_FANCY_BED = null;
    public static final Block LIME_REDWOOD_FANCY_BED = null;
    public static final Block MAGENTA_REDWOOD_FANCY_BED = null;
    public static final Block ORANGE_REDWOOD_FANCY_BED = null;
    public static final Block PINK_REDWOOD_FANCY_BED = null;
    public static final Block PURPLE_REDWOOD_FANCY_BED = null;
    public static final Block RED_REDWOOD_FANCY_BED = null;
    public static final Block WHITE_REDWOOD_FANCY_BED = null;
    public static final Block YELLOW_REDWOOD_FANCY_BED = null;

    public static final Block BROWN_UMBRAN_FANCY_BED = null;
    public static final Block BLACK_UMBRAN_FANCY_BED = null;
    public static final Block BLUE_UMBRAN_FANCY_BED = null;
    public static final Block CYAN_UMBRAN_FANCY_BED = null;
    public static final Block GRAY_UMBRAN_FANCY_BED = null;
    public static final Block GREEN_UMBRAN_FANCY_BED = null;
    public static final Block LIGHT_BLUE_UMBRAN_FANCY_BED = null;
    public static final Block LIGHT_GRAY_UMBRAN_FANCY_BED = null;
    public static final Block LIME_UMBRAN_FANCY_BED = null;
    public static final Block MAGENTA_UMBRAN_FANCY_BED = null;
    public static final Block ORANGE_UMBRAN_FANCY_BED = null;
    public static final Block PINK_UMBRAN_FANCY_BED = null;
    public static final Block PURPLE_UMBRAN_FANCY_BED = null;
    public static final Block RED_UMBRAN_FANCY_BED = null;
    public static final Block WHITE_UMBRAN_FANCY_BED = null;
    public static final Block YELLOW_UMBRAN_FANCY_BED = null;

    public static final Block BROWN_WILLOW_FANCY_BED = null;
    public static final Block BLACK_WILLOW_FANCY_BED = null;
    public static final Block BLUE_WILLOW_FANCY_BED = null;
    public static final Block CYAN_WILLOW_FANCY_BED = null;
    public static final Block GRAY_WILLOW_FANCY_BED = null;
    public static final Block GREEN_WILLOW_FANCY_BED = null;
    public static final Block LIGHT_BLUE_WILLOW_FANCY_BED = null;
    public static final Block LIGHT_GRAY_WILLOW_FANCY_BED = null;
    public static final Block LIME_WILLOW_FANCY_BED = null;
    public static final Block MAGENTA_WILLOW_FANCY_BED = null;
    public static final Block ORANGE_WILLOW_FANCY_BED = null;
    public static final Block PINK_WILLOW_FANCY_BED = null;
    public static final Block PURPLE_WILLOW_FANCY_BED = null;
    public static final Block RED_WILLOW_FANCY_BED = null;
    public static final Block WHITE_WILLOW_FANCY_BED = null;
    public static final Block YELLOW_WILLOW_FANCY_BED = null;

    public static List<Block> CHAIRS = new ArrayList<>();
    public static List<Block> TERRACE_CHAIRS = new ArrayList<>();
    public static List<Block> TABLES = new ArrayList<>();
    public static List<Block> TERRACE_TABLES = new ArrayList<>();
    public static List<Block> FANCY_TABLES = new ArrayList<>();
    public static List<Block> FANCY_DOORS = new ArrayList<>();
    public static List<Block> SUSPENDED_STAIRS = new ArrayList<>();
    public static List<Block> CRATES = new ArrayList<>();
    public static List<Block> FANCY_BEDS = new ArrayList<>();

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event)
    {
        Block block;

        for(int i = 6; i < 18; i++)
        {
            event.getRegistry().register(block = new ChairBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.75F, 0.5F).sound(SoundType.WOOD), ToolType.AXE).setRegistryName(
                WoodType.byId(i).getName() + "_chair"));
            CHAIRS.add(block);
            event.getRegistry().register(block = new TerraceChairBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.75F, 0.5F).sound(SoundType.WOOD), ToolType.AXE).setRegistryName(
                WoodType.byId(i).getName() + "_terrace_chair"));
            TERRACE_CHAIRS.add(block);
            event.getRegistry().register(block = new TableBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.75F, 0.5F).sound(SoundType.WOOD), ToolType.AXE).setRegistryName(
                WoodType.byId(i).getName() + "_table"));
            TABLES.add(block);
            event.getRegistry().register(block = new TerraceTableBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.75F, 0.5F).sound(SoundType.WOOD), ToolType.AXE).setRegistryName(
                WoodType.byId(i).getName() + "_terrace_table"));
            TERRACE_TABLES.add(block);
            event.getRegistry().register(block = new CustomDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.75F, 0.5F).sound(SoundType.WOOD), ToolType.AXE).setRegistryName(
                WoodType.byId(i).getName() + "_fancy_door"));
            FANCY_DOORS.add(block);
            event.getRegistry().register(
                block = new SuspendedStairsBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.75F, 0.5F).sound(SoundType.WOOD), ToolType.AXE).setRegistryName(
                    WoodType.byId(i).getName() + "_suspended_stairs"));
            SUSPENDED_STAIRS.add(block);
            event.getRegistry().register(
                block = new CrateBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.5F).sound(SoundType.WOOD)).setRegistryName(WoodType.byId(i).getName() + "_wooden_crate"));
            CRATES.add(block);
            event.getRegistry().register(block = new FancyTableBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.75F, 0.5F).sound(SoundType.WOOD), ToolType.AXE).setRegistryName(
                WoodType.byId(i).getName() + "_fancy_table"));
            FANCY_TABLES.add(block);
            for(int j = 0; j < Arrays.stream(DyeColor.values()).count(); j++)
            {
                block = new CustomBedBlock(DyeColor.byId(j), WoodType.byId(i), Block.Properties.create(Material.WOOL).sound(SoundType.WOOD).hardnessAndResistance(0.2F)).setRegistryName(
                    DyeColor.byId(j).getName() + "_" + WoodType.byId(i).getName() + "_fancy_bed");
                event.getRegistry().register(block);
                FANCY_BEDS.add(block);
                ModBlocks.FANCY_BEDS.add(block);
            }
        }
    }

    @SubscribeEvent
    public static void registerBlockItems(RegistryEvent.Register<Item> event)
    {
        for(Block block : CHAIRS)
            event.getRegistry().register(new FuelBlockItem(block, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), Constants.chairBurnTime).setRegistryName(block.getRegistryName()));

        for(Block block : TERRACE_CHAIRS)
            event.getRegistry().register(new FuelBlockItem(block, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), Constants.chairBurnTime).setRegistryName(block.getRegistryName()));

        for(Block block : TABLES)
            event.getRegistry().register(new FuelBlockItem(block, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), Constants.chairBurnTime).setRegistryName(block.getRegistryName()));

        for(Block block : TERRACE_TABLES)
            event.getRegistry().register(new FuelBlockItem(block, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), Constants.chairBurnTime).setRegistryName(block.getRegistryName()));

        for(Block block : FANCY_DOORS)
            event.getRegistry().register(new FuelBlockItem(block, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), Constants.doorBurnTime).setRegistryName(block.getRegistryName()));

        for(Block block : SUSPENDED_STAIRS)
            event.getRegistry().register(
                new FuelBlockItem(block, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), Constants.suspendedStairBurnTime).setRegistryName(block.getRegistryName()));

        for(Block block : CRATES)
            event.getRegistry().register(new BlockItem(block, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT).maxStackSize(1)).setRegistryName(block.getRegistryName()));

        for(Block block : FANCY_TABLES)
            event.getRegistry().register(new FuelBlockItem(block, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), Constants.couchBurnTime).setRegistryName(block.getRegistryName()));

        for(Block block : FANCY_BEDS)
            event.getRegistry().register(
                new FuelBlockItem(block, new Item.Properties().setTEISR(() -> CustomBedItemStackTileEntityRenderer::new).group(ModItemGroups.EMBELLISHCRAFT), Constants.bedBurnTime).setRegistryName(
                    block.getRegistryName()));

    }
}
