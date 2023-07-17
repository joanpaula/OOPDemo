package eu.tutorials.oopdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val driver = Driver("Jp", 80)
//        driver.showDetails()

        val myCar = MyCar()
        myCar.maxSpeed = 100
        myCar.start()

    }
}