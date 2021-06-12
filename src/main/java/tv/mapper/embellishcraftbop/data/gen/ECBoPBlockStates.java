package tv.mapper.embellishcraftbop.data.gen;

import net.minecraft.data.DataGenerator;
import net.minecraft.item.DyeColor;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.generators.ModelFile.UncheckedModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import tv.mapper.embellishcraft.data.gen.ECBlockStates;
import tv.mapper.embellishcraftbop.init.ECBoPBlocks;
import tv.mapper.embellishcraftbop.util.BoPWoods;

public class ECBoPBlockStates extends ECBlockStates
{
    public ECBoPBlockStates(DataGenerator gen, String modid, ExistingFileHelper exFileHelper)
    {
        super(gen, modid, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels()
    {
        for(int j = 0; j < BoPWoods.values().length; j++)
        {
            horizontalBlock(ECBoPBlocks.BOP_CHAIR_BLOCKS.get(BoPWoods.byId(j)).get(), new UncheckedModelFile(mod_id + ":block/" + BoPWoods.byId(j).getString() + "_chair"), 0);
            horizontalBlock(ECBoPBlocks.BOP_TERRACE_CHAIR_BLOCKS.get(BoPWoods.byId(j)).get(), new UncheckedModelFile(mod_id + ":block/" + BoPWoods.byId(j).getString() + "_terrace_chair"), 0);
            tableBlock(ECBoPBlocks.BOP_TABLE_BLOCKS.get(BoPWoods.byId(j)).get());
            tableBlock(ECBoPBlocks.BOP_FANCY_TABLE_BLOCKS.get(BoPWoods.byId(j)).get());
            simpleBlock(ECBoPBlocks.BOP_TERRACE_TABLE_BLOCKS.get(BoPWoods.byId(j)).get());
            simpleBlock(ECBoPBlocks.BOP_WOODEN_CRATE_BLOCKS.get(BoPWoods.byId(j)).get());
            // getVariantBuilder(ECBoPBlocks.FANCY_CHEST_BLOCKS.get(BoPWoods.byId(j)).get()).partialState().setModels(
            // new ConfiguredModel(new UncheckedModelFile(mod_id + ":model/" + BoPWoods.byId(j).getString() + "_fancy_chest")));
            chestBlock(ECBoPBlocks.BOP_FANCY_CHEST_BLOCKS.get(BoPWoods.byId(j)).get(), 0);
            horizontalBlock(ECBoPBlocks.BOP_SUSPENDED_STAIRS_BLOCKS.get(BoPWoods.byId(j)).get(), new UncheckedModelFile(mod_id + ":block/" + BoPWoods.byId(j).getString() + "_suspended_stairs"), 0);
            horizontalBlock(ECBoPBlocks.BOP_LARGE_SUSPENDED_STAIRS_BLOCKS.get(BoPWoods.byId(j)).get(), new UncheckedModelFile(mod_id + ":block/" + BoPWoods.byId(j).getString() + "_large_suspended_stairs"), 0);
            doorBlock(ECBoPBlocks.BOP_FANCY_DOOR_BLOCKS.get(BoPWoods.byId(j)).get(), new ResourceLocation(mod_id, "block/" + BoPWoods.byId(j).getString() + "_fancy_door_bottom"),
                new ResourceLocation(mod_id, "block/" + BoPWoods.byId(j).getString() + "_fancy_door_top"));
            doorBlock(ECBoPBlocks.BOP_PLAIN_DOOR_BLOCKS.get(BoPWoods.byId(j)).get(), new ResourceLocation(mod_id, "block/" + BoPWoods.byId(j).getString() + "_plain_door_bottom"),
                new ResourceLocation(mod_id, "block/" + BoPWoods.byId(j).getString() + "_plain_door_top"));
        }

        for(int j = 0; j < DyeColor.values().length; j++)
        {
            bedBlock(ECBoPBlocks.CHERRY_FANCY_BED_BLOCKS.get(DyeColor.byId(j)).get(), 180);
            bedBlock(ECBoPBlocks.DEAD_FANCY_BED_BLOCKS.get(DyeColor.byId(j)).get(), 180);
            bedBlock(ECBoPBlocks.FIR_FANCY_BED_BLOCKS.get(DyeColor.byId(j)).get(), 180);
            bedBlock(ECBoPBlocks.HELLBARK_FANCY_BED_BLOCKS.get(DyeColor.byId(j)).get(), 180);
            bedBlock(ECBoPBlocks.JACARANDA_FANCY_BED_BLOCKS.get(DyeColor.byId(j)).get(), 180);
            bedBlock(ECBoPBlocks.MAGIC_FANCY_BED_BLOCKS.get(DyeColor.byId(j)).get(), 180);
            bedBlock(ECBoPBlocks.MAHOGANY_FANCY_BED_BLOCKS.get(DyeColor.byId(j)).get(), 180);
            bedBlock(ECBoPBlocks.PALM_FANCY_BED_BLOCKS.get(DyeColor.byId(j)).get(), 180);
            bedBlock(ECBoPBlocks.REDWOOD_FANCY_BED_BLOCKS.get(DyeColor.byId(j)).get(), 180);
            bedBlock(ECBoPBlocks.UMBRAN_FANCY_BED_BLOCKS.get(DyeColor.byId(j)).get(), 180);
            bedBlock(ECBoPBlocks.WILLOW_FANCY_BED_BLOCKS.get(DyeColor.byId(j)).get(), 180);
        }
    }
}