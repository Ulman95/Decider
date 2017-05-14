package com.ulman.decider.mvp.model.decider

import com.ulman.decider.mvp.model.decider.beans.Choice

interface Decider {

    fun makeChoice(elementCount: Int): Choice
}