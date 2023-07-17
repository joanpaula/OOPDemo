package eu.tutorials.oopdemo

import android.util.Log

open class Car {

    var maxSpeed = 30

    open fun start() {
        Log.i("MyTag", "car is starting...")
        Log.i("MyTag", "maximum speed is $maxSpeed")
    }

}