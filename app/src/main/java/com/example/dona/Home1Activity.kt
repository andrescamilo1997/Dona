package com.example.dona

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.dona.databinding.ActivityHome1Binding
import com.google.firebase.auth.FirebaseAuth

enum class ProviderType{
    BASIC,
    GOOGLE
}

class Home1Activity : AppCompatActivity() {

    private lateinit var binding: ActivityHome1Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityHome1Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val navView: BottomNavigationView = binding.navView

        val navController = findNavController(R.id.nav_host_fragment_activity_home1)
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        val appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.navigation_home, R.id.navigation_dashboard, R.id.navigation_notifications, R.id.navigation_profile
            )
        )
        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)

        //setup

        val bundle: Bundle? = intent.extras
        val email:String? = bundle?.getString("email")
        val provider:String? = bundle?.getString("provider")
        setup(email ?:"", provider ?:"")

        //Guardado de Datos
        val prefs:SharedPreferences.Editor = getSharedPreferences(getString(R.string.prefs_file), Context.MODE_PRIVATE).edit()
        prefs.putString("email", email)
        prefs.putString("provider", provider)
        prefs.apply()
    }
    private fun setup(email: String, provider: String){
        val emailTextView = findViewById<TextView>(R.id.emailTextView)
        val providerTextView2 = findViewById<TextView>(R.id.providerTextView)
        val cerrarSesionButton = findViewById<Button>(R.id.cerrarSesionButton)
        //val ClosedSeccion = findViewById<Button>(R.id.ClosedSeccion)
        title = "inicio"
        emailTextView.text = email
        providerTextView2.text =provider


        cerrarSesionButton.setOnClickListener {
            val prefs: SharedPreferences.Editor = getSharedPreferences(
            getString(R.string.prefs_file),
               Context.MODE_PRIVATE
            ).edit()
            prefs.clear()
            prefs.apply()
            FirebaseAuth.getInstance().signOut()
            showAuth()
        }


    }
    private fun showAuth(){
        val authIntent = Intent(this, AuthActivity::class.java)
        startActivity(authIntent)
    }
}