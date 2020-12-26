package dev.mgck.databindingsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import dev.mgck.databindingsample.data.WeatherViewModel
import dev.mgck.databindingsample.databinding.ActivityTwoWayExampleBinding

class TwoWayExample : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // setContentView(R.layout.activity_two_way_example)

        val viewModel: WeatherViewModel by viewModels()
        val binding: ActivityTwoWayExampleBinding =
            DataBindingUtil.setContentView(this, R.layout.activity_two_way_example)

        binding.weather = viewModel
        binding.lifecycleOwner = this
    }
}