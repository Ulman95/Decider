package com.ulman.decider.mvp.view.coins

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import com.ulman.decider.AppComponent
import com.ulman.decider.R
import com.ulman.decider.mvp.presenter.coins.CoinsChoice
import com.ulman.decider.mvp.presenter.coins.CoinsPresenter
import com.ulman.decider.mvp.view.BaseFragment
import com.ulman.decider.utils.changeFont
import kotlinx.android.synthetic.main.fragment_coins.*
import javax.inject.Inject

class CoinsFragment : BaseFragment(), CoinsView {

    @Inject lateinit var presenter: CoinsPresenter

    private var fadeInAnimation: Animation? = null

    override fun inject(appComponent: AppComponent) {

        appComponent.getModelComponent().getCoinsComponent().inject(this)
    }

    @Inject
    override fun setPresenter() {
        presenter.view = this
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        fadeInAnimation = AnimationUtils.loadAnimation(activity, R.anim.anim_fade_in)

        return inflater.inflate(R.layout.fragment_coins, container, false)
    }

    override fun onResume() {
        super.onResume()
        setPresenter()
        presenter.start()
    }

    override fun onPause() {
        super.onPause()
        presenter.stop()
    }

    override fun setChoice(choice: CoinsChoice) {

        phraseField.text = choice.phrase
        phraseField.changeFont(choice.font)
        phraseField.startAnimation(fadeInAnimation)
    }

}


