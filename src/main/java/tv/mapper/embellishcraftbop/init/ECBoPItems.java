package tv.mapper.embellishcraftbop.init;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

import org.apache.commons.lang3.tuple.Pair;

import net.minecraft.item.BlockItem;
import net.minecraft.item.DyeColor;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import tv.mapper.embellishcraft.ECConstants;
import tv.mapper.embellishcraft.item.FuelBlockItem;
import tv.mapper.embellishcraft.item.ModItemGroups;
import tv.mapper.embellishcraftbop.EmbellishCraftBOP;
import tv.mapper.embellishcraftbop.util.BoPWoods;

public class ECBoPItems
{
    private static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, EmbellishCraftBOP.MODID);

    public static final Map<BoPWoods, RegistryObject<FuelBlockItem>> BOP_CHAIRS_ITEMS = Arrays.stream(BoPWoods.values()).map(type -> Pair.of(type,
        ITEMS.register(type.getName() + "_chair",
            () -> new FuelBlockItem(ECBoPBlocks.BOP_CHAIR_BLOCKS.get(type).get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), ECConstants.chairBurnTime)))).collect(
                Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<BoPWoods, RegistryObject<FuelBlockItem>> BOP_TERRACE_CHAIRS_ITEMS = Arrays.stream(BoPWoods.values()).map(type -> Pair.of(type,
        ITEMS.register(type.getName() + "_terrace_chair",
            () -> new FuelBlockItem(ECBoPBlocks.BOP_TERRACE_CHAIR_BLOCKS.get(type).get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), ECConstants.chairBurnTime)))).collect(
                Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<BoPWoods, RegistryObject<FuelBlockItem>> BOP_TABLE_ITEMS = Arrays.stream(BoPWoods.values()).map(type -> Pair.of(type,
        ITEMS.register(type.getName() + "_table",
            () -> new FuelBlockItem(ECBoPBlocks.BOP_TABLE_BLOCKS.get(type).get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), ECConstants.chairBurnTime)))).collect(
                Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<BoPWoods, RegistryObject<FuelBlockItem>> BOP_FANCY_TABLE_ITEMS = Arrays.stream(BoPWoods.values()).map(type -> Pair.of(type,
        ITEMS.register(type.getName() + "_fancy_table",
            () -> new FuelBlockItem(ECBoPBlocks.BOP_FANCY_TABLE_BLOCKS.get(type).get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), ECConstants.couchBurnTime)))).collect(
                Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<BoPWoods, RegistryObject<FuelBlockItem>> BOP_TERRACE_TABLE_ITEMS = Arrays.stream(BoPWoods.values()).map(type -> Pair.of(type,
        ITEMS.register(type.getName() + "_terrace_table",
            () -> new FuelBlockItem(ECBoPBlocks.BOP_TERRACE_TABLE_BLOCKS.get(type).get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), ECConstants.chairBurnTime)))).collect(
                Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<BoPWoods, RegistryObject<FuelBlockItem>> BOP_FANCY_DOOR_ITEMS = Arrays.stream(BoPWoods.values()).map(type -> Pair.of(type,
        ITEMS.register(type.getName() + "_fancy_door",
            () -> new FuelBlockItem(ECBoPBlocks.BOP_FANCY_DOOR_BLOCKS.get(type).get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), ECConstants.doorBurnTime)))).collect(
                Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<BoPWoods, RegistryObject<FuelBlockItem>> BOP_SUSPENDED_STAIRS_ITEMS = Arrays.stream(BoPWoods.values()).map(type -> Pair.of(type,
        ITEMS.register(type.getName() + "_suspended_stairs",
            () -> new FuelBlockItem(ECBoPBlocks.BOP_SUSPENDED_STAIRS_BLOCKS.get(type).get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), ECConstants.suspendedStairBurnTime)))).collect(
                Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<BoPWoods, RegistryObject<BlockItem>> BOP_WOODEN_CRATE_ITEMS = Arrays.stream(BoPWoods.values()).map(type -> Pair.of(type,
        ITEMS.register(type.getName() + "_wooden_crate",
            () -> new BlockItem(ECBoPBlocks.BOP_WOODEN_CRATE_BLOCKS.get(type).get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT).maxStackSize(1))))).collect(
                Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<DyeColor, RegistryObject<FuelBlockItem>> CHERRY_FANCY_BED_ITEMS = Arrays.stream(DyeColor.values()).map(type -> Pair.of(type,
        ITEMS.register(type.getName() + "_cherry_fancy_bed",
            () -> new FuelBlockItem(ECBoPBlocks.CHERRY_FANCY_BED_BLOCKS.get(type).get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), ECConstants.bedBurnTime)))).collect(
                Collectors.toMap(Pair::getKey, Pair::getValue));
    public static final Map<DyeColor, RegistryObject<FuelBlockItem>> DEAD_FANCY_BED_ITEMS = Arrays.stream(DyeColor.values()).map(type -> Pair.of(type,
        ITEMS.register(type.getName() + "_dead_fancy_bed",
            () -> new FuelBlockItem(ECBoPBlocks.DEAD_FANCY_BED_BLOCKS.get(type).get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), ECConstants.bedBurnTime)))).collect(
                Collectors.toMap(Pair::getKey, Pair::getValue));
    public static final Map<DyeColor, RegistryObject<FuelBlockItem>> FIR_FANCY_BED_ITEMS = Arrays.stream(DyeColor.values()).map(type -> Pair.of(type,
        ITEMS.register(type.getName() + "_fir_fancy_bed",
            () -> new FuelBlockItem(ECBoPBlocks.FIR_FANCY_BED_BLOCKS.get(type).get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), ECConstants.bedBurnTime)))).collect(
                Collectors.toMap(Pair::getKey, Pair::getValue));
    public static final Map<DyeColor, RegistryObject<FuelBlockItem>> HELLBARK_FANCY_BED_ITEMS = Arrays.stream(DyeColor.values()).map(type -> Pair.of(type,
        ITEMS.register(type.getName() + "_hellbark_fancy_bed",
            () -> new FuelBlockItem(ECBoPBlocks.HELLBARK_FANCY_BED_BLOCKS.get(type).get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), ECConstants.bedBurnTime)))).collect(
                Collectors.toMap(Pair::getKey, Pair::getValue));
    public static final Map<DyeColor, RegistryObject<FuelBlockItem>> JACARANDA_FANCY_BED_ITEMS = Arrays.stream(DyeColor.values()).map(type -> Pair.of(type,
        ITEMS.register(type.getName() + "_jacaranda_fancy_bed",
            () -> new FuelBlockItem(ECBoPBlocks.JACARANDA_FANCY_BED_BLOCKS.get(type).get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), ECConstants.bedBurnTime)))).collect(
                Collectors.toMap(Pair::getKey, Pair::getValue));
    public static final Map<DyeColor, RegistryObject<FuelBlockItem>> MAGIC_FANCY_BED_ITEMS = Arrays.stream(DyeColor.values()).map(type -> Pair.of(type,
        ITEMS.register(type.getName() + "_magic_fancy_bed",
            () -> new FuelBlockItem(ECBoPBlocks.MAGIC_FANCY_BED_BLOCKS.get(type).get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), ECConstants.bedBurnTime)))).collect(
                Collectors.toMap(Pair::getKey, Pair::getValue));
    public static final Map<DyeColor, RegistryObject<FuelBlockItem>> MAHOGANY_FANCY_BED_ITEMS = Arrays.stream(DyeColor.values()).map(type -> Pair.of(type,
        ITEMS.register(type.getName() + "_mahogany_fancy_bed",
            () -> new FuelBlockItem(ECBoPBlocks.MAHOGANY_FANCY_BED_BLOCKS.get(type).get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), ECConstants.bedBurnTime)))).collect(
                Collectors.toMap(Pair::getKey, Pair::getValue));
    public static final Map<DyeColor, RegistryObject<FuelBlockItem>> PALM_FANCY_BED_ITEMS = Arrays.stream(DyeColor.values()).map(type -> Pair.of(type,
        ITEMS.register(type.getName() + "_palm_fancy_bed",
            () -> new FuelBlockItem(ECBoPBlocks.PALM_FANCY_BED_BLOCKS.get(type).get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), ECConstants.bedBurnTime)))).collect(
                Collectors.toMap(Pair::getKey, Pair::getValue));
    public static final Map<DyeColor, RegistryObject<FuelBlockItem>> REDWOOD_FANCY_BED_ITEMS = Arrays.stream(DyeColor.values()).map(type -> Pair.of(type,
        ITEMS.register(type.getName() + "_redwood_fancy_bed",
            () -> new FuelBlockItem(ECBoPBlocks.REDWOOD_FANCY_BED_BLOCKS.get(type).get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), ECConstants.bedBurnTime)))).collect(
                Collectors.toMap(Pair::getKey, Pair::getValue));
    public static final Map<DyeColor, RegistryObject<FuelBlockItem>> UMBRAN_FANCY_BED_ITEMS = Arrays.stream(DyeColor.values()).map(type -> Pair.of(type,
        ITEMS.register(type.getName() + "_umbran_fancy_bed",
            () -> new FuelBlockItem(ECBoPBlocks.UMBRAN_FANCY_BED_BLOCKS.get(type).get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), ECConstants.bedBurnTime)))).collect(
                Collectors.toMap(Pair::getKey, Pair::getValue));
    public static final Map<DyeColor, RegistryObject<FuelBlockItem>> WILLOW_FANCY_BED_ITEMS = Arrays.stream(DyeColor.values()).map(type -> Pair.of(type,
        ITEMS.register(type.getName() + "_willow_fancy_bed",
            () -> new FuelBlockItem(ECBoPBlocks.WILLOW_FANCY_BED_BLOCKS.get(type).get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), ECConstants.bedBurnTime)))).collect(
                Collectors.toMap(Pair::getKey, Pair::getValue));

    public static final Map<BoPWoods, RegistryObject<FuelBlockItem>> BOP_FANCY_CHEST_ITEMS = Arrays.stream(BoPWoods.values()).map(type -> Pair.of(type,
        ITEMS.register(type.getName() + "_fancy_chest",
            () -> new FuelBlockItem(ECBoPBlocks.BOP_FANCY_CHEST_BLOCKS.get(type).get(), new Item.Properties().group(ModItemGroups.EMBELLISHCRAFT), ECConstants.chestBurnTime)))).collect(
                Collectors.toMap(Pair::getKey, Pair::getValue));

    public static void init()
    {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}