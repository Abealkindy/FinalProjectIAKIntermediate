package com.rosinante.lifecycle.adapter

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentStatePagerAdapter
import com.rosinante.lifecycle.fragments.NowPlayingFragment
import com.rosinante.lifecycle.fragments.PopularFragment

/**
 * Created by Rosinante24 on 02/12/17.
 */
class ViewPagerAdapter(fragmentManager: FragmentManager) : FragmentStatePagerAdapter(fragmentManager) {

    override fun getItem(position: Int): Fragment {
        return if (position == 0) {
            PopularFragment()
        } else {
            NowPlayingFragment()
        }
    }

    override fun getCount(): Int {
        return 2
    }
}