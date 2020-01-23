package tv.mapper.embellishcraftbop.data.gen;

import net.minecraft.block.Block;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.LanguageProvider;
import tv.mapper.embellishcraft.block.CustomBedBlock;
import tv.mapper.embellishcraft.util.WoodType;
import tv.mapper.embellishcraftbop.EmbellishCraftBOP;
import tv.mapper.embellishcraftbop.init.ECBoPBlocks;

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
        int i = 6;

        switch(lang)
        {
            default:
            case "en_us":
                for(Block block : ECBoPBlocks.CHAIRS)
                {
                    add(block, capitalize(WoodType.byId(i).getName()) + " Chair");
                    i++;
                }
                i = 6;
                for(Block block : ECBoPBlocks.TERRACE_CHAIRS)
                {
                    add(block, capitalize(WoodType.byId(i).getName()) + " Terrace Chair");
                    i++;
                }
                i = 6;
                for(Block block : ECBoPBlocks.TABLES)
                {
                    add(block, capitalize(WoodType.byId(i).getName()) + " Table");
                    i++;
                }
                i = 6;
                for(Block block : ECBoPBlocks.TERRACE_TABLES)
                {
                    add(block, capitalize(WoodType.byId(i).getName()) + " Terrace Table");
                    i++;
                }
                i = 6;
                for(Block block : ECBoPBlocks.FANCY_TABLES)
                {
                    add(block, capitalize(WoodType.byId(i).getName()) + " Fancy Table");
                    i++;
                }
                i = 6;
                for(Block block : ECBoPBlocks.FANCY_DOORS)
                {
                    add(block, capitalize(WoodType.byId(i).getName()) + " Fancy Door");
                    i++;
                }
                i = 6;
                for(Block block : ECBoPBlocks.SUSPENDED_STAIRS)
                {
                    add(block, capitalize(WoodType.byId(i).getName()) + " Suspended Stairs");
                    i++;
                }
                i = 6;
                for(Block block : ECBoPBlocks.CRATES)
                {
                    add(block, capitalize(WoodType.byId(i).getName()) + " Wooden Crate");
                    i++;
                }
                i = 6;
                for(Block block : ECBoPBlocks.FANCY_BEDS)
                {
                    String color = ((CustomBedBlock)block).getColor().getName();
                    String wood = ((CustomBedBlock)block).getWood().getName();

                    String check[] = color.split("_");
                    if(check.length > 1)
                        color = capitalize(check[0]) + " " + capitalize(check[1]);
                    else
                        color = capitalize(check[0]);

                    check = wood.split("_");
                    if(check.length > 1)
                        wood = capitalize(check[0]) + " " + capitalize(check[1]);
                    else
                        wood = capitalize(check[0]);

                    add(block, color + " " + wood + " Fancy Bed");
                    i++;
                }
                i = 6;
                for(Block block : ECBoPBlocks.FANCY_CHESTS)
                {
                    add(block, capitalize(WoodType.byId(i).getName()) + " Fancy Chest");
                    i++;
                }
                break;
            case "fr_fr":
                for(Block block : ECBoPBlocks.CHAIRS)
                {
                    add(block, "Chaise en " + WoodType.byId(i).getName("fr_fr"));
                    i++;
                }
                i = 6;
                for(Block block : ECBoPBlocks.TERRACE_CHAIRS)
                {
                    add(block, "Chaise de terrasse en " + WoodType.byId(i).getName("fr_fr"));
                    i++;
                }
                i = 6;
                for(Block block : ECBoPBlocks.TABLES)
                {
                    add(block, "Table en " + WoodType.byId(i).getName("fr_fr"));
                    i++;
                }
                i = 6;
                for(Block block : ECBoPBlocks.TERRACE_TABLES)
                {
                    add(block, "Table de terrasse en " + WoodType.byId(i).getName("fr_fr"));
                    i++;
                }
                i = 6;
                for(Block block : ECBoPBlocks.FANCY_TABLES)
                {
                    add(block, "Table massive en " + WoodType.byId(i).getName("fr_fr"));
                    i++;
                }
                i = 6;
                for(Block block : ECBoPBlocks.FANCY_DOORS)
                {
                    add(block, "Porte en " + WoodType.byId(i).getName("fr_fr"));
                    i++;
                }
                i = 6;
                for(Block block : ECBoPBlocks.SUSPENDED_STAIRS)
                {
                    add(block, "Escaliers suspendus en " + WoodType.byId(i).getName("fr_fr"));
                    i++;
                }
                i = 6;
                for(Block block : ECBoPBlocks.CRATES)
                {
                    add(block, "Caisse en " + WoodType.byId(i).getName("fr_fr"));
                    i++;
                }
                i = 6;
                for(Block block : ECBoPBlocks.FANCY_BEDS)
                {

                    String color = ((CustomBedBlock)block).getColor().getName();
                    String wood = ((CustomBedBlock)block).getWood().getName("fr_fr");

                    String check[] = color.split("_");
                    if(check.length > 1)
                        color = check[0] + " " + check[1];
                    else
                        color = check[0];

                    check = wood.split("_");
                    if(check.length > 1)
                        wood = check[0] + " " + check[1];
                    else
                        wood = check[0];

                    color = translateColor(color);

                    add(block, "Lit massif " + color + " en " + wood);

                    i++;
                }
                i = 6;
                for(Block block : ECBoPBlocks.FANCY_CHESTS)
                {
                    add(block, "Coffre massif en " + WoodType.byId(i).getName("fr_fr"));
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

    private static String translateColor(String color)
    {
        switch(color)
        {
            case "black":
                return "noir";
            case "blue":
                return "bleu";
            case "brown":
                return "marron";
            case "cyan":
                return "cyan";
            case "gray":
                return "gris";
            case "light gray":
                return "gris clair";
            case "light blue":
                return "bleu clair";
            case "lime":
                return "vert clair";
            case "magenta":
                return "magenta";
            case "orange":
                return "orange";
            case "purple":
                return "violet";
            case "pink":
                return "rose";
            case "red":
                return "rouge";
            case "white":
                return "blanc";
            case "yellow":
                return "jaune";
            case "green":
                return "vert";
            default:
                return "error";
        }
    }
}