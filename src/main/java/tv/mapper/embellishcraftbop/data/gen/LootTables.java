package tv.mapper.embellishcraftbop.data.gen;

import net.minecraft.block.Block;
import net.minecraft.data.DataGenerator;
import tv.mapper.embellishcraftbop.init.ECBoPBlocks;

public class LootTables extends BaseLootTableProvider
{

    public LootTables(DataGenerator dataGeneratorIn)
    {
        super(dataGeneratorIn);
    }

    @Override
    protected void addTables()
    {
        for(Block block : ECBoPBlocks.CHAIRS)
            lootTables.put(block, createStandardTable(block.getTranslationKey(), block));
    }
}