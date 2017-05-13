package com.ulman.decider.mvp.view.coins

import com.ulman.decider.mvp.presenter.coins.CoinsChoice

interface CoinsView {

    fun setChoice(choice: CoinsChoice)
}