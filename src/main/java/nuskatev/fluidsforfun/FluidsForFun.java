package nuskatev.fluidsforfun;

import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = FluidsForFun.MODID, name = FluidsForFun.NAME, version = FluidsForFun.VERSION)
public class FluidsForFun {
    public static final String MODID = "fluidsforfun";
    public static final String NAME = "Fluids! for Fun and Profit";
    public static final String VERSION = "0";

    private static Logger logger;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        logger = event.getModLog();
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {

        // some example code
        logger.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
    }
}
