package dev.mgck.databindingsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import dev.mgck.databindingsample.data.WeatherViewModel
import dev.mgck.databindingsample.databinding.ActivityViewModExampleBinding

class ViewModExample : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // setContentView(R.layout.activity_view_mod_example)

        val viewModel: WeatherViewModel by viewModels()
        val binding : ActivityViewModExampleBinding =
            DataBindingUtil.setContentView(this, R.layout.activity_view_mod_example)

        binding.weather = viewModel
        // set the lifecycle owner to the Activity
        binding.lifecycleOwner = this
    }
}