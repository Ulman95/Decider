package com.ulman.decider.mvp.view

import android.os.Bundle
import android.support.v4.app.Fragment
import com.ulman.decider.App
import com.ulman.decider.AppComponent

abstract class BaseFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        inject((activity.application as App).component!!)
    }

    abstract fun inject(appComponent: AppComponent)

    abstract fun setPresenter()

    abstract fun getFragmentTag(): String
}