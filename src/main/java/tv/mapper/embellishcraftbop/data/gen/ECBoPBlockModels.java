package tv.mapper.embellishcraftbop.data.gen;

import net.minecraft.block.Block;
import net.minecraft.data.DataGenerator;
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
        return "EmbellishCraft BoP Block Models";
    }

    @Override
    protected void registerModels()
    {
        String name, wood;

        for(Block block : ECBoPBlocks.CHAIRS)
        {
            name = block.getRegistryName().toString().replace("embellishcraft-bop:", "");
            wood = name.replace("_chair", "");
            getBuilder(name).parent(getExistingFile(mcLoc("block/cube_all"))).texture("all", "biomesoplenty:block/" + wood + "_planks");
        }
    }
}
