package com.ulman.decider.mvp.model.interactor

import com.ulman.decider.mvp.model.decider.CoinsDecider
import com.ulman.decider.mvp.model.font.base.FontContainer
import com.ulman.decider.mvp.model.phrase.Phrase
import com.ulman.decider.mvp.presenter.coins.CoinsChoice
import io.reactivex.Observable

class CoinsInteractor(val coinsDecider: CoinsDecider, val phrase: Phrase, val fontContainer: FontContainer) {

    fun makeChoice(): Observable<CoinsChoice> {

        val deciderType = coinsDecider.yesOrNo()
        val phraseString = phrase.getPhrase(coinsDecider.makeChoice(phrase.getPhraseCount()), deciderType)
        val font = fontContainer.getFont(coinsDecider.makeChoice(fontContainer.getFontCount()))

        return Observable.just(CoinsChoice(deciderType, phraseString, font))
    }
}