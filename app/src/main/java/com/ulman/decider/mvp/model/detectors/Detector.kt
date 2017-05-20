package com.ulman.decider.mvp.model.detectors

import io.reactivex.Observable

interface Detector {

    fun start(): Observable<Unit>

    fun stop()
}
