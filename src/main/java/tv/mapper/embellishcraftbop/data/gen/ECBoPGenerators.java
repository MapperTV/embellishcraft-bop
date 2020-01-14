package tv.mapper.embellishcraftbop.data.gen;

import java.util.Collections;

import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourcePackType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.generators.ExistingFileHelper;
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
        ExistingFileHelper delegate = event.getExistingFileHelper();

        ExistingFileHelper helper = new ExistingFileHelper(Collections.emptyList(), true)
        {
            @Override
            public boolean exists(ResourceLocation loc, ResourcePackType type, String pathSuffix, String pathPrefix)
            {
                if(loc.getNamespace() == "embellishcraft" || loc.getNamespace() == "biomesoplenty")
                {
                    return true;
                }
                return delegate.exists(loc, type, pathSuffix, pathPrefix);
            }
        }; // Temporary to counter the crash when generator can't find files from dependencies

        generator.addProvider(new ECBoPRecipes(generator));
        generator.addProvider(new ECBoPLootTables(generator));
        generator.addProvider(new ECBoPBlockStates(generator, helper));
        generator.addProvider(new ECBoPBlockModels(generator, helper));
        generator.addProvider(new ECBoPItemModels(generator, helper));
    }
}
