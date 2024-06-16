/*
 * Copyright (c) 2024. Schizoid
 * All rights reserved.
 */

package dev.lyzev.schizoid.injection.accessor;

import net.minecraft.client.resource.SplashTextResourceSupplier;
import net.minecraft.client.session.Session;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.gen.Accessor;

/**
 * Provides the means to access protected members of the Splash Text Resource supplier.
 */
@Mixin(SplashTextResourceSupplier.class)
public interface SplashTextResourceSupplierAccessor {
    /**
     * Sets the Minecraft session.
     *
     * @param session new Minecraft session
     */
    @Accessor
    @Mutable
    void setSession(Session session);
}
