package com.ulman.decider.mvp.model.font

import android.content.Context
import com.ulman.decider.mvp.model.decider.beans.Choice
import com.ulman.decider.mvp.model.font.base.Font
import com.ulman.decider.mvp.model.font.base.FontContainer

class AndroidFontContainer(val context: Context) : FontContainer {

    val fonts = listOf(
            PoiretOneFont(context.assets),
            ComfortaaFont(context.assets),
            JuraFont(context.assets),
            NeuchaFont(context.assets),
            UnderdogFont(context.assets)
    )

    override fun getFont(choice: Choice): Font = fonts[choice.which]

    override fun getFontCount(): Int = fonts.size

}