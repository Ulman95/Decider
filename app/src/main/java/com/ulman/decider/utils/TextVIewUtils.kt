package com.ulman.decider.utils

import android.widget.TextView
import com.ulman.decider.mvp.model.font.base.Font

fun TextView.changeFont(font: Font) {

    this.typeface = font.getRegularTypeface()
}