package tv.mapper.embellishcraft_bop.data.gen;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DoorBlock;
import net.minecraft.world.level.block.FenceBlock;
import net.minecraft.world.level.block.FenceGateBlock;
import net.minecraft.world.level.block.PressurePlateBlock;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.WallBlock;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import tv.mapper.embellishcraft.building.world.level.block.SuspendedStairsBlock;
import tv.mapper.embellishcraft.core.data.ECTags;
import tv.mapper.embellishcraft.furniture.world.level.block.ChairBlock;
import tv.mapper.embellishcraft.furniture.world.level.block.CouchBlock;
import tv.mapper.embellishcraft.furniture.world.level.block.CrateBlock;
import tv.mapper.embellishcraft.furniture.world.level.block.CustomBedBlock;
import tv.mapper.embellishcraft.furniture.world.level.block.TableBlock;
import tv.mapper.embellishcraft.furniture.world.level.block.TerraceTableBlock;
import tv.mapper.embellishcraft_bop.EmbellishCraftBOP;
import tv.mapper.embellishcraft_bop.init.ECBoPBlocks;
import tv.mapper.mapperbase.world.item.BaseTiers;
import tv.mapper.mapperbase.world.level.block.CustomButtonBlock;
import tv.mapper.mapperbase.world.level.block.CustomLadderBlock;
import tv.mapper.mapperbase.world.level.block.ToolManager;

public class ECBoPBlockTags extends BlockTagsProvider
{
    public ECBoPBlockTags(DataGenerator generatorIn, ExistingFileHelper existingFileHelper)
    {
        super(generatorIn, EmbellishCraftBOP.MODID, existingFileHelper);
    }

    @Override
    public void addTags()
    {
        // for(int j = 0; j < Arrays.stream(BoPWoods.values()).count(); j++)
        // {
        // this.tag(ECTags.ForgeBlocks.CHAIRS).add(ECBoPBlocks.BOP_CHAIR_BLOCKS.get(BoPWoods.byId(j)).get());
        // this.tag(ECTags.ForgeBlocks.CHAIRS).add(ECBoPBlocks.BOP_TERRACE_CHAIR_BLOCKS.get(BoPWoods.byId(j)).get());
        // this.tag(ECTags.ForgeBlocks.TABLES).add(ECBoPBlocks.BOP_TABLE_BLOCKS.get(BoPWoods.byId(j)).get());
        // this.tag(ECTags.ForgeBlocks.TABLES).add(ECBoPBlocks.BOP_FANCY_TABLE_BLOCKS.get(BoPWoods.byId(j)).get());
        // this.tag(ECTags.ForgeBlocks.TABLES).add(ECBoPBlocks.BOP_TERRACE_TABLE_BLOCKS.get(BoPWoods.byId(j)).get());
        // this.tag(ECTags.Blocks.WOODEN_DOORS).add(ECBoPBlocks.BOP_FANCY_DOOR_BLOCKS.get(BoPWoods.byId(j)).get());
        // this.tag(ECTags.Blocks.WOODEN_DOORS).add(ECBoPBlocks.BOP_PLAIN_DOOR_BLOCKS.get(BoPWoods.byId(j)).get());
        // this.tag(BlockTags.DOORS).add(ECBoPBlocks.BOP_FANCY_DOOR_BLOCKS.get(BoPWoods.byId(j)).get());
        // this.tag(BlockTags.DOORS).add(ECBoPBlocks.BOP_PLAIN_DOOR_BLOCKS.get(BoPWoods.byId(j)).get());
        // this.tag(ECTags.Blocks.WOODEN_CRATES).add(ECBoPBlocks.BOP_WOODEN_CRATE_BLOCKS.get(BoPWoods.byId(j)).get());
        // this.tag(Tags.Blocks.CHESTS).add(ECBoPBlocks.BOP_FANCY_CHEST_BLOCKS.get(BoPWoods.byId(j)).get());
        // this.tag(Tags.Blocks.CHESTS_WOODEN).add(ECBoPBlocks.BOP_FANCY_CHEST_BLOCKS.get(BoPWoods.byId(j)).get());
        // this.tag(ECTags.Blocks.SUSPENDED_STAIRS).add(ECBoPBlocks.BOP_SUSPENDED_STAIRS_BLOCKS.get(BoPWoods.byId(j)).get());
        // this.tag(ECTags.Blocks.SUSPENDED_STAIRS).add(ECBoPBlocks.BOP_LARGE_SUSPENDED_STAIRS_BLOCKS.get(BoPWoods.byId(j)).get());
        // }

        // for(int i = 0; i < Arrays.stream(DyeColor.values()).count(); i++)
        // {
        // this.tag(ECTags.Blocks.FANCY_BEDS).add(ECBoPBlocks.CHERRY_FANCY_BED_BLOCKS.get(DyeColor.byId(i)).get());
        // this.tag(ECTags.Blocks.FANCY_BEDS).add(ECBoPBlocks.DEAD_FANCY_BED_BLOCKS.get(DyeColor.byId(i)).get());
        // this.tag(ECTags.Blocks.FANCY_BEDS).add(ECBoPBlocks.FIR_FANCY_BED_BLOCKS.get(DyeColor.byId(i)).get());
        // this.tag(ECTags.Blocks.FANCY_BEDS).add(ECBoPBlocks.HELLBARK_FANCY_BED_BLOCKS.get(DyeColor.byId(i)).get());
        // this.tag(ECTags.Blocks.FANCY_BEDS).add(ECBoPBlocks.JACARANDA_FANCY_BED_BLOCKS.get(DyeColor.byId(i)).get());
        // this.tag(ECTags.Blocks.FANCY_BEDS).add(ECBoPBlocks.MAGIC_FANCY_BED_BLOCKS.get(DyeColor.byId(i)).get());
        // this.tag(ECTags.Blocks.FANCY_BEDS).add(ECBoPBlocks.MAHOGANY_FANCY_BED_BLOCKS.get(DyeColor.byId(i)).get());
        // this.tag(ECTags.Blocks.FANCY_BEDS).add(ECBoPBlocks.PALM_FANCY_BED_BLOCKS.get(DyeColor.byId(i)).get());
        // this.tag(ECTags.Blocks.FANCY_BEDS).add(ECBoPBlocks.REDWOOD_FANCY_BED_BLOCKS.get(DyeColor.byId(i)).get());
        // this.tag(ECTags.Blocks.FANCY_BEDS).add(ECBoPBlocks.UMBRAN_FANCY_BED_BLOCKS.get(DyeColor.byId(i)).get());
        // this.tag(ECTags.Blocks.FANCY_BEDS).add(ECBoPBlocks.WILLOW_FANCY_BED_BLOCKS.get(DyeColor.byId(i)).get());
        // }

        tag(BlockTags.WOODEN_DOORS).addTag(ECTags.Blocks.WOODEN_DOORS);
        tag(BlockTags.DOORS).addTag(ECTags.Blocks.WOODEN_DOORS);
        tag(BlockTags.BEDS).addTag(ECTags.Blocks.FANCY_BEDS);
        tag(ECTags.ForgeBlocks.CRATES).addTag(ECTags.Blocks.WOODEN_CRATES);

        for(RegistryObject<Block> object : ECBoPBlocks.BLOCKS.getEntries())
            addTagsFromBlockType(object.get());

        registerToolTags(ECBoPBlocks.BLOCKS);
    }

