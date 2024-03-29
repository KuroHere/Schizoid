/*
 * Copyright (c) 2024. Schizoid
 * All rights reserved.
 */

package dev.lyzev.schizoid.feature.features.module.modules.util

import dev.lyzev.schizoid.feature.features.module.ModuleRunnable

object ModuleRunnableCopyIp :
    ModuleRunnable("Copy IP", "Copies the server IP to the clipboard.", category = Category.UTIL) {

    override fun invoke(): String? {
        if (!isMultiplayer) return "You are not connected to a server."
        copy(mc.currentServerEntry!!.address)
        return null
    }
}
