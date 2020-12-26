package dev.mgck.databindingsample

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

object TestWeatherData {
    const val temp = 38
    const val conditions = "Sunny"
    const val windchill = 6
}

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // display data the old way using findViewById:
        findViewById<TextView>(R.id.curtemp).text = TestWeatherData.temp.toString()
        findViewById<TextView>(R.id.curcond).text = TestWeatherData.conditions
        findViewById<TextView>(R.id.windchill).text = TestWeatherData.windchill.toString()

        // set event handlers the old way using findViewById:
        findViewById<Button>(R.id.simplebind).setOnClickListener {
            startActivity(Intent(this, SimpleExample::class.java))
        }
        findViewById<Button>(R.id.obsfldbind).setOnClickListener {
            startActivity(Intent(this, ObservableFields::class.java))
        }
        findViewById<Button>(R.id.viewmodeldbind).setOnClickListener {
            startActivity(Intent(this, ViewModExample::class.java))
        }
        findViewById<Button>(R.id.btnTwoWayBind).setOnClickListener {
            startActivity(Intent(this, TwoWayExample::class.java))
        }
    }
}