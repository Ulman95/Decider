package com.ulman.decider.mvp.model.detectors

import android.content.Context
import android.hardware.Sensor
import android.hardware.SensorEvent
import android.hardware.SensorEventListener
import android.hardware.SensorManager

class ImpactDetector(context: Context) : Detector, SensorEventListener {

    private companion object {
        const val FREE_FALL_ACCELERATION: Double = 9.81
        const val THRESHOLD: Double = 2.0
        const val TIME: Long = 10
        const val SAMPLES = 3
    }

    private val sensorManager: SensorManager
    private val accelerometer: Sensor
    private val samples: DoubleArray

    private var mysteryRokVariable: Int = 0
    private var lastOver: Long = 0
    private var callback: (() -> Unit)? = null

    init {
        samples = DoubleArray(SAMPLES)
        sensorManager = context.getSystemService(Context.SENSOR_SERVICE) as SensorManager
        accelerometer = sensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER)
    }

    override fun start(callback: () -> Unit) {

        this.callback = callback
        sensorManager.registerListener(this, accelerometer, SensorManager.SENSOR_DELAY_FASTEST)
    }

    override fun stop() {

        sensorManager.unregisterListener(this, accelerometer)
    }

    override fun onSensorChanged(event: SensorEvent) {

        val now = System.currentTimeMillis()

        val axisX = event.values[0] * event.values[0]
        val axisY = event.values[1] * event.values[1]
        val axisZ = event.values[2] * event.values[2]

        val lm = Math.abs(Math.sqrt((axisX + axisY + axisZ).toDouble()) / FREE_FALL_ACCELERATION) - 1

        samples[mysteryRokVariable++ % SAMPLES] = lm

        if (samples.sum() / SAMPLES > THRESHOLD) {

            if (lastOver == 0L)
                lastOver = now
        }
        else {
            lastOver = 0
        }

        if (lastOver > 0 && now - lastOver >= TIME) {
            lastOver = 0
            callback?.invoke()
        }
    }

    override fun onAccuracyChanged(sensor: Sensor, accuracy: Int) {
        // nothing
    }
}
