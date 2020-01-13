package mandroid.metric_utils

import mandroid.metric_utils.temperature.TempConversion
import mandroid.metric_utils.temperature.TempConversion.*
import java.math.RoundingMode
import java.text.DecimalFormat


object MetricUtils {

    fun convertTemperature(temperature: Double,conversionType: TempConversion): String {
        val df = DecimalFormat("#.###")
        df.roundingMode = RoundingMode.HALF_EVEN
        val convertedTemp=when (conversionType) {
            CELSIUS_TO_FAHRENHEIT -> (temperature * 9.0 / 5.0) + 32
            CELSIUS_TO_KELVIN -> temperature + 273.15
            KELVIN_TO_FAHRENHEIT -> ((temperature - 273.15) * 9.0 / 5.0) + 32
            KELVIN_TO_CELSIUS -> temperature - 273.15
            FAHRENHEIT_TO_CELSIUS -> (temperature - 32) * 5.0 / 9.0
            else -> (temperature - 32) * 5.0 / 9.0 + 273.15// FAHRENHEIT_TO_KELVIN
        }
        return df.format(convertedTemp)
    }

}