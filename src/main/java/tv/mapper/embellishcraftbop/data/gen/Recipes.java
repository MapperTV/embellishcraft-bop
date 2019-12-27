package tv.mapper.embellishcraftbop.data.gen;

import java.util.function.Consumer;

import biomesoplenty.api.block.BOPBlocks;
import net.minecraft.advancements.criterion.InventoryChangeTrigger;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.IFinishedRecipe;
import net.minecraft.data.RecipeProvider;
import net.minecraft.data.ShapedRecipeBuilder;
import net.minecraft.item.Items;
import tv.mapper.embellishcraftbop.init.ModBlocks;

public class Recipes extends RecipeProvider
{

    public Recipes(DataGenerator generatorIn)
    {
        super(generatorIn);
    }

    @Override
    protected void registerRecipes(Consumer<IFinishedRecipe> consumer) {
        ShapedRecipeBuilder.shapedRecipe(ModBlocks.CHERRY_CHAIR)
                .patternLine("S  ")
                .patternLine("SWS")
                .patternLine("S S")
                .key('S', Items.STICK)
                .key('W', BOPBlocks.cherry_slab)
                .setGroup("chairs")
                .addCriterion("wood", InventoryChangeTrigger.Instance.forItems(BOPBlocks.cherry_planks))
                .build(consumer);
    }
}
