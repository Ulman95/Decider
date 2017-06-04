package com.ulman.decider.mvp.model.font.base

import android.content.res.AssetManager
import android.graphics.Typeface

abstract class Font(assetManager: AssetManager) {

    val regular = Typeface.createFromAsset(assetManager, getPath())!!

    fun getRegularTypeface(): Typeface = regular

    abstract fun getPath(): String

}