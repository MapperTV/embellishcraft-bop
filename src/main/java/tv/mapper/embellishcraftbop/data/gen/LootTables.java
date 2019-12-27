package tv.mapper.embellishcraftbop.data.gen;

import net.minecraft.data.DataGenerator;
import tv.mapper.embellishcraftbop.init.ModBlocks;

public class LootTables extends BaseLootTableProvider
{

    public LootTables(DataGenerator dataGeneratorIn)
    {
        super(dataGeneratorIn);
    }

    @Override
    protected void addTables()
    {
        lootTables.put(ModBlocks.CHERRY_CHAIR, createStandardTable("cherry_chair", ModBlocks.CHERRY_CHAIR));
    }
}