package nuskatev.fluidsforfun;

import net.minecraftforge.fml.common.registry.GameRegistry;
import nuskatev.fluidsforfun.blocks.MechanicalSeparator;

@GameRegistry.ObjectHolder(FluidsForFun.MODID)
public class ModBlocks {
    @GameRegistry.ObjectHolder(MechanicalSeparator.NAME)
    public static MechanicalSeparator mechanicalSeparator;
}
