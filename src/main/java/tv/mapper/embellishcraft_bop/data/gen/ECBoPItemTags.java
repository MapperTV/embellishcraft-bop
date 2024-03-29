package tv.mapper.embellishcraft_bop.data.gen;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;
import tv.mapper.embellishcraft.core.data.ECTags;
import tv.mapper.embellishcraft_bop.EmbellishCraftBOP;

public class ECBoPItemTags extends ItemTagsProvider
{
    public ECBoPItemTags(DataGenerator generatorIn, ECBoPBlockTags provider, ExistingFileHelper existingFileHelper)
    {
        super(generatorIn, provider, EmbellishCraftBOP.MODID, existingFileHelper);
    }

    @Override
    public void addTags()
    {
        copy(ECTags.ForgeBlocks.CHAIRS, ECTags.ForgeItems.CHAIRS);
        copy(ECTags.ForgeBlocks.TABLES, ECTags.ForgeItems.TABLES);

        copy(ECTags.Blocks.WOODEN_DOORS, ECTags.Items.WOODEN_DOORS);
        copy(BlockTags.WOODEN_DOORS, ItemTags.WOODEN_DOORS);
        copy(BlockTags.DOORS, ItemTags.DOORS);

        copy(ECTags.Blocks.WOODEN_CRATES, ECTags.Items.WOODEN_CRATES);
        copy(ECTags.ForgeBlocks.CRATES, ECTags.ForgeItems.CRATES);
        copy(ECTags.Blocks.SUSPENDED_STAIRS, ECTags.Items.SUSPENDED_STAIRS);

        copy(ECTags.Blocks.FANCY_BEDS, ECTags.Items.FANCY_BEDS);
        copy(BlockTags.BEDS, ItemTags.BEDS);

        copy(Tags.Blocks.CHESTS_WOODEN, Tags.Items.CHESTS_WOODEN);
    }
}