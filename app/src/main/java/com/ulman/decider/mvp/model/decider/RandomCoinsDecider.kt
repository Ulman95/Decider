package com.ulman.decider.mvp.model.decider

import com.ulman.decider.mvp.model.decider.beans.Choice

class RandomCoinsDecider : CoinsDecider {

    private val random = java.util.Random()

    override fun makeChoice(elementCount: Int): Choice {

        return Choice(random.nextInt(elementCount))
    }

    override fun yesOrNo(): DeciderType {

        if (random.nextBoolean())
            return DeciderType.YES
        else
            return DeciderType.NO
    }
}