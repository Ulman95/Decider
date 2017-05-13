package com.ulman.decider.mvp.model.detectors

interface Detector {

    fun start(callback : () -> Unit)

    fun stop()
}