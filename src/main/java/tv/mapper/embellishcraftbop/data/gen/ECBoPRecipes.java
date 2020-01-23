package tv.mapper.embellishcraftbop.data.gen;

import java.util.function.Consumer;

import biomesoplenty.api.block.BOPBlocks;
import net.minecraft.advancements.criterion.InventoryChangeTrigger;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.IFinishedRecipe;
import net.minecraft.data.RecipeProvider;
import net.minecraft.data.ShapedRecipeBuilder;
import net.minecraft.data.ShapelessRecipeBuilder;
import net.minecraft.item.DyeColor;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.tags.Tag;
import net.minecraftforge.common.Tags;
import tv.mapper.embellishcraft.block.CustomBedBlock;
import tv.mapper.embellishcraft.init.ModItems;
import tv.mapper.embellishcraft.util.WoodType;
import tv.mapper.embellishcraftbop.init.ECBoPBlocks;

public class ECBoPRecipes extends RecipeProvider
{

    public ECBoPRecipes(DataGenerator generatorIn)
    {
        super(generatorIn);
    }

    @Override
    protected void registerRecipes(Consumer<IFinishedRecipe> consumer)
    {
        Block[] bopSlabs = {BOPBlocks.cherry_slab, BOPBlocks.dead_slab, BOPBlocks.ethereal_slab, BOPBlocks.fir_slab, BOPBlocks.hellbark_slab, BOPBlocks.jacaranda_slab, BOPBlocks.magic_slab, BOPBlocks.mahogany_slab, BOPBlocks.palm_slab, BOPBlocks.redwood_slab, BOPBlocks.umbran_slab, BOPBlocks.willow_slab};
        Block[] bopPlanks = {BOPBlocks.cherry_planks, BOPBlocks.dead_planks, BOPBlocks.ethereal_planks, BOPBlocks.fir_planks, BOPBlocks.hellbark_planks, BOPBlocks.jacaranda_planks, BOPBlocks.magic_planks, BOPBlocks.mahogany_planks, BOPBlocks.palm_planks, BOPBlocks.redwood_planks, BOPBlocks.umbran_planks, BOPBlocks.willow_planks};
        Block[] bopLogs = {BOPBlocks.cherry_log, BOPBlocks.dead_log, BOPBlocks.ethereal_log, BOPBlocks.fir_log, BOPBlocks.hellbark_log, BOPBlocks.jacaranda_log, BOPBlocks.magic_log, BOPBlocks.mahogany_log, BOPBlocks.palm_log, BOPBlocks.redwood_log, BOPBlocks.umbran_log, BOPBlocks.willow_log};
        Block[] bopPressure = {BOPBlocks.cherry_pressure_plate, BOPBlocks.dead_pressure_plate, BOPBlocks.ethereal_pressure_plate, BOPBlocks.fir_pressure_plate, BOPBlocks.hellbark_pressure_plate, BOPBlocks.jacaranda_pressure_plate, BOPBlocks.magic_pressure_plate, BOPBlocks.mahogany_pressure_plate, BOPBlocks.palm_pressure_plate, BOPBlocks.redwood_pressure_plate, BOPBlocks.umbran_pressure_plate, BOPBlocks.willow_pressure_plate};
        Block[] bopButtons = {BOPBlocks.cherry_button, BOPBlocks.dead_button, BOPBlocks.ethereal_button, BOPBlocks.fir_button, BOPBlocks.hellbark_button, BOPBlocks.jacaranda_button, BOPBlocks.magic_button, BOPBlocks.mahogany_button, BOPBlocks.palm_button, BOPBlocks.redwood_button, BOPBlocks.umbran_button, BOPBlocks.willow_button};
        int i = 0;

        for(Block block : ECBoPBlocks.CHAIRS)
        {
            ShapedRecipeBuilder.shapedRecipe(block).patternLine("S  ").patternLine("SWS").patternLine("S S").key('S', Items.STICK).key('W', bopSlabs[i]).setGroup("chairs").addCriterion("wood",
                InventoryChangeTrigger.Instance.forItems(bopPlanks[i])).build(consumer);
            i++;
        }

        i = 0;
        for(Block block : ECBoPBlocks.TERRACE_CHAIRS)
        {
            ShapedRecipeBuilder.shapedRecipe(block).patternLine("S  ").patternLine("SWS").patternLine("S S").key('S', Items.STICK).key('W', bopPressure[i]).setGroup("chairs").addCriterion("wood",
                InventoryChangeTrigger.Instance.forItems(bopPlanks[i])).build(consumer);
            i++;
        }

        i = 0;
        for(Block block : ECBoPBlocks.TABLES)
        {
            ShapedRecipeBuilder.shapedRecipe(block).patternLine("SWS").patternLine("S S").patternLine("S S").key('S', Items.STICK).key('W', bopSlabs[i]).setGroup("tables").addCriterion("wood",
                InventoryChangeTrigger.Instance.forItems(bopPlanks[i])).build(consumer);
            i++;
        }

        i = 0;
        for(Block block : ECBoPBlocks.TERRACE_TABLES)
        {
            ShapedRecipeBuilder.shapedRecipe(block).patternLine("WWW").patternLine(" S ").patternLine(" S ").key('S', Items.STICK).key('W', bopPressure[i]).setGroup("tables").addCriterion("wood",
                InventoryChangeTrigger.Instance.forItems(bopPlanks[i])).build(consumer);
            i++;
        }

        i = 0;
        for(Block block : ECBoPBlocks.FANCY_TABLES)
        {
            ShapedRecipeBuilder.shapedRecipe(block, 2).patternLine("PPP").patternLine("W W").patternLine("W W").key('W', bopLogs[i]).key('P', bopPlanks[i]).setGroup("tables").addCriterion("wood",
                InventoryChangeTrigger.Instance.forItems(bopPlanks[i])).build(consumer);
            i++;
        }

        i = 0;
        for(Block block : ECBoPBlocks.FANCY_DOORS)
        {
            ShapedRecipeBuilder.shapedRecipe(block, 3).patternLine("PP").patternLine("PB").patternLine("PP").key('B', bopButtons[i]).key('P', bopPlanks[i]).setGroup("tables").addCriterion("wood",
                InventoryChangeTrigger.Instance.forItems(bopPlanks[i])).build(consumer);
            i++;
        }

        i = 0;
        for(Block block : ECBoPBlocks.SUSPENDED_STAIRS)
        {
            ShapedRecipeBuilder.shapedRecipe(block, 6).patternLine("  P").patternLine(" PR").patternLine("PR ").key('R', Tags.Items.RODS_WOODEN).key('P', bopPlanks[i]).setGroup("stairs").addCriterion(
                "wood", InventoryChangeTrigger.Instance.forItems(bopPlanks[i])).build(consumer);
            i++;
        }

        i = 0;
        for(Block block : ECBoPBlocks.CRATES)
        {
            ShapedRecipeBuilder.shapedRecipe(block).patternLine("BPB").patternLine("P P").patternLine("BPB").key('B', ModItems.BOLT).key('P', bopPlanks[i]).setGroup("crates").addCriterion("wood",
                InventoryChangeTrigger.Instance.forItems(bopPlanks[i])).build(consumer);
            i++;
        }

        i = 0;
        for(Block block : ECBoPBlocks.FANCY_BEDS)
        {
            DyeColor color = ((CustomBedBlock)block).getColor();
            WoodType wood = ((CustomBedBlock)block).getWood();

            ShapedRecipeBuilder.shapedRecipe(block).patternLine("P P").patternLine("WWW").patternLine("PPP").key('W', getWoolFromColor(color)).key('P', bopPlanks[i / 16]).setGroup(
                "beds").addCriterion("wood", InventoryChangeTrigger.Instance.forItems(bopPlanks[i / 16])).build(consumer);
            i++;

            ShapelessRecipeBuilder.shapelessRecipe(block).addIngredient(getDyeTagFromColor(color)).addIngredient(getWhiteBedFromWood(wood)).setGroup("beds").addCriterion("fancy_bed",
                InventoryChangeTrigger.Instance.forItems(getWhiteBedFromWood(wood))).build(consumer, block.getRegistryName().toString() + "_from_white");
        }

        i = 0;
        for(Block block : ECBoPBlocks.FANCY_CHESTS)
        {
            ShapedRecipeBuilder.shapedRecipe(block).patternLine(" S ").patternLine("SCS").patternLine(" S ").key('C', Blocks.CHEST).key('S', bopSlabs[i]).setGroup("fancy_chests").addCriterion("chest",
                InventoryChangeTrigger.Instance.forItems(Blocks.CHEST)).build(consumer);
            i++;
        }
    }

