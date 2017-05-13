package com.ulman.decider.mvp.model

interface Decider {

    fun makeChoice(elementCount: Int, phraseCount: Int): Choice
}