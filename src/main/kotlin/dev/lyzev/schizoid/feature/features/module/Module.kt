/*
 * Copyright (c) 2023. Schizoid
 * All rights reserved.
 */

package dev.lyzev.schizoid.feature.features.module

import dev.lyzev.api.settings.BooleanSetting
import dev.lyzev.schizoid.feature.Category
import dev.lyzev.schizoid.feature.Feature

/**
 * Represents a module.
 *
 * @property name The name of the module.
 * @property desc The description of the module.
 * @param key The keybind of the module.
 * @property category The category of the module.
 */
abstract class Module(name: String, desc: String, vararg aliases: String, key: Int = -1, category: Category) :
    Feature(name, desc, aliases = aliases, key, category) {

    // Indicates whether the module should be shown in the array list.
    var showInArrayList by BooleanSetting(this::class, "Show In ArrayList", true)
}
