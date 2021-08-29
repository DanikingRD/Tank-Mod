package com.crescentine.tankmod;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.impl.client.renderer.registry.EntityRendererRegistryImpl;

public class TankModClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        EntityRendererRegistryImpl.INSTANCE.register(TankMod.TANK_ENTITY_TYPE, ctx ->
                new TankEntityRenderer(ctx, new TankEntityModel()));
    }
}