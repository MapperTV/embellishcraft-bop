package tv.mapper.embellishcraftbop.data.gen;

import java.util.Arrays;

import org.codehaus.plexus.util.StringUtils;

import net.minecraft.data.DataGenerator;
import net.minecraft.item.DyeColor;
import net.minecraftforge.common.data.LanguageProvider;
import tv.mapper.embellishcraftbop.EmbellishCraftBOP;
import tv.mapper.embellishcraftbop.init.ECBoPBlocks;
import tv.mapper.embellishcraftbop.util.BoPWoods;

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
        String name, color;

        switch(lang)
        {
            default:
            case "en_us":
                for(int j = 0; j < Arrays.stream(BoPWoods.values()).count(); j++)
                {
                    name = BoPWoods.byId(j).getName("en_us");

                    addBlock(ECBoPBlocks.BOP_CHAIR_BLOCKS.get(BoPWoods.byId(j)), name + " Chair");
                    addBlock(ECBoPBlocks.BOP_TERRACE_CHAIR_BLOCKS.get(BoPWoods.byId(j)), name + " Terrace Chair");
                    addBlock(ECBoPBlocks.BOP_TABLE_BLOCKS.get(BoPWoods.byId(j)), name + " Table");
                    addBlock(ECBoPBlocks.BOP_FANCY_TABLE_BLOCKS.get(BoPWoods.byId(j)), name + " Fancy Table");
                    addBlock(ECBoPBlocks.BOP_TERRACE_TABLE_BLOCKS.get(BoPWoods.byId(j)), name + " Terrace Table");
                    addBlock(ECBoPBlocks.BOP_FANCY_DOOR_BLOCKS.get(BoPWoods.byId(j)), name + " Fancy Door");
                    addBlock(ECBoPBlocks.BOP_SUSPENDED_STAIRS_BLOCKS.get(BoPWoods.byId(j)), name + " Suspended Stairs");
                    addBlock(ECBoPBlocks.BOP_WOODEN_CRATE_BLOCKS.get(BoPWoods.byId(j)), name + " Wooden Crate");
                    addBlock(ECBoPBlocks.BOP_FANCY_CHEST_BLOCKS.get(BoPWoods.byId(j)), name + " Fancy Chest");
                }

                for(int j = 0; j < Arrays.stream(DyeColor.values()).count(); j++)
                {
                    String raw[] = DyeColor.byId(j).getName().split("_");
                    if(raw[0].equals("light"))
                        color = StringUtils.capitalise(raw[0]) + " " + StringUtils.capitalise(raw[1]);
                    else
                        color = StringUtils.capitalise(raw[0]);

                    addBlock(ECBoPBlocks.CHERRY_FANCY_BED_BLOCKS.get(DyeColor.byId(j)), color + " Cherry Fancy Bed");
                    addBlock(ECBoPBlocks.DEAD_FANCY_BED_BLOCKS.get(DyeColor.byId(j)), color + " Dead Fancy Bed");
                    addBlock(ECBoPBlocks.FIR_FANCY_BED_BLOCKS.get(DyeColor.byId(j)), color + " Fir Fancy Bed");
                    addBlock(ECBoPBlocks.HELLBARK_FANCY_BED_BLOCKS.get(DyeColor.byId(j)), color + " Hellbark Fancy Bed");
                    addBlock(ECBoPBlocks.JACARANDA_FANCY_BED_BLOCKS.get(DyeColor.byId(j)), color + " Jacaranda Fancy Bed");
                    addBlock(ECBoPBlocks.MAGIC_FANCY_BED_BLOCKS.get(DyeColor.byId(j)), color + " Magic Fancy Bed");
                    addBlock(ECBoPBlocks.MAHOGANY_FANCY_BED_BLOCKS.get(DyeColor.byId(j)), color + " Mahogany Fancy Bed");
                    addBlock(ECBoPBlocks.PALM_FANCY_BED_BLOCKS.get(DyeColor.byId(j)), color + " Palm Fancy Bed");
                    addBlock(ECBoPBlocks.REDWOOD_FANCY_BED_BLOCKS.get(DyeColor.byId(j)), color + " Redwood Fancy Bed");
                    addBlock(ECBoPBlocks.UMBRAN_FANCY_BED_BLOCKS.get(DyeColor.byId(j)), color + " Umbran Fancy Bed");
                    addBlock(ECBoPBlocks.WILLOW_FANCY_BED_BLOCKS.get(DyeColor.byId(j)), color + " Willow Fancy Bed");
                }
                break;
            case "fr_fr":
                for(int j = 0; j < Arrays.stream(BoPWoods.values()).count(); j++)
                {
                    name = BoPWoods.byId(j).getName("fr_fr");

                    addBlock(ECBoPBlocks.BOP_CHAIR_BLOCKS.get(BoPWoods.byId(j)), "Chaise en " + name);
                    addBlock(ECBoPBlocks.BOP_TERRACE_CHAIR_BLOCKS.get(BoPWoods.byId(j)), "Chaise de terrasse en " + name);
                    addBlock(ECBoPBlocks.BOP_TABLE_BLOCKS.get(BoPWoods.byId(j)), "Table en " + name);
                    addBlock(ECBoPBlocks.BOP_FANCY_TABLE_BLOCKS.get(BoPWoods.byId(j)), "Table massive en " + name);
                    addBlock(ECBoPBlocks.BOP_TERRACE_TABLE_BLOCKS.get(BoPWoods.byId(j)), "Table de terrasse en " + name);
                    addBlock(ECBoPBlocks.BOP_FANCY_DOOR_BLOCKS.get(BoPWoods.byId(j)), "Porte massive en " + name);
                    addBlock(ECBoPBlocks.BOP_SUSPENDED_STAIRS_BLOCKS.get(BoPWoods.byId(j)), "Escaliers suspendus en " + name);
                    addBlock(ECBoPBlocks.BOP_WOODEN_CRATE_BLOCKS.get(BoPWoods.byId(j)), "Caisse en " + name);
                    addBlock(ECBoPBlocks.BOP_FANCY_CHEST_BLOCKS.get(BoPWoods.byId(j)), "Coffre massif en " + name);
                }

                for(int j = 0; j < Arrays.stream(DyeColor.values()).count(); j++)
                {
                    String raw[] = DyeColor.byId(j).getName().split("_");
                    if(raw[0].equals("light"))
                        name = StringUtils.capitalise(raw[0]) + " " + StringUtils.capitalise(raw[1]);
                    else
                        name = StringUtils.capitalise(raw[0]);

                    color = translateColor(name);

                    addBlock(ECBoPBlocks.CHERRY_FANCY_BED_BLOCKS.get(DyeColor.byId(j)), "Lit massif " + color + " en bois de cerisier");
                    addBlock(ECBoPBlocks.DEAD_FANCY_BED_BLOCKS.get(DyeColor.byId(j)), "Lit massif " + color + " en bois mort");
                    addBlock(ECBoPBlocks.FIR_FANCY_BED_BLOCKS.get(DyeColor.byId(j)), "Lit massif " + color + " en bois de sapin");
                    addBlock(ECBoPBlocks.HELLBARK_FANCY_BED_BLOCKS.get(DyeColor.byId(j)), "Lit massif " + color + " en écorce infernale");
                    addBlock(ECBoPBlocks.JACARANDA_FANCY_BED_BLOCKS.get(DyeColor.byId(j)), "Lit massif " + color + " en jacaranda");
                    addBlock(ECBoPBlocks.MAGIC_FANCY_BED_BLOCKS.get(DyeColor.byId(j)), "Lit massif " + color + " en bois magique");
                    addBlock(ECBoPBlocks.MAHOGANY_FANCY_BED_BLOCKS.get(DyeColor.byId(j)), "Lit massif " + color + " en bois d'acajou");
                    addBlock(ECBoPBlocks.PALM_FANCY_BED_BLOCKS.get(DyeColor.byId(j)), "Lit massif " + color + " en bois de palmier");
                    addBlock(ECBoPBlocks.REDWOOD_FANCY_BED_BLOCKS.get(DyeColor.byId(j)), "Lit massif " + color + " en bois de sequoia");
                    addBlock(ECBoPBlocks.UMBRAN_FANCY_BED_BLOCKS.get(DyeColor.byId(j)), "Lit massif " + color + " en bois sinistre");
                    addBlock(ECBoPBlocks.WILLOW_FANCY_BED_BLOCKS.get(DyeColor.byId(j)), "Lit massif " + color + " en bois de saule");
                }
                break;
        }
    }

    private static String translateColor(String color)
    {
        switch(color)
        {
            case "Black":
                return "noir";
            case "Blue":
                return "bleu";
            case "Brown":
                return "marron";
            case "Cyan":
                return "cyan";
            case "Gray":
                return "gris";
            case "Light Gray":
                return "gris clair";
            case "Light Blue":
                return "bleu clair";
            case "Lime":
                return "vert clair";
            case "Magenta":
                return "magenta";
            case "Orange":
                return "orange";
            case "Purple":
                return "violet";
            case "Pink":
                return "rose";
            case "Red":
                return "rouge";
            case "White":
                return "blanc";
            case "Yellow":
                return "jaune";
            case "Green":
                return "vert";
            default:
                return "error";
        }
    }
}