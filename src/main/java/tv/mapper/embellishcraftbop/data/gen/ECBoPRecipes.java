package tv.mapper.embellishcraftbop.data.gen;

import java.util.Arrays;
import java.util.function.Consumer;

import biomesoplenty.api.block.BOPBlocks;
import net.minecraft.block.Blocks;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.IFinishedRecipe;
import net.minecraft.data.RecipeProvider;
import net.minecraft.data.ShapedRecipeBuilder;
import net.minecraft.item.DyeColor;
import net.minecraftforge.common.Tags;
import tv.mapper.embellishcraft.ECConstants;
import tv.mapper.embellishcraftbop.init.ECBoPBlocks;
import tv.mapper.embellishcraftbop.util.BoPWoods;
import tv.mapper.embellishcraftbop.util.ECBoPBlockUtils;
import tv.mapper.mapperbase.item.BaseItems;

public class ECBoPRecipes extends RecipeProvider
{

    public ECBoPRecipes(DataGenerator generatorIn)
    {
        super(generatorIn);
    }

    @Override
    protected void registerRecipes(Consumer<IFinishedRecipe> consumer)
    {
        for(int j = 0; j < Arrays.stream(BoPWoods.values()).count(); j++)
        {
            ShapedRecipeBuilder.shapedRecipe(ECBoPBlocks.BOP_CHAIR_BLOCKS.get(BoPWoods.byId(j)).get()).key('W', ECBoPBlockUtils.bopSlabs[j]).key('S', Tags.Items.RODS_WOODEN).patternLine("S  ").patternLine(
                "SWS").patternLine("S S").setGroup("chairs").addCriterion("has_" + BoPWoods.byId(j).getName() + "_slab", this.hasItem(ECBoPBlockUtils.bopSlabs[j])).build(consumer);
            ShapedRecipeBuilder.shapedRecipe(ECBoPBlocks.BOP_TERRACE_CHAIR_BLOCKS.get(BoPWoods.byId(j)).get()).key('W', ECBoPBlockUtils.bopPressure[j]).key('S', Tags.Items.RODS_WOODEN).patternLine(
                "S  ").patternLine("SWS").patternLine("S S").setGroup("terrace_chairs").addCriterion("has_" + BoPWoods.byId(j).getName() + "_pressure_plate", this.hasItem(ECBoPBlockUtils.bopPressure[j])).build(
                    consumer);
            ShapedRecipeBuilder.shapedRecipe(ECBoPBlocks.BOP_TABLE_BLOCKS.get(BoPWoods.byId(j)).get()).key('W', ECBoPBlockUtils.bopSlabs[j]).key('S', Tags.Items.RODS_WOODEN).patternLine("SWS").patternLine(
                "S S").patternLine("S S").setGroup("tables").addCriterion("has_" + BoPWoods.byId(j).getName() + "_slab", this.hasItem(ECBoPBlockUtils.bopSlabs[j])).build(consumer);
            ShapedRecipeBuilder.shapedRecipe(ECBoPBlocks.BOP_TERRACE_TABLE_BLOCKS.get(BoPWoods.byId(j)).get()).key('W', ECBoPBlockUtils.bopPressure[j]).key('S', Tags.Items.RODS_WOODEN).patternLine(
                "WWW").patternLine(" S ").patternLine(" S ").setGroup("terrace_tables").addCriterion("has_" + BoPWoods.byId(j).getName() + "_pressure_plate", this.hasItem(ECBoPBlockUtils.bopPressure[j])).build(
                    consumer);
            ShapedRecipeBuilder.shapedRecipe(ECBoPBlocks.BOP_FANCY_TABLE_BLOCKS.get(BoPWoods.byId(j)).get(), 2).key('W', ECBoPBlockUtils.bopPlanks[j]).key('S', ECBoPBlockUtils.bopLogs[j]).patternLine(
                "WWW").patternLine("S S").patternLine("S S").setGroup("fancy_tables").addCriterion("has_" + BoPWoods.byId(j).getName() + "_planks", this.hasItem(ECBoPBlockUtils.bopPlanks[j])).build(consumer);
            ShapedRecipeBuilder.shapedRecipe(ECBoPBlocks.BOP_FANCY_DOOR_BLOCKS.get(BoPWoods.byId(j)).get(), 3).key('P', ECBoPBlockUtils.bopPlanks[j]).key('B', ECBoPBlockUtils.bopButtons[j]).patternLine(
                "PP").patternLine("PB").patternLine("PP").setGroup("fancy_doors").addCriterion("has_" + BoPWoods.byId(j).getName() + "_planks", this.hasItem(ECBoPBlockUtils.bopPlanks[j])).build(consumer);
            ShapedRecipeBuilder.shapedRecipe(ECBoPBlocks.BOP_PLAIN_DOOR_BLOCKS.get(BoPWoods.byId(j)).get(), 3).key('P', ECBoPBlockUtils.bopLogs[j]).key('B', ECBoPBlockUtils.bopButtons[j]).patternLine(
                "PP").patternLine("PB").patternLine("PP").setGroup("plain_doors").addCriterion("has_" + BoPWoods.byId(j).getName() + "_log", this.hasItem(ECBoPBlockUtils.bopLogs[j])).build(consumer);
            ShapedRecipeBuilder.shapedRecipe(ECBoPBlocks.BOP_SUSPENDED_STAIRS_BLOCKS.get(BoPWoods.byId(j)).get(), 6).key('P', ECBoPBlockUtils.bopPlanks[j]).key('S', Tags.Items.RODS_WOODEN).patternLine(
                "  P").patternLine(" PS").patternLine("PS ").setGroup("suspended_stairs").addCriterion("has_" + BoPWoods.byId(j).getName() + "_planks", this.hasItem(ECBoPBlockUtils.bopPlanks[j])).build(
                    consumer);
            ShapedRecipeBuilder.shapedRecipe(ECBoPBlocks.BOP_WOODEN_CRATE_BLOCKS.get(BoPWoods.byId(j)).get()).key('B', BaseItems.BOLT.get()).key('W', ECBoPBlockUtils.bopPlanks[j]).patternLine(
                "BWB").patternLine("W W").patternLine("BWB").setGroup("wooden_crates").addCriterion("has_" + BoPWoods.byId(j).getName() + "_planks", this.hasItem(ECBoPBlockUtils.bopPlanks[j])).build(consumer);
            ShapedRecipeBuilder.shapedRecipe(ECBoPBlocks.BOP_FANCY_CHEST_BLOCKS.get(BoPWoods.byId(j)).get()).key('C', Blocks.CHEST).key('W', ECBoPBlockUtils.bopSlabs[j]).patternLine(" W ").patternLine(
                "WCW").patternLine(" W ").setGroup("fancy_chests").addCriterion("has_chest", this.hasItem(Blocks.CHEST)).build(consumer);
        }

        for(int j = 0; j < Arrays.stream(DyeColor.values()).count(); j++)
        {
            ShapedRecipeBuilder.shapedRecipe(ECBoPBlocks.CHERRY_FANCY_BED_BLOCKS.get(DyeColor.byId(j)).get()).key('P', BOPBlocks.cherry_planks).key('W', ECConstants.McWools[j]).patternLine("P P").patternLine(
                "WWW").patternLine("PPP").setGroup("fancy_beds").addCriterion("has_cherry_planks", this.hasItem(BOPBlocks.cherry_planks)).build(consumer);
            ShapedRecipeBuilder.shapedRecipe(ECBoPBlocks.DEAD_FANCY_BED_BLOCKS.get(DyeColor.byId(j)).get()).key('P', BOPBlocks.dead_planks).key('W', ECConstants.McWools[j]).patternLine("P P").patternLine(
                "WWW").patternLine("PPP").setGroup("fancy_beds").addCriterion("has_dead_planks", this.hasItem(BOPBlocks.dead_planks)).build(consumer);
            ShapedRecipeBuilder.shapedRecipe(ECBoPBlocks.FIR_FANCY_BED_BLOCKS.get(DyeColor.byId(j)).get()).key('P', BOPBlocks.fir_planks).key('W', ECConstants.McWools[j]).patternLine("P P").patternLine(
                "WWW").patternLine("PPP").setGroup("fancy_beds").addCriterion("has_fir_planks", this.hasItem(BOPBlocks.fir_planks)).build(consumer);
            ShapedRecipeBuilder.shapedRecipe(ECBoPBlocks.HELLBARK_FANCY_BED_BLOCKS.get(DyeColor.byId(j)).get()).key('P', BOPBlocks.hellbark_planks).key('W', ECConstants.McWools[j]).patternLine(
                "P P").patternLine("WWW").patternLine("PPP").setGroup("fancy_beds").addCriterion("has_hellbark_planks", this.hasItem(BOPBlocks.hellbark_planks)).build(consumer);
            ShapedRecipeBuilder.shapedRecipe(ECBoPBlocks.JACARANDA_FANCY_BED_BLOCKS.get(DyeColor.byId(j)).get()).key('P', BOPBlocks.jacaranda_planks).key('W', ECConstants.McWools[j]).patternLine(
                "P P").patternLine("WWW").patternLine("PPP").setGroup("fancy_beds").addCriterion("has_jacaranda_planks", this.hasItem(BOPBlocks.jacaranda_planks)).build(consumer);
            ShapedRecipeBuilder.shapedRecipe(ECBoPBlocks.MAGIC_FANCY_BED_BLOCKS.get(DyeColor.byId(j)).get()).key('P', BOPBlocks.magic_planks).key('W', ECConstants.McWools[j]).patternLine("P P").patternLine(
                "WWW").patternLine("PPP").setGroup("fancy_beds").addCriterion("has_magic_planks", this.hasItem(BOPBlocks.magic_planks)).build(consumer);
            ShapedRecipeBuilder.shapedRecipe(ECBoPBlocks.MAHOGANY_FANCY_BED_BLOCKS.get(DyeColor.byId(j)).get()).key('P', BOPBlocks.mahogany_planks).key('W', ECConstants.McWools[j]).patternLine(
                "P P").patternLine("WWW").patternLine("PPP").setGroup("fancy_beds").addCriterion("has_mahogany_planks", this.hasItem(BOPBlocks.mahogany_planks)).build(consumer);
            ShapedRecipeBuilder.shapedRecipe(ECBoPBlocks.PALM_FANCY_BED_BLOCKS.get(DyeColor.byId(j)).get()).key('P', BOPBlocks.palm_planks).key('W', ECConstants.McWools[j]).patternLine("P P").patternLine(
                "WWW").patternLine("PPP").setGroup("fancy_beds").addCriterion("has_palm_planks", this.hasItem(BOPBlocks.palm_planks)).build(consumer);
            ShapedRecipeBuilder.shapedRecipe(ECBoPBlocks.REDWOOD_FANCY_BED_BLOCKS.get(DyeColor.byId(j)).get()).key('P', BOPBlocks.redwood_planks).key('W', ECConstants.McWools[j]).patternLine("P P").patternLine(
                "WWW").patternLine("PPP").setGroup("fancy_beds").addCriterion("has_redwood_planks", this.hasItem(BOPBlocks.redwood_planks)).build(consumer);
            ShapedRecipeBuilder.shapedRecipe(ECBoPBlocks.UMBRAN_FANCY_BED_BLOCKS.get(DyeColor.byId(j)).get()).key('P', BOPBlocks.umbran_planks).key('W', ECConstants.McWools[j]).patternLine("P P").patternLine(
                "WWW").patternLine("PPP").setGroup("fancy_beds").addCriterion("has_umbran_planks", this.hasItem(BOPBlocks.umbran_planks)).build(consumer);
            ShapedRecipeBuilder.shapedRecipe(ECBoPBlocks.WILLOW_FANCY_BED_BLOCKS.get(DyeColor.byId(j)).get()).key('P', BOPBlocks.willow_planks).key('W', ECConstants.McWools[j]).patternLine("P P").patternLine(
                "WWW").patternLine("PPP").setGroup("fancy_beds").addCriterion("has_willow_planks", this.hasItem(BOPBlocks.willow_planks)).build(consumer);
        }
    }
}