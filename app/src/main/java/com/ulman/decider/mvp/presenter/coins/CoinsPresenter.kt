package com.ulman.decider.mvp.presenter.coins

import com.ulman.decider.mvp.model.detectors.Detector
import com.ulman.decider.mvp.model.interactor.CoinsInteractor
import com.ulman.decider.mvp.model.reaction.Reaction
import com.ulman.decider.mvp.view.coins.CoinsView

class CoinsPresenter(val interactor: CoinsInteractor, val detector: Detector, val reaction: Reaction) {

    var view: CoinsView? = null

    fun start() = detector.start { makeChoice(); reaction.reaction() }

    fun stop() {
        detector.stop()
        view = null
    }

    private fun makeChoice() = view?.setChoice(interactor.makeChoice())
}