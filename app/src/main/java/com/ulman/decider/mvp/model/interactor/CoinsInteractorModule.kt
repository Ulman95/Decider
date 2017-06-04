package com.ulman.decider.mvp.model.interactor

import com.ulman.decider.mvp.model.decider.CoinsDecider
import com.ulman.decider.mvp.model.font.base.FontContainer
import com.ulman.decider.mvp.model.phrase.Phrase
import dagger.Module
import dagger.Provides

@Module
class CoinsInteractorModule {

    @Provides
    fun provideInteractor(coinsDecider: CoinsDecider, phrase: Phrase, fontContainer: FontContainer): CoinsInteractor {

        return CoinsInteractor(coinsDecider, phrase, fontContainer)
    }
}


