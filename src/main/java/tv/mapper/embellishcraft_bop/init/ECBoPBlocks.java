package tv.mapper.embellishcraft_bop.init;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

import org.apache.commons.lang3.tuple.Pair;

import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import tv.mapper.embellishcraft.building.world.level.block.SuspendedStairsBlock;
import tv.mapper.embellishcraft.core.util.WoodsType;
import tv.mapper.embellishcraft.furniture.world.level.block.ChairBlock;
import tv.mapper.embellishcraft.furniture.world.level.block.CrateBlock;
import tv.mapper.embellishcraft.furniture.world.level.block.CustomBedBlock;
import tv.mapper.embellishcraft.furniture.world.level.block.FancyTableBlock;
import tv.mapper.embellishcraft.furniture.world.level.block.InitFurnitureBlocks;
import tv.mapper.embellishcraft.furniture.world.level.block.TableBlock;
import tv.mapper.embellishcraft.furniture.world.level.block.TerraceChairBlock;
import tv.mapper.embellishcraft.furniture.world.level.block.TerraceTableBlock;
import tv.mapper.embellishcraft_bop.EmbellishCraftBOP;
import tv.mapper.embellishcraft_bop.util.BoPWoods;
import tv.mapper.mapperbase.world.level.block.CustomDoorBlock;
import tv.mapper.mapperbase.world.level.block.ToolTypes;

