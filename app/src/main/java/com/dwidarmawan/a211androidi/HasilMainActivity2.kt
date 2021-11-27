package com.dwidarmawan.a211androidi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class HasilMainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hasil_main2)

        val nama = intent.getStringExtra("nama")
        val email = intent.getStringExtra("email")
        val alamat = intent.getStringExtra("alamat")
        val nomor = intent.getStringExtra("nomor")
        val tanggalLahir = intent.getStringExtra("tanggalLahir")
        val jumlahMataKuliah = intent.getIntExtra("jumlahMataKuliah", 0)

        val namaTextView = findViewById<TextView>(R.id.namaTextView)
        val emailTextView = findViewById<TextView>(R.id.emailTextView)
        val alamatTextView = findViewById<TextView>(R.id.alamatTextView)
        val nomorTextView = findViewById<TextView>(R.id.nomorTextView)
        val tanggalLahirTextView = findViewById<TextView>(R.id.tanggalLahirTextView)
        val jumlahMataKuliahTextView = findViewById<TextView>(R.id.jumlahMataKuliahTextView)

        namaTextView.setText(nama)
        emailTextView.setText(email)
        alamatTextView.setText(alamat)
        nomorTextView.setText(nomor)
        tanggalLahirTextView.setText(tanggalLahir)
        jumlahMataKuliahTextView.setText(jumlahMataKuliah.toString())

    }
}