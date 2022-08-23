package com.example.recyclerview

import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class PresentationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_presentation)

        val intent = intent
        val selectedCarText = intent.getStringExtra("car")
        val selectedCarImage = intent.getIntExtra("selectedImage",0)
        val bitmap = BitmapFactory.decodeResource(applicationContext.resources,selectedCarImage)
        val textView = findViewById<android.widget.TextView>(R.id.textView)
        val imageView = findViewById<android.widget.ImageView>(R.id.imageView)

        textView.setText(selectedCarText)
        imageView.setImageBitmap(bitmap)

    }
}