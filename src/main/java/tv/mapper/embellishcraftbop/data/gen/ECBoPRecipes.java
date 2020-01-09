package tv.mapper.embellishcraftbop.data.gen;

import java.util.function.Consumer;

import biomesoplenty.api.block.BOPBlocks;
import net.minecraft.advancements.criterion.InventoryChangeTrigger;
import net.minecraft.block.Block;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.IFinishedRecipe;
import net.minecraft.data.RecipeProvider;
import net.minecraft.data.ShapedRecipeBuilder;
import net.minecraft.item.Items;
import net.minecraftforge.common.Tags;
import tv.mapper.embellishcraft.init.ModItems;
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
            ShapedRecipeBuilder.shapedRecipe(block, 6).patternLine("  P").patternLine(" PR").patternLine("PR ").key('R', Tags.Items.RODS_WOODEN).key('P', bopPlanks[i]).setGroup("stairs").addCriterion("wood",
                InventoryChangeTrigger.Instance.forItems(bopPlanks[i])).build(consumer);
            i++;
        }
        
        i = 0;
        for(Block block : ECBoPBlocks.CRATES)
        {
            ShapedRecipeBuilder.shapedRecipe(block).patternLine("BPB").patternLine("P P").patternLine("BPB").key('B', ModItems.BOLT).key('P', bopPlanks[i]).setGroup("crates").addCriterion("wood",
                InventoryChangeTrigger.Instance.forItems(bopPlanks[i])).build(consumer);
            i++;
        }

    }
}
