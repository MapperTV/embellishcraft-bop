package tv.mapper.embellishcraftbop.data.gen;

import net.minecraft.block.Block;
import net.minecraft.data.DataGenerator;
import tv.mapper.embellishcraftbop.init.ECBoPBlocks;

public class ECBoPLootTables extends ECBoPLootTableProvider
{

    public ECBoPLootTables(DataGenerator dataGeneratorIn)
    {
        super(dataGeneratorIn);
    }

    @Override
    protected void addTables()
    {
        for(Block block : ECBoPBlocks.CHAIRS)
            lootTables.put(block, createStandardTable(block.getTranslationKey(), block));

        for(Block block : ECBoPBlocks.TERRACE_CHAIRS)
            lootTables.put(block, createStandardTable(block.getTranslationKey(), block));

        for(Block block : ECBoPBlocks.TABLES)
            lootTables.put(block, createStandardTable(block.getTranslationKey(), block));

        for(Block block : ECBoPBlocks.TERRACE_TABLES)
            lootTables.put(block, createStandardTable(block.getTranslationKey(), block));

        for(Block block : ECBoPBlocks.FANCY_TABLES)
            lootTables.put(block, createStandardTable(block.getTranslationKey(), block));

        for(Block block : ECBoPBlocks.FANCY_DOORS)
            lootTables.put(block, createDoorTable(block.getTranslationKey(), block));

        for(Block block : ECBoPBlocks.SUSPENDED_STAIRS)
            lootTables.put(block, createStandardTable(block.getTranslationKey(), block));

        for(Block block : ECBoPBlocks.CRATES)
            lootTables.put(block, createCrateTable(block.getTranslationKey(), block));

        for(Block block : ECBoPBlocks.FANCY_BEDS)
            lootTables.put(block, createBedTable(block.getTranslationKey(), block));

    }
}