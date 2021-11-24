package com.dwidarmawan.a211androidi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val simpanButton = findViewById<Button>(R.id.simpanButton)
        val batalButton = findViewById<Button>(R.id.batalButton)

        val namaEditText = findViewById<EditText>(R.id.namaEditText)
        val emailEditText = findViewById<EditText>(R.id.emailEditText)
        val nomorEditText = findViewById<EditText>(R.id.nomorEditText)
        val tanggallahirEditText = findViewById<EditText>(R.id.tanggallahirEditText)
        val jumlahmkEditText = findViewById<EditText>(R.id.jumlahmkEditText)

        simpanButton.setOnClickListener {
            namaEditText.setText("")
            emailEditText.setText("")
            nomorEditText.setText("")
            tanggallahirEditText.setText("")
            jumlahmkEditText.setText("")

            Toast.makeText(this,"Data Tersimpan",Toast.LENGTH_SHORT).show()
        }

        batalButton.setOnClickListener{
            finish()

        }
    }
}