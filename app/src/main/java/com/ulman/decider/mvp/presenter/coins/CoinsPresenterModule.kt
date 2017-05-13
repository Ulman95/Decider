package com.ulman.decider.mvp.presenter.coins

import com.ulman.decider.mvp.model.decider.Decider
import com.ulman.decider.mvp.model.detectors.Detector
import dagger.Module
import dagger.Provides

@Module
class CoinsPresenterModule {

    @Provides
    fun getPresenter(decider: Decider, detector: Detector): CoinsPresenter {
        return CoinsPresenter(decider, detector)
    }
}