package tv.mapper.embellishcraftbop.data.gen;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.GatherDataEvent;
import tv.mapper.embellishcraftbop.EmbellishCraftBOP;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ECBoPGenerators
{
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event)
    {
        DataGenerator generator = event.getGenerator();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();

        generator.addProvider(new ECBoPRecipes(generator));
        generator.addProvider(new ECBoPLootTables(generator));
        generator.addProvider(new ECBoPBlockStates(generator, EmbellishCraftBOP.MODID, existingFileHelper));
        generator.addProvider(new ECBoPBlockModels(generator, EmbellishCraftBOP.MODID, existingFileHelper));
        generator.addProvider(new ECBoPItemModels(generator, EmbellishCraftBOP.MODID, existingFileHelper));

        ECBoPBlockTags ecBlockTagProvider = new ECBoPBlockTags(generator, existingFileHelper);

        generator.addProvider(ecBlockTagProvider);
        generator.addProvider(new ECBoPItemTags(generator, ecBlockTagProvider, existingFileHelper));

        generator.addProvider(new ECBoPLang(generator, "en_us"));
        generator.addProvider(new ECBoPLang(generator, "fr_fr"));
    }
}
