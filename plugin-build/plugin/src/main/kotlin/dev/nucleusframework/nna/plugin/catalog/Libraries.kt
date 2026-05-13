package dev.nucleusframework.nna.plugin.catalog

import org.gradle.api.Project


val Project.kotlinxCoroutineDependency
    get() = catalog.findLibrary("kotlinx.coroutines.core").get()
        .get()

val Project.kotlinxCoroutineJvmDependency
    get() = catalog.findLibrary("kotlinx.coroutines.core.jvm").get()
        .get()

val Project.kotlinxCoroutineTestDependency
    get() = catalog.findLibrary("kotlinx.coroutines.test").get()
        .get()

val Project.kotlinEmbeddedCompiler
    get() = catalog.findLibrary("kotlin.compiler.embeddable").get()
        .get()
