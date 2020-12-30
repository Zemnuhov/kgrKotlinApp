package com.example.kgrkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout


class MainActivity : AppCompatActivity() {
    private var tabLayout:TabLayout?=null
    private var viewPager:ViewPager?=null
    private lateinit var pagerAdapter:PagerAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tabLayout=findViewById(R.id.tabLayout)
        viewPager=findViewById(R.id.viewPager)

        pagerAdapter= PagerAdapter(supportFragmentManager)
        initPages()
        viewPager?.adapter = pagerAdapter
        tabLayout?.setupWithViewPager(viewPager)
    }

    fun initPages(){
        pagerAdapter.addItem(ScanBluetoothFragment.newInstance(),"Соединения")
        pagerAdapter.addItem(BlankFragment.newInstance(2),"Мониторинг")
        pagerAdapter.addItem(BlankFragment.newInstance(3),"Записи")
    }
}

