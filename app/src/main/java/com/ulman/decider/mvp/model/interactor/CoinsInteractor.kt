package com.ulman.decider.mvp.model.interactor

import com.ulman.decider.mvp.model.decider.CoinsDecider
import com.ulman.decider.mvp.model.font.base.FontContainer
import com.ulman.decider.mvp.model.phrase.Phrase
import com.ulman.decider.mvp.presenter.coins.CoinsChoice

class CoinsInteractor(val coinsDecider: CoinsDecider, val phrase: Phrase, val fontContainer: FontContainer) {

    fun makeChoice(): CoinsChoice {

        val deciderType = coinsDecider.yesOrNo()
        val phraseString = phrase.getPhrase(coinsDecider.makeChoice(phrase.getPhraseCount()), deciderType)
        val font = fontContainer.getFont(coinsDecider.makeChoice(fontContainer.getFontCount()))

        return CoinsChoice(deciderType, phraseString, font)
    }
}