package com.rosinante.lifecycle.activities

import android.os.Bundle
import android.support.design.widget.TabLayout
import android.support.v7.app.AppCompatActivity
import com.rosinante.lifecycle.R
import com.rosinante.lifecycle.adapter.ViewPagerAdapter

import kotlinx.android.synthetic.main.activity_menu_utama.*
import kotlinx.android.synthetic.main.content_menu_utama.*

class MenuUtama : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_utama)
        setSupportActionBar(toolbar)
        //kalo di Java kita mengenal yang namanya findViewById(), atau ButterKnife,
        // kalo di Kotlin, kita tidak usah menambahkan dua hal tersebut,
        // tinggal panggil id dari widget yang ingin kita pakai saja.

        //mengatur tulisan atas pada masing2 TabLayout
        tabMovie.addTab(tabMovie.newTab().setText("Popular"))
        tabMovie.addTab(tabMovie.newTab().setText("Now Playing"))
        //mengatur adapter untuk viewPager yang akan diisi oleh fragment dan juga ditempatkan di TabLayout
        var viewPagerAdapter = ViewPagerAdapter(supportFragmentManager)
        viewPagerTab.adapter = viewPagerAdapter
        //mengatur jika viewPager digeser/berpindah posisi, maka akan terlihan di TabLayoutnya
        viewPagerTab.addOnPageChangeListener(TabLayout.TabLayoutOnPageChangeListener(tabMovie))
        //mengatur saat TabLayout diklik/dipilih
        tabMovie.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabReselected(tab: TabLayout.Tab?) {

            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {

            }

            override fun onTabSelected(tab: TabLayout.Tab?) {
                //mengatur jika TabLayout dipilih/diklik maka akan berpindah Fragment/ViewPagernya sesuai posisi
                viewPagerTab.currentItem = tab?.position!!
            }

        })
    }

}
