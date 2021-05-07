package com.example.recycler

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_layout.view.*

class SepatuAdapter(val arrayList: ArrayList<SepatuModel>,
                    val context: Context) :
        RecyclerView.Adapter<SepatuAdapter.ViewHolder>(){

            class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

                fun bindItems(model: SepatuModel) {
                    itemView.NamaSepatu.text = model.nmsepatu
                    itemView.descsepatu.text = model.dessepatu
                    itemView.hargasepatu.text = model.hargasepatu.toString()
                    itemView.imgsepatu.setImageResource(model.imagesepatu)

                }
            }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.item_layout , parent , false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindItems(arrayList[position])

        holder.itemView.setOnClickListener(){
            val model = arrayList.get(position)

            var gsepatu : String = model.nmsepatu
            var gDesc : String = model.dessepatu
            var gHarga : Int = model.hargasepatu.toString().toInt()
            var gImg : Int = model.imagesepatu

            val intent = Intent(context , OrderActivity::class.java)
            intent.putExtra("pSepatu" , gsepatu)
            intent.putExtra("pDesc" , gDesc)
            intent.putExtra("pHarga" , gHarga)
            intent.putExtra("pImg" , gImg)

            context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return arrayList.size
    }
}