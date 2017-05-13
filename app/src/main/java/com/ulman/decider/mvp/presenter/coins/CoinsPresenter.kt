package com.ulman.decider.mvp.presenter.coins

import com.ulman.decider.mvp.model.Detector
import com.ulman.decider.mvp.model.RandomDecider
import com.ulman.decider.mvp.view.coins.CoinsView
import com.ulman.decider.mvp.view.coins.Phrase

class CoinsPresenter(val coinsView: CoinsView, val decider: RandomDecider, val detector: Detector) {

    companion object {
        val PHRASE_COUNT = Phrase.COINS_SIZE
        val VARIANT_COUNT = 2
    }

    fun start() {
        detector.start { makeChoice() }
    }

    fun stop() {
        detector.stop()
    }

    private fun makeChoice() {

        val choice = decider.makeChoice(CoinsPresenter.VARIANT_COUNT, CoinsPresenter.PHRASE_COUNT)
        val type = if (choice.index == 1) CoinsChoiceType.YES else CoinsChoiceType.NO
        coinsView.setChoice(CoinsChoice(type, choice.phrase))
    }
}