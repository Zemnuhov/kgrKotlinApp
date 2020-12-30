package com.example.kgrkotlin

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter


class PagerAdapter(fm:FragmentManager): FragmentPagerAdapter(fm) {
    private var listFragment:ArrayList<Fragment> = ArrayList()
    private var listFragmentTitle:ArrayList<String> = ArrayList()



    override fun getCount(): Int {
        return listFragment.size
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return listFragmentTitle[position]
    }

    override fun getItem(position: Int): Fragment {
        return listFragment[position]
    }

    fun addItem(fragment:Fragment,title:String){
        listFragment.add(fragment)
        listFragmentTitle.add(title)
    }
}