package com.ulman.decider.mvp.model.reaction.dagger

import android.content.Context
import com.ulman.decider.mvp.model.reaction.Reaction
import com.ulman.decider.mvp.model.reaction.VibroReaction
import dagger.Module
import dagger.Provides

@Module
class ReactionModule {

    @Provides
    fun getReaction(context: Context): Reaction = VibroReaction(context)

}