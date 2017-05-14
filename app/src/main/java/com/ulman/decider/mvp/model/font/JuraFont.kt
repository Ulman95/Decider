package com.ulman.decider.mvp.model.font

import android.content.res.AssetManager
import com.ulman.decider.mvp.model.font.base.Font

class JuraFont(assetManager: AssetManager) : Font(assetManager) {

    override fun getPath() = "fonts/Jura-Regular.ttf"
}