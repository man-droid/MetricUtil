package mandroid.metric_utils.temperature

sealed class TempConversionType {
    object CELSIUS_TO_FAHRENHEIT : TempConversionType()
    object CELSIUS_TO_KELVIN : TempConversionType()
    object KELVIN_TO_FAHRENHEIT : TempConversionType()
    object KELVIN_TO_CELSIUS : TempConversionType()
    object FAHRENHEIT_TO_CELSIUS : TempConversionType()
    object FAHRENHEIT_TO_KELVIN : TempConversionType()
}