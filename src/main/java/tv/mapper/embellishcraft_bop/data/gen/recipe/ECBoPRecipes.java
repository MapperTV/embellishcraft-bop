package tv.mapper.embellishcraft_bop.data.gen.recipe;

import java.util.Arrays;
import java.util.function.Consumer;

import biomesoplenty.api.block.BOPBlocks;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.world.item.DyeColor;
import net.minecraftforge.common.Tags;
import tv.mapper.embellishcraft.core.ECConstants;
import tv.mapper.embellishcraft_bop.init.ECBoPBlocks;
import tv.mapper.embellishcraft_bop.util.BoPWoods;
import tv.mapper.embellishcraft_bop.util.ECBoPBlockUtils;
import tv.mapper.mapperbase.world.item.BaseItems;

public class ECBoPRecipes extends RecipeProvider
{
    public ECBoPRecipes(DataGenerator generatorIn)
    {
        super(generatorIn);
    }

    @Override
    protected void buildCraftingRecipes(Consumer<FinishedRecipe> consumer)
    {
        for(int j = 0; j < Arrays.stream(BoPWoods.values()).count(); j++)
        {
            ShapedRecipeBuilder.shaped(ECBoPBlocks.BOP_CHAIR_BLOCKS.get(BoPWoods.byId(j)).get()).define('W', ECBoPBlockUtils.bopSlabs[j]).define('S', Tags.Items.RODS_WOODEN).pattern("S  ").pattern("SWS").pattern("S S").group("chairs").unlockedBy("has_" + BoPWoods.byId(j).getSerializedName() + "_slab", has(ECBoPBlockUtils.bopSlabs[j])).save(consumer);
            ShapedRecipeBuilder.shaped(ECBoPBlocks.BOP_TERRACE_CHAIR_BLOCKS.get(BoPWoods.byId(j)).get()).define('W', ECBoPBlockUtils.bopPressure[j]).define('S', Tags.Items.RODS_WOODEN).pattern("S  ").pattern("SWS").pattern("S S").group("terrace_chairs").unlockedBy("has_" + BoPWoods.byId(j).getSerializedName() + "_pressure_plate", has(ECBoPBlockUtils.bopPressure[j])).save(consumer);
            ShapedRecipeBuilder.shaped(ECBoPBlocks.BOP_TABLE_BLOCKS.get(BoPWoods.byId(j)).get()).define('W', ECBoPBlockUtils.bopSlabs[j]).define('S', Tags.Items.RODS_WOODEN).pattern("SWS").pattern("S S").pattern("S S").group("tables").unlockedBy("has_" + BoPWoods.byId(j).getSerializedName() + "_slab", has(ECBoPBlockUtils.bopSlabs[j])).save(consumer);
            ShapedRecipeBuilder.shaped(ECBoPBlocks.BOP_TERRACE_TABLE_BLOCKS.get(BoPWoods.byId(j)).get()).define('W', ECBoPBlockUtils.bopPressure[j]).define('S', Tags.Items.RODS_WOODEN).pattern("WWW").pattern(" S ").pattern(" S ").group("terrace_tables").unlockedBy("has_" + BoPWoods.byId(j).getSerializedName() + "_pressure_plate", has(ECBoPBlockUtils.bopPressure[j])).save(consumer);
            ShapedRecipeBuilder.shaped(ECBoPBlocks.BOP_FANCY_TABLE_BLOCKS.get(BoPWoods.byId(j)).get(), 2).define('W', ECBoPBlockUtils.bopPlanks[j]).define('S', ECBoPBlockUtils.bopLogs[j]).pattern("WWW").pattern("S S").pattern("S S").group("fancy_tables").unlockedBy("has_" + BoPWoods.byId(j).getSerializedName() + "_PLANKS", has(ECBoPBlockUtils.bopPlanks[j])).save(consumer);
            ShapedRecipeBuilder.shaped(ECBoPBlocks.BOP_FANCY_DOOR_BLOCKS.get(BoPWoods.byId(j)).get(), 3).define('P', ECBoPBlockUtils.bopPlanks[j]).define('B', ECBoPBlockUtils.bopButtons[j]).pattern("PP").pattern("PB").pattern("PP").group("fancy_doors").unlockedBy("has_" + BoPWoods.byId(j).getSerializedName() + "_PLANKS", has(ECBoPBlockUtils.bopPlanks[j])).save(consumer);
            ShapedRecipeBuilder.shaped(ECBoPBlocks.BOP_PLAIN_DOOR_BLOCKS.get(BoPWoods.byId(j)).get(), 3).define('P', ECBoPBlockUtils.bopLogs[j]).define('B', ECBoPBlockUtils.bopButtons[j]).pattern("PP").pattern("PB").pattern("PP").group("plain_doors").unlockedBy("has_" + BoPWoods.byId(j).getSerializedName() + "_log", has(ECBoPBlockUtils.bopLogs[j])).save(consumer);
            ShapedRecipeBuilder.shaped(ECBoPBlocks.BOP_SUSPENDED_STAIRS_BLOCKS.get(BoPWoods.byId(j)).get(), 4).define('P', ECBoPBlockUtils.bopSlabs[j]).define('S', Tags.Items.RODS_WOODEN).pattern("  P").pattern(" PS").pattern("PS ").group("suspended_stairs").unlockedBy("has_" + BoPWoods.byId(j).getSerializedName() + "_slabs", has(ECBoPBlockUtils.bopSlabs[j])).save(consumer);
            ShapedRecipeBuilder.shaped(ECBoPBlocks.BOP_LARGE_SUSPENDED_STAIRS_BLOCKS.get(BoPWoods.byId(j)).get(), 4).define('P', ECBoPBlockUtils.bopPlanks[j]).define('S', Tags.Items.RODS_WOODEN).pattern("  P").pattern(" PS").pattern("PS ").group("suspended_stairs").unlockedBy("has_" + BoPWoods.byId(j).getSerializedName() + "_PLANKS", has(ECBoPBlockUtils.bopPlanks[j])).save(consumer);
            ShapedRecipeBuilder.shaped(ECBoPBlocks.BOP_WOODEN_CRATE_BLOCKS.get(BoPWoods.byId(j)).get()).define('B', BaseItems.BOLT.get()).define('W', ECBoPBlockUtils.bopPlanks[j]).pattern("BWB").pattern("W W").pattern("BWB").group("wooden_crates").unlockedBy("has_" + BoPWoods.byId(j).getSerializedName() + "_PLANKS", has(ECBoPBlockUtils.bopPlanks[j])).save(consumer);
            // ShapedRecipeBuilder.shaped(ECBoPBlocks.BOP_FANCY_CHEST_BLOCKS.get(BoPWoods.byId(j)).get()).define('C', Blocks.CHEST).define('W', ECBoPBlockUtils.bopSlabs[j]).pattern(" W
            // ").pattern("WCW").pattern(" W ").group("fancy_chests").unlockedBy("has_chest", has(Blocks.CHEST)).save(consumer);
        }

        for(int j = 0; j < Arrays.stream(DyeColor.values()).count(); j++)
        {
            ShapedRecipeBuilder.shaped(ECBoPBlocks.CHERRY_FANCY_BED_BLOCKS.get(DyeColor.byId(j)).get()).define('P', BOPBlocks.CHERRY_PLANKS).define('W', ECConstants.McWools[j]).pattern("P P").pattern("WWW").pattern("PPP").group("fancy_beds").unlockedBy("has_CHERRY_PLANKS", has(BOPBlocks.CHERRY_PLANKS)).save(consumer);
            ShapedRecipeBuilder.shaped(ECBoPBlocks.DEAD_FANCY_BED_BLOCKS.get(DyeColor.byId(j)).get()).define('P', BOPBlocks.DEAD_PLANKS).define('W', ECConstants.McWools[j]).pattern("P P").pattern("WWW").pattern("PPP").group("fancy_beds").unlockedBy("has_DEAD_PLANKS", has(BOPBlocks.DEAD_PLANKS)).save(consumer);
            ShapedRecipeBuilder.shaped(ECBoPBlocks.FIR_FANCY_BED_BLOCKS.get(DyeColor.byId(j)).get()).define('P', BOPBlocks.FIR_PLANKS).define('W', ECConstants.McWools[j]).pattern("P P").pattern("WWW").pattern("PPP").group("fancy_beds").unlockedBy("has_FIR_PLANKS", has(BOPBlocks.FIR_PLANKS)).save(consumer);
            ShapedRecipeBuilder.shaped(ECBoPBlocks.HELLBARK_FANCY_BED_BLOCKS.get(DyeColor.byId(j)).get()).define('P', BOPBlocks.HELLBARK_PLANKS).define('W', ECConstants.McWools[j]).pattern("P P").pattern("WWW").pattern("PPP").group("fancy_beds").unlockedBy("has_HELLBARK_PLANKS", has(BOPBlocks.HELLBARK_PLANKS)).save(consumer);
            ShapedRecipeBuilder.shaped(ECBoPBlocks.JACARANDA_FANCY_BED_BLOCKS.get(DyeColor.byId(j)).get()).define('P', BOPBlocks.JACARANDA_PLANKS).define('W', ECConstants.McWools[j]).pattern("P P").pattern("WWW").pattern("PPP").group("fancy_beds").unlockedBy("has_JACARANDA_PLANKS", has(BOPBlocks.JACARANDA_PLANKS)).save(consumer);
            ShapedRecipeBuilder.shaped(ECBoPBlocks.MAGIC_FANCY_BED_BLOCKS.get(DyeColor.byId(j)).get()).define('P', BOPBlocks.MAGIC_PLANKS).define('W', ECConstants.McWools[j]).pattern("P P").pattern("WWW").pattern("PPP").group("fancy_beds").unlockedBy("has_MAGIC_PLANKS", has(BOPBlocks.MAGIC_PLANKS)).save(consumer);
            ShapedRecipeBuilder.shaped(ECBoPBlocks.MAHOGANY_FANCY_BED_BLOCKS.get(DyeColor.byId(j)).get()).define('P', BOPBlocks.MAHOGANY_PLANKS).define('W', ECConstants.McWools[j]).pattern("P P").pattern("WWW").pattern("PPP").group("fancy_beds").unlockedBy("has_MAHOGANY_PLANKS", has(BOPBlocks.MAHOGANY_PLANKS)).save(consumer);
            ShapedRecipeBuilder.shaped(ECBoPBlocks.PALM_FANCY_BED_BLOCKS.get(DyeColor.byId(j)).get()).define('P', BOPBlocks.PALM_PLANKS).define('W', ECConstants.McWools[j]).pattern("P P").pattern("WWW").pattern("PPP").group("fancy_beds").unlockedBy("has_PALM_PLANKS", has(BOPBlocks.PALM_PLANKS)).save(consumer);
            ShapedRecipeBuilder.shaped(ECBoPBlocks.REDWOOD_FANCY_BED_BLOCKS.get(DyeColor.byId(j)).get()).define('P', BOPBlocks.REDWOOD_PLANKS).define('W', ECConstants.McWools[j]).pattern("P P").pattern("WWW").pattern("PPP").group("fancy_beds").unlockedBy("has_REDWOOD_PLANKS", has(BOPBlocks.REDWOOD_PLANKS)).save(consumer);
            ShapedRecipeBuilder.shaped(ECBoPBlocks.UMBRAN_FANCY_BED_BLOCKS.get(DyeColor.byId(j)).get()).define('P', BOPBlocks.UMBRAN_PLANKS).define('W', ECConstants.McWools[j]).pattern("P P").pattern("WWW").pattern("PPP").group("fancy_beds").unlockedBy("has_UMBRAN_PLANKS", has(BOPBlocks.UMBRAN_PLANKS)).save(consumer);
            ShapedRecipeBuilder.shaped(ECBoPBlocks.WILLOW_FANCY_BED_BLOCKS.get(DyeColor.byId(j)).get()).define('P', BOPBlocks.WILLOW_PLANKS).define('W', ECConstants.McWools[j]).pattern("P P").pattern("WWW").pattern("PPP").group("fancy_beds").unlockedBy("has_WILLOW_PLANKS", has(BOPBlocks.WILLOW_PLANKS)).save(consumer);
        }
    }
}