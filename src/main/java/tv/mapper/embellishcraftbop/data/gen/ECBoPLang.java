package tv.mapper.embellishcraftbop.data.gen;

import net.minecraft.block.Block;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.LanguageProvider;
import tv.mapper.embellishcraftbop.EmbellishCraftBOP;
import tv.mapper.embellishcraftbop.init.ECBoPBlocks;
import tv.mapper.embellishcraftbop.util.BoPWoodType;

public class ECBoPLang extends LanguageProvider
{
    private String lang;

    public ECBoPLang(DataGenerator generator, String lang)
    {
        super(generator, EmbellishCraftBOP.MODID, lang);
        this.lang = lang;
    }

    @Override
    protected void addTranslations()
    {
        int i = 0;

        switch(lang)
        {
            default:
            case "en_us":
                for(Block block : ECBoPBlocks.CHAIRS)
                {
                    add(block, capitalize(BoPWoodType.byId(i).getName()) + " Chair");
                    i++;
                }
                i = 0;
                for(Block block : ECBoPBlocks.TERRACE_CHAIRS)
                {
                    add(block, capitalize(BoPWoodType.byId(i).getName()) + " Terrace Chair");
                    i++;
                }
                i = 0;
                for(Block block : ECBoPBlocks.TABLES)
                {
                    add(block, capitalize(BoPWoodType.byId(i).getName()) + " Table");
                    i++;
                }
                i = 0;
                for(Block block : ECBoPBlocks.TERRACE_TABLES)
                {
                    add(block, capitalize(BoPWoodType.byId(i).getName()) + " Terrace Table");
                    i++;
                }
                i = 0;
                for(Block block : ECBoPBlocks.FANCY_TABLES)
                {
                    add(block, capitalize(BoPWoodType.byId(i).getName()) + " Fancy Table");
                    i++;
                }
                i = 0;
                for(Block block : ECBoPBlocks.FANCY_DOORS)
                {
                    add(block, capitalize(BoPWoodType.byId(i).getName()) + " Fancy Door");
                    i++;
                }
                i = 0;
                for(Block block : ECBoPBlocks.SUSPENDED_STAIRS)
                {
                    add(block, capitalize(BoPWoodType.byId(i).getName()) + " Suspended Stairs");
                    i++;
                }
                i = 0;
                for(Block block : ECBoPBlocks.CRATES)
                {
                    add(block, capitalize(BoPWoodType.byId(i).getName()) + " Wooden Crate");
                    i++;
                }
                break;
            case "fr_fr":
                for(Block block : ECBoPBlocks.CHAIRS)
                {
                    add(block, "Chaise en " + BoPWoodType.byId(i).getName("fr_fr"));
                    i++;
                }
                i = 0;
                for(Block block : ECBoPBlocks.TERRACE_CHAIRS)
                {
                    add(block, "Chaise de terrasse en " + BoPWoodType.byId(i).getName("fr_fr"));
                    i++;
                }
                i = 0;
                for(Block block : ECBoPBlocks.TABLES)
                {
                    add(block, "Table en " + BoPWoodType.byId(i).getName("fr_fr"));
                    i++;
                }
                i = 0;
                for(Block block : ECBoPBlocks.TERRACE_TABLES)
                {
                    add(block, "Table de terrasse en " + BoPWoodType.byId(i).getName("fr_fr"));
                    i++;
                }
                i = 0;
                for(Block block : ECBoPBlocks.FANCY_TABLES)
                {
                    add(block, "Table massive en " + BoPWoodType.byId(i).getName("fr_fr"));
                    i++;
                }
                i = 0;
                for(Block block : ECBoPBlocks.FANCY_DOORS)
                {
                    add(block, "Porte en " + BoPWoodType.byId(i).getName("fr_fr"));
                    i++;
                }
                i = 0;
                for(Block block : ECBoPBlocks.SUSPENDED_STAIRS)
                {
                    add(block, "Escaliers suspendus en " + BoPWoodType.byId(i).getName("fr_fr"));
                    i++;
                }
                i = 0;
                for(Block block : ECBoPBlocks.CRATES)
                {
                    add(block, "Caisse en " + BoPWoodType.byId(i).getName("fr_fr"));
                    i++;
                }
                break;
        }
    }

    public static String capitalize(String str)
    {
        if(str == null || str.isEmpty())
        {
            return str;
        }

        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }
}