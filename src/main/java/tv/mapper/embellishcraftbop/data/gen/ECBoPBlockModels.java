package tv.mapper.embellishcraftbop.data.gen;

import net.minecraft.block.Block;
import net.minecraft.data.DataGenerator;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.generators.BlockModelProvider;
import net.minecraftforge.client.model.generators.ExistingFileHelper;
import tv.mapper.embellishcraftbop.EmbellishCraftBOP;
import tv.mapper.embellishcraftbop.init.ECBoPBlocks;

public class ECBoPBlockModels extends BlockModelProvider
{

    public ECBoPBlockModels(DataGenerator generator, ExistingFileHelper existingFileHelper)
    {
        super(generator, EmbellishCraftBOP.MODID, existingFileHelper);
    }

    @Override
    public String getName()
    {
        return "EmbellishCraft-BoP Block Models";
    }

    @Override
    protected void registerModels()
    {
        String name, wood;

        for(Block block : ECBoPBlocks.CHAIRS)
        {
            name = block.getRegistryName().toString().replace("embellishcraft-bop:", "");
            wood = name.replace("_chair", "");
            getBuilder(name).parent(getExistingFile(new ResourceLocation("embellishcraft", "block/furniture/chair"))).texture("1",
                new ResourceLocation("biomesoplenty", "block/" + wood + "_planks")).texture("particle", new ResourceLocation("biomesoplenty", "block/" + wood + "_planks"));
        }

        for(Block block : ECBoPBlocks.TERRACE_CHAIRS)
        {
            name = block.getRegistryName().toString().replace("embellishcraft-bop:", "");
            wood = name.replace("_terrace_chair", "");
            getBuilder(name).parent(getExistingFile(new ResourceLocation("embellishcraft", "block/furniture/terrace_chair"))).texture("material", modLoc("block/" + wood + "_terrace_table")).texture(
                "particle", modLoc("block/" + wood + "_terrace_table"));
        }

        for(Block block : ECBoPBlocks.TABLES)
        {
            name = block.getRegistryName().toString().replace("embellishcraft-bop:", "");
            wood = name.replace("_table", "");
            getBuilder(name + "_foot").parent(getExistingFile(new ResourceLocation("embellishcraft", "block/furniture/table/table_foot"))).texture("material",
                new ResourceLocation("biomesoplenty", "block/" + wood + "_planks")).texture("particle", new ResourceLocation("biomesoplenty", "block/" + wood + "_planks"));
            getBuilder(name + "_inventory").parent(getExistingFile(new ResourceLocation("embellishcraft", "block/furniture/table/table_inventory"))).texture("material",
                new ResourceLocation("biomesoplenty", "block/" + wood + "_planks"));
            getBuilder(name + "_top").parent(getExistingFile(new ResourceLocation("embellishcraft", "block/furniture/table/table_top"))).texture("material",
                new ResourceLocation("biomesoplenty", "block/" + wood + "_planks")).texture("particle", new ResourceLocation("biomesoplenty", "block/" + wood + "_planks"));
        }

        for(Block block : ECBoPBlocks.TERRACE_TABLES)
        {
            name = block.getRegistryName().toString().replace("embellishcraft-bop:", "");
            getBuilder(name).parent(getExistingFile(new ResourceLocation("embellishcraft", "block/furniture/terrace_table"))).texture("material", modLoc("block/" + name)).texture("particle",
                modLoc("block/" + name));
        }

        for(Block block : ECBoPBlocks.FANCY_TABLES)
        {
            name = block.getRegistryName().toString().replace("embellishcraft-bop:", "");
            wood = name.replace("_fancy_table", "");
            getBuilder(name + "_foot").parent(getExistingFile(new ResourceLocation("embellishcraft", "block/furniture/table/fancy/fancy_table_foot"))).texture("side",
                modLoc("block/" + name + "_side")).texture("top", modLoc("block/" + name + "_top")).texture("particle", new ResourceLocation("biomesoplenty", "block/" + wood + "_planks"));
            getBuilder(name + "_inventory").parent(getExistingFile(new ResourceLocation("embellishcraft", "block/furniture/table/fancy/fancy_table_inventory"))).texture("side",
                modLoc("block/" + name + "_side")).texture("top", modLoc("block/" + name + "_top"));
            getBuilder(name + "_top").parent(getExistingFile(new ResourceLocation("embellishcraft", "block/furniture/table/fancy/fancy_table_top"))).texture("side",
                modLoc("block/" + name + "_side")).texture("top", modLoc("block/" + name + "_top")).texture("particle", new ResourceLocation("biomesoplenty", "block/" + wood + "_planks"));
        }

        for(Block block : ECBoPBlocks.FANCY_DOORS)
        {
            name = block.getRegistryName().toString().replace("embellishcraft-bop:", "");
            getBuilder(name + "_bottom").parent(getExistingFile(mcLoc("block/door_bottom"))).texture("bottom", modLoc("block/" + name + "_bottom")).texture("top", modLoc("block/" + name + "_top"));
            getBuilder(name + "_bottom_hinge").parent(getExistingFile(mcLoc("block/door_bottom_rh"))).texture("bottom", modLoc("block/" + name + "_bottom")).texture("top",
                modLoc("block/" + name + "_top"));
            getBuilder(name + "_top").parent(getExistingFile(mcLoc("block/door_top"))).texture("bottom", modLoc("block/" + name + "_bottom")).texture("top", modLoc("block/" + name + "_top"));
            getBuilder(name + "_top_hinge").parent(getExistingFile(mcLoc("block/door_top_rh"))).texture("bottom", modLoc("block/" + name + "_bottom")).texture("top", modLoc("block/" + name + "_top"));
        }

        for(Block block : ECBoPBlocks.SUSPENDED_STAIRS)
        {
            name = block.getRegistryName().toString().replace("embellishcraft-bop:", "");
            wood = name.replace("_suspended_stairs", "");
            getBuilder(name).parent(getExistingFile(new ResourceLocation("embellishcraft", "block/stairs/base/suspended_stairs"))).texture("all",
                new ResourceLocation("biomesoplenty", "block/" + wood + "_planks"));
        }

        for(Block block : ECBoPBlocks.CRATES)
        {
            name = block.getRegistryName().toString().replace("embellishcraft-bop:", "");
            getBuilder(name).parent(getExistingFile(mcLoc("block/cube_all"))).texture("all", modLoc("block/" + name));
        }

        for(Block block : ECBoPBlocks.FANCY_BEDS)
        {
            name = block.getRegistryName().toString().replace("embellishcraft-bop:", "");

            String check[] = name.split("_");
            if(check[0].equals("light"))
            {
                wood = check[2];
                if(wood.equals("dark"))
                    wood = wood + "_" + check[3];
            }
            else
            {
                wood = check[1];
                if(wood.equals("dark"))
                    wood = wood + "_" + check[2];
            }
            getBuilder(name).texture("particle", new ResourceLocation("biomesoplenty", "block/" + wood + "_planks"));
        }

        for(Block block : ECBoPBlocks.FANCY_CHESTS)
        {
            name = block.getRegistryName().toString().replace("embellishcraft-bop:", "");

            String check[] = name.split("_");

            wood = check[0];
            if(wood.equals("dark"))
                wood = wood + "_" + check[1];

            getBuilder(name).texture("particle", new ResourceLocation("biomesoplenty", "block/" + wood + "_planks"));
        }
    }
}
