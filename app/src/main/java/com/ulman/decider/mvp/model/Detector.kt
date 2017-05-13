package com.ulman.decider.mvp.model

interface Detector {

    fun start(callback : () -> Unit)

    fun stop()
}