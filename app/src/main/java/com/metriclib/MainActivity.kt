package com.metriclib

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import mandroid.metric_utils.MetricUtils
import mandroid.metric_utils.temperature.TempConversion
import mandroid.metric_utils.temperature.TempConversion.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button.setOnClickListener {
            textView.text = MetricUtils.convertTemperature(etTemp.text.toString().toDouble(), getConversionType(spinner.selectedItemPosition))
        }

    }

    private fun getConversionType(pos: Int): TempConversion {
        return when (pos) {
            0 -> CELSIUS_TO_FAHRENHEIT
            1 -> CELSIUS_TO_KELVIN
            2 -> KELVIN_TO_FAHRENHEIT
            3 -> KELVIN_TO_CELSIUS
            4 -> FAHRENHEIT_TO_CELSIUS
            else -> FAHRENHEIT_TO_KELVIN
        }
    }
}
