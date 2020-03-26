package tv.mapper.embellishcraftbop.data.gen;

import java.util.Arrays;

import net.minecraft.data.DataGenerator;
import net.minecraft.item.DyeColor;
import net.minecraftforge.client.model.generators.ExistingFileHelper;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelFile.UncheckedModelFile;
import tv.mapper.embellishcraftbop.util.BoPWoods;

public class ECBoPItemModels extends ItemModelProvider
{
    public ECBoPItemModels(DataGenerator generator, String modid, ExistingFileHelper existingFileHelper)
    {
        super(generator, modid, existingFileHelper);
    }

    @Override
    public String getName()
    {
        return "EmbellishCraft-BoP Item Models";
    }

    @Override
    protected void registerModels()
    {
        for(int j = 0; j < Arrays.stream(BoPWoods.values()).count(); j++)
        {
            getBuilder(BoPWoods.byId(j).getName() + "_terrace_table").parent(new UncheckedModelFile(modid + ":block/" + BoPWoods.byId(j).getName() + "_terrace_table"));
            getBuilder(BoPWoods.byId(j).getName() + "_terrace_chair").parent(new UncheckedModelFile(modid + ":block/" + BoPWoods.byId(j).getName() + "_terrace_chair"));
            getBuilder(BoPWoods.byId(j).getName() + "_chair").parent(new UncheckedModelFile(modid + ":block/" + BoPWoods.byId(j).getName() + "_chair"));
            getBuilder(BoPWoods.byId(j).getName() + "_table").parent(new UncheckedModelFile(modid + ":block/" + BoPWoods.byId(j).getName() + "_table_inventory"));
            getBuilder(BoPWoods.byId(j).getName() + "_fancy_table").parent(new UncheckedModelFile(modid + ":block/" + BoPWoods.byId(j).getName() + "_fancy_table_inventory"));
            getBuilder(BoPWoods.byId(j).getName() + "_suspended_stairs").parent(new UncheckedModelFile(modid + ":block/" + BoPWoods.byId(j).getName() + "_suspended_stairs"));
            getBuilder(BoPWoods.byId(j).getName() + "_fancy_door").parent(new UncheckedModelFile("item/generated")).texture("layer0", modLoc("item/" + BoPWoods.byId(j).getName() + "_fancy_door"));
            getBuilder(BoPWoods.byId(j).getName() + "_wooden_crate").parent(new UncheckedModelFile(modid + ":block/" + BoPWoods.byId(j).getName() + "_wooden_crate"));
            getBuilder(BoPWoods.byId(j).getName() + "_fancy_chest").parent(new UncheckedModelFile(modid + ":block/" + BoPWoods.byId(j).getName() + "_fancy_chest"));

            for(int i = 0; i < Arrays.stream(DyeColor.values()).count(); i++)
            {
                getBuilder(DyeColor.byId(i).getName() + "_" + BoPWoods.byId(j).getName() + "_fancy_bed").parent(
                    new UncheckedModelFile(modid + ":block/" + DyeColor.byId(i).getName() + "_" + BoPWoods.byId(j).getName() + "_fancy_bed_inventory"));
            }
        }
    }
}