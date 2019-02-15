package nuskatev.fluidsforfun.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import nuskatev.fluidsforfun.FluidsForFun;

public class MechanicalSeparator extends Block {
    public static final String NAME = "mechanical_separator";

    public MechanicalSeparator() {
        super(Material.ROCK);
        setUnlocalizedName(FluidsForFun.MODID + '.' + NAME);
        setRegistryName(NAME);
    }

    @SideOnly(Side.CLIENT)
    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(
                Item.getItemFromBlock(this),
                0,
                new ModelResourceLocation(getRegistryName(), "inventory"));
    }
}
