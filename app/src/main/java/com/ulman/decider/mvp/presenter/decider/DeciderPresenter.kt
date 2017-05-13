package com.ulman.decider.mvp.presenter.decider

import com.ulman.decider.mvp.model.Choice
import com.ulman.decider.mvp.model.RandomDecider
import com.ulman.decider.mvp.view.decider.DeciderView


class DeciderPresenter(val deciderView: DeciderView, val decider: RandomDecider) {


    fun makeChoice(size: Int) {

        val index = decider.getRandom(size)
        deciderView.chooseVariant(Choice(1,2))
    }
}