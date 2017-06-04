package com.ulman.decider.mvp.model.phrase

import com.ulman.decider.mvp.model.decider.beans.Choice
import com.ulman.decider.mvp.model.decider.DeciderType

interface Phrase {

    fun getPhrase(choice: Choice, deciderType: DeciderType): String

    fun getPhraseCount(): Int
}