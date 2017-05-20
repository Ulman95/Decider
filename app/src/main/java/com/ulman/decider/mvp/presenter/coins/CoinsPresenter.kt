package com.ulman.decider.mvp.presenter.coins

import com.ulman.decider.mvp.model.detectors.Detector
import com.ulman.decider.mvp.model.interactor.CoinsInteractor
import com.ulman.decider.mvp.model.reaction.Reaction
import com.ulman.decider.mvp.view.coins.CoinsView
import java.util.concurrent.TimeUnit

class CoinsPresenter(val interactor: CoinsInteractor, val detector: Detector, val reaction: Reaction) {

    var view: CoinsView? = null

    fun start() {

        detector.start()
                .throttleFirst(300, TimeUnit.MILLISECONDS)
                .doOnNext { reaction.reaction() }
                .flatMap { interactor.makeChoice() }
                .subscribe { view?.setChoice(it) }
    }

    fun stop() {
        detector.stop()
        view = null
    }
}