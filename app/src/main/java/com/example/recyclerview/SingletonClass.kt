package com.example.recyclerview

import android.graphics.Bitmap

class SingletonClass {
    companion object selectedCar {
        var car :Bitmap? = null
    }
}