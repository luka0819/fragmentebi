package com.example.fragmentebi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val nawView: BottomNavigationView= findViewById(R.id.nav_view)
        val navControler = findNavController(R.id.nav_host_fragment)

        val appBarConfig = AppBarConfiguration(setOf(
            R.id.navigation_home,R.id.navigation_dashboard,R.id.navigation_notification,R.id.navigation_profili
        ))
        setupActionBarWithNavController(navControler , appBarConfig)
        nawView.setupWithNavController(navControler)


    }
}