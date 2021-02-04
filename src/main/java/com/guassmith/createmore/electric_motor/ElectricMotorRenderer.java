package com.guassmith.createmore.electric_motor;

import com.simibubi.create.AllBlockPartials;
import com.simibubi.create.content.contraptions.base.KineticTileEntity;
import com.simibubi.create.content.contraptions.base.KineticTileEntityRenderer;
import com.simibubi.create.foundation.utility.SuperByteBuffer;
import net.minecraft.client.renderer.tileentity.TileEntityRendererDispatcher;

public class ElectricMotorRenderer extends KineticTileEntityRenderer {
    public ElectricMotorRenderer(TileEntityRendererDispatcher dispatcher) {
        super(dispatcher);
    }

    @Override
    protected SuperByteBuffer getRotatedModel(KineticTileEntity te) {
        return AllBlockPartials.SHAFT_HALF.renderOnDirectionalSouth(te.getBlockState());
    }
}