package com.ulman.decider.mvp.model.decider.dagger

import com.ulman.decider.mvp.model.decider.CoinsDecider
import com.ulman.decider.mvp.model.decider.RandomCoinsDecider
import dagger.Module
import dagger.Provides

@Module
class CoinsDeciderModule {

    @Provides
    fun getDecider(): CoinsDecider = RandomCoinsDecider()

}