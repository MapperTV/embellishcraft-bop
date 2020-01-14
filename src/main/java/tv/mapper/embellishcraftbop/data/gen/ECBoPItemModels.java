package tv.mapper.embellishcraftbop.data.gen;

import net.minecraft.block.Block;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.ExistingFileHelper;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelFile.UncheckedModelFile;
import tv.mapper.embellishcraftbop.EmbellishCraftBOP;
import tv.mapper.embellishcraftbop.init.ECBoPBlocks;

public class ECBoPItemModels extends ItemModelProvider
{
    public ECBoPItemModels(DataGenerator generator, ExistingFileHelper existingFileHelper)
    {
        super(generator, EmbellishCraftBOP.MODID, existingFileHelper);
    }

    @Override
    public String getName()
    {
        return "EmbellishCraft-BoP Item Models";
    }

    @Override
    protected void registerModels()
    {
        String name;

        for(Block block : ECBoPBlocks.CHAIRS)
        {
            name = block.getRegistryName().toString().replace("embellishcraft-bop:", "");
            getBuilder(name).parent(new UncheckedModelFile(modid + ":block/" + name));
        }

        for(Block block : ECBoPBlocks.TERRACE_CHAIRS)
        {
            name = block.getRegistryName().toString().replace("embellishcraft-bop:", "");
            getBuilder(name).parent(new UncheckedModelFile(modid + ":block/" + name));
        }

        for(Block block : ECBoPBlocks.TABLES)
        {
            name = block.getRegistryName().toString().replace("embellishcraft-bop:", "");
            getBuilder(name).parent(new UncheckedModelFile(modid + ":block/" + name + "_inventory"));
        }

        for(Block block : ECBoPBlocks.TERRACE_TABLES)
        {
            name = block.getRegistryName().toString().replace("embellishcraft-bop:", "");
            getBuilder(name).parent(new UncheckedModelFile(modid + ":block/" + name));
        }

        for(Block block : ECBoPBlocks.FANCY_TABLES)
        {
            name = block.getRegistryName().toString().replace("embellishcraft-bop:", "");
            getBuilder(name).parent(new UncheckedModelFile(modid + ":block/" + name + "_inventory"));
        }

        for(Block block : ECBoPBlocks.FANCY_DOORS)
        {
            name = block.getRegistryName().toString().replace("embellishcraft-bop:", "");
            getBuilder(name).parent(new UncheckedModelFile("item/generated")).texture("layer0", modLoc("item/" + name));
        }

        for(Block block : ECBoPBlocks.SUSPENDED_STAIRS)
        {
            name = block.getRegistryName().toString().replace("embellishcraft-bop:", "");
            getBuilder(name).parent(new UncheckedModelFile(modid + ":block/" + name));
        }

        for(Block block : ECBoPBlocks.CRATES)
        {
            name = block.getRegistryName().toString().replace("embellishcraft-bop:", "");
            getBuilder(name).parent(new UncheckedModelFile(modid + ":block/" + name));
        }
    }
}
