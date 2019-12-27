package tv.mapper.embellishcraftbop.init;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
import tv.mapper.embellishcraft.block.CustomDoorBlock;
import tv.mapper.embellishcraft.block.SuspendedStairsBlock;
import tv.mapper.embellishcraft.block.TableBlock;
import tv.mapper.embellishcraft.block.TerraceChairBlock;
import tv.mapper.embellishcraft.block.TerraceTableBlock;
import tv.mapper.embellishcraft.item.FuelBlockItem;
import tv.mapper.embellishcraft.item.ModItemGroups;
import tv.mapper.embellishcraftbop.EmbellishCraftBOP;
import tv.mapper.embellishcraftbop.util.BoPWoodType;

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

    private static List<Block> CHAIRS = new ArrayList<>();
    private static List<Block> DOORS = new ArrayList<>();
    private static List<Block> SUSPENDED_STAIRS = new ArrayList<>();

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event)
    {
        Block block;

        for(int i = 0; i < Arrays.stream(BoPWoodType.values()).count(); i++)
        {
            event.getRegistry().register(block = new ChairBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.75F, 0.5F).sound(SoundType.WOOD), ToolType.AXE).setRegistryName(BoPWoodType.byId(i).getName() + "_chair"));
            CHAIRS.add(block);
            event.getRegistry().register(block = new TerraceChairBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.75F, 0.5F).sound(SoundType.WOOD), ToolType.AXE).setRegistryName(BoPWoodType.byId(i).getName() + "_terrace_chair"));
            CHAIRS.add(block);
            event.getRegistry().register(block = new TableBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.75F, 0.5F).sound(SoundType.WOOD), ToolType.AXE).setRegistryName(BoPWoodType.byId(i).getName() + "_table"));
            CHAIRS.add(block);
            event.getRegistry().register(block = new TerraceTableBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.75F, 0.5F).sound(SoundType.WOOD), ToolType.AXE).setRegistryName(BoPWoodType.byId(i).getName() + "_terrace_table"));
            CHAIRS.add(block);
            event.getRegistry().register(block = new CustomDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.75F, 0.5F).sound(SoundType.WOOD), ToolType.AXE).setRegistryName(BoPWoodType.byId(i).getName() + "_fancy_door"));
            DOORS.add(block);
            event.getRegistry().register(block = new SuspendedStairsBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.75F, 0.5F).sound(SoundType.WOOD), ToolType.AXE).setRegistryName(BoPWoodType.byId(i).getName() + "_suspended_stairs"));
            SUSPENDED_STAIRS.add(block);
        }
    }

    @SubscribeEvent
    public static void registerBlockItems(RegistryEvent.Register<Item> event)
    {
        for(Block block : CHAIRS)
            event.getRegistry().register(new FuelBlockItem(block, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), Constants.chairBurnTime).setRegistryName(block.getRegistryName()));

        for(Block block : DOORS)
            event.getRegistry().register(new FuelBlockItem(block, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), Constants.doorBurnTime).setRegistryName(block.getRegistryName()));

        for(Block block : SUSPENDED_STAIRS)
            event.getRegistry().register(new FuelBlockItem(block, new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), Constants.suspendedStairBurnTime).setRegistryName(block.getRegistryName()));

    }
}
