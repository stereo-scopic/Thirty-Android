package com.example.thrity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.thrity.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val viewBinding: ActivityMainBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(viewBinding.root)

        supportFragmentManager
            .beginTransaction()
            .replace(viewBinding.containerFragment.id, ChallengeFragment())
            .commitAllowingStateLoss()

        viewBinding.navBottom.run {
            setOnItemSelectedListener {
                when (it.itemId) {
                    R.id.menu_challenge -> {
                        supportFragmentManager
                            .beginTransaction()
                            .replace(viewBinding.containerFragment.id, ChallengeFragment())
                            .commitAllowingStateLoss()
                    }
                    R.id.menu_explore -> {
                        supportFragmentManager
                            .beginTransaction()
                            .replace(viewBinding.containerFragment.id, ExploreFragment())
                            .commitAllowingStateLoss()
                    }
                    R.id.menu_community -> {
                        supportFragmentManager
                            .beginTransaction()
                            .replace(viewBinding.containerFragment.id, CommunityFragment())
                            .commitAllowingStateLoss()
                    }
                    R.id.menu_my -> {
                        supportFragmentManager
                            .beginTransaction()
                            .replace(viewBinding.containerFragment.id, MyFragment())
                            .commitAllowingStateLoss()
                    }
                }
                true
            }
            selectedItemId = R.id.menu_challenge
        }
    }
}