package tv.mapper.embellishcraft_bop.util;

import biomesoplenty.api.block.BOPBlocks;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.Tags.IOptionalNamedTag;
import tv.mapper.embellishcraft.core.util.WoodsType;
import tv.mapper.embellishcraft_bop.init.ECBoPBlocks;

public class ECBoPBlockUtils
{
    public static final Block[] bopSlabs = {BOPBlocks.CHERRY_SLAB, BOPBlocks.DEAD_SLAB, BOPBlocks.FIR_SLAB, BOPBlocks.HELLBARK_SLAB, BOPBlocks.JACARANDA_SLAB, BOPBlocks.MAGIC_SLAB, BOPBlocks.MAHOGANY_SLAB, BOPBlocks.PALM_SLAB, BOPBlocks.REDWOOD_SLAB, BOPBlocks.UMBRAN_SLAB, BOPBlocks.WILLOW_SLAB};
    public static final Block[] bopPlanks = {BOPBlocks.CHERRY_PLANKS, BOPBlocks.DEAD_PLANKS, BOPBlocks.FIR_PLANKS, BOPBlocks.HELLBARK_PLANKS, BOPBlocks.JACARANDA_PLANKS, BOPBlocks.MAGIC_PLANKS, BOPBlocks.MAHOGANY_PLANKS, BOPBlocks.PALM_PLANKS, BOPBlocks.REDWOOD_PLANKS, BOPBlocks.UMBRAN_PLANKS, BOPBlocks.WILLOW_PLANKS};
    public static final Block[] bopLogs = {BOPBlocks.CHERRY_LOG, BOPBlocks.DEAD_LOG, BOPBlocks.FIR_LOG, BOPBlocks.HELLBARK_LOG, BOPBlocks.JACARANDA_LOG, BOPBlocks.MAGIC_LOG, BOPBlocks.MAHOGANY_LOG, BOPBlocks.PALM_LOG, BOPBlocks.REDWOOD_LOG, BOPBlocks.UMBRAN_LOG, BOPBlocks.WILLOW_LOG};
    public static final Block[] bopPressure = {BOPBlocks.CHERRY_PRESSURE_PLATE, BOPBlocks.DEAD_PRESSURE_PLATE, BOPBlocks.FIR_PRESSURE_PLATE, BOPBlocks.HELLBARK_PRESSURE_PLATE, BOPBlocks.JACARANDA_PRESSURE_PLATE, BOPBlocks.MAGIC_PRESSURE_PLATE, BOPBlocks.MAHOGANY_PRESSURE_PLATE, BOPBlocks.PALM_PRESSURE_PLATE, BOPBlocks.REDWOOD_PRESSURE_PLATE, BOPBlocks.UMBRAN_PRESSURE_PLATE, BOPBlocks.WILLOW_PRESSURE_PLATE};
    public static final Block[] bopButtons = {BOPBlocks.CHERRY_BUTTON, BOPBlocks.DEAD_BUTTON, BOPBlocks.FIR_BUTTON, BOPBlocks.HELLBARK_BUTTON, BOPBlocks.JACARANDA_BUTTON, BOPBlocks.MAGIC_BUTTON, BOPBlocks.MAHOGANY_BUTTON, BOPBlocks.PALM_BUTTON, BOPBlocks.REDWOOD_BUTTON, BOPBlocks.UMBRAN_BUTTON, BOPBlocks.WILLOW_BUTTON};

    public static Block getWhiteBedFromWood(WoodsType wood)
    {
        switch(wood)
        {
            default:
            case CHERRY:
                return ECBoPBlocks.CHERRY_FANCY_BED_BLOCKS.get(DyeColor.byId(0)).get();
            case DEAD:
                return ECBoPBlocks.DEAD_FANCY_BED_BLOCKS.get(DyeColor.byId(0)).get();
            case FIR:
                return ECBoPBlocks.FIR_FANCY_BED_BLOCKS.get(DyeColor.byId(0)).get();
            case HELLBARK:
                return ECBoPBlocks.HELLBARK_FANCY_BED_BLOCKS.get(DyeColor.byId(0)).get();
            case JACARANDA:
                return ECBoPBlocks.JACARANDA_FANCY_BED_BLOCKS.get(DyeColor.byId(0)).get();
            case MAGIC:
                return ECBoPBlocks.MAGIC_FANCY_BED_BLOCKS.get(DyeColor.byId(0)).get();
            case MAHOGANY:
                return ECBoPBlocks.MAHOGANY_FANCY_BED_BLOCKS.get(DyeColor.byId(0)).get();
            case PALM:
                return ECBoPBlocks.PALM_FANCY_BED_BLOCKS.get(DyeColor.byId(0)).get();
            case REDWOOD:
                return ECBoPBlocks.REDWOOD_FANCY_BED_BLOCKS.get(DyeColor.byId(0)).get();
            case UMBRAN:
                return ECBoPBlocks.UMBRAN_FANCY_BED_BLOCKS.get(DyeColor.byId(0)).get();
            case WILLOW:
                return ECBoPBlocks.WILLOW_FANCY_BED_BLOCKS.get(DyeColor.byId(0)).get();
        }
    }

    public static Block getWoolFromColor(DyeColor color)
    {
        switch(color)
        {
            default:
            case BLACK:
                return Blocks.BLACK_WOOL;
            case BLUE:
                return Blocks.BLUE_WOOL;
            case BROWN:
                return Blocks.BROWN_WOOL;
            case CYAN:
                return Blocks.CYAN_WOOL;
            case GRAY:
                return Blocks.GRAY_WOOL;
            case GREEN:
                return Blocks.GREEN_WOOL;
            case LIGHT_BLUE:
                return Blocks.LIGHT_BLUE_WOOL;
            case LIGHT_GRAY:
                return Blocks.LIGHT_GRAY_WOOL;
            case LIME:
                return Blocks.LIME_WOOL;
            case MAGENTA:
                return Blocks.MAGENTA_WOOL;
            case ORANGE:
                return Blocks.ORANGE_WOOL;
            case PINK:
                return Blocks.PINK_WOOL;
            case PURPLE:
                return Blocks.PURPLE_WOOL;
            case RED:
                return Blocks.RED_WOOL;
            case WHITE:
                return Blocks.WHITE_WOOL;
            case YELLOW:
                return Blocks.YELLOW_WOOL;
        }
    }

    public static IOptionalNamedTag<Item> getDyeTagFromColor(DyeColor color)
    {
        switch(color)
        {
            default:
            case BLACK:
                return Tags.Items.DYES_BLACK;
            case BLUE:
                return Tags.Items.DYES_BLUE;
            case BROWN:
                return Tags.Items.DYES_BROWN;
            case CYAN:
                return Tags.Items.DYES_CYAN;
            case GRAY:
                return Tags.Items.DYES_GRAY;
            case GREEN:
                return Tags.Items.DYES_GREEN;
            case LIGHT_BLUE:
                return Tags.Items.DYES_LIGHT_BLUE;
            case LIGHT_GRAY:
                return Tags.Items.DYES_LIGHT_GRAY;
            case LIME:
                return Tags.Items.DYES_LIME;
            case MAGENTA:
                return Tags.Items.DYES_MAGENTA;
            case ORANGE:
                return Tags.Items.DYES_ORANGE;
            case PINK:
                return Tags.Items.DYES_PINK;
            case PURPLE:
                return Tags.Items.DYES_PURPLE;
            case RED:
                return Tags.Items.DYES_RED;
            case WHITE:
                return Tags.Items.DYES_WHITE;
            case YELLOW:
                return Tags.Items.DYES_YELLOW;
        }
    }
}