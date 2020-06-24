package tv.mapper.embellishcraftbop.data.gen;

import java.util.Arrays;

import net.minecraft.data.BlockTagsProvider;
import net.minecraft.data.DataGenerator;
import net.minecraft.item.DyeColor;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.Tags;
import tv.mapper.embellishcraft.data.ECTags;
import tv.mapper.embellishcraftbop.init.ECBoPBlocks;
import tv.mapper.embellishcraftbop.util.BoPWoods;

public class ECBoPBlockTags extends BlockTagsProvider
{

    public ECBoPBlockTags(DataGenerator generatorIn)
    {
        super(generatorIn);
    }

    public void registerTags()
    {
        for(int j = 0; j < Arrays.stream(BoPWoods.values()).count(); j++)
        {
            this.getBuilder(ECTags.ForgeBlocks.CHAIRS).add(ECBoPBlocks.BOP_CHAIR_BLOCKS.get(BoPWoods.byId(j)).get());
            this.getBuilder(ECTags.ForgeBlocks.CHAIRS).add(ECBoPBlocks.BOP_TERRACE_CHAIR_BLOCKS.get(BoPWoods.byId(j)).get());
            this.getBuilder(ECTags.ForgeBlocks.TABLES).add(ECBoPBlocks.BOP_TABLE_BLOCKS.get(BoPWoods.byId(j)).get());
            this.getBuilder(ECTags.ForgeBlocks.TABLES).add(ECBoPBlocks.BOP_FANCY_TABLE_BLOCKS.get(BoPWoods.byId(j)).get());
            this.getBuilder(ECTags.ForgeBlocks.TABLES).add(ECBoPBlocks.BOP_TERRACE_TABLE_BLOCKS.get(BoPWoods.byId(j)).get());
            this.getBuilder(ECTags.Blocks.WOODEN_DOORS).add(ECBoPBlocks.BOP_FANCY_DOOR_BLOCKS.get(BoPWoods.byId(j)).get());
            this.getBuilder(ECTags.Blocks.WOODEN_DOORS).add(ECBoPBlocks.BOP_PLAIN_DOOR_BLOCKS.get(BoPWoods.byId(j)).get());
            this.getBuilder(BlockTags.DOORS).add(ECBoPBlocks.BOP_FANCY_DOOR_BLOCKS.get(BoPWoods.byId(j)).get());
            this.getBuilder(BlockTags.DOORS).add(ECBoPBlocks.BOP_PLAIN_DOOR_BLOCKS.get(BoPWoods.byId(j)).get());
            this.getBuilder(ECTags.Blocks.WOODEN_CRATES).add(ECBoPBlocks.BOP_WOODEN_CRATE_BLOCKS.get(BoPWoods.byId(j)).get());
            this.getBuilder(Tags.Blocks.CHESTS).add(ECBoPBlocks.BOP_FANCY_CHEST_BLOCKS.get(BoPWoods.byId(j)).get());
            this.getBuilder(Tags.Blocks.CHESTS_WOODEN).add(ECBoPBlocks.BOP_FANCY_CHEST_BLOCKS.get(BoPWoods.byId(j)).get());
        }

        for(int i = 0; i < Arrays.stream(DyeColor.values()).count(); i++)
        {
            this.getBuilder(ECTags.Blocks.FANCY_BEDS).add(ECBoPBlocks.CHERRY_FANCY_BED_BLOCKS.get(DyeColor.byId(i)).get());
            this.getBuilder(ECTags.Blocks.FANCY_BEDS).add(ECBoPBlocks.DEAD_FANCY_BED_BLOCKS.get(DyeColor.byId(i)).get());
            this.getBuilder(ECTags.Blocks.FANCY_BEDS).add(ECBoPBlocks.FIR_FANCY_BED_BLOCKS.get(DyeColor.byId(i)).get());
            this.getBuilder(ECTags.Blocks.FANCY_BEDS).add(ECBoPBlocks.HELLBARK_FANCY_BED_BLOCKS.get(DyeColor.byId(i)).get());
            this.getBuilder(ECTags.Blocks.FANCY_BEDS).add(ECBoPBlocks.JACARANDA_FANCY_BED_BLOCKS.get(DyeColor.byId(i)).get());
            this.getBuilder(ECTags.Blocks.FANCY_BEDS).add(ECBoPBlocks.MAGIC_FANCY_BED_BLOCKS.get(DyeColor.byId(i)).get());
            this.getBuilder(ECTags.Blocks.FANCY_BEDS).add(ECBoPBlocks.MAHOGANY_FANCY_BED_BLOCKS.get(DyeColor.byId(i)).get());
            this.getBuilder(ECTags.Blocks.FANCY_BEDS).add(ECBoPBlocks.PALM_FANCY_BED_BLOCKS.get(DyeColor.byId(i)).get());
            this.getBuilder(ECTags.Blocks.FANCY_BEDS).add(ECBoPBlocks.REDWOOD_FANCY_BED_BLOCKS.get(DyeColor.byId(i)).get());
            this.getBuilder(ECTags.Blocks.FANCY_BEDS).add(ECBoPBlocks.UMBRAN_FANCY_BED_BLOCKS.get(DyeColor.byId(i)).get());
            this.getBuilder(ECTags.Blocks.FANCY_BEDS).add(ECBoPBlocks.WILLOW_FANCY_BED_BLOCKS.get(DyeColor.byId(i)).get());
        }

        getBuilder(BlockTags.WOODEN_DOORS).add(ECTags.Blocks.WOODEN_DOORS);
        getBuilder(BlockTags.DOORS).add(ECTags.Blocks.WOODEN_DOORS);
        getBuilder(BlockTags.BEDS).add(ECTags.Blocks.FANCY_BEDS);
        getBuilder(ECTags.ForgeBlocks.CRATES).add(ECTags.Blocks.WOODEN_CRATES);
    }
}