    private void addTagsFromBlockType(Block block)
    {
        if(block instanceof WallBlock)
            this.tag(BlockTags.WALLS).add(block);
        else if(block instanceof SlabBlock)
            this.tag(BlockTags.SLABS).add(block);
        else if(block instanceof StairBlock)
            this.tag(BlockTags.STAIRS).add(block);
        else if(block instanceof PressurePlateBlock)
            this.tag(BlockTags.PRESSURE_PLATES).add(block);
        else if(block instanceof CustomButtonBlock)
            this.tag(BlockTags.BUTTONS).add(block);
        else if(block instanceof FenceBlock)
            this.tag(Tags.Blocks.FENCES).add(block);
        else if(block instanceof FenceGateBlock)
            this.tag(Tags.Blocks.FENCE_GATES).add(block);
        else if(block instanceof CustomBedBlock)
            this.tag(ECTags.Blocks.FANCY_BEDS).add(block);
        else if(block instanceof CouchBlock)
            this.tag(ECTags.Blocks.COUCHES).add(block);
        else if(block instanceof CustomLadderBlock)
            this.tag(BlockTags.CLIMBABLE).add(block);
        else if(block instanceof ChairBlock)
            this.tag(ECTags.ForgeBlocks.CHAIRS).add(block);
        else if(block instanceof TableBlock || block instanceof TerraceTableBlock)
            this.tag(ECTags.ForgeBlocks.TABLES).add(block);
        else if(block instanceof SuspendedStairsBlock)
            this.tag(ECTags.Blocks.SUSPENDED_STAIRS).add(block);
        else if(block instanceof DoorBlock)
        {
            if(block.defaultBlockState().getMaterial().equals(Material.WOOD))
                this.tag(ECTags.Blocks.WOODEN_DOORS).add(block);
            this.tag(ECTags.Blocks.DOORS).add(block);
        }
        else if(block instanceof CrateBlock)
            this.tag(ECTags.Blocks.WOODEN_CRATES).add(block);
        // else if(block instanceof ChestBlock)
        // this.tag(Tags.Blocks.CHESTS_WOODEN).add(block);
    }

    // Tool system
    protected void registerToolTags(DeferredRegister<Block> blocks)
    {
        for(RegistryObject<Block> object : blocks.getEntries())
        {
            Block block = object.get();

            if(block instanceof ToolManager)
            {
                switch(((ToolManager)block).getTool())
                {
                    case PICKAXE:
                        this.tag(BlockTags.MINEABLE_WITH_PICKAXE).add(block);
                        break;
                    case AXE:
                        this.tag(BlockTags.MINEABLE_WITH_AXE).add(block);
                        break;
                    case SHOVEL:
                        this.tag(BlockTags.MINEABLE_WITH_SHOVEL).add(block);
                        break;
                    case HOE:
                        this.tag(BlockTags.MINEABLE_WITH_HOE).add(block);
                        break;
                    default:
                        break;
                }

                switch(((ToolManager)block).getTier())
                {
                    case WOOD:
                        this.tag(Tags.Blocks.NEEDS_WOOD_TOOL).add(block);
                        break;
                    case GOLD:
                        this.tag(Tags.Blocks.NEEDS_GOLD_TOOL).add(block);
                        break;
                    case STONE:
                        this.tag(BlockTags.NEEDS_STONE_TOOL).add(block);
                        break;
                    case IRON:
                        this.tag(BlockTags.NEEDS_IRON_TOOL).add(block);
                        break;
                    case STEEL:
                        this.tag(BaseTiers.NEEDS_STEEL_TOOL).add(block);
                        break;
                    case DIAMOND:
                        this.tag(BlockTags.NEEDS_DIAMOND_TOOL).add(block);
                        break;
                    case NETHERITE:
                        this.tag(Tags.Blocks.NEEDS_NETHERITE_TOOL).add(block);
                        break;
                    default:
                        break;
                }
            }
        }
    }
}