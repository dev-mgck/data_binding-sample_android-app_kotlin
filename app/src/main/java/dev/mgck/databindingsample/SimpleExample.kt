package dev.mgck.databindingsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import dev.mgck.databindingsample.data.SampleWeatherData
import dev.mgck.databindingsample.databinding.ActivitySimpleExampleBinding

class SimpleExample : AppCompatActivity() {
    // create an instance (data object) of the data class
    val theweather = SampleWeatherData(30, "Overcast", 5, "C")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Data library auto-generated the associated binding class (ActivitySimpleExampleBinding)
        // inflate the layout using the binding library (DataBindingUtil Class)
        val binding: ActivitySimpleExampleBinding =
            DataBindingUtil.setContentView(this, R.layout.activity_simple_example)

        // connect the data with the layout variable weather -> variable created on .xml file
        binding.weather = theweather
    }
}