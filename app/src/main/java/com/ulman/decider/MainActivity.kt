package com.ulman.decider

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.ulman.decider.mvp.view.coins.CoinsFragment
import com.ulman.decider.mvp.view.decider.DeciderFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var fragment = supportFragmentManager.findFragmentById(R.id.main_container)

        if (fragment == null) {

            fragment = CoinsFragment()
            supportFragmentManager.beginTransaction().add(R.id.main_container, fragment).commit()
        }

        mainMenu.setOnNavigationItemSelectedListener {

            when (it.itemId) {
                R.id.menu_main_coins  -> supportFragmentManager
                        .beginTransaction()
                        .replace(R.id.main_container, CoinsFragment())
                        .commit()

                R.id.menu_main_second -> supportFragmentManager
                        .beginTransaction()
                        .replace(R.id.main_container, DeciderFragment())
                        .commit()
            }

            return@setOnNavigationItemSelectedListener true
        }
    }
}
