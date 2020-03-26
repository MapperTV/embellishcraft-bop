package tv.mapper.embellishcraftbop.util;

import biomesoplenty.api.block.BOPBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.DyeColor;
import net.minecraft.item.Item;
import net.minecraft.tags.Tag;
import net.minecraftforge.common.Tags;
import tv.mapper.embellishcraft.util.WoodsType;
import tv.mapper.embellishcraftbop.init.ECBoPBlocks;

public class ECBoPBlockUtils
{
    public static final Block[] bopSlabs = {BOPBlocks.cherry_slab, BOPBlocks.dead_slab, BOPBlocks.fir_slab, BOPBlocks.hellbark_slab, BOPBlocks.jacaranda_slab, BOPBlocks.magic_slab, BOPBlocks.mahogany_slab, BOPBlocks.palm_slab, BOPBlocks.redwood_slab, BOPBlocks.umbran_slab, BOPBlocks.willow_slab};
    public static final Block[] bopPlanks = {BOPBlocks.cherry_planks, BOPBlocks.dead_planks, BOPBlocks.fir_planks, BOPBlocks.hellbark_planks, BOPBlocks.jacaranda_planks, BOPBlocks.magic_planks, BOPBlocks.mahogany_planks, BOPBlocks.palm_planks, BOPBlocks.redwood_planks, BOPBlocks.umbran_planks, BOPBlocks.willow_planks};
    public static final Block[] bopLogs = {BOPBlocks.cherry_log, BOPBlocks.dead_log, BOPBlocks.fir_log, BOPBlocks.hellbark_log, BOPBlocks.jacaranda_log, BOPBlocks.magic_log, BOPBlocks.mahogany_log, BOPBlocks.palm_log, BOPBlocks.redwood_log, BOPBlocks.umbran_log, BOPBlocks.willow_log};
    public static final Block[] bopPressure = {BOPBlocks.cherry_pressure_plate, BOPBlocks.dead_pressure_plate, BOPBlocks.fir_pressure_plate, BOPBlocks.hellbark_pressure_plate, BOPBlocks.jacaranda_pressure_plate, BOPBlocks.magic_pressure_plate, BOPBlocks.mahogany_pressure_plate, BOPBlocks.palm_pressure_plate, BOPBlocks.redwood_pressure_plate, BOPBlocks.umbran_pressure_plate, BOPBlocks.willow_pressure_plate};
    public static final Block[] bopButtons = {BOPBlocks.cherry_button, BOPBlocks.dead_button, BOPBlocks.fir_button, BOPBlocks.hellbark_button, BOPBlocks.jacaranda_button, BOPBlocks.magic_button, BOPBlocks.mahogany_button, BOPBlocks.palm_button, BOPBlocks.redwood_button, BOPBlocks.umbran_button, BOPBlocks.willow_button};

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

    public static Tag<Item> getDyeTagFromColor(DyeColor color)
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