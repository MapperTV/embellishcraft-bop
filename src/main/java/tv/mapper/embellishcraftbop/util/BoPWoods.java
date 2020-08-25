package tv.mapper.embellishcraftbop.util;

import java.util.Arrays;
import java.util.Comparator;

import net.minecraft.util.IStringSerializable;

public enum BoPWoods implements IStringSerializable
{
    CHERRY(0, "cherry", "cerisier", "Cherry"),
    DEAD(1, "dead", "bois mort", "Dead"),
    FIR(2, "fir", "sapin", "Fir"),
    HELLBARK(3, "hellbark", "écorce infernale", "Hellbark"),
    JACARANDA(4, "jacaranda", "jacaranda", "Jacaranda"),
    MAGIC(5, "magic", "bois magique", "Magic"),
    MAHOGANY(6, "mahogany", "acajou", "Mahogany"),
    PALM(7, "palm", "palmier", "Palm"),
    REDWOOD(8, "redwood", "sequoia", "Redwood"),
    UMBRAN(9, "umbran", "bois sinistre", "Umbran"),
    WILLOW(10, "willow", "saule", "Willow");

    private static final BoPWoods[] VALUES = Arrays.stream(values()).sorted(Comparator.comparingInt(BoPWoods::getId)).toArray((map) ->
    {
        return new BoPWoods[map];
    });

    private final int id;
    private final String name;
    private final String en_us;
    private final String fr_fr;

    private BoPWoods(int idIn, String name, String fr_fr, String en_us)
    {
        this.id = idIn;
        this.name = name;
        this.en_us = en_us;
        this.fr_fr = fr_fr;
    }

    @Override
    public String getString()
    {
        return name;
    }

    public String getString(String lang)
    {
        return lang.equals("fr_fr") ? this.fr_fr : this.en_us;
    }

    public int getId()
    {
        return this.id;
    }

    public static BoPWoods byId(int id)
    {
        if(id < 0 || id >= VALUES.length)
        {
            id = 0;
        }

        return VALUES[id];
    }

    public static String getWoodByID(int id)
    {
        for(BoPWoods wood : values())
        {
            if(wood.getId() == id)
                return wood.getString();
        }
        return null;
    }
}