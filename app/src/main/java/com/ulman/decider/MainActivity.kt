package com.ulman.decider

import android.os.Bundle
import android.support.graphics.drawable.AnimatedVectorDrawableCompat
import android.support.v7.app.AppCompatActivity
import com.ulman.decider.mvp.view.coins.CoinsFragment
import com.ulman.decider.utils.FragmentHelper
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val fragmentHelper = FragmentHelper(R.id.main_container, supportFragmentManager)

    private var menuToBack: AnimatedVectorDrawableCompat? = null
    private var backToMenu: AnimatedVectorDrawableCompat? = null

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var fragment = supportFragmentManager.findFragmentById(R.id.main_container)

        menuToBack = AnimatedVectorDrawableCompat.create(this, R.drawable.anim_menu_to_back)
        backToMenu = AnimatedVectorDrawableCompat.create(this, R.drawable.anim_back_to_menu)

        if (fragment == null) {

            fragment = CoinsFragment()
            supportFragmentManager.beginTransaction().add(R.id.main_container, fragment).commit()
        }

        mainMenu.setOnNavigationItemSelectedListener {

            when (it.itemId) {

                R.id.menu_main_coins -> fragmentHelper.replace(CoinsFragment())
            //                R.id.menu_main_second -> fragmentHelper.replace(DeciderFragment())
            }

            return@setOnNavigationItemSelectedListener true
        }

        main_ic_menu_container.setOnClickListener {

            if (main_ic_menu.drawable === menuToBack) {
                main_ic_menu.setImageDrawable(backToMenu)
                backToMenu?.start()
            }
            else {
                main_ic_menu.setImageDrawable(menuToBack)
                menuToBack?.start()
            }
        }
    }
}
