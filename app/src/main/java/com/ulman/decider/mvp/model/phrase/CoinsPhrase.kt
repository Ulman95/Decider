package com.ulman.decider.mvp.model.phrase

import android.content.Context
import com.ulman.decider.R
import com.ulman.decider.mvp.model.decider.DeciderType
import com.ulman.decider.mvp.model.decider.beans.Choice

class CoinsPhrase(val context: Context) : Phrase {

    val yesPhrases: Array<out String> = context.resources.getStringArray(R.array.phrase_coins_yes)!!
    val noPhrases: Array<out String> = context.resources.getStringArray(R.array.phrase_coins_no)!!

    override fun getPhrase(choice: Choice, deciderType: DeciderType): String {

        return if (deciderType == DeciderType.YES) yesPhrases[choice.which] else noPhrases[choice.which]
    }

    override fun getPhraseCount(): Int = yesPhrases.size

}