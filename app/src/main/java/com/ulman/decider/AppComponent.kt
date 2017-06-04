package com.ulman.decider

import com.ulman.decider.mvp.model.ModelComponent
import dagger.Component

@Component(modules = arrayOf(AppModule::class))
interface AppComponent {

    fun getModelComponent(): ModelComponent
}