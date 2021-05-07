package com.example.recycler

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_bayar_total.*

class BayarTotal : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bayar_total)

        supportActionBar!!.setTitle("Bayar")
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)

        val intent = intent

        val NSepatu =intent.getStringExtra("NamaSepatu")
        val NJml = intent.getStringExtra("JmlBrg")
        val NJHarga = intent.getStringExtra("TotalHarga")

        val total =findViewById<TextView>(R.id.total)

        total.text = "Name:\n"+NSepatu +
          "\nJumlah Barang:\n" + NJml +
                "\nTotal Harga:\n"+NJHarga

    }
}