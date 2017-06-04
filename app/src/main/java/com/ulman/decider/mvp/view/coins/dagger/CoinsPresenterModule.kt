package com.ulman.decider.mvp.view.coins.dagger

import com.ulman.decider.mvp.model.detectors.Detector
import com.ulman.decider.mvp.model.interactor.CoinsInteractor
import com.ulman.decider.mvp.model.reaction.Reaction
import com.ulman.decider.mvp.presenter.coins.CoinsPresenter
import dagger.Module
import dagger.Provides

@Module
class CoinsPresenterModule {

    @Provides
    fun getPresenter(interactor: CoinsInteractor, detector: Detector, reaction: Reaction): CoinsPresenter {
        return CoinsPresenter(interactor, detector, reaction)
    }
}