package com.ulman.decider.mvp.view.coins.dagger

import com.ulman.decider.mvp.view.coins.CoinsFragment
import dagger.Subcomponent

@Subcomponent(modules = arrayOf(CoinsPresenterModule::class))
interface CoinsComponent {

    fun inject(fragment: CoinsFragment)
}