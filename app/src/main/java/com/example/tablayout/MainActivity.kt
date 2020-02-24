package com.example.tablayout


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Adapter
import android.widget.ImageButton
import androidx.viewpager.widget.PagerAdapter
import androidx.viewpager.widget.PagerTabStrip
import androidx.viewpager.widget.ViewPager
import com.example.tablayout.Fragments.*
import kotlinx.android.synthetic.main.activity_main.*
import java.text.ParsePosition

class MainActivity : AppCompatActivity() {

    private val fragmentManager = supportFragmentManager
    private val homeFragment = HomeFragment()
    private val searchFragment = SearchFragment()
    private val addFragment = AddFragment()
    private val notificationFragment = NotificationFragment()
    private val profileFragment = ProfileFragment()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val manager = fragmentManager.beginTransaction()
        manager.replace(R.id.mViewPager, homeFragment)
        manager.commit()
        homeBtn.setImageResource(R.drawable.ic_home_pink)


    }

    fun homeClick(view: View) {
        val manager = fragmentManager.beginTransaction()
        manager.replace(R.id.mViewPager, homeFragment)
        manager.commit()
        homeBtn.setImageResource(R.drawable.ic_home_pink)
        searchBtn.setImageResource(R.drawable.ic_search_black_24dp)
        addBtn.setImageResource(R.drawable.ic_add_black_24dp)
        notiBtn.setImageResource(R.drawable.ic_notifications_none_black_24dp)
        profileBtn.setImageResource(R.drawable.ic_person_outline_black_24dp)

    }

    fun searchClick(view: View) {
        val manager = fragmentManager.beginTransaction()
        manager.replace(R.id.mViewPager, searchFragment)
        manager.commit()
        homeBtn.setImageResource(R.drawable.ic_home_black_24dp)
        searchBtn.setImageResource(R.drawable.ic_search_pink)
        addBtn.setImageResource(R.drawable.ic_add_black_24dp)
        notiBtn.setImageResource(R.drawable.ic_notifications_none_black_24dp)
        profileBtn.setImageResource(R.drawable.ic_person_outline_black_24dp)

    }

    fun addClick(view: View) {
        val manager = fragmentManager.beginTransaction()
        manager.replace(R.id.mViewPager, addFragment)
        manager.commit()
        homeBtn.setImageResource(R.drawable.ic_home_black_24dp)
        searchBtn.setImageResource(R.drawable.ic_search_black_24dp)
        addBtn.setImageResource(R.drawable.ic_add_pink)
        notiBtn.setImageResource(R.drawable.ic_notifications_none_black_24dp)
        profileBtn.setImageResource(R.drawable.ic_person_outline_black_24dp)

    }

    fun notifiClick(view: View) {
        val manager = fragmentManager.beginTransaction()
        manager.replace(R.id.mViewPager, notificationFragment)
        manager.commit()
        homeBtn.setImageResource(R.drawable.ic_home_black_24dp)
        searchBtn.setImageResource(R.drawable.ic_search_black_24dp)
        addBtn.setImageResource(R.drawable.ic_add_black_24dp)
        notiBtn.setImageResource(R.drawable.ic_notifications_none_pink)
        profileBtn.setImageResource(R.drawable.ic_person_outline_black_24dp)

    }

    fun profileClick(view: View) {
        val manager = fragmentManager.beginTransaction()
        manager.replace(R.id.mViewPager, profileFragment)
        manager.commit()
        homeBtn.setImageResource(R.drawable.ic_home_black_24dp)
        searchBtn.setImageResource(R.drawable.ic_search_black_24dp)
        addBtn.setImageResource(R.drawable.ic_add_black_24dp)
        notiBtn.setImageResource(R.drawable.ic_notifications_none_black_24dp)
        profileBtn.setImageResource(R.drawable.ic_person_outline_pink)


    }





}
