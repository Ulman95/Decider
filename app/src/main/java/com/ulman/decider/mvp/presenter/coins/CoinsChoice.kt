package com.ulman.decider.mvp.presenter.coins

import com.ulman.decider.mvp.model.decider.DeciderType
import com.ulman.decider.mvp.model.font.base.Font

data class CoinsChoice(val type: DeciderType, val phrase: String, val font: Font)