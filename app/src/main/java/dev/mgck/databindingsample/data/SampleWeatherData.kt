package dev.mgck.databindingsample.data

data class SampleWeatherData (
    val temp: Int,
    val conditions: String,
    val windchill: Int,
    val units: String)

{
    // TODO: create a function that operates on the data
    fun convertToF() : Int {
        return (temp * 9/5) + 32
    }

    fun formatAsCandF() : String {
        return "${temp}C (${convertToF()}F)"
    }
}