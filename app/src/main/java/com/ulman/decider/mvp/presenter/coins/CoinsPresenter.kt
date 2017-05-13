package com.ulman.decider.mvp.presenter.coins

import com.ulman.decider.mvp.model.decider.Decider
import com.ulman.decider.mvp.model.detectors.Detector
import com.ulman.decider.mvp.model.reaction.Reaction
import com.ulman.decider.mvp.view.coins.CoinsView
import com.ulman.decider.mvp.view.coins.Phrase

class CoinsPresenter(val decider: Decider, val detector: Detector, val reaction: Reaction) {

    var view: CoinsView? = null

    companion object {
        val PHRASE_COUNT = Phrase.COINS_SIZE
        val VARIANT_COUNT = 2
    }

    fun start() {
        detector.start { makeChoice(); reaction.reaction() }
    }

    fun stop() {
        detector.stop()
        view = null
    }

    private fun makeChoice() {

        val choice = decider.makeChoice(CoinsPresenter.VARIANT_COUNT, CoinsPresenter.PHRASE_COUNT)
        val type = if (choice.index == 1) CoinsChoiceType.YES else CoinsChoiceType.NO
        view?.setChoice(CoinsChoice(type, choice.phrase))
    }
}