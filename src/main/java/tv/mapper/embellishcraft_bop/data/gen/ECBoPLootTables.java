package tv.mapper.embellishcraft_bop.data.gen;

import java.util.Arrays;

import net.minecraft.data.DataGenerator;
import net.minecraft.world.item.DyeColor;
import tv.mapper.embellishcraft.core.data.gen.ECLootTables;
import tv.mapper.embellishcraft_bop.EmbellishCraftBOP;
import tv.mapper.embellishcraft_bop.init.ECBoPBlocks;
import tv.mapper.embellishcraft_bop.util.BoPWoods;

public class ECBoPLootTables extends ECLootTables
{
    public ECBoPLootTables(DataGenerator dataGeneratorIn)
    {
        super(dataGeneratorIn);
    }

    @Override
    protected void addTables()
    {
        for(int j = 0; j < Arrays.stream(BoPWoods.values()).count(); j++)
        {
            lootTables.put(ECBoPBlocks.BOP_CHAIR_BLOCKS.get(BoPWoods.byId(j)).get(), createStandardTable(EmbellishCraftBOP.MODID, ECBoPBlocks.BOP_CHAIR_BLOCKS.get(BoPWoods.byId(j)).get()));
            lootTables.put(ECBoPBlocks.BOP_TERRACE_CHAIR_BLOCKS.get(BoPWoods.byId(j)).get(), createStandardTable(EmbellishCraftBOP.MODID, ECBoPBlocks.BOP_TERRACE_CHAIR_BLOCKS.get(BoPWoods.byId(j)).get()));
            lootTables.put(ECBoPBlocks.BOP_TABLE_BLOCKS.get(BoPWoods.byId(j)).get(), createStandardTable(EmbellishCraftBOP.MODID, ECBoPBlocks.BOP_TABLE_BLOCKS.get(BoPWoods.byId(j)).get()));
            lootTables.put(ECBoPBlocks.BOP_FANCY_TABLE_BLOCKS.get(BoPWoods.byId(j)).get(), createStandardTable(EmbellishCraftBOP.MODID, ECBoPBlocks.BOP_FANCY_TABLE_BLOCKS.get(BoPWoods.byId(j)).get()));
            lootTables.put(ECBoPBlocks.BOP_FANCY_DOOR_BLOCKS.get(BoPWoods.byId(j)).get(), createDoorTable(EmbellishCraftBOP.MODID, ECBoPBlocks.BOP_FANCY_DOOR_BLOCKS.get(BoPWoods.byId(j)).get()));
            lootTables.put(ECBoPBlocks.BOP_PLAIN_DOOR_BLOCKS.get(BoPWoods.byId(j)).get(), createDoorTable(EmbellishCraftBOP.MODID, ECBoPBlocks.BOP_PLAIN_DOOR_BLOCKS.get(BoPWoods.byId(j)).get()));
            lootTables.put(ECBoPBlocks.BOP_TERRACE_TABLE_BLOCKS.get(BoPWoods.byId(j)).get(), createStandardTable(EmbellishCraftBOP.MODID, ECBoPBlocks.BOP_TERRACE_TABLE_BLOCKS.get(BoPWoods.byId(j)).get()));
            lootTables.put(ECBoPBlocks.BOP_SUSPENDED_STAIRS_BLOCKS.get(BoPWoods.byId(j)).get(), createStandardTable(EmbellishCraftBOP.MODID, ECBoPBlocks.BOP_SUSPENDED_STAIRS_BLOCKS.get(BoPWoods.byId(j)).get()));
            lootTables.put(ECBoPBlocks.BOP_LARGE_SUSPENDED_STAIRS_BLOCKS.get(BoPWoods.byId(j)).get(), createStandardTable(EmbellishCraftBOP.MODID, ECBoPBlocks.BOP_LARGE_SUSPENDED_STAIRS_BLOCKS.get(BoPWoods.byId(j)).get()));
            lootTables.put(ECBoPBlocks.BOP_WOODEN_CRATE_BLOCKS.get(BoPWoods.byId(j)).get(), createCrateTable(EmbellishCraftBOP.MODID, ECBoPBlocks.BOP_WOODEN_CRATE_BLOCKS.get(BoPWoods.byId(j)).get()));
            // lootTables.put(ECBoPBlocks.BOP_FANCY_CHEST_BLOCKS.get(BoPWoods.byId(j)).get(), createChestTable(BoPWoods.byId(j).getSerializedName() + "_fancy_chest",
            // ECBoPBlocks.BOP_FANCY_CHEST_BLOCKS.get(BoPWoods.byId(j)).get()));
        }

        for(int j = 0; j < Arrays.stream(DyeColor.values()).count(); j++)
        {
            lootTables.put(ECBoPBlocks.CHERRY_FANCY_BED_BLOCKS.get(DyeColor.byId(j)).get(), createBedTable(EmbellishCraftBOP.MODID, ECBoPBlocks.CHERRY_FANCY_BED_BLOCKS.get(DyeColor.byId(j)).get()));
            lootTables.put(ECBoPBlocks.DEAD_FANCY_BED_BLOCKS.get(DyeColor.byId(j)).get(), createBedTable(EmbellishCraftBOP.MODID, ECBoPBlocks.DEAD_FANCY_BED_BLOCKS.get(DyeColor.byId(j)).get()));
            lootTables.put(ECBoPBlocks.FIR_FANCY_BED_BLOCKS.get(DyeColor.byId(j)).get(), createBedTable(EmbellishCraftBOP.MODID, ECBoPBlocks.FIR_FANCY_BED_BLOCKS.get(DyeColor.byId(j)).get()));
            lootTables.put(ECBoPBlocks.HELLBARK_FANCY_BED_BLOCKS.get(DyeColor.byId(j)).get(), createBedTable(EmbellishCraftBOP.MODID, ECBoPBlocks.HELLBARK_FANCY_BED_BLOCKS.get(DyeColor.byId(j)).get()));
            lootTables.put(ECBoPBlocks.JACARANDA_FANCY_BED_BLOCKS.get(DyeColor.byId(j)).get(), createBedTable(EmbellishCraftBOP.MODID, ECBoPBlocks.JACARANDA_FANCY_BED_BLOCKS.get(DyeColor.byId(j)).get()));
            lootTables.put(ECBoPBlocks.MAGIC_FANCY_BED_BLOCKS.get(DyeColor.byId(j)).get(), createBedTable(EmbellishCraftBOP.MODID, ECBoPBlocks.MAGIC_FANCY_BED_BLOCKS.get(DyeColor.byId(j)).get()));
            lootTables.put(ECBoPBlocks.MAHOGANY_FANCY_BED_BLOCKS.get(DyeColor.byId(j)).get(), createBedTable(EmbellishCraftBOP.MODID, ECBoPBlocks.MAHOGANY_FANCY_BED_BLOCKS.get(DyeColor.byId(j)).get()));
            lootTables.put(ECBoPBlocks.PALM_FANCY_BED_BLOCKS.get(DyeColor.byId(j)).get(), createBedTable(EmbellishCraftBOP.MODID, ECBoPBlocks.PALM_FANCY_BED_BLOCKS.get(DyeColor.byId(j)).get()));
            lootTables.put(ECBoPBlocks.REDWOOD_FANCY_BED_BLOCKS.get(DyeColor.byId(j)).get(), createBedTable(EmbellishCraftBOP.MODID, ECBoPBlocks.REDWOOD_FANCY_BED_BLOCKS.get(DyeColor.byId(j)).get()));
            lootTables.put(ECBoPBlocks.UMBRAN_FANCY_BED_BLOCKS.get(DyeColor.byId(j)).get(), createBedTable(EmbellishCraftBOP.MODID, ECBoPBlocks.UMBRAN_FANCY_BED_BLOCKS.get(DyeColor.byId(j)).get()));
            lootTables.put(ECBoPBlocks.WILLOW_FANCY_BED_BLOCKS.get(DyeColor.byId(j)).get(), createBedTable(EmbellishCraftBOP.MODID, ECBoPBlocks.WILLOW_FANCY_BED_BLOCKS.get(DyeColor.byId(j)).get()));
        }
    }

    @Override
    public String getName()
    {
        return "EmbellishCraft-BOP LootTables";
    }
}