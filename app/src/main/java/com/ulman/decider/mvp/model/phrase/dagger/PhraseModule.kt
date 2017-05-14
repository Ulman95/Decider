package com.ulman.decider.mvp.model.phrase.dagger

import android.content.Context
import com.ulman.decider.mvp.model.phrase.CoinsPhrase
import com.ulman.decider.mvp.model.phrase.Phrase
import dagger.Module
import dagger.Provides

@Module
class PhraseModule {

    @Provides
    fun providePhrase(context: Context): Phrase = CoinsPhrase(context)

}