package tv.mapper.embellishcraftbop.init;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.Tag;
import net.minecraft.util.ResourceLocation;
import tv.mapper.embellishcraftbop.EmbellishCraftBOP;

public class ECBoPTags
{
    public static class Blocks
    {
        public static final Tag<Block> WOODEN_DOORS = tag("wooden_doors");
        public static final Tag<Block> WOODEN_CRATES = tag("wooden_crates");

        private static Tag<Block> tag(String name)
        {
            return new BlockTags.Wrapper(new ResourceLocation(EmbellishCraftBOP.MODID, name));
        }
    }

    public static class Items
    {
        public static final Tag<Item> WOODEN_DOORS = tag("wooden_doors");
        public static final Tag<Item> WOODEN_CRATES = tag("wooden_crates");

        private static Tag<Item> tag(String name)
        {
            return new ItemTags.Wrapper(new ResourceLocation(EmbellishCraftBOP.MODID, name));
        }
    }

    public static class ForgeBlocks
    {
        public static final Tag<Block> CHAIRS = tag("chairs");
        public static final Tag<Block> TABLES = tag("tables");

        private static Tag<Block> tag(String name)
        {
            return new BlockTags.Wrapper(new ResourceLocation("forge", name));
        }
    }

    public static class ForgeItems
    {
        public static final Tag<Item> CHAIRS = tag("chairs");
        public static final Tag<Item> TABLES = tag("tables");

        private static Tag<Item> tag(String name)
        {
            return new ItemTags.Wrapper(new ResourceLocation("forge", name));
        }
    }
}
