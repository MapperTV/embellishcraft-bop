package tv.mapper.embellishcraftbop.util;

import java.util.Arrays;
import java.util.Comparator;

import net.minecraft.util.IStringSerializable;

public enum BoPWoodType implements IStringSerializable
{
    CHERRY(0, "cherry"),
    DEAD(1, "dead"),
    ETHEREAL(2, "ethereal"),
    FIR(3, "fir"),
    HELLBARK(4, "hellbark"),
    JACARANDA(5, "jacaranda"),
    MAGIC(6, "magic"),
    MAHOGANY(7, "mahogany"),
    PALM(8, "palm"),
    REDWOOD(9, "redwood"),
    UMBRAN(10, "umbran"),
    WILLOW(11, "willow");

    private static final BoPWoodType[] VALUES = Arrays.stream(values()).sorted(Comparator.comparingInt(BoPWoodType::getId)).toArray((map) ->
    {
        return new BoPWoodType[map];
    });

    private final int id;
    private final String name;

    private BoPWoodType(int idIn, String name)
    {
        this.id = idIn;
        this.name = name;
    }

    public String getName()
    {
        return this.name;
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

    public static String getWoodByID(int id)
    {
        for(BoPWoodType wood : values())
        {
            if(wood.getId() == id)
                return wood.getName();
        }
        return null;
    }

}