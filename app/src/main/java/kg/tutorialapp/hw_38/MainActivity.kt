package kg.tutorialapp.hw_38

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity() {

    lateinit var toggle: ActionBarDrawerToggle
    lateinit var drawerLayout: DrawerLayout
    lateinit var navigationView: NavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        drawerLayout = findViewById(R.id.drawer_layout)
        navigationView = findViewById(R.id.navigation_view)

        toggle = ActionBarDrawerToggle(this, drawerLayout, R.string.drawer_open, R.string.drawer_close)
        drawerLayout.addDrawerListener(toggle)
        toggle.syncState()

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        navigationView.setNavigationItemSelectedListener {
            when(it.itemId){
                R.id.item_home -> Toast.makeText(applicationContext,
                    "Home clcked", Toast.LENGTH_LONG).show()
                R.id.item_music -> Toast.makeText(applicationContext,
                    "Music clcked", Toast.LENGTH_LONG).show()
                R.id.item_movies -> Toast.makeText(applicationContext,
                    "Movies clcked", Toast.LENGTH_LONG).show()
                R.id.item_books -> Toast.makeText(applicationContext,
                    "Books clcked", Toast.LENGTH_LONG).show()
                R.id.item_settings -> Toast.makeText(applicationContext,
                    "Settings clcked", Toast.LENGTH_LONG).show()
            }
            true
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (toggle.onOptionsItemSelected(item)) {
            return true
        }
        return super.onOptionsItemSelected(item)
    }
}