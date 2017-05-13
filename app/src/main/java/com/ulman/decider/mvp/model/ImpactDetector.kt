package com.ulman.decider.mvp.model

import android.content.Context
import android.content.Context.SENSOR_SERVICE
import android.hardware.SensorManager
import com.squareup.seismic.ShakeDetector

class ImpactDetector(val context: Context) : Detector {

    var shake: ShakeDetector? = null

    override fun start(callback: () -> Unit) {

        val sensorManager = context.getSystemService(SENSOR_SERVICE) as SensorManager
        shake = ShakeDetector(callback)
        shake!!.start(sensorManager)
    }

    override fun stop() {
        shake?.stop()
    }
}