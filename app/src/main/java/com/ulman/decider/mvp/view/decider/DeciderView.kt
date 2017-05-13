package com.ulman.decider.mvp.view.decider

import com.ulman.decider.mvp.model.Choice

interface DeciderView {

    fun chooseVariant(choice: Choice)
}