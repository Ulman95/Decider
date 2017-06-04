package com.ulman.decider.mvp.model

import com.ulman.decider.mvp.model.decider.dagger.CoinsDeciderModule
import com.ulman.decider.mvp.model.detectors.dagger.DetectorModule
import com.ulman.decider.mvp.model.font.dagger.FontModule
import com.ulman.decider.mvp.model.interactor.CoinsInteractorModule
import com.ulman.decider.mvp.model.phrase.dagger.PhraseModule
import com.ulman.decider.mvp.model.reaction.dagger.ReactionModule
import com.ulman.decider.mvp.view.coins.dagger.CoinsComponent
import dagger.Subcomponent

@Subcomponent(modules = arrayOf(CoinsDeciderModule::class, DetectorModule::class, ReactionModule::class, CoinsInteractorModule::class,
        FontModule::class, PhraseModule::class))
interface ModelComponent {

    fun getCoinsComponent(): CoinsComponent
}