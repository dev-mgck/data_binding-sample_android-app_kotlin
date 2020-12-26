package dev.mgck.databindingsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.databinding.ObservableField
import androidx.databinding.ObservableInt
import dev.mgck.databindingsample.data.ObservableWeatherData
import dev.mgck.databindingsample.databinding.ActivityObservableFieldsBinding

class ObservableFields : AppCompatActivity() {

    // Creating an ObservableWeatherData model
    private val obs_weather = ObservableWeatherData(
        ObservableInt(30),
        ObservableField<String>("Cloudy"),
        ObservableInt(5)
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding : ActivityObservableFieldsBinding =
            DataBindingUtil.setContentView(this, R.layout.activity_observable_fields)

        // binding to the observable model
        binding.weather = obs_weather
    }
}