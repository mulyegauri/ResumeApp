package com.example.resumeapp


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupWithNavController
import androidx.navigation.ui.setupActionBarWithNavController


import com.google.android.material.bottomnavigation.BottomNavigationView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Initialize Bottom Navigation View.
        val navView : BottomNavigationView = findViewById(R.id.bottom_navigatin_view)
       // val navHostFragment = supportFragmentManager.findFragmentById(R.id.nav_fragment) as NavHostFragment
        val navController  = findNavController(R.id.nav_fragment)
        //Pass the ID's of Different destinations
        val appBarConfiguration = AppBarConfiguration(
            setOf(
            R.id.home_navigation,
            R.id.skills_navigation,
            R.id.settings_navigation,
            R.id.moredetails_navigation
        ))

        //Initialize NavController.
        setupActionBarWithNavController( navController, appBarConfiguration)
        navView.setupWithNavController(navController)

    }
}