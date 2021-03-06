package com.ulman.decider

import android.app.Application

class App : Application() {

    var component: AppComponent? = null

    override fun onCreate() {
        super.onCreate()

        component = DaggerAppComponent.builder()
                .appModule(AppModule(this))
                .build()

    }
}