package com.ulman.decider.mvp.presenter.coins

import com.ulman.decider.mvp.model.detectors.Detector
import com.ulman.decider.mvp.model.decider.Decider
import com.ulman.decider.mvp.view.coins.CoinsView
import dagger.Module
import dagger.Provides

@Module
class CoinsPresenterModule {

    @Provides
    fun getPresenter(coinsView: CoinsView, decider: Decider, detector: Detector): CoinsPresenter {
        return CoinsPresenter(coinsView, decider, detector)
    }
}