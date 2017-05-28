package com.ulman.decider.utils

import android.content.Intent
import com.ulman.decider.mvp.view.coins.CoinsFragment

class ShortcutHelper(val fragmentHelper: FragmentHelper) {

    fun goAction(intent: Intent?): Boolean {

        if (intent == null) return false

        when (intent.action) {

            CoinsFragment.SHORTCUT_ACTION -> { fragmentHelper.replace(CoinsFragment.newInstance(true)); return true }
            else                          -> return false
        }
    }

}