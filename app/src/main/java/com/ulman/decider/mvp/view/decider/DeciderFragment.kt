package com.ulman.decider.mvp.view.decider

import android.support.v4.app.Fragment
import com.ulman.decider.mvp.presenter.decider.DeciderPresenter
import javax.inject.Inject

class DeciderFragment : Fragment(), DeciderView {

    @Inject
    lateinit var presenter: DeciderPresenter
}


