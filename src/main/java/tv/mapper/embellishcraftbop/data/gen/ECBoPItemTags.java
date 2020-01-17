package tv.mapper.embellishcraftbop.data.gen;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import tv.mapper.embellishcraftbop.init.ECBoPTags;

public class ECBoPItemTags extends ItemTagsProvider
{

    public ECBoPItemTags(DataGenerator generatorIn)
    {
        super(generatorIn);
    }

    public void registerTags()
    {
        copy(ECBoPTags.ForgeBlocks.CHAIRS, ECBoPTags.ForgeItems.CHAIRS);
        copy(ECBoPTags.ForgeBlocks.TABLES, ECBoPTags.ForgeItems.TABLES);

        copy(ECBoPTags.Blocks.WOODEN_DOORS, ECBoPTags.Items.WOODEN_DOORS);
        copy(ECBoPTags.Blocks.WOODEN_CRATES, ECBoPTags.Items.WOODEN_CRATES);

        getBuilder(ItemTags.WOODEN_DOORS).add(ECBoPTags.Items.WOODEN_DOORS);
    }
}
