package tv.mapper.embellishcraftbop.init;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

import org.apache.commons.lang3.tuple.Pair;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.item.DyeColor;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import tv.mapper.embellishcraft.block.ChairBlock;
import tv.mapper.embellishcraft.block.CrateBlock;
import tv.mapper.embellishcraft.block.CustomBedBlock;
import tv.mapper.embellishcraft.block.CustomChestBlock;
import tv.mapper.embellishcraft.block.ECBlockRegistry;
import tv.mapper.embellishcraft.block.FancyTableBlock;
import tv.mapper.embellishcraft.block.SuspendedStairsBlock;
import tv.mapper.embellishcraft.block.TableBlock;
import tv.mapper.embellishcraft.block.TerraceChairBlock;
import tv.mapper.embellishcraft.block.TerraceTableBlock;
import tv.mapper.embellishcraft.tileentity.ModTileEntityTypes;
import tv.mapper.embellishcraft.util.CustomChestType;
import tv.mapper.embellishcraft.util.McWoods;
import tv.mapper.embellishcraft.util.WoodsType;
import tv.mapper.embellishcraftbop.EmbellishCraftBOP;
import tv.mapper.embellishcraftbop.util.BoPWoods;
import tv.mapper.mapperbase.block.CustomDoorBlock;

public class ECBoPBlocks
{
    private static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, EmbellishCraftBOP.MODID);

    public static final Map<BoPWoods, RegistryObject<ChairBlock>> BOP_CHAIR_BLOCKS = Arrays.stream(BoPWoods.values()).map(type -> Pair.of(type,
        BLOCKS.register(type.getString() + "_chair",
            () -> new ChairBlock(Block.Properties.create(Material.WOOD, MaterialColor.WOOD).hardnessAndResistance(0.75F, 0.5F).sound(SoundType.WOOD), ToolType.AXE)))).collect(
                Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<BoPWoods, RegistryObject<TerraceChairBlock>> BOP_TERRACE_CHAIR_BLOCKS = Arrays.stream(BoPWoods.values()).map(type -> Pair.of(type,
        BLOCKS.register(type.getString() + "_terrace_chair",
            () -> new TerraceChairBlock(Block.Properties.create(Material.WOOD, MaterialColor.WOOD).hardnessAndResistance(0.75F, 0.5F).sound(SoundType.WOOD), ToolType.AXE)))).collect(
                Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<BoPWoods, RegistryObject<TableBlock>> BOP_TABLE_BLOCKS = Arrays.stream(BoPWoods.values()).map(type -> Pair.of(type,
        BLOCKS.register(type.getString() + "_table",
            () -> new TableBlock(Block.Properties.create(Material.WOOD, MaterialColor.WOOD).hardnessAndResistance(0.75F, 0.5F).sound(SoundType.WOOD), ToolType.AXE)))).collect(
                Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<BoPWoods, RegistryObject<FancyTableBlock>> BOP_FANCY_TABLE_BLOCKS = Arrays.stream(BoPWoods.values()).map(type -> Pair.of(type,
        BLOCKS.register(type.getString() + "_fancy_table",
            () -> new FancyTableBlock(Block.Properties.create(Material.WOOD, MaterialColor.WOOD).hardnessAndResistance(0.75F, 0.5F).sound(SoundType.WOOD), ToolType.AXE)))).collect(
                Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<BoPWoods, RegistryObject<TerraceTableBlock>> BOP_TERRACE_TABLE_BLOCKS = Arrays.stream(BoPWoods.values()).map(type -> Pair.of(type,
        BLOCKS.register(type.getString() + "_terrace_table",
            () -> new TerraceTableBlock(Block.Properties.create(Material.WOOD, MaterialColor.WOOD).hardnessAndResistance(0.75F, 0.5F).sound(SoundType.WOOD), ToolType.AXE)))).collect(
                Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<BoPWoods, RegistryObject<CustomDoorBlock>> BOP_FANCY_DOOR_BLOCKS = Arrays.stream(BoPWoods.values()).map(type -> Pair.of(type,
        BLOCKS.register(type.getString() + "_fancy_door",
            () -> new CustomDoorBlock(Block.Properties.create(Material.WOOD, MaterialColor.WOOD).hardnessAndResistance(3.0F).sound(SoundType.WOOD), ToolType.AXE)))).collect(
                Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<BoPWoods, RegistryObject<CustomDoorBlock>> BOP_PLAIN_DOOR_BLOCKS = Arrays.stream(BoPWoods.values()).map(type -> Pair.of(type,
        BLOCKS.register(type.getString() + "_plain_door",
            () -> new CustomDoorBlock(Block.Properties.create(Material.WOOD, MaterialColor.WOOD).hardnessAndResistance(3.0F).sound(SoundType.WOOD), ToolType.AXE)))).collect(
                Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<BoPWoods, RegistryObject<SuspendedStairsBlock>> BOP_SUSPENDED_STAIRS_BLOCKS = Arrays.stream(BoPWoods.values()).map(type -> Pair.of(type,
            BLOCKS.register(type.getString() + "_suspended_stairs",
                () -> new SuspendedStairsBlock(Block.Properties.create(Material.WOOD, MaterialColor.WOOD).hardnessAndResistance(3.0F).sound(SoundType.WOOD), ToolType.AXE, false)))).collect(
                    Collectors.toMap(Pair::getKey, Pair::getValue));
    
    public static final Map<BoPWoods, RegistryObject<SuspendedStairsBlock>> BOP_LARGE_SUSPENDED_STAIRS_BLOCKS = Arrays.stream(BoPWoods.values()).map(type -> Pair.of(type,
            BLOCKS.register(type.getString() + "_large_suspended_stairs",
                () -> new SuspendedStairsBlock(Block.Properties.create(Material.WOOD, MaterialColor.WOOD).hardnessAndResistance(3.0F).sound(SoundType.WOOD), ToolType.AXE, true)))).collect(
                    Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<BoPWoods, RegistryObject<CrateBlock>> BOP_WOODEN_CRATE_BLOCKS = Arrays.stream(BoPWoods.values()).map(type -> Pair.of(type,
        BLOCKS.register(type.getString() + "_wooden_crate", () -> new CrateBlock(Block.Properties.create(Material.WOOD, MaterialColor.WOOD).hardnessAndResistance(2.5F).sound(SoundType.WOOD))))).collect(
            Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<DyeColor, RegistryObject<CustomBedBlock>> CHERRY_FANCY_BED_BLOCKS = Arrays.stream(DyeColor.values()).map(
        type -> Pair.of(type,
            BLOCKS.register(type.getString() + "_cherry_fancy_bed",
                () -> new CustomBedBlock(type, WoodsType.CHERRY, Block.Properties.create(Material.WOOL).sound(SoundType.WOOD).hardnessAndResistance(0.2F))))).collect(
                    Collectors.toMap(Pair::getKey, Pair::getValue));
    public static final Map<DyeColor, RegistryObject<CustomBedBlock>> DEAD_FANCY_BED_BLOCKS = Arrays.stream(DyeColor.values()).map(type -> Pair.of(type,
        BLOCKS.register(type.getString() + "_dead_fancy_bed", () -> new CustomBedBlock(type, WoodsType.DEAD, Block.Properties.create(Material.WOOL).sound(SoundType.WOOD).hardnessAndResistance(0.2F))))).collect(
            Collectors.toMap(Pair::getKey, Pair::getValue));
    public static final Map<DyeColor, RegistryObject<CustomBedBlock>> FIR_FANCY_BED_BLOCKS = Arrays.stream(DyeColor.values()).map(type -> Pair.of(type,
        BLOCKS.register(type.getString() + "_fir_fancy_bed", () -> new CustomBedBlock(type, WoodsType.FIR, Block.Properties.create(Material.WOOL).sound(SoundType.WOOD).hardnessAndResistance(0.2F))))).collect(
            Collectors.toMap(Pair::getKey, Pair::getValue));
    public static final Map<DyeColor, RegistryObject<CustomBedBlock>> HELLBARK_FANCY_BED_BLOCKS = Arrays.stream(DyeColor.values()).map(type -> Pair.of(type,
        BLOCKS.register(type.getString() + "_hellbark_fancy_bed",
            () -> new CustomBedBlock(type, WoodsType.HELLBARK, Block.Properties.create(Material.WOOL).sound(SoundType.WOOD).hardnessAndResistance(0.2F))))).collect(
                Collectors.toMap(Pair::getKey, Pair::getValue));
    public static final Map<DyeColor, RegistryObject<CustomBedBlock>> JACARANDA_FANCY_BED_BLOCKS = Arrays.stream(DyeColor.values()).map(type -> Pair.of(type,
        BLOCKS.register(type.getString() + "_jacaranda_fancy_bed",
            () -> new CustomBedBlock(type, WoodsType.JACARANDA, Block.Properties.create(Material.WOOL).sound(SoundType.WOOD).hardnessAndResistance(0.2F))))).collect(
                Collectors.toMap(Pair::getKey, Pair::getValue));
    public static final Map<DyeColor, RegistryObject<CustomBedBlock>> MAGIC_FANCY_BED_BLOCKS = Arrays.stream(DyeColor.values()).map(
        type -> Pair.of(type,
            BLOCKS.register(type.getString() + "_magic_fancy_bed",
                () -> new CustomBedBlock(type, WoodsType.MAGIC, Block.Properties.create(Material.WOOL).sound(SoundType.WOOD).hardnessAndResistance(0.2F))))).collect(
                    Collectors.toMap(Pair::getKey, Pair::getValue));
    public static final Map<DyeColor, RegistryObject<CustomBedBlock>> MAHOGANY_FANCY_BED_BLOCKS = Arrays.stream(DyeColor.values()).map(type -> Pair.of(type,
        BLOCKS.register(type.getString() + "_mahogany_fancy_bed",
            () -> new CustomBedBlock(type, WoodsType.MAHOGANY, Block.Properties.create(Material.WOOL).sound(SoundType.WOOD).hardnessAndResistance(0.2F))))).collect(
                Collectors.toMap(Pair::getKey, Pair::getValue));
    public static final Map<DyeColor, RegistryObject<CustomBedBlock>> PALM_FANCY_BED_BLOCKS = Arrays.stream(DyeColor.values()).map(type -> Pair.of(type,
        BLOCKS.register(type.getString() + "_palm_fancy_bed", () -> new CustomBedBlock(type, WoodsType.PALM, Block.Properties.create(Material.WOOL).sound(SoundType.WOOD).hardnessAndResistance(0.2F))))).collect(
            Collectors.toMap(Pair::getKey, Pair::getValue));
    public static final Map<DyeColor, RegistryObject<CustomBedBlock>> REDWOOD_FANCY_BED_BLOCKS = Arrays.stream(DyeColor.values()).map(type -> Pair.of(type,
        BLOCKS.register(type.getString() + "_redwood_fancy_bed",
            () -> new CustomBedBlock(type, WoodsType.REDWOOD, Block.Properties.create(Material.WOOL).sound(SoundType.WOOD).hardnessAndResistance(0.2F))))).collect(
                Collectors.toMap(Pair::getKey, Pair::getValue));
    public static final Map<DyeColor, RegistryObject<CustomBedBlock>> UMBRAN_FANCY_BED_BLOCKS = Arrays.stream(DyeColor.values()).map(
        type -> Pair.of(type,
            BLOCKS.register(type.getString() + "_umbran_fancy_bed",
                () -> new CustomBedBlock(type, WoodsType.UMBRAN, Block.Properties.create(Material.WOOL).sound(SoundType.WOOD).hardnessAndResistance(0.2F))))).collect(
                    Collectors.toMap(Pair::getKey, Pair::getValue));
    public static final Map<DyeColor, RegistryObject<CustomBedBlock>> WILLOW_FANCY_BED_BLOCKS = Arrays.stream(DyeColor.values()).map(
        type -> Pair.of(type,
            BLOCKS.register(type.getString() + "_willow_fancy_bed",
                () -> new CustomBedBlock(type, WoodsType.WILLOW, Block.Properties.create(Material.WOOL).sound(SoundType.WOOD).hardnessAndResistance(0.2F))))).collect(
                    Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<BoPWoods, RegistryObject<CustomChestBlock>> BOP_FANCY_CHEST_BLOCKS = Arrays.stream(BoPWoods.values()).map(type -> Pair.of(type,
        BLOCKS.register(type.getString() + "_fancy_chest", () -> new CustomChestBlock(Block.Properties.create(Material.WOOD, MaterialColor.WOOD).hardnessAndResistance(2.5F).sound(SoundType.WOOD), () ->
        {
            return ModTileEntityTypes.CUSTOM_CHEST;
        }, CustomChestType.OAK_FANCY, WoodsType.byId(type.getId() + McWoods.values().length))))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static void init()
    {
        EmbellishCraftBOP.LOGGER.info("2.1- Embellishcraft-BoP: block registering.");
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    public static void postInit()
    {
        EmbellishCraftBOP.LOGGER.info("2.2- Embellishcraft-BoP: block listing.");
        for(int i = 0; i < BoPWoods.values().length; i++)
        {
            ECBlockRegistry.FANCY_CHESTS.add(BOP_FANCY_CHEST_BLOCKS.get(BoPWoods.byId(i)));
            ECBlockRegistry.CUTOUT_BLOCKS.add(BOP_TERRACE_CHAIR_BLOCKS.get(BoPWoods.byId(i)));
            ECBlockRegistry.CUTOUT_BLOCKS.add(BOP_TERRACE_TABLE_BLOCKS.get(BoPWoods.byId(i)));
            ECBlockRegistry.CRATES.add(BOP_WOODEN_CRATE_BLOCKS.get(BoPWoods.byId(i)));
        }

        for(int i = 0; i < DyeColor.values().length; i++)
        {
            ECBlockRegistry.FANCY_BEDS.add(CHERRY_FANCY_BED_BLOCKS.get(DyeColor.byId(i)));
            ECBlockRegistry.FANCY_BEDS.add(DEAD_FANCY_BED_BLOCKS.get(DyeColor.byId(i)));
            ECBlockRegistry.FANCY_BEDS.add(FIR_FANCY_BED_BLOCKS.get(DyeColor.byId(i)));
            ECBlockRegistry.FANCY_BEDS.add(HELLBARK_FANCY_BED_BLOCKS.get(DyeColor.byId(i)));
            ECBlockRegistry.FANCY_BEDS.add(JACARANDA_FANCY_BED_BLOCKS.get(DyeColor.byId(i)));
            ECBlockRegistry.FANCY_BEDS.add(MAGIC_FANCY_BED_BLOCKS.get(DyeColor.byId(i)));
            ECBlockRegistry.FANCY_BEDS.add(MAHOGANY_FANCY_BED_BLOCKS.get(DyeColor.byId(i)));
            ECBlockRegistry.FANCY_BEDS.add(PALM_FANCY_BED_BLOCKS.get(DyeColor.byId(i)));
            ECBlockRegistry.FANCY_BEDS.add(REDWOOD_FANCY_BED_BLOCKS.get(DyeColor.byId(i)));
            ECBlockRegistry.FANCY_BEDS.add(UMBRAN_FANCY_BED_BLOCKS.get(DyeColor.byId(i)));
            ECBlockRegistry.FANCY_BEDS.add(WILLOW_FANCY_BED_BLOCKS.get(DyeColor.byId(i)));
        }
    }
}