package tv.mapper.embellishcraftbop.data.gen;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.ItemTagsProvider;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraftforge.common.Tags;
import tv.mapper.embellishcraft.data.ECTags;

public class ECBoPItemTags extends ItemTagsProvider
{

    public ECBoPItemTags(DataGenerator generatorIn)
    {
        super(generatorIn);
    }

    public void registerTags()
    {
        copy(ECTags.ForgeBlocks.CHAIRS, ECTags.ForgeItems.CHAIRS);
        copy(ECTags.ForgeBlocks.TABLES, ECTags.ForgeItems.TABLES);

        copy(ECTags.Blocks.WOODEN_DOORS, ECTags.Items.WOODEN_DOORS);
        copy(BlockTags.WOODEN_DOORS, ItemTags.WOODEN_DOORS);
        copy(BlockTags.DOORS, ItemTags.DOORS);

        copy(ECTags.Blocks.WOODEN_CRATES, ECTags.Items.WOODEN_CRATES);
        copy(ECTags.ForgeBlocks.CRATES, ECTags.ForgeItems.CRATES);

        copy(ECTags.Blocks.FANCY_BEDS, ECTags.Items.FANCY_BEDS);
        copy(BlockTags.BEDS, ItemTags.BEDS);

        copy(Tags.Blocks.CHESTS_WOODEN, Tags.Items.CHESTS_WOODEN);
    }
}