package com.ulman.decider.utils

import android.support.v4.app.FragmentManager
import com.ulman.decider.mvp.view.BaseFragment

class FragmentHelper(val containerId: Int, val supportFragmentManager: FragmentManager) {

    fun replace(baseFragment: BaseFragment) {

        supportFragmentManager.beginTransaction()
                .replace(containerId, baseFragment, baseFragment.getFragmentTag())
                .commit()
    }
}