package com.ulman.decider.mvp.model.reaction

import android.content.Context
import android.os.Vibrator

class VibroReaction(context: Context) : Reaction {

    private companion object {
        const val DURATION = 100L
    }

    val vibrator: Vibrator = context.getSystemService(Context.VIBRATOR_SERVICE) as Vibrator

    override fun reaction() = vibrator.vibrate(DURATION)

}