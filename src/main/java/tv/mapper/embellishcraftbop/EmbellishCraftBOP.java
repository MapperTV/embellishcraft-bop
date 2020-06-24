package tv.mapper.embellishcraftbop;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLDedicatedServerSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import tv.mapper.embellishcraftbop.init.ECBoPBlocks;
import tv.mapper.embellishcraftbop.init.ECBoPItems;

@Mod(EmbellishCraftBOP.MODID)
public class EmbellishCraftBOP
{
    public static final String MODID = "embellishcraft-bop";
    public static final Logger LOGGER = LogManager.getLogger();

    public EmbellishCraftBOP()
    {
        ECBoPBlocks.init();
        ECBoPBlocks.postInit();
        ECBoPItems.init();

        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientSetup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::serverSetup);
    }

    private void setup(final FMLCommonSetupEvent event)
    {
        LOGGER.info("EmbellishCraft-BOP: setup started");
    }

    private void clientSetup(final FMLClientSetupEvent event)
    {
        // LOGGER.info("EmbellishCraft client setup");
    }

    private void serverSetup(final FMLDedicatedServerSetupEvent event)
    {
        // LOGGER.info("EmbellishCraft server setup");
    }
}
