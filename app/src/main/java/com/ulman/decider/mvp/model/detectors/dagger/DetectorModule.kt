package com.ulman.decider.mvp.model.detectors.dagger

import android.content.Context
import com.ulman.decider.mvp.model.detectors.Detector
import com.ulman.decider.mvp.model.detectors.ImpactDetector
import dagger.Module
import dagger.Provides

@Module
class DetectorModule {

    @Provides
    fun getDetector(context: Context): Detector {
        return ImpactDetector(context)
    }
}