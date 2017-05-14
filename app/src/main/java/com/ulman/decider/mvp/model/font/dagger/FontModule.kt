package com.ulman.decider.mvp.model.font.dagger

import android.content.Context
import com.ulman.decider.mvp.model.font.AndroidFontContainer
import com.ulman.decider.mvp.model.font.base.FontContainer
import dagger.Module
import dagger.Provides

@Module
class FontModule {

    @Provides
    fun provideFontContainer(context: Context): FontContainer = AndroidFontContainer(context)

}