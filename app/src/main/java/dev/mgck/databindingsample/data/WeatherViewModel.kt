package dev.mgck.databindingsample.data

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel


class WeatherViewModel : ViewModel() {
    // This data is hard-coded but you can imagine it comes from a weather service somewhere
    private val _current_temp = MutableLiveData(30)
    private val _current_conditions = MutableLiveData("Cloudy")
    private val _current_windchill = MutableLiveData(0)

    // public properties that we can bind to
    val current_temp: MutableLiveData<Int> = _current_temp
    val current_cond: LiveData<String> = _current_conditions
    val current_windchill: LiveData<Int> = _current_windchill

    // methods to change the temperature
    fun onIncreaseTemp() {
        _current_temp.value = _current_temp.value?.plus(1)
    }

    fun onDecreaseTemp() {
        _current_temp.value = _current_temp.value?.minus(1)
    }
}