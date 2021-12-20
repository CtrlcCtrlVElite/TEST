package com.github.peter1224.test.services

import com.intellij.openapi.project.Project
import com.github.peter1224.test.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
