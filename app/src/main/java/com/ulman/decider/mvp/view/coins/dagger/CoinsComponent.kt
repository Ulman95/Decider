package com.ulman.decider.mvp.view.coins.dagger

import com.ulman.decider.mvp.view.coins.CoinsFragment
import dagger.Component

@Component
interface CoinsComponent {

    fun inject(fragment: CoinsFragment)

}