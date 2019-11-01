package tv.mapper.embellishcraftbop.init;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.registries.ObjectHolder;
import tv.mapper.embellishcraft.Constants;
import tv.mapper.embellishcraft.block.ChairBlock;
import tv.mapper.embellishcraft.block.TableBlock;
import tv.mapper.embellishcraft.block.TerraceChairBlock;
import tv.mapper.embellishcraft.block.TerraceTableBlock;
import tv.mapper.embellishcraft.item.FuelBlockItem;
import tv.mapper.embellishcraft.item.ModItemGroups;
import tv.mapper.embellishcraftbop.EmbellishCraftBOP;

@ObjectHolder(EmbellishCraftBOP.MODID)
@EventBusSubscriber(bus = Bus.MOD)
public class ModBlocks
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

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event)
    {
        event.getRegistry().register(new ChairBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.75F, 0.5F).sound(SoundType.WOOD), ToolType.AXE).setRegistryName("cherry_chair"));
        event.getRegistry().register(new ChairBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.75F, 0.5F).sound(SoundType.WOOD), ToolType.AXE).setRegistryName("dead_chair"));
        event.getRegistry().register(new ChairBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.75F, 0.5F).sound(SoundType.WOOD), ToolType.AXE).setRegistryName("ethereal_chair"));
        event.getRegistry().register(new ChairBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.75F, 0.5F).sound(SoundType.WOOD), ToolType.AXE).setRegistryName("fir_chair"));
        event.getRegistry().register(new ChairBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.75F, 0.5F).sound(SoundType.WOOD), ToolType.AXE).setRegistryName("hellbark_chair"));
        event.getRegistry().register(new ChairBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.75F, 0.5F).sound(SoundType.WOOD), ToolType.AXE).setRegistryName("jacaranda_chair"));
        event.getRegistry().register(new ChairBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.75F, 0.5F).sound(SoundType.WOOD), ToolType.AXE).setRegistryName("magic_chair"));
        event.getRegistry().register(new ChairBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.75F, 0.5F).sound(SoundType.WOOD), ToolType.AXE).setRegistryName("mahogany_chair"));
        event.getRegistry().register(new ChairBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.75F, 0.5F).sound(SoundType.WOOD), ToolType.AXE).setRegistryName("palm_chair"));
        event.getRegistry().register(new ChairBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.75F, 0.5F).sound(SoundType.WOOD), ToolType.AXE).setRegistryName("redwood_chair"));
        event.getRegistry().register(new ChairBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.75F, 0.5F).sound(SoundType.WOOD), ToolType.AXE).setRegistryName("umbran_chair"));
        event.getRegistry().register(new ChairBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.75F, 0.5F).sound(SoundType.WOOD), ToolType.AXE).setRegistryName("willow_chair"));

        event.getRegistry().register(new TerraceChairBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.75F, 0.5F).sound(SoundType.WOOD), ToolType.AXE).setRegistryName("cherry_terrace_chair"));
        event.getRegistry().register(new TerraceChairBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.75F, 0.5F).sound(SoundType.WOOD), ToolType.AXE).setRegistryName("dead_terrace_chair"));
        event.getRegistry().register(new TerraceChairBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.75F, 0.5F).sound(SoundType.WOOD), ToolType.AXE).setRegistryName("ethereal_terrace_chair"));
        event.getRegistry().register(new TerraceChairBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.75F, 0.5F).sound(SoundType.WOOD), ToolType.AXE).setRegistryName("fir_terrace_chair"));
        event.getRegistry().register(new TerraceChairBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.75F, 0.5F).sound(SoundType.WOOD), ToolType.AXE).setRegistryName("hellbark_terrace_chair"));
        event.getRegistry().register(new TerraceChairBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.75F, 0.5F).sound(SoundType.WOOD), ToolType.AXE).setRegistryName("jacaranda_terrace_chair"));
        event.getRegistry().register(new TerraceChairBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.75F, 0.5F).sound(SoundType.WOOD), ToolType.AXE).setRegistryName("magic_terrace_chair"));
        event.getRegistry().register(new TerraceChairBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.75F, 0.5F).sound(SoundType.WOOD), ToolType.AXE).setRegistryName("mahogany_terrace_chair"));
        event.getRegistry().register(new TerraceChairBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.75F, 0.5F).sound(SoundType.WOOD), ToolType.AXE).setRegistryName("palm_terrace_chair"));
        event.getRegistry().register(new TerraceChairBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.75F, 0.5F).sound(SoundType.WOOD), ToolType.AXE).setRegistryName("redwood_terrace_chair"));
        event.getRegistry().register(new TerraceChairBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.75F, 0.5F).sound(SoundType.WOOD), ToolType.AXE).setRegistryName("umbran_terrace_chair"));
        event.getRegistry().register(new TerraceChairBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.75F, 0.5F).sound(SoundType.WOOD), ToolType.AXE).setRegistryName("willow_terrace_chair"));

        event.getRegistry().register(new TableBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.75F, 0.5F).sound(SoundType.WOOD), ToolType.AXE).setRegistryName("cherry_table"));
        event.getRegistry().register(new TableBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.75F, 0.5F).sound(SoundType.WOOD), ToolType.AXE).setRegistryName("dead_table"));
        event.getRegistry().register(new TableBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.75F, 0.5F).sound(SoundType.WOOD), ToolType.AXE).setRegistryName("ethereal_table"));
        event.getRegistry().register(new TableBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.75F, 0.5F).sound(SoundType.WOOD), ToolType.AXE).setRegistryName("fir_table"));
        event.getRegistry().register(new TableBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.75F, 0.5F).sound(SoundType.WOOD), ToolType.AXE).setRegistryName("hellbark_table"));
        event.getRegistry().register(new TableBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.75F, 0.5F).sound(SoundType.WOOD), ToolType.AXE).setRegistryName("jacaranda_table"));
        event.getRegistry().register(new TableBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.75F, 0.5F).sound(SoundType.WOOD), ToolType.AXE).setRegistryName("magic_table"));
        event.getRegistry().register(new TableBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.75F, 0.5F).sound(SoundType.WOOD), ToolType.AXE).setRegistryName("mahogany_table"));
        event.getRegistry().register(new TableBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.75F, 0.5F).sound(SoundType.WOOD), ToolType.AXE).setRegistryName("palm_table"));
        event.getRegistry().register(new TableBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.75F, 0.5F).sound(SoundType.WOOD), ToolType.AXE).setRegistryName("redwood_table"));
        event.getRegistry().register(new TableBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.75F, 0.5F).sound(SoundType.WOOD), ToolType.AXE).setRegistryName("umbran_table"));
        event.getRegistry().register(new TableBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.75F, 0.5F).sound(SoundType.WOOD), ToolType.AXE).setRegistryName("willow_table"));

        event.getRegistry().register(new TerraceTableBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.75F, 0.5F).sound(SoundType.WOOD), ToolType.AXE).setRegistryName("cherry_terrace_table"));
        event.getRegistry().register(new TerraceTableBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.75F, 0.5F).sound(SoundType.WOOD), ToolType.AXE).setRegistryName("dead_terrace_table"));
        event.getRegistry().register(new TerraceTableBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.75F, 0.5F).sound(SoundType.WOOD), ToolType.AXE).setRegistryName("ethereal_terrace_table"));
        event.getRegistry().register(new TerraceTableBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.75F, 0.5F).sound(SoundType.WOOD), ToolType.AXE).setRegistryName("fir_terrace_table"));
        event.getRegistry().register(new TerraceTableBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.75F, 0.5F).sound(SoundType.WOOD), ToolType.AXE).setRegistryName("hellbark_terrace_table"));
        event.getRegistry().register(new TerraceTableBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.75F, 0.5F).sound(SoundType.WOOD), ToolType.AXE).setRegistryName("jacaranda_terrace_table"));
        event.getRegistry().register(new TerraceTableBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.75F, 0.5F).sound(SoundType.WOOD), ToolType.AXE).setRegistryName("magic_terrace_table"));
        event.getRegistry().register(new TerraceTableBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.75F, 0.5F).sound(SoundType.WOOD), ToolType.AXE).setRegistryName("mahogany_terrace_table"));
        event.getRegistry().register(new TerraceTableBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.75F, 0.5F).sound(SoundType.WOOD), ToolType.AXE).setRegistryName("palm_terrace_table"));
        event.getRegistry().register(new TerraceTableBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.75F, 0.5F).sound(SoundType.WOOD), ToolType.AXE).setRegistryName("redwood_terrace_table"));
        event.getRegistry().register(new TerraceTableBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.75F, 0.5F).sound(SoundType.WOOD), ToolType.AXE).setRegistryName("umbran_terrace_table"));
        event.getRegistry().register(new TerraceTableBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.75F, 0.5F).sound(SoundType.WOOD), ToolType.AXE).setRegistryName("willow_terrace_table"));

        event.getRegistry().register(new TerraceTableBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.75F, 0.5F).sound(SoundType.WOOD), ToolType.AXE).setRegistryName("cherry_fancy_door"));
        event.getRegistry().register(new TerraceTableBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.75F, 0.5F).sound(SoundType.WOOD), ToolType.AXE).setRegistryName("dead_fancy_door"));
        event.getRegistry().register(new TerraceTableBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.75F, 0.5F).sound(SoundType.WOOD), ToolType.AXE).setRegistryName("ethereal_fancy_door"));
        event.getRegistry().register(new TerraceTableBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.75F, 0.5F).sound(SoundType.WOOD), ToolType.AXE).setRegistryName("fir_fancy_door"));
        event.getRegistry().register(new TerraceTableBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.75F, 0.5F).sound(SoundType.WOOD), ToolType.AXE).setRegistryName("hellbark_fancy_door"));
        event.getRegistry().register(new TerraceTableBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.75F, 0.5F).sound(SoundType.WOOD), ToolType.AXE).setRegistryName("jacaranda_fancy_door"));
        event.getRegistry().register(new TerraceTableBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.75F, 0.5F).sound(SoundType.WOOD), ToolType.AXE).setRegistryName("magic_fancy_door"));
        event.getRegistry().register(new TerraceTableBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.75F, 0.5F).sound(SoundType.WOOD), ToolType.AXE).setRegistryName("mahogany_fancy_door"));
        event.getRegistry().register(new TerraceTableBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.75F, 0.5F).sound(SoundType.WOOD), ToolType.AXE).setRegistryName("palm_fancy_door"));
        event.getRegistry().register(new TerraceTableBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.75F, 0.5F).sound(SoundType.WOOD), ToolType.AXE).setRegistryName("redwood_fancy_door"));
        event.getRegistry().register(new TerraceTableBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.75F, 0.5F).sound(SoundType.WOOD), ToolType.AXE).setRegistryName("umbran_fancy_door"));
        event.getRegistry().register(new TerraceTableBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.75F, 0.5F).sound(SoundType.WOOD), ToolType.AXE).setRegistryName("willow_fancy_door"));

        event.getRegistry().register(new TerraceTableBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.75F, 0.5F).sound(SoundType.WOOD), ToolType.AXE).setRegistryName("cherry_suspended_stairs"));
        event.getRegistry().register(new TerraceTableBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.75F, 0.5F).sound(SoundType.WOOD), ToolType.AXE).setRegistryName("dead_suspended_stairs"));
        event.getRegistry().register(new TerraceTableBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.75F, 0.5F).sound(SoundType.WOOD), ToolType.AXE).setRegistryName("ethereal_suspended_stairs"));
        event.getRegistry().register(new TerraceTableBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.75F, 0.5F).sound(SoundType.WOOD), ToolType.AXE).setRegistryName("fir_suspended_stairs"));
        event.getRegistry().register(new TerraceTableBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.75F, 0.5F).sound(SoundType.WOOD), ToolType.AXE).setRegistryName("hellbark_suspended_stairs"));
        event.getRegistry().register(new TerraceTableBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.75F, 0.5F).sound(SoundType.WOOD), ToolType.AXE).setRegistryName("jacaranda_suspended_stairs"));
        event.getRegistry().register(new TerraceTableBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.75F, 0.5F).sound(SoundType.WOOD), ToolType.AXE).setRegistryName("magic_suspended_stairs"));
        event.getRegistry().register(new TerraceTableBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.75F, 0.5F).sound(SoundType.WOOD), ToolType.AXE).setRegistryName("mahogany_suspended_stairs"));
        event.getRegistry().register(new TerraceTableBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.75F, 0.5F).sound(SoundType.WOOD), ToolType.AXE).setRegistryName("palm_suspended_stairs"));
        event.getRegistry().register(new TerraceTableBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.75F, 0.5F).sound(SoundType.WOOD), ToolType.AXE).setRegistryName("redwood_suspended_stairs"));
        event.getRegistry().register(new TerraceTableBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.75F, 0.5F).sound(SoundType.WOOD), ToolType.AXE).setRegistryName("umbran_suspended_stairs"));
        event.getRegistry().register(new TerraceTableBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.75F, 0.5F).sound(SoundType.WOOD), ToolType.AXE).setRegistryName("willow_suspended_stairs"));

    }

    @SubscribeEvent
    public static void registerBlockItems(RegistryEvent.Register<Item> event)
    {
        event.getRegistry().register(new FuelBlockItem(CHERRY_CHAIR, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), Constants.chairBurnTime).setRegistryName(CHERRY_CHAIR.getRegistryName()));
        event.getRegistry().register(new FuelBlockItem(DEAD_CHAIR, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), Constants.chairBurnTime).setRegistryName(DEAD_CHAIR.getRegistryName()));
        event.getRegistry().register(new FuelBlockItem(ETHEREAL_CHAIR, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), Constants.chairBurnTime).setRegistryName(ETHEREAL_CHAIR.getRegistryName()));
        event.getRegistry().register(new FuelBlockItem(FIR_CHAIR, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), Constants.chairBurnTime).setRegistryName(FIR_CHAIR.getRegistryName()));
        event.getRegistry().register(new FuelBlockItem(HELLBARK_CHAIR, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), Constants.chairBurnTime).setRegistryName(HELLBARK_CHAIR.getRegistryName()));
        event.getRegistry().register(new FuelBlockItem(JACARANDA_CHAIR, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), Constants.chairBurnTime).setRegistryName(JACARANDA_CHAIR.getRegistryName()));
        event.getRegistry().register(new FuelBlockItem(MAGIC_CHAIR, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), Constants.chairBurnTime).setRegistryName(MAGIC_CHAIR.getRegistryName()));
        event.getRegistry().register(new FuelBlockItem(MAHOGANY_CHAIR, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), Constants.chairBurnTime).setRegistryName(MAHOGANY_CHAIR.getRegistryName()));
        event.getRegistry().register(new FuelBlockItem(PALM_CHAIR, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), Constants.chairBurnTime).setRegistryName(PALM_CHAIR.getRegistryName()));
        event.getRegistry().register(new FuelBlockItem(REDWOOD_CHAIR, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), Constants.chairBurnTime).setRegistryName(REDWOOD_CHAIR.getRegistryName()));
        event.getRegistry().register(new FuelBlockItem(UMBRAN_CHAIR, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), Constants.chairBurnTime).setRegistryName(UMBRAN_CHAIR.getRegistryName()));
        event.getRegistry().register(new FuelBlockItem(WILLOW_CHAIR, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), Constants.chairBurnTime).setRegistryName(WILLOW_CHAIR.getRegistryName()));

        event.getRegistry().register(new FuelBlockItem(CHERRY_TERRACE_CHAIR, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), Constants.chairBurnTime).setRegistryName(CHERRY_TERRACE_CHAIR.getRegistryName()));
        event.getRegistry().register(new FuelBlockItem(DEAD_TERRACE_CHAIR, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), Constants.chairBurnTime).setRegistryName(DEAD_TERRACE_CHAIR.getRegistryName()));
        event.getRegistry().register(new FuelBlockItem(ETHEREAL_TERRACE_CHAIR, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), Constants.chairBurnTime).setRegistryName(ETHEREAL_TERRACE_CHAIR.getRegistryName()));
        event.getRegistry().register(new FuelBlockItem(FIR_TERRACE_CHAIR, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), Constants.chairBurnTime).setRegistryName(FIR_TERRACE_CHAIR.getRegistryName()));
        event.getRegistry().register(new FuelBlockItem(HELLBARK_TERRACE_CHAIR, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), Constants.chairBurnTime).setRegistryName(HELLBARK_TERRACE_CHAIR.getRegistryName()));
        event.getRegistry().register(new FuelBlockItem(JACARANDA_TERRACE_CHAIR, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), Constants.chairBurnTime).setRegistryName(JACARANDA_TERRACE_CHAIR.getRegistryName()));
        event.getRegistry().register(new FuelBlockItem(MAGIC_TERRACE_CHAIR, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), Constants.chairBurnTime).setRegistryName(MAGIC_TERRACE_CHAIR.getRegistryName()));
        event.getRegistry().register(new FuelBlockItem(MAHOGANY_TERRACE_CHAIR, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), Constants.chairBurnTime).setRegistryName(MAHOGANY_TERRACE_CHAIR.getRegistryName()));
        event.getRegistry().register(new FuelBlockItem(PALM_TERRACE_CHAIR, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), Constants.chairBurnTime).setRegistryName(PALM_TERRACE_CHAIR.getRegistryName()));
        event.getRegistry().register(new FuelBlockItem(REDWOOD_TERRACE_CHAIR, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), Constants.chairBurnTime).setRegistryName(REDWOOD_TERRACE_CHAIR.getRegistryName()));
        event.getRegistry().register(new FuelBlockItem(UMBRAN_TERRACE_CHAIR, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), Constants.chairBurnTime).setRegistryName(UMBRAN_TERRACE_CHAIR.getRegistryName()));
        event.getRegistry().register(new FuelBlockItem(WILLOW_TERRACE_CHAIR, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), Constants.chairBurnTime).setRegistryName(WILLOW_TERRACE_CHAIR.getRegistryName()));

        event.getRegistry().register(new FuelBlockItem(CHERRY_TABLE, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), Constants.chairBurnTime).setRegistryName(CHERRY_TABLE.getRegistryName()));
        event.getRegistry().register(new FuelBlockItem(DEAD_TABLE, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), Constants.chairBurnTime).setRegistryName(DEAD_TABLE.getRegistryName()));
        event.getRegistry().register(new FuelBlockItem(ETHEREAL_TABLE, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), Constants.chairBurnTime).setRegistryName(ETHEREAL_TABLE.getRegistryName()));
        event.getRegistry().register(new FuelBlockItem(FIR_TABLE, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), Constants.chairBurnTime).setRegistryName(FIR_TABLE.getRegistryName()));
        event.getRegistry().register(new FuelBlockItem(HELLBARK_TABLE, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), Constants.chairBurnTime).setRegistryName(HELLBARK_TABLE.getRegistryName()));
        event.getRegistry().register(new FuelBlockItem(JACARANDA_TABLE, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), Constants.chairBurnTime).setRegistryName(JACARANDA_TABLE.getRegistryName()));
        event.getRegistry().register(new FuelBlockItem(MAGIC_TABLE, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), Constants.chairBurnTime).setRegistryName(MAGIC_TABLE.getRegistryName()));
        event.getRegistry().register(new FuelBlockItem(MAHOGANY_TABLE, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), Constants.chairBurnTime).setRegistryName(MAHOGANY_TABLE.getRegistryName()));
        event.getRegistry().register(new FuelBlockItem(PALM_TABLE, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), Constants.chairBurnTime).setRegistryName(PALM_TABLE.getRegistryName()));
        event.getRegistry().register(new FuelBlockItem(REDWOOD_TABLE, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), Constants.chairBurnTime).setRegistryName(REDWOOD_TABLE.getRegistryName()));
        event.getRegistry().register(new FuelBlockItem(UMBRAN_TABLE, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), Constants.chairBurnTime).setRegistryName(UMBRAN_TABLE.getRegistryName()));
        event.getRegistry().register(new FuelBlockItem(WILLOW_TABLE, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), Constants.chairBurnTime).setRegistryName(WILLOW_TABLE.getRegistryName()));

        event.getRegistry().register(new FuelBlockItem(CHERRY_TERRACE_TABLE, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), Constants.chairBurnTime).setRegistryName(CHERRY_TERRACE_TABLE.getRegistryName()));
        event.getRegistry().register(new FuelBlockItem(DEAD_TERRACE_TABLE, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), Constants.chairBurnTime).setRegistryName(DEAD_TERRACE_TABLE.getRegistryName()));
        event.getRegistry().register(new FuelBlockItem(ETHEREAL_TERRACE_TABLE, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), Constants.chairBurnTime).setRegistryName(ETHEREAL_TERRACE_TABLE.getRegistryName()));
        event.getRegistry().register(new FuelBlockItem(FIR_TERRACE_TABLE, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), Constants.chairBurnTime).setRegistryName(FIR_TERRACE_TABLE.getRegistryName()));
        event.getRegistry().register(new FuelBlockItem(HELLBARK_TERRACE_TABLE, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), Constants.chairBurnTime).setRegistryName(HELLBARK_TERRACE_TABLE.getRegistryName()));
        event.getRegistry().register(new FuelBlockItem(JACARANDA_TERRACE_TABLE, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), Constants.chairBurnTime).setRegistryName(JACARANDA_TERRACE_TABLE.getRegistryName()));
        event.getRegistry().register(new FuelBlockItem(MAGIC_TERRACE_TABLE, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), Constants.chairBurnTime).setRegistryName(MAGIC_TERRACE_TABLE.getRegistryName()));
        event.getRegistry().register(new FuelBlockItem(MAHOGANY_TERRACE_TABLE, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), Constants.chairBurnTime).setRegistryName(MAHOGANY_TERRACE_TABLE.getRegistryName()));
        event.getRegistry().register(new FuelBlockItem(PALM_TERRACE_TABLE, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), Constants.chairBurnTime).setRegistryName(PALM_TERRACE_TABLE.getRegistryName()));
        event.getRegistry().register(new FuelBlockItem(REDWOOD_TERRACE_TABLE, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), Constants.chairBurnTime).setRegistryName(REDWOOD_TERRACE_TABLE.getRegistryName()));
        event.getRegistry().register(new FuelBlockItem(UMBRAN_TERRACE_TABLE, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), Constants.chairBurnTime).setRegistryName(UMBRAN_TERRACE_TABLE.getRegistryName()));
        event.getRegistry().register(new FuelBlockItem(WILLOW_TERRACE_TABLE, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), Constants.chairBurnTime).setRegistryName(WILLOW_TERRACE_TABLE.getRegistryName()));

        event.getRegistry().register(new FuelBlockItem(CHERRY_FANCY_DOOR, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), Constants.chairBurnTime).setRegistryName(CHERRY_FANCY_DOOR.getRegistryName()));
        event.getRegistry().register(new FuelBlockItem(DEAD_FANCY_DOOR, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), Constants.chairBurnTime).setRegistryName(DEAD_FANCY_DOOR.getRegistryName()));
        event.getRegistry().register(new FuelBlockItem(ETHEREAL_FANCY_DOOR, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), Constants.chairBurnTime).setRegistryName(ETHEREAL_FANCY_DOOR.getRegistryName()));
        event.getRegistry().register(new FuelBlockItem(FIR_FANCY_DOOR, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), Constants.chairBurnTime).setRegistryName(FIR_FANCY_DOOR.getRegistryName()));
        event.getRegistry().register(new FuelBlockItem(HELLBARK_FANCY_DOOR, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), Constants.chairBurnTime).setRegistryName(HELLBARK_FANCY_DOOR.getRegistryName()));
        event.getRegistry().register(new FuelBlockItem(JACARANDA_FANCY_DOOR, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), Constants.chairBurnTime).setRegistryName(JACARANDA_FANCY_DOOR.getRegistryName()));
        event.getRegistry().register(new FuelBlockItem(MAGIC_FANCY_DOOR, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), Constants.chairBurnTime).setRegistryName(MAGIC_FANCY_DOOR.getRegistryName()));
        event.getRegistry().register(new FuelBlockItem(MAHOGANY_FANCY_DOOR, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), Constants.chairBurnTime).setRegistryName(MAHOGANY_FANCY_DOOR.getRegistryName()));
        event.getRegistry().register(new FuelBlockItem(PALM_FANCY_DOOR, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), Constants.chairBurnTime).setRegistryName(PALM_FANCY_DOOR.getRegistryName()));
        event.getRegistry().register(new FuelBlockItem(REDWOOD_FANCY_DOOR, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), Constants.chairBurnTime).setRegistryName(REDWOOD_FANCY_DOOR.getRegistryName()));
        event.getRegistry().register(new FuelBlockItem(UMBRAN_FANCY_DOOR, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), Constants.chairBurnTime).setRegistryName(UMBRAN_FANCY_DOOR.getRegistryName()));
        event.getRegistry().register(new FuelBlockItem(WILLOW_FANCY_DOOR, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), Constants.chairBurnTime).setRegistryName(WILLOW_FANCY_DOOR.getRegistryName()));

        event.getRegistry().register(new FuelBlockItem(CHERRY_SUSPENDED_STAIRS, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), Constants.chairBurnTime).setRegistryName(CHERRY_SUSPENDED_STAIRS.getRegistryName()));
        event.getRegistry().register(new FuelBlockItem(DEAD_SUSPENDED_STAIRS, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), Constants.chairBurnTime).setRegistryName(DEAD_SUSPENDED_STAIRS.getRegistryName()));
        event.getRegistry().register(new FuelBlockItem(ETHEREAL_SUSPENDED_STAIRS, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), Constants.chairBurnTime).setRegistryName(ETHEREAL_SUSPENDED_STAIRS.getRegistryName()));
        event.getRegistry().register(new FuelBlockItem(FIR_SUSPENDED_STAIRS, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), Constants.chairBurnTime).setRegistryName(FIR_SUSPENDED_STAIRS.getRegistryName()));
        event.getRegistry().register(new FuelBlockItem(HELLBARK_SUSPENDED_STAIRS, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), Constants.chairBurnTime).setRegistryName(HELLBARK_SUSPENDED_STAIRS.getRegistryName()));
        event.getRegistry().register(new FuelBlockItem(JACARANDA_SUSPENDED_STAIRS, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), Constants.chairBurnTime).setRegistryName(JACARANDA_SUSPENDED_STAIRS.getRegistryName()));
        event.getRegistry().register(new FuelBlockItem(MAGIC_SUSPENDED_STAIRS, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), Constants.chairBurnTime).setRegistryName(MAGIC_SUSPENDED_STAIRS.getRegistryName()));
        event.getRegistry().register(new FuelBlockItem(MAHOGANY_SUSPENDED_STAIRS, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), Constants.chairBurnTime).setRegistryName(MAHOGANY_SUSPENDED_STAIRS.getRegistryName()));
        event.getRegistry().register(new FuelBlockItem(PALM_SUSPENDED_STAIRS, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), Constants.chairBurnTime).setRegistryName(PALM_SUSPENDED_STAIRS.getRegistryName()));
        event.getRegistry().register(new FuelBlockItem(REDWOOD_SUSPENDED_STAIRS, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), Constants.chairBurnTime).setRegistryName(REDWOOD_SUSPENDED_STAIRS.getRegistryName()));
        event.getRegistry().register(new FuelBlockItem(UMBRAN_SUSPENDED_STAIRS, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), Constants.chairBurnTime).setRegistryName(UMBRAN_SUSPENDED_STAIRS.getRegistryName()));
        event.getRegistry().register(new FuelBlockItem(WILLOW_SUSPENDED_STAIRS, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), Constants.chairBurnTime).setRegistryName(WILLOW_SUSPENDED_STAIRS.getRegistryName()));

    }
}
