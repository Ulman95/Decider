package com.ulman.decider.mvp.view.coins

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.ulman.decider.R
import kotlinx.android.synthetic.main.fragment_decider.*


class CoinsFragment : Fragment() {


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        return inflater.inflate(R.layout.fragment_decider, container, false)
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {

        text.text = "second"
    }
}


