package com.ulman.decider.mvp.model.decider.dagger

import com.ulman.decider.mvp.model.decider.Decider
import com.ulman.decider.mvp.model.decider.RandomDecider
import dagger.Module
import dagger.Provides

@Module
class DeciderModule {

    @Provides
    fun getDecider(): Decider {

        return RandomDecider()
    }
}