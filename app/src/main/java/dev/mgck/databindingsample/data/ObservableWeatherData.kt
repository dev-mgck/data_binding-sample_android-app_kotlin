package dev.mgck.databindingsample.data

import androidx.databinding.ObservableField
import androidx.databinding.ObservableInt

data class ObservableWeatherData(
    val current_temp : ObservableInt,
    val current_cond : ObservableField<String>,
    val current_windchill : ObservableInt) {

    //  defining some functions to increase or decrease the temperature
    fun onIncreaseTemp() {
        current_temp.set(current_temp.get() + 1)
    }

    fun onDecreaseTemp() {
        current_temp.set(current_temp.get() - 1)
    }
}