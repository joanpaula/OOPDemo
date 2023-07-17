package eu.tutorials.oopdemo

import android.util.Log

class MyCar : Car(), SpeedController{

    override fun start() {
        Log.i("MyTag", "Hi its MyCar starting... Brand ID is ${getBrandId()}")
    }

    override fun accelerate() {
        TODO("Not yet implemented")
    }

    override fun declerate() {
        TODO("Not yet implemented")
    }

}