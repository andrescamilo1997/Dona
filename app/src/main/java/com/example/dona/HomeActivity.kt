package com.example.dona

import android.content.Context
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.firebase.auth.FirebaseAuth

enum class ProviderType{
    BASIC,
    GOOGLE
}

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

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
    private fun setup(email: String, provider: String  ){
        val emailTextView = findViewById<TextView>(R.id.emailTextView)
        val providerTextView2 = findViewById<TextView>(R.id.providerTextView2)
        val cerrarSesionButton = findViewById<Button>(R.id.cerrarSesionButton)
        title = "inicio"
        emailTextView.text = email
        providerTextView2.text =provider

        cerrarSesionButton.setOnClickListener{
            val prefs:SharedPreferences.Editor = getSharedPreferences(getString(R.string.prefs_file), Context.MODE_PRIVATE).edit()
            prefs.clear()
            prefs.apply()
            FirebaseAuth.getInstance().signOut()
            onBackPressed()
        }
    }
}