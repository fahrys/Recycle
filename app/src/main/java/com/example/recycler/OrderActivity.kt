package com.example.recycler

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.ActionBar
import kotlinx.android.synthetic.main.activity_bayar_total.*
import kotlinx.android.synthetic.main.activity_order.*

class OrderActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_order)

        var toHarga:Int = 0
        var minteger:Int = 0
        var MIN_NUMBER = 0

            val actionBar : ActionBar? = supportActionBar
            actionBar!!.setDisplayHomeAsUpEnabled(true)
            actionBar!!.setDisplayHomeAsUpEnabled(true)

        var intent = intent
        val aSepatu = intent.getStringExtra("pSepatu")
        val aDesc = intent.getStringExtra("pDesc")
        val aHarga = intent.getIntExtra("pHarga" , 0)
        val aImg = intent.getIntExtra("pImg" , 0 )

        actionBar.setTitle("Order " +aSepatu)
        SepatuOrd.text = aSepatu
        desOrd.text = aDesc
        hargaOrd.text = aHarga.toString()
        imageOrd.setImageResource(aImg)

        fun display(number: Int) {
            val displayInteger = findViewById<View>(
                R.id.JmlOrd) as TextView

            displayInteger.text = "" + number

            toHarga = hargaOrd.text.toString().toInt() * displayInteger.text.toString().toInt()
            ToHardOrd.text = toHarga.toString()
        }

        decreaseOrd.setOnClickListener() {
            if(minteger == MIN_NUMBER) {
                minteger = 0
            }
            else {
                minteger = minteger - 1
                display(minteger)
            }
        }

        increaseOrd.setOnClickListener() {
            minteger = minteger + 1
            display(minteger)
        }

        OrderLagi.setOnClickListener {
            onBackPressed()
        }

        Bayar.setOnClickListener {
            var namaSepatu = SepatuOrd.text.toString()
            var jumlahbarang = JmlOrd.text.toString()
            var jumlahharga = ToHardOrd.text.toString()

            val intent = Intent(this , BayarTotal::class.java)
            intent.putExtra("NamaSepatu", namaSepatu)
            intent.putExtra("JmlBrg" , jumlahbarang)
            intent.putExtra("TotalHarga" , jumlahharga)
            startActivity(intent)
            true



        }
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true

    }
}