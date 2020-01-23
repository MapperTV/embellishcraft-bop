package tv.mapper.embellishcraftbop.data.gen;

import java.util.function.Function;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.DoorBlock;
import net.minecraft.data.DataGenerator;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ConfiguredModel;
import net.minecraftforge.client.model.generators.ExistingFileHelper;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.client.model.generators.ModelFile.UncheckedModelFile;
import net.minecraftforge.client.model.generators.MultiPartBlockStateBuilder;
import tv.mapper.embellishcraft.block.TableBlock;
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
            orientableBlock(block, new UncheckedModelFile(modid + ":block/" + name), 0);
        }

        for(Block block : ECBoPBlocks.TERRACE_CHAIRS)
        {
            name = block.getRegistryName().toString().replace("embellishcraft-bop:", "");
            orientableBlock(block, new UncheckedModelFile(modid + ":block/" + name), 0);
        }

        for(Block block : ECBoPBlocks.TABLES)
        {
            tableBlock(block);
        }

        for(Block block : ECBoPBlocks.TERRACE_TABLES)
        {
            simpleBlock(block);
        }

        for(Block block : ECBoPBlocks.FANCY_TABLES)
        {
            tableBlock(block);
        }

        for(Block block : ECBoPBlocks.FANCY_DOORS)
        {
            name = block.getRegistryName().toString().replace("embellishcraft-bop:", "");
            String door = name.replace("_door", "");
            doorBlock((DoorBlock)block, door, new ResourceLocation(modid + ":block/" + name + "_bottom"), new ResourceLocation(modid + ":block/" + name + "_top"));
        }

        for(Block block : ECBoPBlocks.SUSPENDED_STAIRS)
        {
            name = block.getRegistryName().toString().replace("embellishcraft-bop:", "");
            orientableBlock(block, new UncheckedModelFile(modid + ":block/" + name), 0);
        }

        for(Block block : ECBoPBlocks.CRATES)
        {
            simpleBlock(block);
        }

        for(Block block : ECBoPBlocks.FANCY_BEDS)
        {
            name = block.getRegistryName().toString().replace("embellishcraft-bop:", "");
            simpleBlock(block, new UncheckedModelFile(modid + ":block/" + name));
        }

        for(Block block : ECBoPBlocks.FANCY_CHESTS)
        {
            name = block.getRegistryName().toString().replace("embellishcraft-bop:", "");
            simpleBlock(block, new UncheckedModelFile(modid + ":block/" + name));
        }
    }

    /**
     * Creates a blockstate file for blocks that have 4 orientations depeding of cardinal (north, south etc). e.g. chairs, suspended stairs...
     */
    protected void orientableBlock(Block block, ModelFile model, int angleOffset)
    {
        orientableBlock(block, $ -> model, angleOffset);
    }

    protected void orientableBlock(Block block, Function<BlockState, ModelFile> modelFunc, int angleOffset)
    {
        getVariantBuilder(block).forAllStatesExcept(
            state -> ConfiguredModel.builder().modelFile(modelFunc.apply(state)).rotationY(((int)state.get(BlockStateProperties.HORIZONTAL_FACING).getHorizontalAngle() + angleOffset) % 360).build(),
            BlockStateProperties.WATERLOGGED);
    }

    /**
     * Creates a blockstate file for the modular table blocks (noraml and fancy)
     */
    protected void tableBlock(Block block)
    {
        String name = block.getRegistryName().toString().replace("embellishcraft-bop:", "");
        MultiPartBlockStateBuilder builder = getMultipartBuilder(block).part().modelFile(new UncheckedModelFile(modid + ":block/" + name + "_top")).addModel().end();
        builder.part().modelFile(new UncheckedModelFile(modid + ":block/" + name + "_foot")).uvLock(true).addModel().condition(TableBlock.TABLE_NORTH, true).end();
        builder.part().modelFile(new UncheckedModelFile(modid + ":block/" + name + "_foot")).rotationY(90).uvLock(true).addModel().condition(TableBlock.TABLE_EAST, true).end();
        builder.part().modelFile(new UncheckedModelFile(modid + ":block/" + name + "_foot")).rotationY(180).uvLock(true).addModel().condition(TableBlock.TABLE_SOUTH, true).end();
        builder.part().modelFile(new UncheckedModelFile(modid + ":block/" + name + "_foot")).rotationY(270).uvLock(true).addModel().condition(TableBlock.TABLE_WEST, true).end();
    }
}
