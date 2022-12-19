package com.example.thrity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.thrity.Challenge.ChallengeFragment
import com.example.thrity.Community.CommunityFragment
import com.example.thrity.Explore.ExploreFragment
import com.example.thrity.My.MyFragment
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
                        it.setIcon(R.drawable.nav_challenge_select)
                        menu.findItem(R.id.menu_explore).setIcon(R.drawable.nav_explore)
                        menu.findItem(R.id.menu_community).setIcon(R.drawable.nav_community_select)
                        menu.findItem(R.id.menu_my).setIcon(R.drawable.nav_my)
                    }
                    R.id.menu_explore -> {
                        supportFragmentManager
                            .beginTransaction()
                            .replace(viewBinding.containerFragment.id, ExploreFragment())
                            .commitAllowingStateLoss()
                        it.setIcon(R.drawable.nav_explore_select)
                        menu.findItem(R.id.menu_challenge).setIcon(R.drawable.nav_challenge)
                        menu.findItem(R.id.menu_community).setIcon(R.drawable.nav_community_select)
                        menu.findItem(R.id.menu_my).setIcon(R.drawable.nav_my)
                    }
                    R.id.menu_community -> {
                        supportFragmentManager
                            .beginTransaction()
                            .replace(viewBinding.containerFragment.id, CommunityFragment())
                            .commitAllowingStateLoss()
                        it.setIcon(R.drawable.nav_community_select)
                        menu.findItem(R.id.menu_explore).setIcon(R.drawable.nav_explore)
                        menu.findItem(R.id.menu_challenge).setIcon(R.drawable.nav_challenge)
                        menu.findItem(R.id.menu_my).setIcon(R.drawable.nav_my)
                    }
                    R.id.menu_my -> {
                        supportFragmentManager
                            .beginTransaction()
                            .replace(viewBinding.containerFragment.id, MyFragment())
                            .commitAllowingStateLoss()
                        it.setIcon(R.drawable.nav_my_select)
                        menu.findItem(R.id.menu_explore).setIcon(R.drawable.nav_explore)
                        menu.findItem(R.id.menu_community).setIcon(R.drawable.nav_community_select)
                        menu.findItem(R.id.menu_challenge).setIcon(R.drawable.nav_challenge)
                    }
                }
                true
            }
            selectedItemId = R.id.menu_challenge
        }
    }
}