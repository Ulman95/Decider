package com.ulman.decider.mvp.model

import java.util.*

class RandomDecider : Decider {

    private val random = Random()

    override fun makeChoice(elementCount: Int, phraseCount: Int): Choice {

        return Choice(random.nextInt(elementCount - 1), random.nextInt(phraseCount - 1))
    }

}