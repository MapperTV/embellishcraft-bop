package tv.mapper.embellishcraftbop.data.gen;

import java.util.function.Consumer;

import net.minecraft.advancements.criterion.InventoryChangeTrigger;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.IFinishedRecipe;
import net.minecraft.data.RecipeProvider;
import net.minecraft.data.ShapedRecipeBuilder;
import net.minecraft.data.ShapelessRecipeBuilder;
import net.minecraft.item.DyeColor;
import net.minecraft.item.Items;
import net.minecraftforge.common.Tags;
import tv.mapper.embellishcraft.block.CustomBedBlock;
import tv.mapper.embellishcraft.util.WoodsType;
import tv.mapper.embellishcraftbop.init.ECBoPBlocks;
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
        int i = 0;

        for(Block block : ECBoPBlocks.CHAIRS)
        {
            ShapedRecipeBuilder.shapedRecipe(block).patternLine("S  ").patternLine("SWS").patternLine("S S").key('S', Items.STICK).key('W', ECBoPBlockUtils.bopSlabs[i]).setGroup("chairs").addCriterion("wood",
                InventoryChangeTrigger.Instance.forItems(ECBoPBlockUtils.bopPlanks[i])).build(consumer);
            i++;
        }

        i = 0;
        for(Block block : ECBoPBlocks.TERRACE_CHAIRS)
        {
            ShapedRecipeBuilder.shapedRecipe(block).patternLine("S  ").patternLine("SWS").patternLine("S S").key('S', Items.STICK).key('W', ECBoPBlockUtils.bopPressure[i]).setGroup("chairs").addCriterion(
                "wood", InventoryChangeTrigger.Instance.forItems(ECBoPBlockUtils.bopPlanks[i])).build(consumer);
            i++;
        }

        i = 0;
        for(Block block : ECBoPBlocks.TABLES)
        {
            ShapedRecipeBuilder.shapedRecipe(block).patternLine("SWS").patternLine("S S").patternLine("S S").key('S', Items.STICK).key('W', ECBoPBlockUtils.bopSlabs[i]).setGroup("tables").addCriterion("wood",
                InventoryChangeTrigger.Instance.forItems(ECBoPBlockUtils.bopPlanks[i])).build(consumer);
            i++;
        }

        i = 0;
        for(Block block : ECBoPBlocks.TERRACE_TABLES)
        {
            ShapedRecipeBuilder.shapedRecipe(block).patternLine("WWW").patternLine(" S ").patternLine(" S ").key('S', Items.STICK).key('W', ECBoPBlockUtils.bopPressure[i]).setGroup("tables").addCriterion(
                "wood", InventoryChangeTrigger.Instance.forItems(ECBoPBlockUtils.bopPlanks[i])).build(consumer);
            i++;
        }

        i = 0;
        for(Block block : ECBoPBlocks.FANCY_TABLES)
        {
            ShapedRecipeBuilder.shapedRecipe(block, 2).patternLine("PPP").patternLine("W W").patternLine("W W").key('W', ECBoPBlockUtils.bopLogs[i]).key('P', ECBoPBlockUtils.bopPlanks[i]).setGroup(
                "tables").addCriterion("wood", InventoryChangeTrigger.Instance.forItems(ECBoPBlockUtils.bopPlanks[i])).build(consumer);
            i++;
        }

        i = 0;
        for(Block block : ECBoPBlocks.FANCY_DOORS)
        {
            ShapedRecipeBuilder.shapedRecipe(block, 3).patternLine("PP").patternLine("PB").patternLine("PP").key('B', ECBoPBlockUtils.bopButtons[i]).key('P', ECBoPBlockUtils.bopPlanks[i]).setGroup(
                "tables").addCriterion("wood", InventoryChangeTrigger.Instance.forItems(ECBoPBlockUtils.bopPlanks[i])).build(consumer);
            i++;
        }

        i = 0;
        for(Block block : ECBoPBlocks.SUSPENDED_STAIRS)
        {
            ShapedRecipeBuilder.shapedRecipe(block, 6).patternLine("  P").patternLine(" PR").patternLine("PR ").key('R', Tags.Items.RODS_WOODEN).key('P', ECBoPBlockUtils.bopPlanks[i]).setGroup(
                "stairs").addCriterion("wood", InventoryChangeTrigger.Instance.forItems(ECBoPBlockUtils.bopPlanks[i])).build(consumer);
            i++;
        }

        i = 0;
        for(Block block : ECBoPBlocks.CRATES)
        {
            ShapedRecipeBuilder.shapedRecipe(block).patternLine("BPB").patternLine("P P").patternLine("BPB").key('B', BaseItems.BOLT.get()).key('P', ECBoPBlockUtils.bopPlanks[i]).setGroup(
                "crates").addCriterion("wood", InventoryChangeTrigger.Instance.forItems(ECBoPBlockUtils.bopPlanks[i])).build(consumer);
            i++;
        }

        i = 0;
        for(Block block : ECBoPBlocks.FANCY_BEDS)
        {
            DyeColor color = ((CustomBedBlock)block).getColor();
            WoodsType wood = ((CustomBedBlock)block).getWood();

            ShapedRecipeBuilder.shapedRecipe(block).patternLine("P P").patternLine("WWW").patternLine("PPP").key('W', ECBoPBlockUtils.getWoolFromColor(color)).key('P',
                ECBoPBlockUtils.bopPlanks[i / 16]).setGroup("beds").addCriterion("wood", InventoryChangeTrigger.Instance.forItems(ECBoPBlockUtils.bopPlanks[i / 16])).build(consumer);
            i++;

            ShapelessRecipeBuilder.shapelessRecipe(block).addIngredient(ECBoPBlockUtils.getDyeTagFromColor(color)).addIngredient(ECBoPBlockUtils.getWhiteBedFromWood(wood)).setGroup("beds").addCriterion(
                "fancy_bed", InventoryChangeTrigger.Instance.forItems(ECBoPBlockUtils.getWhiteBedFromWood(wood))).build(consumer, block.getRegistryName().toString() + "_from_white");
        }

        i = 0;
        for(Block block : ECBoPBlocks.FANCY_CHESTS)
        {
            ShapedRecipeBuilder.shapedRecipe(block).patternLine(" S ").patternLine("SCS").patternLine(" S ").key('C', Blocks.CHEST).key('S', ECBoPBlockUtils.bopSlabs[i]).setGroup("fancy_chests").addCriterion(
                "chest", InventoryChangeTrigger.Instance.forItems(Blocks.CHEST)).build(consumer);
            i++;
        }
    }
}
