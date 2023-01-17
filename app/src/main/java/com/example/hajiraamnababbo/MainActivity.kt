package com.example.hajiraamnababbo

import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.hajiraamnababbo.databinding.ActivityMainBinding
import android.content.Intent


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navView: BottomNavigationView = binding.navView

        val navController = findNavController(R.id.nav_host_fragment_activity_main)
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        val appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.navigation_home, R.id.navigation_dashboard, R.id.navigation_notifications
            )
        )
        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)
    }


    fun videospage(view: View) {
        val intent = Intent(/* packageContext = */ this,/* cls = */ hajra::class.java)
        startActivity(intent)
        Toast.makeText(this, "You Are Going On Hajira Amna Babbo \uD83E\uDDD0     \uD83E\uDD13Videos_Page\uD83D\uDC7B", Toast.LENGTH_LONG).show()
    }
    fun abba(view: View) {
        val intent = Intent(/* packageContext = */ this,/* cls = */ UncleStories::class.java)
        startActivity(intent)
        Toast.makeText(this, "You Are Going On Mitti Aur Loha Story Page \uD83E\uDDD0     \uD83E\uDD13Videos_Page\uD83D\uDC7B", Toast.LENGTH_LONG).show()
    }
    fun adeemastories(view: View) {
        val intent = Intent(/* packageContext = */ this,/* cls = */ AdeemaApiJanStories::class.java)
        startActivity(intent)
        Toast.makeText(this, "You Are Going On Jungle Ka Raja Story Page \uD83E\uDDD0     \uD83E\uDD13Videos_Page\uD83D\uDC7B", Toast.LENGTH_LONG).show()
    }
    fun loinandfox(view: View) {
        val intent = Intent(/* packageContext = */ this,/* cls = */ lionfox::class.java)
        startActivity(intent)
        Toast.makeText(this, "You Are Going On Sher Aur Lomri Story Page \uD83E\uDDD0     \uD83E\uDD13Videos_Page\uD83D\uDC7B", Toast.LENGTH_LONG).show()
    }

}