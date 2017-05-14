package com.ulman.decider.mvp.model.font.base

import com.ulman.decider.mvp.model.decider.beans.Choice
import com.ulman.decider.mvp.model.font.base.Font

interface FontContainer {

    fun getFontCount(): Int

    fun getFont(choice: Choice): Font
}