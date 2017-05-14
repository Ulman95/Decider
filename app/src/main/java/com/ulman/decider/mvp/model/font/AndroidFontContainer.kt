package com.ulman.decider.mvp.model.font

import android.content.Context
import com.ulman.decider.mvp.model.decider.beans.Choice
import com.ulman.decider.mvp.model.font.base.Font
import com.ulman.decider.mvp.model.font.base.FontContainer

class AndroidFontContainer(val context: Context) : FontContainer {

    companion object {
        val FONTS = listOf(
                "fonts/Neucha.ttf",
                "fonts/Comfortaa-Regular.ttf",
                "fonts/Jura-Regular.ttf",
                "fonts/PoiretOne-Regular.ttf",
                "fonts/Underdog-Regular.ttf",
                "fonts/AC Line.otf",
                "fonts/beer money.ttf",
                "fonts/BERNIERDistressed-Regular.otf",
                "fonts/Cheque-Regular.otf",
                "fonts/gnyrwn971.ttf",
                "fonts/GUERRILLA-Normal.otf",
                "fonts/Lionelofparis.ttf",
                "fonts/TkachenkoSketch4F-Regular.otf",
                "fonts/ZnikomitNo25.otf"
        )
    }

    override fun getFontCount(): Int = FONTS.size

    override fun getFont(choice: Choice): Font = object : Font(context.assets) {

        override fun getPath(): String = FONTS[choice.which]
    }

}