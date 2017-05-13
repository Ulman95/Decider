package com.ulman.decider.mvp.model

import com.ulman.decider.mvp.model.decider.dagger.DeciderModule
import com.ulman.decider.mvp.model.detectors.dagger.DetectorModule
import com.ulman.decider.mvp.model.reaction.dagger.ReactionModule
import com.ulman.decider.mvp.view.coins.dagger.CoinsComponent
import dagger.Subcomponent

@Subcomponent(modules = arrayOf(DeciderModule::class, DetectorModule::class, ReactionModule::class))
interface ModelComponent {

    fun getCoinsComponent(): CoinsComponent
}