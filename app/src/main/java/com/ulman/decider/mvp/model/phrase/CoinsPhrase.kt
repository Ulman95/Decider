package com.ulman.decider.mvp.model.phrase

import android.content.Context
import com.ulman.decider.R
import com.ulman.decider.mvp.model.decider.beans.Choice
import com.ulman.decider.mvp.model.decider.DeciderType

class CoinsPhrase(val context: Context) : Phrase {

    private companion object {

        val COINS_PHRASE_YES: List<Int> = listOf(
                R.string.phrase_coins_yes_1,
                R.string.phrase_coins_yes_2,
                R.string.phrase_coins_yes_3,
                R.string.phrase_coins_yes_4,
                R.string.phrase_coins_yes_5,
                R.string.phrase_coins_yes_6,
                R.string.phrase_coins_yes_7
        )

        val COINS_PHRASE_NO: List<Int> = listOf(
                R.string.phrase_coins_no_1,
                R.string.phrase_coins_no_2,
                R.string.phrase_coins_no_3,
                R.string.phrase_coins_no_4,
                R.string.phrase_coins_no_5,
                R.string.phrase_coins_no_6,
                R.string.phrase_coins_no_7
        )

        val COINS_SIZE = COINS_PHRASE_YES.size

    }

    override fun getPhrase(choice: Choice, deciderType: DeciderType): String {

        val text = if (deciderType == DeciderType.YES) COINS_PHRASE_YES[choice.which] else COINS_PHRASE_NO[choice.which]

        return context.getString(text)

    }

    override fun getPhraseCount(): Int = COINS_SIZE

}