    private Block getWhiteBedFromWood(WoodType wood)
    {
        switch(wood)
        {
            default:
            case CHERRY:
                return ECBoPBlocks.WHITE_CHERRY_FANCY_BED;
            case DEAD:
                return ECBoPBlocks.WHITE_DEAD_FANCY_BED;
            case ETHEREAL:
                return ECBoPBlocks.WHITE_ETHEREAL_FANCY_BED;
            case FIR:
                return ECBoPBlocks.WHITE_FIR_FANCY_BED;
            case HELLBARK:
                return ECBoPBlocks.WHITE_HELLBARK_FANCY_BED;
            case JACARANDA:
                return ECBoPBlocks.WHITE_JACARANDA_FANCY_BED;
            case MAGIC:
                return ECBoPBlocks.WHITE_MAGIC_FANCY_BED;
            case MAHOGANY:
                return ECBoPBlocks.WHITE_MAHOGANY_FANCY_BED;
            case PALM:
                return ECBoPBlocks.WHITE_PALM_FANCY_BED;
            case REDWOOD:
                return ECBoPBlocks.WHITE_REDWOOD_FANCY_BED;
            case UMBRAN:
                return ECBoPBlocks.WHITE_UMBRAN_FANCY_BED;
            case WILLOW:
                return ECBoPBlocks.WHITE_WILLOW_FANCY_BED;
        }
    }

