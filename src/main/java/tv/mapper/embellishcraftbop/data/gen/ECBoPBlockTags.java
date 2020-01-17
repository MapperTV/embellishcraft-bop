package tv.mapper.embellishcraftbop.data.gen;

import net.minecraft.block.Block;
import net.minecraft.data.BlockTagsProvider;
import net.minecraft.data.DataGenerator;
import net.minecraft.tags.BlockTags;
import tv.mapper.embellishcraftbop.init.ECBoPBlocks;
import tv.mapper.embellishcraftbop.init.ECBoPTags;

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
            getBuilder(ECBoPTags.ForgeBlocks.CHAIRS).add(block);
        }

        for(Block block : ECBoPBlocks.TERRACE_CHAIRS)
        {
            getBuilder(ECBoPTags.ForgeBlocks.CHAIRS).add(block);
        }

        for(Block block : ECBoPBlocks.TABLES)
        {
            getBuilder(ECBoPTags.ForgeBlocks.TABLES).add(block);
        }

        for(Block block : ECBoPBlocks.TERRACE_TABLES)
        {
            getBuilder(ECBoPTags.ForgeBlocks.TABLES).add(block);
        }

        for(Block block : ECBoPBlocks.FANCY_TABLES)
        {
            getBuilder(ECBoPTags.ForgeBlocks.TABLES).add(block);
        }

        for(Block block : ECBoPBlocks.FANCY_DOORS)
        {
            getBuilder(ECBoPTags.Blocks.WOODEN_DOORS).add(block);
        }

        // for(Block block : ECBoPBlocks.SUSPENDED_STAIRS)
        // {}

        for(Block block : ECBoPBlocks.CRATES)
        {
            getBuilder(ECBoPTags.Blocks.WOODEN_CRATES).add(block);
        }

        getBuilder(BlockTags.WOODEN_DOORS).add(ECBoPTags.Blocks.WOODEN_DOORS);
    }
}