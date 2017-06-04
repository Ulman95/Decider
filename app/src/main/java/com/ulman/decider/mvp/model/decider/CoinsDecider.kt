package com.ulman.decider.mvp.model.decider

interface CoinsDecider : Decider {

    fun yesOrNo(): DeciderType
}