package com.example.guiadeviajekotlin

import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GravityCompat
import com.example.guiadeviajekotlin.databinding.ActivityMainBinding
import com.google.android.material.navigation.NavigationView
import com.example.guiadeviajekotlin.fragments.PerfilFragment
import com.example.guiadeviajekotlin.fragments.RecomendacionesFragment
import com.example.guiadeviajekotlin.fragments.ReservasFragment
import com.example.guiadeviajekotlin.fragments.ItinerarioFragment
import com.example.guiadeviajekotlin.fragments.LugaresFragment

import androidx.fragment.app.Fragment

class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbar)

        val toggle = ActionBarDrawerToggle(
            this, binding.drawerLayout, binding.toolbar,
            R.string.navigation_drawer_open, R.string.navigation_drawer_close
        )
        binding.drawerLayout.addDrawerListener(toggle)
        toggle.syncState()

        binding.navView.setNavigationItemSelectedListener(this)

        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, PerfilFragment())
                .commit()
            binding.navView.setCheckedItem(R.id.nav_perfil)
        }
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.nav_perfil -> replaceFragment(PerfilFragment())
            R.id.nav_recomendaciones -> replaceFragment(RecomendacionesFragment(), "Abriendo Recomendaciones...")
            R.id.nav_reservas -> replaceFragment(ReservasFragment(), "Abriendo Reservas...")
            R.id.nav_itinerario -> replaceFragment(ItinerarioFragment(), "Abriendo Itinerario...")
            R.id.nav_lugares -> replaceFragment(LugaresFragment(), "Abriendo Lugares...")
            R.id.nav_offline -> {} // OfflineFragment luego
        }
        binding.drawerLayout.closeDrawer(GravityCompat.START)
        return true
    }

    private fun replaceFragment(fragment: androidx.fragment.app.Fragment, toast: String? = null) {
        toast?.let { Toast.makeText(this, it, Toast.LENGTH_SHORT).show() }
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, fragment)
            .commit()
    }

    override fun onBackPressed() {
        if (binding.drawerLayout.isDrawerOpen(GravityCompat.START)) {
            binding.drawerLayout.closeDrawer(GravityCompat.START)
        } else {
            super.onBackPressed()
        }
    }
}
