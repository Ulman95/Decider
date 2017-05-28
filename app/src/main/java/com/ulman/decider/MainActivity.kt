package com.ulman.decider

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.ulman.decider.mvp.view.coins.CoinsFragment
import com.ulman.decider.utils.FragmentHelper
import com.ulman.decider.utils.ShortcutHelper
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val fragmentHelper = FragmentHelper(R.id.main_container, supportFragmentManager)
    private val shortcutHelper = ShortcutHelper(fragmentHelper)

    //    private var menuToBack: AnimatedVectorDrawableCompat? = null
    //    private var backToMenu: AnimatedVectorDrawableCompat? = null

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mainMenu.setOnNavigationItemSelectedListener {

            when (it.itemId) {

                R.id.menu_main_coins -> fragmentHelper.replace(CoinsFragment.newInstance(false))
            //                R.id.menu_main_second -> fragmentHelper.replace(DeciderFragment())
            }

            return@setOnNavigationItemSelectedListener true
        }

        if (shortcutHelper.goAction(intent))
            return


        fragmentHelper.add(CoinsFragment.newInstance(false))


        //        menuToBack = AnimatedVectorDrawableCompat.create(this, R.drawable.anim_menu_to_back)
        //        backToMenu = AnimatedVectorDrawableCompat.create(this, R.drawable.anim_back_to_menu)

        //        main_ic_menu_container.setOnClickListener {
        //
        //            if (main_ic_menu.drawable === menuToBack) {
        //                main_ic_menu.setImageDrawable(backToMenu)
        //                backToMenu?.start()
        //            }
        //            else {
        //                main_ic_menu.setImageDrawable(menuToBack)
        //                menuToBack?.start()
        //            }
        //        }
    }
}
