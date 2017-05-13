package com.ulman.decider.mvp.model.decider

import com.ulman.decider.mvp.model.decider.beans.Choice

class RandomDecider : Decider {

    private val random = java.util.Random()

    override fun makeChoice(elementCount: Int, phraseCount: Int): Choice {

        return Choice(random.nextInt(elementCount - 1), random.nextInt(phraseCount - 1))
    }

}