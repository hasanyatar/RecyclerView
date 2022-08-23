package com.example.recyclerview

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val myCars = arrayListOf<String>()
        myCars.add("blue lamborghini")
        myCars.add("lamborghini")
        myCars.add("porsche")
        myCars.add("koen")
        myCars.add("bmw")


//        val blue_lam =
//            BitmapFactory.decodeResource(applicationContext.resources, R.drawable.blue_lam)
//        val lamborghini =
//            BitmapFactory.decodeResource(applicationContext.resources, R.drawable.lamborghini)
//        val porsche = BitmapFactory.decodeResource(applicationContext.resources, R.drawable.porsche)
//        val koen = BitmapFactory.decodeResource(applicationContext.resources, R.drawable.koen)
//        val bmw = BitmapFactory.decodeResource(applicationContext.resources, R.drawable.bmw)
//        var carsImage = ArrayList<Bitmap>()
//        carsImage.add(blue_lam)
//        carsImage.add(lamborghini)
//        carsImage.add(porsche)
//        carsImage.add(koen)
//        carsImage.add(bmw)

        val blue_lam = R.drawable.blue_lam
        val lamborghini = R.drawable.lamborghini
        val porsche = R.drawable.porsche
        val koen = R.drawable.koen
        val bmw = R.drawable.bmw

        var carsDrawableList = ArrayList<Int>()
        carsDrawableList.add(blue_lam)
        carsDrawableList.add(lamborghini)
        carsDrawableList.add(porsche)
        carsDrawableList.add(koen)
        carsDrawableList.add(bmw)


        var recyclerView : RecyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        val adapter = RecyclerAdapter(myCars, carsDrawableList)

        recyclerView.adapter = adapter
    }

}