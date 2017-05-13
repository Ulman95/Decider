package com.ulman.decider.mvp.view.decider

import com.ulman.decider.mvp.model.decider.beans.Choice

interface DeciderView {

    fun chooseVariant(choice: Choice)
}