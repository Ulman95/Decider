package com.ulman.decider.mvp.model.font

import android.content.res.AssetManager
import com.ulman.decider.mvp.model.font.base.Font

class NeuchaFont(assetManager: AssetManager) : Font(assetManager) {

    override fun getPath() = "fonts/Neucha.ttf"
}