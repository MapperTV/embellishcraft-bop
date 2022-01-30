package tv.mapper.embellishcraft_bop.data.gen;

import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.DyeColor;
import net.minecraftforge.common.data.ExistingFileHelper;
import tv.mapper.embellishcraft.core.ECConstants;
import tv.mapper.embellishcraft.core.data.gen.ECBlockModels;
import tv.mapper.embellishcraft_bop.util.BoPWoods;

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
        for(int i = 0; i < BoPWoods.values().length; i++)
        {
            getBuilder(BoPWoods.byId(i).getSerializedName() + "_chair").parent(getExistingFile(new ResourceLocation("embellishcraft", "block/chair"))).texture("material", new ResourceLocation("biomesoplenty", "block/" + BoPWoods.byId(i).getSerializedName() + "_planks")).texture("particle", new ResourceLocation("biomesoplenty", "block/" + BoPWoods.byId(i).getSerializedName() + "_planks"));
            getBuilder(BoPWoods.byId(i).getSerializedName() + "_terrace_chair").parent(getExistingFile(new ResourceLocation("embellishcraft", "block/terrace_chair"))).texture("material", new ResourceLocation(modid, "block/" + BoPWoods.byId(i).getSerializedName() + "_terrace_table")).texture("particle", new ResourceLocation(modid, "block/" + BoPWoods.byId(i).getSerializedName() + "_terrace_table"));
            getBuilder(BoPWoods.byId(i).getSerializedName() + "_terrace_table").parent(getExistingFile(new ResourceLocation("embellishcraft", "block/terrace_table"))).texture("material", new ResourceLocation(modid, "block/" + BoPWoods.byId(i).getSerializedName() + "_terrace_table")).texture("particle", new ResourceLocation(modid, "block/" + BoPWoods.byId(i).getSerializedName() + "_terrace_table"));

            getBuilder(BoPWoods.byId(i).getSerializedName() + "_table_foot").parent(getExistingFile(new ResourceLocation("embellishcraft", "block/table_foot"))).texture("material", new ResourceLocation("biomesoplenty", "block/" + BoPWoods.byId(i).getSerializedName() + "_planks")).texture("particle", new ResourceLocation("biomesoplenty", "block/" + BoPWoods.byId(i).getSerializedName() + "_planks"));
            getBuilder(BoPWoods.byId(i).getSerializedName() + "_table_inventory").parent(getExistingFile(new ResourceLocation("embellishcraft", "block/table_inventory"))).texture("material", new ResourceLocation("biomesoplenty", "block/" + BoPWoods.byId(i).getSerializedName() + "_planks"));
            getBuilder(BoPWoods.byId(i).getSerializedName() + "_table_top").parent(getExistingFile(new ResourceLocation("embellishcraft", "block/table_top"))).texture("material", new ResourceLocation("biomesoplenty", "block/" + BoPWoods.byId(i).getSerializedName() + "_planks")).texture("particle", new ResourceLocation("biomesoplenty", "block/" + BoPWoods.byId(i).getSerializedName() + "_planks"));

            getBuilder(BoPWoods.byId(i).getSerializedName() + "_fancy_table_foot").parent(getExistingFile(new ResourceLocation("embellishcraft", "block/fancy_table_foot"))).texture("side", new ResourceLocation(modid, "block/" + BoPWoods.byId(i).getSerializedName() + "_fancy_table_side")).texture("top", new ResourceLocation(modid, "block/" + BoPWoods.byId(i).getSerializedName() + "_fancy_table_top")).texture("particle", new ResourceLocation("biomesoplenty", "block/" + BoPWoods.byId(i).getSerializedName() + "_planks"));
            getBuilder(BoPWoods.byId(i).getSerializedName() + "_fancy_table_inventory").parent(getExistingFile(new ResourceLocation("embellishcraft", "block/fancy_table_inventory"))).texture("side", new ResourceLocation(modid, "block/" + BoPWoods.byId(i).getSerializedName() + "_fancy_table_side")).texture("top", new ResourceLocation(modid, "block/" + BoPWoods.byId(i).getSerializedName() + "_fancy_table_top"));
            getBuilder(BoPWoods.byId(i).getSerializedName() + "_fancy_table_top").parent(getExistingFile(new ResourceLocation("embellishcraft", "block/fancy_table_top"))).texture("side", new ResourceLocation(modid, "block/" + BoPWoods.byId(i).getSerializedName() + "_fancy_table_side")).texture("top", new ResourceLocation(modid, "block/" + BoPWoods.byId(i).getSerializedName() + "_fancy_table_top")).texture("particle", new ResourceLocation("biomesoplenty", "block/" + BoPWoods.byId(i).getSerializedName() + "_planks"));

            getBuilder(BoPWoods.byId(i).getSerializedName() + "_suspended_stairs").parent(getExistingFile(new ResourceLocation("embellishcraft", "block/suspended_stairs"))).texture("all", new ResourceLocation("biomesoplenty", "block/" + BoPWoods.byId(i).getSerializedName() + "_planks"));
            getBuilder(BoPWoods.byId(i).getSerializedName() + "_large_suspended_stairs").parent(getExistingFile(new ResourceLocation("embellishcraft", "block/large_suspended_stairs"))).texture("all", new ResourceLocation("biomesoplenty", "block/" + BoPWoods.byId(i).getSerializedName() + "_planks"));

            // getBuilder(BoPWoods.byId(j).getSerializedName() + "_fancy_chest").texture("particle", new ResourceLocation("biomesoplenty", "block/" + BoPWoods.byId(j).getSerializedName() +
            // "_planks"));
            getBuilder(BoPWoods.byId(i).getSerializedName() + "_fancy_chest").parent(getExistingFile(new ResourceLocation("embellishcraft", "block/chest"))).texture("particle", new ResourceLocation("biomesoplenty", "block/" + BoPWoods.byId(i).getSerializedName() + "_planks")).texture("front", new ResourceLocation(modid, "block/" + BoPWoods.byId(i).getSerializedName() + "_fancy_chest_front")).texture("side", new ResourceLocation(modid, "block/" + BoPWoods.byId(i).getSerializedName() + "_fancy_chest_side")).texture("top", new ResourceLocation(modid, "block/" + BoPWoods.byId(i).getSerializedName() + "_fancy_chest_top")).texture("bottom", new ResourceLocation(modid, "block/" + BoPWoods.byId(i).getSerializedName() + "_fancy_chest_bottom")).texture("lock", new ResourceLocation(ECConstants.MODID, "block/air_duct")).texture("particle", new ResourceLocation("biomesoplenty", "block/" + BoPWoods.byId(i).getSerializedName() + "_planks"));
            getBuilder(BoPWoods.byId(i).getSerializedName() + "_fancy_chest_left").parent(getExistingFile(new ResourceLocation("embellishcraft", "block/chest_left"))).texture("particle", new ResourceLocation("biomesoplenty", "block/" + BoPWoods.byId(i).getSerializedName() + "_planks")).texture("front", new ResourceLocation(modid, "block/" + BoPWoods.byId(i).getSerializedName() + "_fancy_chest_front_right")).texture("side", new ResourceLocation(modid, "block/" + BoPWoods.byId(i).getSerializedName() + "_fancy_chest_side")).texture("top", new ResourceLocation(modid, "block/" + BoPWoods.byId(i).getSerializedName() + "_fancy_chest_top_right")).texture("bottom", new ResourceLocation(modid, "block/" + BoPWoods.byId(i).getSerializedName() + "_fancy_chest_bottom_right")).texture("back", new ResourceLocation(modid, "block/" + BoPWoods.byId(i).getSerializedName() + "_fancy_chest_side_left")).texture("lock", new ResourceLocation(ECConstants.MODID, "block/air_duct"));
            getBuilder(BoPWoods.byId(i).getSerializedName() + "_fancy_chest_right").parent(getExistingFile(new ResourceLocation("embellishcraft", "block/chest_right"))).texture("particle", new ResourceLocation("biomesoplenty", "block/" + BoPWoods.byId(i).getSerializedName() + "_planks")).texture("front", new ResourceLocation(modid, "block/" + BoPWoods.byId(i).getSerializedName() + "_fancy_chest_front_left")).texture("side", new ResourceLocation(modid, "block/" + BoPWoods.byId(i).getSerializedName() + "_fancy_chest_side")).texture("top", new ResourceLocation(modid, "block/" + BoPWoods.byId(i).getSerializedName() + "_fancy_chest_top_left")).texture("bottom", new ResourceLocation(modid, "block/" + BoPWoods.byId(i).getSerializedName() + "_fancy_chest_bottom_left")).texture("back", new ResourceLocation(modid, "block/" + BoPWoods.byId(i).getSerializedName() + "_fancy_chest_side_right")).texture("lock", new ResourceLocation(ECConstants.MODID, "block/air_duct"));
            cubeColumn(BoPWoods.byId(i).getSerializedName() + "_wooden_crate", modLoc("block/" + BoPWoods.byId(i).getSerializedName() + "_wooden_crate"), modLoc("block/" + BoPWoods.byId(i).getSerializedName() + "_wooden_crate_top"));

            for(int j = 0; j < DyeColor.values().length; j++)
            {
                buildBed(DyeColor.byId(j).getSerializedName(), BoPWoods.byId(i).getSerializedName(), "fancy_bed", "biomesoplenty");
            }
        }
    }

    private void buildBed(String color, String wood, String name, String planks_modid)
    {
        getBuilder(color + "_" + wood + "_" + name + "_head").parent(getExistingFile(new ResourceLocation(ECConstants.MODID, "block/" + name + "_head"))).texture("head", new ResourceLocation(modid, "block/" + color + "_" + wood + "_" + name + "_head")).texture("head_side", new ResourceLocation(modid, "block/" + color + "_" + wood + "_" + name + "_head_side")).texture("head_end", new ResourceLocation(modid, "block/" + wood + "_" + name + "_head_end")).texture("under", new ResourceLocation(planks_modid, "block/" + wood + "_planks")).texture("particle", new ResourceLocation(planks_modid, "block/" + wood + "_planks"));
        getBuilder(color + "_" + wood + "_" + name + "_foot").parent(getExistingFile(new ResourceLocation(ECConstants.MODID, "block/" + name + "_foot"))).texture("foot", new ResourceLocation(modid, "block/" + color + "_" + wood + "_" + name + "_foot")).texture("foot_side", new ResourceLocation(modid, "block/" + color + "_" + wood + "_" + name + "_foot_side")).texture("foot_end", new ResourceLocation(modid, "block/" + wood + "_" + name + "_foot_end")).texture("under", new ResourceLocation(planks_modid, "block/" + wood + "_planks")).texture("particle", new ResourceLocation(planks_modid, "block/" + wood + "_planks"));
        getBuilder(color + "_" + wood + "_" + name + "_inventory").parent(getExistingFile(new ResourceLocation(ECConstants.MODID, "block/" + name + "_inventory"))).texture("bed", new ResourceLocation(modid, "block/" + color + "_" + wood + "_" + name + "_head")).texture("end", new ResourceLocation(modid, "block/" + wood + "_" + name + "_head_end")).texture("under", new ResourceLocation(planks_modid, "block/" + wood + "_planks"));
    }
}