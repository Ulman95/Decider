package com.ulman.decider.mvp.view.coins

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import com.ulman.decider.AppComponent
import com.ulman.decider.R
import com.ulman.decider.mvp.model.font.AndroidFontContainer
import com.ulman.decider.mvp.model.font.base.Font
import com.ulman.decider.mvp.presenter.coins.CoinsChoice
import com.ulman.decider.mvp.presenter.coins.CoinsPresenter
import com.ulman.decider.mvp.view.BaseFragment
import com.ulman.decider.utils.changeFont
import kotlinx.android.synthetic.main.fragment_coins.*
import javax.inject.Inject

class CoinsFragment : BaseFragment(), CoinsView {

    @Inject lateinit var presenter: CoinsPresenter

    private var fadeInAnimation: Animation? = null

    companion object {

        const val TAG = "CoinsFragment"
    }

    override fun inject(appComponent: AppComponent) {

        appComponent.getModelComponent().getCoinsComponent().inject(this)
    }

    @Inject
    override fun setPresenter() {
        presenter.view = this
    }

    override fun getFragmentTag(): String = TAG

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        fadeInAnimation = AnimationUtils.loadAnimation(activity, R.anim.anim_fade_in)

        return inflater.inflate(R.layout.fragment_coins, container, false)
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        hintText.changeFont(object : Font(context.assets) {
            override fun getPath(): String = AndroidFontContainer.FONTS[3]
        })
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

        hintContainer.visibility = View.GONE
        phraseField.visibility = View.VISIBLE
        phraseField.text = choice.phrase
        phraseField.changeFont(choice.font)
        phraseField.startAnimation(fadeInAnimation)
    }
}


