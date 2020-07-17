package com.github.nhomble.versiondiffer.services

import com.intellij.openapi.project.Project
import com.github.nhomble.versiondiffer.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
