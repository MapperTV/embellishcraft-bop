package tv.mapper.embellishcraft_bop.init;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

import org.apache.commons.lang3.tuple.Pair;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.Item;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import tv.mapper.embellishcraft.core.ECConstants;
import tv.mapper.embellishcraft.core.world.item.ModItemGroups;
import tv.mapper.embellishcraft_bop.EmbellishCraftBOP;
import tv.mapper.embellishcraft_bop.util.BoPWoods;
import tv.mapper.mapperbase.world.item.FuelBlockItem;

public class ECBoPItems
{
    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, EmbellishCraftBOP.MODID);

    public static final Map<BoPWoods, RegistryObject<FuelBlockItem>> BOP_CHAIRS_ITEMS = Arrays.stream(BoPWoods.values()).map(type -> Pair.of(type, ITEMS.register(type.getSerializedName() + "_chair", () -> new FuelBlockItem(ECBoPBlocks.BOP_CHAIR_BLOCKS.get(type).get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT_FURNITURE), ECConstants.chairBurnTime)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<BoPWoods, RegistryObject<FuelBlockItem>> BOP_TERRACE_CHAIRS_ITEMS = Arrays.stream(BoPWoods.values()).map(type -> Pair.of(type, ITEMS.register(type.getSerializedName() + "_terrace_chair", () -> new FuelBlockItem(ECBoPBlocks.BOP_TERRACE_CHAIR_BLOCKS.get(type).get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT_FURNITURE), ECConstants.chairBurnTime)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<BoPWoods, RegistryObject<FuelBlockItem>> BOP_TABLE_ITEMS = Arrays.stream(BoPWoods.values()).map(type -> Pair.of(type, ITEMS.register(type.getSerializedName() + "_table", () -> new FuelBlockItem(ECBoPBlocks.BOP_TABLE_BLOCKS.get(type).get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT_FURNITURE), ECConstants.chairBurnTime)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<BoPWoods, RegistryObject<FuelBlockItem>> BOP_FANCY_TABLE_ITEMS = Arrays.stream(BoPWoods.values()).map(type -> Pair.of(type, ITEMS.register(type.getSerializedName() + "_fancy_table", () -> new FuelBlockItem(ECBoPBlocks.BOP_FANCY_TABLE_BLOCKS.get(type).get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT_FURNITURE), ECConstants.couchBurnTime)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<BoPWoods, RegistryObject<FuelBlockItem>> BOP_TERRACE_TABLE_ITEMS = Arrays.stream(BoPWoods.values()).map(type -> Pair.of(type, ITEMS.register(type.getSerializedName() + "_terrace_table", () -> new FuelBlockItem(ECBoPBlocks.BOP_TERRACE_TABLE_BLOCKS.get(type).get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT_FURNITURE), ECConstants.chairBurnTime)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<BoPWoods, RegistryObject<FuelBlockItem>> BOP_FANCY_DOOR_ITEMS = Arrays.stream(BoPWoods.values()).map(type -> Pair.of(type, ITEMS.register(type.getSerializedName() + "_fancy_door", () -> new FuelBlockItem(ECBoPBlocks.BOP_FANCY_DOOR_BLOCKS.get(type).get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT_FURNITURE), ECConstants.doorBurnTime)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<BoPWoods, RegistryObject<FuelBlockItem>> BOP_PLAIN_DOOR_ITEMS = Arrays.stream(BoPWoods.values()).map(type -> Pair.of(type, ITEMS.register(type.getSerializedName() + "_plain_door", () -> new FuelBlockItem(ECBoPBlocks.BOP_PLAIN_DOOR_BLOCKS.get(type).get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT_FURNITURE), ECConstants.doorBurnTime)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<BoPWoods, RegistryObject<FuelBlockItem>> BOP_SUSPENDED_STAIRS_ITEMS = Arrays.stream(BoPWoods.values()).map(type -> Pair.of(type, ITEMS.register(type.getSerializedName() + "_suspended_stairs", () -> new FuelBlockItem(ECBoPBlocks.BOP_SUSPENDED_STAIRS_BLOCKS.get(type).get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT_FURNITURE), ECConstants.suspendedStairBurnTime)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<BoPWoods, RegistryObject<FuelBlockItem>> BOP_LARGE_SUSPENDED_STAIRS_ITEMS = Arrays.stream(BoPWoods.values()).map(type -> Pair.of(type, ITEMS.register(type.getSerializedName() + "_large_suspended_stairs", () -> new FuelBlockItem(ECBoPBlocks.BOP_LARGE_SUSPENDED_STAIRS_BLOCKS.get(type).get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT_FURNITURE), ECConstants.largeSuspendedStairBurnTime)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<BoPWoods, RegistryObject<BlockItem>> BOP_WOODEN_CRATE_ITEMS = Arrays.stream(BoPWoods.values()).map(type -> Pair.of(type, ITEMS.register(type.getSerializedName() + "_wooden_crate", () -> new BlockItem(ECBoPBlocks.BOP_WOODEN_CRATE_BLOCKS.get(type).get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT_FURNITURE).stacksTo(1))))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<DyeColor, RegistryObject<FuelBlockItem>> CHERRY_FANCY_BED_ITEMS = Arrays.stream(DyeColor.values()).map(type -> Pair.of(type, ITEMS.register(type.getSerializedName() + "_cherry_fancy_bed", () -> new FuelBlockItem(ECBoPBlocks.CHERRY_FANCY_BED_BLOCKS.get(type).get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT_FURNITURE), ECConstants.bedBurnTime)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));
    public static final Map<DyeColor, RegistryObject<FuelBlockItem>> DEAD_FANCY_BED_ITEMS = Arrays.stream(DyeColor.values()).map(type -> Pair.of(type, ITEMS.register(type.getSerializedName() + "_dead_fancy_bed", () -> new FuelBlockItem(ECBoPBlocks.DEAD_FANCY_BED_BLOCKS.get(type).get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT_FURNITURE), ECConstants.bedBurnTime)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));
    public static final Map<DyeColor, RegistryObject<FuelBlockItem>> FIR_FANCY_BED_ITEMS = Arrays.stream(DyeColor.values()).map(type -> Pair.of(type, ITEMS.register(type.getSerializedName() + "_fir_fancy_bed", () -> new FuelBlockItem(ECBoPBlocks.FIR_FANCY_BED_BLOCKS.get(type).get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT_FURNITURE), ECConstants.bedBurnTime)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));
    public static final Map<DyeColor, RegistryObject<BlockItem>> HELLBARK_FANCY_BED_ITEMS = Arrays.stream(DyeColor.values()).map(type -> Pair.of(type, ITEMS.register(type.getSerializedName() + "_hellbark_fancy_bed", () -> new BlockItem(ECBoPBlocks.HELLBARK_FANCY_BED_BLOCKS.get(type).get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT_FURNITURE))))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));
    public static final Map<DyeColor, RegistryObject<FuelBlockItem>> JACARANDA_FANCY_BED_ITEMS = Arrays.stream(DyeColor.values()).map(type -> Pair.of(type, ITEMS.register(type.getSerializedName() + "_jacaranda_fancy_bed", () -> new FuelBlockItem(ECBoPBlocks.JACARANDA_FANCY_BED_BLOCKS.get(type).get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT_FURNITURE), ECConstants.bedBurnTime)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));
    public static final Map<DyeColor, RegistryObject<FuelBlockItem>> MAGIC_FANCY_BED_ITEMS = Arrays.stream(DyeColor.values()).map(type -> Pair.of(type, ITEMS.register(type.getSerializedName() + "_magic_fancy_bed", () -> new FuelBlockItem(ECBoPBlocks.MAGIC_FANCY_BED_BLOCKS.get(type).get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT_FURNITURE), ECConstants.bedBurnTime)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));
    public static final Map<DyeColor, RegistryObject<FuelBlockItem>> MAHOGANY_FANCY_BED_ITEMS = Arrays.stream(DyeColor.values()).map(type -> Pair.of(type, ITEMS.register(type.getSerializedName() + "_mahogany_fancy_bed", () -> new FuelBlockItem(ECBoPBlocks.MAHOGANY_FANCY_BED_BLOCKS.get(type).get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT_FURNITURE), ECConstants.bedBurnTime)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));
    public static final Map<DyeColor, RegistryObject<FuelBlockItem>> PALM_FANCY_BED_ITEMS = Arrays.stream(DyeColor.values()).map(type -> Pair.of(type, ITEMS.register(type.getSerializedName() + "_palm_fancy_bed", () -> new FuelBlockItem(ECBoPBlocks.PALM_FANCY_BED_BLOCKS.get(type).get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT_FURNITURE), ECConstants.bedBurnTime)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));
    public static final Map<DyeColor, RegistryObject<FuelBlockItem>> REDWOOD_FANCY_BED_ITEMS = Arrays.stream(DyeColor.values()).map(type -> Pair.of(type, ITEMS.register(type.getSerializedName() + "_redwood_fancy_bed", () -> new FuelBlockItem(ECBoPBlocks.REDWOOD_FANCY_BED_BLOCKS.get(type).get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT_FURNITURE), ECConstants.bedBurnTime)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));
    public static final Map<DyeColor, RegistryObject<FuelBlockItem>> UMBRAN_FANCY_BED_ITEMS = Arrays.stream(DyeColor.values()).map(type -> Pair.of(type, ITEMS.register(type.getSerializedName() + "_umbran_fancy_bed", () -> new FuelBlockItem(ECBoPBlocks.UMBRAN_FANCY_BED_BLOCKS.get(type).get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT_FURNITURE), ECConstants.bedBurnTime)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));
    public static final Map<DyeColor, RegistryObject<FuelBlockItem>> WILLOW_FANCY_BED_ITEMS = Arrays.stream(DyeColor.values()).map(type -> Pair.of(type, ITEMS.register(type.getSerializedName() + "_willow_fancy_bed", () -> new FuelBlockItem(ECBoPBlocks.WILLOW_FANCY_BED_BLOCKS.get(type).get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT_FURNITURE), ECConstants.bedBurnTime)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    // public static final Map<BoPWoods, RegistryObject<FuelBlockItem>> BOP_FANCY_CHEST_ITEMS = Arrays.stream(BoPWoods.values()).map(type -> Pair.of(type, ITEMS.register(type.getSerializedName() +
    // "_fancy_chest", () -> new FuelBlockItem(ECBoPBlocks.BOP_FANCY_CHEST_BLOCKS.get(type).get(), new Item.Properties().tab(ModItemGroups.EMBELLISHCRAFT_FURNITURE),
    // ECConstants.chestBurnTime)))).collect(Collectors.toMap(Pair::getKey, Pair::getValue));

    public static void init()
    {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}