    private Block getWoolFromColor(DyeColor color)
    {
        switch(color)
        {
            default:
            case BLACK:
                return Blocks.BLACK_WOOL;
            case BLUE:
                return Blocks.BLUE_WOOL;
            case BROWN:
                return Blocks.BROWN_WOOL;
            case CYAN:
                return Blocks.CYAN_WOOL;
            case GRAY:
                return Blocks.GRAY_WOOL;
            case GREEN:
                return Blocks.GREEN_WOOL;
            case LIGHT_BLUE:
                return Blocks.LIGHT_BLUE_WOOL;
            case LIGHT_GRAY:
                return Blocks.LIGHT_GRAY_WOOL;
            case LIME:
                return Blocks.LIME_WOOL;
            case MAGENTA:
                return Blocks.MAGENTA_WOOL;
            case ORANGE:
                return Blocks.ORANGE_WOOL;
            case PINK:
                return Blocks.PINK_WOOL;
            case PURPLE:
                return Blocks.PURPLE_WOOL;
            case RED:
                return Blocks.RED_WOOL;
            case WHITE:
                return Blocks.WHITE_WOOL;
            case YELLOW:
                return Blocks.YELLOW_WOOL;
        }
    }

    private Tag<Item> getDyeTagFromColor(DyeColor color)
    {
        switch(color)
        {
            default:
            case BLACK:
                return Tags.Items.DYES_BLACK;
            case BLUE:
                return Tags.Items.DYES_BLUE;
            case BROWN:
                return Tags.Items.DYES_BROWN;
            case CYAN:
                return Tags.Items.DYES_CYAN;
            case GRAY:
                return Tags.Items.DYES_GRAY;
            case GREEN:
                return Tags.Items.DYES_GREEN;
            case LIGHT_BLUE:
                return Tags.Items.DYES_LIGHT_BLUE;
            case LIGHT_GRAY:
                return Tags.Items.DYES_LIGHT_GRAY;
            case LIME:
                return Tags.Items.DYES_LIME;
            case MAGENTA:
                return Tags.Items.DYES_MAGENTA;
            case ORANGE:
                return Tags.Items.DYES_ORANGE;
            case PINK:
                return Tags.Items.DYES_PINK;
            case PURPLE:
                return Tags.Items.DYES_PURPLE;
            case RED:
                return Tags.Items.DYES_RED;
            case WHITE:
                return Tags.Items.DYES_WHITE;
            case YELLOW:
                return Tags.Items.DYES_YELLOW;
        }
    }
}
