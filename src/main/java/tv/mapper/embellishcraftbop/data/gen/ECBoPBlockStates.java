package tv.mapper.embellishcraftbop.data.gen;

import java.util.function.Function;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.data.DataGenerator;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ConfiguredModel;
import net.minecraftforge.client.model.generators.ExistingFileHelper;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.client.model.generators.ModelFile.UncheckedModelFile;
import tv.mapper.embellishcraftbop.EmbellishCraftBOP;
import tv.mapper.embellishcraftbop.init.ECBoPBlocks;

public class ECBoPBlockStates extends BlockStateProvider
{
    public ECBoPBlockStates(DataGenerator gen, ExistingFileHelper exFileHelper)
    {
        super(gen, EmbellishCraftBOP.MODID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels()
    {
        String name;

        for(Block block : ECBoPBlocks.CHAIRS)
        {
            name = block.getRegistryName().toString().replace("embellishcraft-bop:", "");
            chairBlock(block, new UncheckedModelFile(modid + ":block/" + name), 0);
        }

        for(Block block : ECBoPBlocks.TERRACE_CHAIRS)
        {
            name = block.getRegistryName().toString().replace("embellishcraft-bop:", "");
            chairBlock(block, new UncheckedModelFile(modid + ":block/" + name), 0);
        }

        // for(Block block : ECBoPBlocks.TABLES)
        // lootTables.put(block, createStandardTable(block.getTranslationKey(), block));
        //
        // for(Block block : ECBoPBlocks.TERRACE_TABLES)
        // lootTables.put(block, createStandardTable(block.getTranslationKey(), block));
        //
        // for(Block block : ECBoPBlocks.FANCY_TABLES)
        // lootTables.put(block, createStandardTable(block.getTranslationKey(), block));
        //
        // for(Block block : ECBoPBlocks.FANCY_DOORS)
        // lootTables.put(block, createDoorTable(block.getTranslationKey(), block));
        //
        // for(Block block : ECBoPBlocks.SUSPENDED_STAIRS)
        // lootTables.put(block, createStandardTable(block.getTranslationKey(), block));
        //
        // for(Block block : ECBoPBlocks.CRATES)
        // lootTables.put(block, createCrateTable(block.getTranslationKey(), block));
    }

    protected void chairBlock(Block block, ModelFile model, int angleOffset)
    {
        chairBlock(block, $ -> model, angleOffset);
    }

    protected void chairBlock(Block block, Function<BlockState, ModelFile> modelFunc, int angleOffset)
    {
        getVariantBuilder(block).forAllStatesExcept(
            state -> ConfiguredModel.builder().modelFile(modelFunc.apply(state)).rotationY(((int)state.get(BlockStateProperties.HORIZONTAL_FACING).getHorizontalAngle() + angleOffset) % 360).build(),
            BlockStateProperties.WATERLOGGED);
    }
}
