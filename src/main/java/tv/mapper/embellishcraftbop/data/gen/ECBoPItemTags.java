package tv.mapper.embellishcraftbop.data.gen;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import tv.mapper.embellishcraft.init.ECTags;

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
        copy(ECTags.Blocks.WOODEN_CRATES, ECTags.Items.WOODEN_CRATES);

        getBuilder(ItemTags.WOODEN_DOORS).add(ECTags.Items.WOODEN_DOORS);
    }
}
