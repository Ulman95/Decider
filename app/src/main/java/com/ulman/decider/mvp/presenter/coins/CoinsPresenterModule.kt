package com.ulman.decider.mvp.presenter.coins

import com.ulman.decider.mvp.model.decider.Decider
import com.ulman.decider.mvp.model.detectors.Detector
import com.ulman.decider.mvp.model.reaction.Reaction
import dagger.Module
import dagger.Provides

@Module
class CoinsPresenterModule {

    @Provides
    fun getPresenter(decider: Decider, detector: Detector, reaction: Reaction): CoinsPresenter {
        return CoinsPresenter(decider, detector, reaction)
    }
}