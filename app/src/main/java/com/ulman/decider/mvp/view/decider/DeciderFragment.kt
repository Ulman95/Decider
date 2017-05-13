package com.ulman.decider.mvp.view.decider

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.ulman.decider.R
import com.ulman.decider.mvp.model.decider.beans.Choice
import com.ulman.decider.mvp.presenter.decider.DeciderPresenter
import javax.inject.Inject

class DeciderFragment : Fragment(), DeciderView {

    override fun chooseVariant(choice: Choice) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    @Inject
    lateinit var presenter: DeciderPresenter

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        return inflater.inflate(R.layout.fragment_coins, container, false)
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {

    }
}


