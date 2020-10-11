package com.example.calculadoradedavid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun salir(view: View) {
        System.exit(0)
    }

    fun acceder(view: View) {
        var editTextUser = findViewById<EditText>(R.id.editTextName)
        var user: String = editTextUser.text.toString()
        val Intent = Intent(this, MainActivity2::class.java)
        Intent.putExtra("user", user)
        startActivity(Intent)
        finish()
    }
}