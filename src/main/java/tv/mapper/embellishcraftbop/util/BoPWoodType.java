package tv.mapper.embellishcraftbop.util;

import java.util.Arrays;
import java.util.Comparator;

import net.minecraft.util.IStringSerializable;

public enum BoPWoodType implements IStringSerializable
{
    CHERRY(0, "cherry", "cerisier"),
    DEAD(1, "dead", "bois mort"),
    ETHEREAL(2, "ethereal", "bois ethere"),
    FIR(3, "fir", "sapin"),
    HELLBARK(4, "hellbark", "ecorce infernale"),
    JACARANDA(5, "jacaranda", "jacaranda"),
    MAGIC(6, "magic", "bois magique"),
    MAHOGANY(7, "mahogany", "acajou"),
    PALM(8, "palm", "palmier"),
    REDWOOD(9, "redwood", "sequoia"),
    UMBRAN(10, "umbran", "bois sinistre"),
    WILLOW(11, "willow", "saule");

    private static final BoPWoodType[] VALUES = Arrays.stream(values()).sorted(Comparator.comparingInt(BoPWoodType::getId)).toArray((map) ->
    {
        return new BoPWoodType[map];
    });

    private final int id;
    private final String en_us;
    private final String fr_fr;

    private BoPWoodType(int idIn, String en_us, String fr_fr)
    {
        this.id = idIn;
        this.en_us = en_us;
        this.fr_fr = fr_fr;
    }

    public String getName(String lang)
    {
        return lang.equals("fr_fr") ? this.fr_fr : this.en_us;
    }

    public int getId()
    {
        return this.id;
    }

    public static BoPWoodType byId(int id)
    {
        if(id < 0 || id >= VALUES.length)
        {
            id = 0;
        }

        return VALUES[id];
    }

    public static String getWoodByID(int id, String lang)
    {
        for(BoPWoodType wood : values())
        {
            if(wood.getId() == id)
                return wood.getName(lang);
        }
        return null;
    }

    @Override
    public String getName()
    {
        return getName("en_us");
    }

}