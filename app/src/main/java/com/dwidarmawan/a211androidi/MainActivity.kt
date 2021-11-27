package com.dwidarmawan.a211androidi

import android.content.Intent
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
        val alamatEditText = findViewById<EditText>(R.id.alamatEditText)
        val nomorEditText = findViewById<EditText>(R.id.nomorEditText)
        val tanggalLahirEditText = findViewById<EditText>(R.id.tanggalLahirEditText)
        val jumlahMataKuliahEditText = findViewById<EditText>(R.id.jumlahMataKuliahEditText)

        simpanButton.setOnClickListener {
            Toast.makeText(this,"Data Tersimpan",Toast.LENGTH_SHORT).show()

            val nama = namaEditText.text.toString()
            val email = emailEditText.text.toString()
            val alamat = alamatEditText.text.toString()
            val nomor = nomorEditText.text.toString()
            val tanggalLahir = tanggalLahirEditText.text.toString()
            val jumlahMataKuliah = jumlahMataKuliahEditText.text.toString().toInt()

            val intent = Intent(this,HasilMainActivity2::class.java)
            intent.putExtra("nama", nama)
            intent.putExtra("email", email)
            intent.putExtra("alamat", alamat)
            intent.putExtra("nomor", nomor)
            intent.putExtra("tanggalLahir", tanggalLahir)
            intent.putExtra("jumlahMataKuliah", jumlahMataKuliah)
            startActivity(intent)

        }

        batalButton.setOnClickListener{
            finish()

        }
    }
}