public class ECBoPBlocks
{
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, EmbellishCraftBOP.MODID);

    public static final Map<BoPWoods, RegistryObject<ChairBlock>> BOP_CHAIR_BLOCKS = Arrays.stream(BoPWoods.values()).map(type -> Pair.of(type, BLOCKS.register(type.getSerializedName() + "_chair", () -> new ChairBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(0.75F, 0.5F).sound(SoundType.WOOD), ToolTypes.AXE)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<BoPWoods, RegistryObject<TerraceChairBlock>> BOP_TERRACE_CHAIR_BLOCKS = Arrays.stream(BoPWoods.values()).map(type -> Pair.of(type, BLOCKS.register(type.getSerializedName() + "_terrace_chair", () -> new TerraceChairBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(0.75F, 0.5F).sound(SoundType.WOOD), ToolTypes.AXE)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<BoPWoods, RegistryObject<TableBlock>> BOP_TABLE_BLOCKS = Arrays.stream(BoPWoods.values()).map(type -> Pair.of(type, BLOCKS.register(type.getSerializedName() + "_table", () -> new TableBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(0.75F, 0.5F).sound(SoundType.WOOD), ToolTypes.AXE)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<BoPWoods, RegistryObject<FancyTableBlock>> BOP_FANCY_TABLE_BLOCKS = Arrays.stream(BoPWoods.values()).map(type -> Pair.of(type, BLOCKS.register(type.getSerializedName() + "_fancy_table", () -> new FancyTableBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(0.75F, 0.5F).sound(SoundType.WOOD), ToolTypes.AXE)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<BoPWoods, RegistryObject<TerraceTableBlock>> BOP_TERRACE_TABLE_BLOCKS = Arrays.stream(BoPWoods.values()).map(type -> Pair.of(type, BLOCKS.register(type.getSerializedName() + "_terrace_table", () -> new TerraceTableBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(0.75F, 0.5F).sound(SoundType.WOOD), ToolTypes.AXE)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<BoPWoods, RegistryObject<CustomDoorBlock>> BOP_FANCY_DOOR_BLOCKS = Arrays.stream(BoPWoods.values()).map(type -> Pair.of(type, BLOCKS.register(type.getSerializedName() + "_fancy_door", () -> new CustomDoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(3.0F).sound(SoundType.WOOD), ToolTypes.AXE)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<BoPWoods, RegistryObject<CustomDoorBlock>> BOP_PLAIN_DOOR_BLOCKS = Arrays.stream(BoPWoods.values()).map(type -> Pair.of(type, BLOCKS.register(type.getSerializedName() + "_plain_door", () -> new CustomDoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(3.0F).sound(SoundType.WOOD), ToolTypes.AXE)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<BoPWoods, RegistryObject<SuspendedStairsBlock>> BOP_SUSPENDED_STAIRS_BLOCKS = Arrays.stream(BoPWoods.values()).map(type -> Pair.of(type, BLOCKS.register(type.getSerializedName() + "_suspended_stairs", () -> new SuspendedStairsBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(3.0F).sound(SoundType.WOOD), ToolTypes.AXE, false)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<BoPWoods, RegistryObject<SuspendedStairsBlock>> BOP_LARGE_SUSPENDED_STAIRS_BLOCKS = Arrays.stream(BoPWoods.values()).map(type -> Pair.of(type, BLOCKS.register(type.getSerializedName() + "_large_suspended_stairs", () -> new SuspendedStairsBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(3.0F).sound(SoundType.WOOD), ToolTypes.AXE, true)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<BoPWoods, RegistryObject<CrateBlock>> BOP_WOODEN_CRATE_BLOCKS = Arrays.stream(BoPWoods.values()).map(type -> Pair.of(type, BLOCKS.register(type.getSerializedName() + "_wooden_crate", () -> new CrateBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(2.5F).sound(SoundType.WOOD), ToolTypes.AXE)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<DyeColor, RegistryObject<CustomBedBlock>> CHERRY_FANCY_BED_BLOCKS = Arrays.stream(DyeColor.values()).map(type -> Pair.of(type, BLOCKS.register(type.getSerializedName() + "_cherry_fancy_bed", () -> new CustomBedBlock(type, WoodsType.CHERRY, Block.Properties.of(Material.WOOL).sound(SoundType.WOOD).strength(0.2F), ToolTypes.AXE)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));
    public static final Map<DyeColor, RegistryObject<CustomBedBlock>> DEAD_FANCY_BED_BLOCKS = Arrays.stream(DyeColor.values()).map(type -> Pair.of(type, BLOCKS.register(type.getSerializedName() + "_dead_fancy_bed", () -> new CustomBedBlock(type, WoodsType.DEAD, Block.Properties.of(Material.WOOL).sound(SoundType.WOOD).strength(0.2F), ToolTypes.AXE)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));
    public static final Map<DyeColor, RegistryObject<CustomBedBlock>> FIR_FANCY_BED_BLOCKS = Arrays.stream(DyeColor.values()).map(type -> Pair.of(type, BLOCKS.register(type.getSerializedName() + "_fir_fancy_bed", () -> new CustomBedBlock(type, WoodsType.FIR, Block.Properties.of(Material.WOOL).sound(SoundType.WOOD).strength(0.2F), ToolTypes.AXE)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));
    public static final Map<DyeColor, RegistryObject<CustomBedBlock>> HELLBARK_FANCY_BED_BLOCKS = Arrays.stream(DyeColor.values()).map(type -> Pair.of(type, BLOCKS.register(type.getSerializedName() + "_hellbark_fancy_bed", () -> new CustomBedBlock(type, WoodsType.HELLBARK, Block.Properties.of(Material.WOOL).sound(SoundType.WOOD).strength(0.2F), ToolTypes.AXE)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));
    public static final Map<DyeColor, RegistryObject<CustomBedBlock>> JACARANDA_FANCY_BED_BLOCKS = Arrays.stream(DyeColor.values()).map(type -> Pair.of(type, BLOCKS.register(type.getSerializedName() + "_jacaranda_fancy_bed", () -> new CustomBedBlock(type, WoodsType.JACARANDA, Block.Properties.of(Material.WOOL).sound(SoundType.WOOD).strength(0.2F), ToolTypes.AXE)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));
    public static final Map<DyeColor, RegistryObject<CustomBedBlock>> MAGIC_FANCY_BED_BLOCKS = Arrays.stream(DyeColor.values()).map(type -> Pair.of(type, BLOCKS.register(type.getSerializedName() + "_magic_fancy_bed", () -> new CustomBedBlock(type, WoodsType.MAGIC, Block.Properties.of(Material.WOOL).sound(SoundType.WOOD).strength(0.2F), ToolTypes.AXE)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));
    public static final Map<DyeColor, RegistryObject<CustomBedBlock>> MAHOGANY_FANCY_BED_BLOCKS = Arrays.stream(DyeColor.values()).map(type -> Pair.of(type, BLOCKS.register(type.getSerializedName() + "_mahogany_fancy_bed", () -> new CustomBedBlock(type, WoodsType.MAHOGANY, Block.Properties.of(Material.WOOL).sound(SoundType.WOOD).strength(0.2F), ToolTypes.AXE)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));
    public static final Map<DyeColor, RegistryObject<CustomBedBlock>> PALM_FANCY_BED_BLOCKS = Arrays.stream(DyeColor.values()).map(type -> Pair.of(type, BLOCKS.register(type.getSerializedName() + "_palm_fancy_bed", () -> new CustomBedBlock(type, WoodsType.PALM, Block.Properties.of(Material.WOOL).sound(SoundType.WOOD).strength(0.2F), ToolTypes.AXE)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));
    public static final Map<DyeColor, RegistryObject<CustomBedBlock>> REDWOOD_FANCY_BED_BLOCKS = Arrays.stream(DyeColor.values()).map(type -> Pair.of(type, BLOCKS.register(type.getSerializedName() + "_redwood_fancy_bed", () -> new CustomBedBlock(type, WoodsType.REDWOOD, Block.Properties.of(Material.WOOL).sound(SoundType.WOOD).strength(0.2F), ToolTypes.AXE)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));
    public static final Map<DyeColor, RegistryObject<CustomBedBlock>> UMBRAN_FANCY_BED_BLOCKS = Arrays.stream(DyeColor.values()).map(type -> Pair.of(type, BLOCKS.register(type.getSerializedName() + "_umbran_fancy_bed", () -> new CustomBedBlock(type, WoodsType.UMBRAN, Block.Properties.of(Material.WOOL).sound(SoundType.WOOD).strength(0.2F), ToolTypes.AXE)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));
    public static final Map<DyeColor, RegistryObject<CustomBedBlock>> WILLOW_FANCY_BED_BLOCKS = Arrays.stream(DyeColor.values()).map(type -> Pair.of(type, BLOCKS.register(type.getSerializedName() + "_willow_fancy_bed", () -> new CustomBedBlock(type, WoodsType.WILLOW, Block.Properties.of(Material.WOOL).sound(SoundType.WOOD).strength(0.2F), ToolTypes.AXE)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    // public static final Map<BoPWoods, RegistryObject<CustomChestBlock>> BOP_FANCY_CHEST_BLOCKS = Arrays.stream(BoPWoods.values()).map(type -> Pair.of(type, BLOCKS.register(type.getSerializedName()
    // + "_fancy_chest", () -> new CustomChestBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(2.5F).sound(SoundType.WOOD), () ->
    // {
    // return ModTileEntityTypes.CUSTOM_CHEST;
    // }, CustomChestType.OAK_FANCY, WoodsType.byId(type.getId() + McWoods.values().length), ToolTypes.AXE)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

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
            // InitFurnitureBlocks.FANCY_CHESTS.add(BOP_FANCY_CHEST_BLOCKS.get(BoPWoods.byId(i)));
            InitFurnitureBlocks.CUTOUT_BLOCKS.add(BOP_TERRACE_CHAIR_BLOCKS.get(BoPWoods.byId(i)));
            InitFurnitureBlocks.CUTOUT_BLOCKS.add(BOP_TERRACE_TABLE_BLOCKS.get(BoPWoods.byId(i)));
            InitFurnitureBlocks.CRATES.add(BOP_WOODEN_CRATE_BLOCKS.get(BoPWoods.byId(i)));
        }

        for(int i = 0; i < DyeColor.values().length; i++)
        {
            InitFurnitureBlocks.FANCY_BEDS.add(CHERRY_FANCY_BED_BLOCKS.get(DyeColor.byId(i)));
            InitFurnitureBlocks.FANCY_BEDS.add(DEAD_FANCY_BED_BLOCKS.get(DyeColor.byId(i)));
            InitFurnitureBlocks.FANCY_BEDS.add(FIR_FANCY_BED_BLOCKS.get(DyeColor.byId(i)));
            InitFurnitureBlocks.FANCY_BEDS.add(HELLBARK_FANCY_BED_BLOCKS.get(DyeColor.byId(i)));
            InitFurnitureBlocks.FANCY_BEDS.add(JACARANDA_FANCY_BED_BLOCKS.get(DyeColor.byId(i)));
            InitFurnitureBlocks.FANCY_BEDS.add(MAGIC_FANCY_BED_BLOCKS.get(DyeColor.byId(i)));
            InitFurnitureBlocks.FANCY_BEDS.add(MAHOGANY_FANCY_BED_BLOCKS.get(DyeColor.byId(i)));
            InitFurnitureBlocks.FANCY_BEDS.add(PALM_FANCY_BED_BLOCKS.get(DyeColor.byId(i)));
            InitFurnitureBlocks.FANCY_BEDS.add(REDWOOD_FANCY_BED_BLOCKS.get(DyeColor.byId(i)));
            InitFurnitureBlocks.FANCY_BEDS.add(UMBRAN_FANCY_BED_BLOCKS.get(DyeColor.byId(i)));
            InitFurnitureBlocks.FANCY_BEDS.add(WILLOW_FANCY_BED_BLOCKS.get(DyeColor.byId(i)));
        }
    }
}