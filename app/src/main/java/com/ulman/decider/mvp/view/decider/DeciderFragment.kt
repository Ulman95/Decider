package com.ulman.decider.mvp.view.decider

import com.ulman.decider.AppComponent
import com.ulman.decider.mvp.presenter.decider.DeciderPresenter
import com.ulman.decider.mvp.view.BaseFragment
import javax.inject.Inject

class DeciderFragment : BaseFragment(), DeciderView {

    override fun getFragmentTag(): String = "ss"

    override fun setPresenter() {
    }

    override fun inject(appComponent: AppComponent) {
    }

    @Inject
    lateinit var presenter: DeciderPresenter
}


