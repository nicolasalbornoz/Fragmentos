package com.example.fragmentos.ui.main

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.fragmentos.BatmanFragment
import com.example.fragmentos.FlashFragment
import com.example.fragmentos.R
import com.example.fragmentos.SupermanFragment

private val TAB_TITLES = arrayOf(
    R.string.superman,
    R.string.batman,
    R.string.flash
)

/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
class SectionsPagerAdapter(private val context: Context, fm: FragmentManager) : FragmentPagerAdapter(fm) {

    override fun getItem(position: Int): Fragment {

        when(position){
            0 -> return SupermanFragment()
            1 -> return  BatmanFragment()
            else -> return FlashFragment()
        }

    }

    override fun getPageTitle(position: Int): CharSequence? {
        return context.resources.getString(TAB_TITLES[position])
    }

    override fun getCount(): Int {
        // Show 2 total pages.
        return 3
    }
}