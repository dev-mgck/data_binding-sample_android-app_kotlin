package dev.mgck.databindingsample.util

import android.graphics.Color
import android.view.View
import android.widget.TextView
import androidx.databinding.BindingAdapter

//create a Binding Adapter that hides the wind chill setting if it's zero
@BindingAdapter("app:hideIfZero")
fun hideIfZero(view: View, value: Int) {
    view.visibility = if (value == 0) View.GONE else View.VISIBLE
}

//Programming Challenge: set the color of the temp text based on value
@BindingAdapter("android:textColor")
fun tempToColor(view: TextView, temp: Int) {
    when {
        temp < 15 -> view.setTextColor(Color.BLUE)
        temp in 15..21 -> view.setTextColor(Color.rgb(255, 165, 0))
        temp >= 22 -> view.setTextColor(Color.RED)
    }
}