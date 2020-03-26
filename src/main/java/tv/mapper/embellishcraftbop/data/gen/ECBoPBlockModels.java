package tv.mapper.embellishcraftbop.data.gen;

import java.util.Arrays;

import net.minecraft.data.DataGenerator;
import net.minecraft.item.DyeColor;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.generators.ExistingFileHelper;
import tv.mapper.embellishcraft.data.gen.ECBlockModels;
import tv.mapper.embellishcraftbop.EmbellishCraftBOP;
import tv.mapper.embellishcraftbop.util.BoPWoods;

public class ECBoPBlockModels extends ECBlockModels
{

    public ECBoPBlockModels(DataGenerator generator, String modid, ExistingFileHelper existingFileHelper)
    {
        super(generator, modid, existingFileHelper);
    }

    @Override
    public String getName()
    {
        return "EmbellishCraft-BoP Block Models";
    }

    @Override
    protected void registerModels()
    {
        for(int j = 0; j < Arrays.stream(BoPWoods.values()).count(); j++)
        {
            getBuilder(BoPWoods.byId(j).getName() + "_chair").parent(getExistingFile(modLoc("block/chair"))).texture("material", new ResourceLocation("block/" + BoPWoods.byId(j).getName() + "_planks")).texture(
                "particle", new ResourceLocation("biomesoplenty", "block/" + BoPWoods.byId(j).getName() + "_planks"));
            getBuilder(BoPWoods.byId(j).getName() + "_terrace_chair").parent(getExistingFile(modLoc("block/terrace_chair"))).texture("material",
                new ResourceLocation(EmbellishCraftBOP.MODID, "block/" + BoPWoods.byId(j).getName() + "_terrace_table")).texture("particle",
                    new ResourceLocation(EmbellishCraftBOP.MODID, "block/" + BoPWoods.byId(j).getName() + "_terrace_table"));
            getBuilder(BoPWoods.byId(j).getName() + "_terrace_table").parent(getExistingFile(modLoc("block/terrace_table"))).texture("material",
                new ResourceLocation(EmbellishCraftBOP.MODID, "block/" + BoPWoods.byId(j).getName() + "_terrace_table")).texture("particle",
                    new ResourceLocation(EmbellishCraftBOP.MODID, "block/" + BoPWoods.byId(j).getName() + "_terrace_table"));

            getBuilder(BoPWoods.byId(j).getName() + "_table_foot").parent(getExistingFile(modLoc("block/table_foot"))).texture("material",
                new ResourceLocation("block/" + BoPWoods.byId(j).getName() + "_planks")).texture("particle", new ResourceLocation("biomesoplenty", "block/" + BoPWoods.byId(j).getName() + "_planks"));
            getBuilder(BoPWoods.byId(j).getName() + "_table_inventory").parent(getExistingFile(modLoc("block/table_inventory"))).texture("material",
                new ResourceLocation("block/" + BoPWoods.byId(j).getName() + "_planks"));
            getBuilder(BoPWoods.byId(j).getName() + "_table_top").parent(getExistingFile(modLoc("block/table_top"))).texture("material",
                new ResourceLocation("block/" + BoPWoods.byId(j).getName() + "_planks")).texture("particle", new ResourceLocation("biomesoplenty", "block/" + BoPWoods.byId(j).getName() + "_planks"));

            getBuilder(BoPWoods.byId(j).getName() + "_fancy_table_foot").parent(getExistingFile(modLoc("block/fancy_table_foot"))).texture("side",
                new ResourceLocation(EmbellishCraftBOP.MODID, "block/" + BoPWoods.byId(j).getName() + "_fancy_table_side")).texture("top",
                    new ResourceLocation(EmbellishCraftBOP.MODID, "block/" + BoPWoods.byId(j).getName() + "_fancy_table_top")).texture("particle",
                        new ResourceLocation("biomesoplenty", "block/" + BoPWoods.byId(j).getName() + "_planks"));
            getBuilder(BoPWoods.byId(j).getName() + "_fancy_table_inventory").parent(getExistingFile(modLoc("block/fancy_table_inventory"))).texture("side",
                new ResourceLocation(EmbellishCraftBOP.MODID, "block/" + BoPWoods.byId(j).getName() + "_fancy_table_side")).texture("top",
                    new ResourceLocation(EmbellishCraftBOP.MODID, "block/" + BoPWoods.byId(j).getName() + "_fancy_table_top"));
            getBuilder(BoPWoods.byId(j).getName() + "_fancy_table_top").parent(getExistingFile(modLoc("block/fancy_table_top"))).texture("side",
                new ResourceLocation(EmbellishCraftBOP.MODID, "block/" + BoPWoods.byId(j).getName() + "_fancy_table_side")).texture("top",
                    new ResourceLocation(EmbellishCraftBOP.MODID, "block/" + BoPWoods.byId(j).getName() + "_fancy_table_top")).texture("particle",
                        new ResourceLocation("biomesoplenty", "block/" + BoPWoods.byId(j).getName() + "_planks"));

            getBuilder(BoPWoods.byId(j).getName() + "_suspended_stairs").parent(getExistingFile(modLoc("block/suspended_stairs"))).texture("all",
                new ResourceLocation("biomesoplenty", "block/" + BoPWoods.byId(j).getName() + "_planks"));

            // getBuilder(BoPWoods.byId(j).getName() + "_fancy_chest").texture("particle", new ResourceLocation("biomesoplenty", "block/" + BoPWoods.byId(j).getName() + "_planks"));
            getBuilder(BoPWoods.byId(j).getName() + "_fancy_chest").parent(getExistingFile(modLoc("block/chest"))).texture("particle",
                new ResourceLocation("biomesoplenty", "block/" + BoPWoods.byId(j).getName() + "_planks")).texture("front",
                    new ResourceLocation(EmbellishCraftBOP.MODID, "block/" + BoPWoods.byId(j).getName() + "_fancy_chest_front")).texture("side",
                        new ResourceLocation(EmbellishCraftBOP.MODID, "block/" + BoPWoods.byId(j).getName() + "_fancy_chest_side")).texture("top",
                            new ResourceLocation(EmbellishCraftBOP.MODID, "block/" + BoPWoods.byId(j).getName() + "_fancy_chest_top")).texture("bottom",
                                new ResourceLocation(EmbellishCraftBOP.MODID, "block/" + BoPWoods.byId(j).getName() + "_fancy_chest_bottom")).texture("lock",
                                    new ResourceLocation(EmbellishCraftBOP.MODID, "block/air_duct")).texture("particle", new ResourceLocation("block/" + BoPWoods.byId(j).getName() + "_planks"));
            getBuilder(BoPWoods.byId(j).getName() + "_fancy_chest_left").parent(getExistingFile(modLoc("block/chest_left"))).texture("particle",
                new ResourceLocation("biomesoplenty", "block/" + BoPWoods.byId(j).getName() + "_planks")).texture("front",
                    new ResourceLocation(EmbellishCraftBOP.MODID, "block/" + BoPWoods.byId(j).getName() + "_fancy_chest_front_right")).texture("side",
                        new ResourceLocation(EmbellishCraftBOP.MODID, "block/" + BoPWoods.byId(j).getName() + "_fancy_chest_side")).texture("top",
                            new ResourceLocation(EmbellishCraftBOP.MODID, "block/" + BoPWoods.byId(j).getName() + "_fancy_chest_top_right")).texture("bottom",
                                new ResourceLocation(EmbellishCraftBOP.MODID, "block/" + BoPWoods.byId(j).getName() + "_fancy_chest_bottom_right")).texture("back",
                                    new ResourceLocation(EmbellishCraftBOP.MODID, "block/" + BoPWoods.byId(j).getName() + "_fancy_chest_side_left")).texture("lock",
                                        new ResourceLocation(EmbellishCraftBOP.MODID, "block/air_duct"));
            getBuilder(BoPWoods.byId(j).getName() + "_fancy_chest_right").parent(getExistingFile(modLoc("block/chest_right"))).texture("particle",
                new ResourceLocation("biomesoplenty", "block/" + BoPWoods.byId(j).getName() + "_planks")).texture("front",
                    new ResourceLocation(EmbellishCraftBOP.MODID, "block/" + BoPWoods.byId(j).getName() + "_fancy_chest_front_left")).texture("side",
                        new ResourceLocation(EmbellishCraftBOP.MODID, "block/" + BoPWoods.byId(j).getName() + "_fancy_chest_side")).texture("top",
                            new ResourceLocation(EmbellishCraftBOP.MODID, "block/" + BoPWoods.byId(j).getName() + "_fancy_chest_top_left")).texture("bottom",
                                new ResourceLocation(EmbellishCraftBOP.MODID, "block/" + BoPWoods.byId(j).getName() + "_fancy_chest_bottom_left")).texture("back",
                                    new ResourceLocation(EmbellishCraftBOP.MODID, "block/" + BoPWoods.byId(j).getName() + "_fancy_chest_side_right")).texture("lock",
                                        new ResourceLocation(EmbellishCraftBOP.MODID, "block/air_duct"));
        }

        for(int i = 0; i < Arrays.stream(BoPWoods.values()).count(); i++)
        {
            for(int j = 0; j < Arrays.stream(DyeColor.values()).count(); j++)
            {
                buildBed(DyeColor.byId(j).getName(), BoPWoods.byId(i).getName(), "fancy_bed");
            }
        }
    }
}