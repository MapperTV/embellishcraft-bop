package tv.mapper.embellishcraftbop.data.gen;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.GatherDataEvent;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ECBoPGenerators
{
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event)
    {
        DataGenerator generator = event.getGenerator();
        generator.addProvider(new ECBoPRecipes(generator));
        generator.addProvider(new ECBoPLootTables(generator));
        generator.addProvider(new ECBoPBlockModels(generator, event.getExistingFileHelper()));
    }
}
