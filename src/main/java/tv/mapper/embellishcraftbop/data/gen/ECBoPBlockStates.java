package tv.mapper.embellishcraftbop.data.gen;

import java.util.Arrays;

import net.minecraft.data.DataGenerator;
import net.minecraft.item.DyeColor;
import net.minecraftforge.client.model.generators.ExistingFileHelper;
import net.minecraftforge.client.model.generators.ModelFile.UncheckedModelFile;
import tv.mapper.embellishcraft.data.gen.ECBlockStates;
import tv.mapper.embellishcraftbop.EmbellishCraftBOP;
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
        for(int j = 0; j < Arrays.stream(BoPWoods.values()).count(); j++)
        {
            horizontalBlock(ECBoPBlocks.BOP_CHAIR_BLOCKS.get(BoPWoods.byId(j)).get(), new UncheckedModelFile(EmbellishCraftBOP.MODID + ":block/" + BoPWoods.byId(j).getName() + "_chair"), 0);
            horizontalBlock(ECBoPBlocks.BOP_TERRACE_CHAIR_BLOCKS.get(BoPWoods.byId(j)).get(), new UncheckedModelFile(EmbellishCraftBOP.MODID + ":block/" + BoPWoods.byId(j).getName() + "_terrace_chair"), 0);
            tableBlock(ECBoPBlocks.BOP_TABLE_BLOCKS.get(BoPWoods.byId(j)).get());
            tableBlock(ECBoPBlocks.BOP_FANCY_TABLE_BLOCKS.get(BoPWoods.byId(j)).get());
            simpleBlock(ECBoPBlocks.BOP_TERRACE_TABLE_BLOCKS.get(BoPWoods.byId(j)).get());
            simpleBlock(ECBoPBlocks.BOP_WOODEN_CRATE_BLOCKS.get(BoPWoods.byId(j)).get());
            // getVariantBuilder(ECBoPBlocks.FANCY_CHEST_BLOCKS.get(BoPWoods.byId(j)).get()).partialState().setModels(
            // new ConfiguredModel(new UncheckedModelFile(EmbellishCraftBOP.MODID + ":model/" + BoPWoods.byId(j).getName() + "_fancy_chest")));
            chestBlock(ECBoPBlocks.BOP_FANCY_CHEST_BLOCKS.get(BoPWoods.byId(j)).get(), 0);
            horizontalBlock(ECBoPBlocks.BOP_SUSPENDED_STAIRS_BLOCKS.get(BoPWoods.byId(j)).get(), new UncheckedModelFile(EmbellishCraftBOP.MODID + ":block/" + BoPWoods.byId(j).getName() + "_suspended_stairs"),
                0);
            doorBlock(ECBoPBlocks.BOP_FANCY_DOOR_BLOCKS.get(BoPWoods.byId(j)).get(), modLoc("block/" + BoPWoods.byId(j).getName() + "_fancy_door_bottom"),
                modLoc("block/" + BoPWoods.byId(j).getName() + "_fancy_door_top"));
        }

        for(int j = 0; j < Arrays.stream(DyeColor.values()).count(); j++)
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