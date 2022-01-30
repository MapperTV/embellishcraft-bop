package tv.mapper.embellishcraft_bop.data.gen;

import net.minecraft.core.Direction;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.block.BedBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.ChestBlock;
import net.minecraft.world.level.block.state.properties.BedPart;
import net.minecraftforge.client.model.generators.ModelFile.UncheckedModelFile;
import net.minecraftforge.client.model.generators.MultiPartBlockStateBuilder;
import net.minecraftforge.client.model.generators.VariantBlockStateBuilder;
import net.minecraftforge.common.data.ExistingFileHelper;
import tv.mapper.embellishcraft.furniture.data.gen.FurnitureBlockStates;
import tv.mapper.embellishcraft.furniture.world.level.block.TableBlock;
import tv.mapper.embellishcraft_bop.init.ECBoPBlocks;
import tv.mapper.embellishcraft_bop.util.BoPWoods;

public class ECBoPBlockStates extends FurnitureBlockStates
{
    public ECBoPBlockStates(DataGenerator gen, String modid, ExistingFileHelper exFileHelper)
    {
        super(gen, modid, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels()
    {
        for(int j = 0; j < BoPWoods.values().length; j++)
        {
            horizontalBlock(ECBoPBlocks.BOP_CHAIR_BLOCKS.get(BoPWoods.byId(j)).get(), new UncheckedModelFile(mod_id + ":block/" + BoPWoods.byId(j).getSerializedName() + "_chair"), 0);
            horizontalBlock(ECBoPBlocks.BOP_TERRACE_CHAIR_BLOCKS.get(BoPWoods.byId(j)).get(), new UncheckedModelFile(mod_id + ":block/" + BoPWoods.byId(j).getSerializedName() + "_terrace_chair"), 0);
            tableBlock(ECBoPBlocks.BOP_TABLE_BLOCKS.get(BoPWoods.byId(j)).get());
            tableBlock(ECBoPBlocks.BOP_FANCY_TABLE_BLOCKS.get(BoPWoods.byId(j)).get());
            simpleBlock(ECBoPBlocks.BOP_TERRACE_TABLE_BLOCKS.get(BoPWoods.byId(j)).get());
            simpleBlock(ECBoPBlocks.BOP_WOODEN_CRATE_BLOCKS.get(BoPWoods.byId(j)).get());
            // getVariantBuilder(ECBoPBlocks.FANCY_CHEST_BLOCKS.get(BoPWoods.byId(j)).get()).partialState().setModels(
            // new ConfiguredModel(new UncheckedModelFile(mod_id + ":model/" + BoPWoods.byId(j).getSerializedName() + "_fancy_chest")));
            // chestBlock(ECBoPBlocks.BOP_FANCY_CHEST_BLOCKS.get(BoPWoods.byId(j)).get(), 0);
            horizontalBlock(ECBoPBlocks.BOP_SUSPENDED_STAIRS_BLOCKS.get(BoPWoods.byId(j)).get(), new UncheckedModelFile(mod_id + ":block/" + BoPWoods.byId(j).getSerializedName() + "_suspended_stairs"), 0);
            horizontalBlock(ECBoPBlocks.BOP_LARGE_SUSPENDED_STAIRS_BLOCKS.get(BoPWoods.byId(j)).get(), new UncheckedModelFile(mod_id + ":block/" + BoPWoods.byId(j).getSerializedName() + "_large_suspended_stairs"), 0);
            doorBlock(ECBoPBlocks.BOP_FANCY_DOOR_BLOCKS.get(BoPWoods.byId(j)).get(), new ResourceLocation(mod_id, "block/" + BoPWoods.byId(j).getSerializedName() + "_fancy_door_bottom"), new ResourceLocation(mod_id, "block/" + BoPWoods.byId(j).getSerializedName() + "_fancy_door_top"));
            doorBlock(ECBoPBlocks.BOP_PLAIN_DOOR_BLOCKS.get(BoPWoods.byId(j)).get(), new ResourceLocation(mod_id, "block/" + BoPWoods.byId(j).getSerializedName() + "_plain_door_bottom"), new ResourceLocation(mod_id, "block/" + BoPWoods.byId(j).getSerializedName() + "_plain_door_top"));
        }

        for(int j = 0; j < DyeColor.values().length; j++)
        {
            bedBlock(ECBoPBlocks.CHERRY_FANCY_BED_BLOCKS.get(DyeColor.byId(j)).get(), 180);
            bedBlock(ECBoPBlocks.DEAD_FANCY_BED_BLOCKS.get(DyeColor.byId(j)).get(), 180);
            bedBlock(ECBoPBlocks.FIR_FANCY_BED_BLOCKS.get(DyeColor.byId(j)).get(), 180);
            bedBlock(ECBoPBlocks.HELLBARK_FANCY_BED_BLOCKS.get(DyeColor.byId(j)).get(), 180);
            bedBlock(ECBoPBlocks.JACARANDA_FANCY_BED_BLOCKS.get(DyeColor.byId(j)).get(), 180);
            bedBlock(ECBoPBlocks.MAGIC_FANCY_BED_BLOCKS.get(DyeColor.byId(j)).get(), 180);
            bedBlock(ECBoPBlocks.MAHOGANY_FANCY_BED_BLOCKS.get(DyeColor.byId(j)).get(), 180);
            bedBlock(ECBoPBlocks.PALM_FANCY_BED_BLOCKS.get(DyeColor.byId(j)).get(), 180);
            bedBlock(ECBoPBlocks.REDWOOD_FANCY_BED_BLOCKS.get(DyeColor.byId(j)).get(), 180);
            bedBlock(ECBoPBlocks.UMBRAN_FANCY_BED_BLOCKS.get(DyeColor.byId(j)).get(), 180);
            bedBlock(ECBoPBlocks.WILLOW_FANCY_BED_BLOCKS.get(DyeColor.byId(j)).get(), 180);
        }
    }

    private void tableBlock(Block block)
    {

        String raw[] = block.getRegistryName().toString().split(":");
        String name = raw[1];
        MultiPartBlockStateBuilder builder = getMultipartBuilder(block).part().modelFile(new UncheckedModelFile(mod_id + ":block/" + name + "_top")).addModel().end();
        builder.part().modelFile(new UncheckedModelFile(mod_id + ":block/" + name + "_foot")).uvLock(true).addModel().condition(TableBlock.TABLE_NORTH, true).end();
        builder.part().modelFile(new UncheckedModelFile(mod_id + ":block/" + name + "_foot")).rotationY(90).uvLock(true).addModel().condition(TableBlock.TABLE_EAST, true).end();
        builder.part().modelFile(new UncheckedModelFile(mod_id + ":block/" + name + "_foot")).rotationY(180).uvLock(true).addModel().condition(TableBlock.TABLE_SOUTH, true).end();
        builder.part().modelFile(new UncheckedModelFile(mod_id + ":block/" + name + "_foot")).rotationY(270).uvLock(true).addModel().condition(TableBlock.TABLE_WEST, true).end();
    }

    private void bedBlock(BedBlock block, int offset)
    {
        String raw[] = block.getRegistryName().toString().split(":");
        String name = raw[1];
        VariantBlockStateBuilder builder = getVariantBuilder(block);
        String model;

        for(Direction dir : Direction.Plane.HORIZONTAL)
        {
            for(BedPart type : BedPart.values())
            {
                model = type == BedPart.HEAD ? mod_id + ":block/" + name + "_head" : mod_id + ":block/" + name + "_foot";

                builder.partialState().with(BedBlock.PART, type).with(ChestBlock.FACING, dir).modelForState().modelFile(new UncheckedModelFile(model)).rotationY((int)((dir.toYRot() + offset) % 360)).addModel();
            }
        }
    }
}