package io.github.kdroidfilter.nucleusnativeaccess.plugin.catalog

import org.gradle.api.Project
import org.gradle.api.artifacts.VersionCatalog
import org.gradle.api.artifacts.VersionCatalogsExtension

val Project.catalog: VersionCatalog
    get() = extensions.getByType(VersionCatalogsExtension::class.java).named("libs")
