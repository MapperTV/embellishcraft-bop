package tv.mapper.embellishcraftbop.data.gen;

import net.minecraft.block.Block;
import net.minecraft.data.BlockTagsProvider;
import net.minecraft.data.DataGenerator;
import net.minecraft.tags.BlockTags;
import tv.mapper.embellishcraft.init.ECTags;
import tv.mapper.embellishcraftbop.init.ECBoPBlocks;

public class ECBoPBlockTags extends BlockTagsProvider
{

    public ECBoPBlockTags(DataGenerator generatorIn)
    {
        super(generatorIn);
    }

    public void registerTags()
    {
        for(Block block : ECBoPBlocks.CHAIRS)
        {
            getBuilder(ECTags.ForgeBlocks.CHAIRS).add(block);
        }

        for(Block block : ECBoPBlocks.TERRACE_CHAIRS)
        {
            getBuilder(ECTags.ForgeBlocks.CHAIRS).add(block);
        }

        for(Block block : ECBoPBlocks.TABLES)
        {
            getBuilder(ECTags.ForgeBlocks.TABLES).add(block);
        }

        for(Block block : ECBoPBlocks.TERRACE_TABLES)
        {
            getBuilder(ECTags.ForgeBlocks.TABLES).add(block);
        }

        for(Block block : ECBoPBlocks.FANCY_TABLES)
        {
            getBuilder(ECTags.ForgeBlocks.TABLES).add(block);
        }

        for(Block block : ECBoPBlocks.FANCY_DOORS)
        {
            getBuilder(ECTags.Blocks.WOODEN_DOORS).add(block);
        }

        // for(Block block : ECBoPBlocks.SUSPENDED_STAIRS)
        // {}

        for(Block block : ECBoPBlocks.CRATES)
        {
            getBuilder(ECTags.Blocks.WOODEN_CRATES).add(block);
        }

        for(Block block : ECBoPBlocks.FANCY_BEDS)
        {
            getBuilder(ECTags.Blocks.FANCY_BEDS).add(block);
        }

        getBuilder(BlockTags.WOODEN_DOORS).add(ECTags.Blocks.WOODEN_DOORS);
        getBuilder(BlockTags.BEDS).add(ECTags.Blocks.FANCY_BEDS);
        getBuilder(ECTags.ForgeBlocks.CRATES).add(ECTags.Blocks.WOODEN_CRATES);
    }
}