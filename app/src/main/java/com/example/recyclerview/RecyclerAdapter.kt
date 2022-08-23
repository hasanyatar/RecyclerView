package com.example.recyclerview

import android.content.Intent
import android.graphics.Bitmap
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecyclerAdapter(val carList : ArrayList<String>,val carImage :ArrayList<Int> ): RecyclerView.Adapter<RecyclerAdapter.CarsVH>() {

    class CarsVH(itemView:View) : RecyclerView.ViewHolder(itemView){
        val recyclerViewTextView:TextView = itemView.findViewById(R.id.recyclerViewTextView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CarsVH {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.recycler_row,parent,false)
        return CarsVH(itemView)
    }
    override fun getItemCount(): Int {
        return carList.size
    }

    override fun onBindViewHolder(holder:CarsVH, position: Int) {
        holder.recyclerViewTextView.text = carList[position]
        holder.itemView.setOnClickListener(){
            val intent = Intent(holder.itemView.context,PresentationActivity :: class.java)
            intent.putExtra("car",carList[position])
            intent.putExtra("selectedImage",carImage[position])
            holder.itemView.context.startActivity(intent)
        }
    }



}