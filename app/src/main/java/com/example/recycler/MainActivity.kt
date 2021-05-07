package com.example.recycler

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val arrayitem = ArrayList<SepatuModel>()
        arrayitem.add(SepatuModel("Adidas" , "Adidas terbuat dari Sepatu" , R.drawable.adidas , 3000000))
        arrayitem.add(SepatuModel("New Balance" , "New Balance terbuat dari Sepatu" , R.drawable.newbalance , 2000000))
        arrayitem.add(SepatuModel("Nike" , "Nike terbuat dari Sepatu" , R.drawable.nike , 1000000))
        arrayitem.add(SepatuModel("Puma" , "Puma terbuat dari Sepatu" , R.drawable.puma , 9000000))
        arrayitem.add(SepatuModel("Rebook" , "Rebook terbuat dari Sepatu" , R.drawable.recook , 8000000))
        arrayitem.add(SepatuModel("Vans" , "Vans terbuat dari Sepatu" , R.drawable.vans , 7000000))
        arrayitem.add(SepatuModel("Wakai" , "Wakai terbuat dari Sepatu" , R.drawable.wakai , 6000000))
        arrayitem.add(SepatuModel("Brodo" , "Brodo terbuat dari Sepatu" , R.drawable.brodo , 5000000))
        arrayitem.add(SepatuModel("Convers" , "Convers terbuat dari Sepatu" , R.drawable.convers , 4000000))
        arrayitem.add(SepatuModel("Diadora" , "Diadora terbuat dari Sepatu" , R.drawable.diadora , 2300000))
        arrayitem.add(SepatuModel("League" , "League terbuat dari Sepatu" , R.drawable.league , 2200000))

        var myAdapter = SepatuAdapter(arrayitem, this)

        RV_sepatu.layoutManager = LinearLayoutManager(this)
        RV_sepatu.adapter = myAdapter
    }
}