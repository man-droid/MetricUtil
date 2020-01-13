# MetricUtil
- Useful for temperature conversion (Celsius/Fohrenheit/Kelvin)


Add it in your root build.gradle at the end of repositories:
```
allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```
Add the dependency in your app module:
```
dependencies {
	        implementation 'com.github.man-droid:MetricUtil:0.1'
	}

#Sample
```
MetricUtils.convertTemperature(0,  TempConversion.CELSIUS_TO_FAHRENHEIT)
```
Available conversions:
- CELSIUS_TO_FAHRENHEIT
- CELSIUS_TO_KELVIN
- KELVIN_TO_FAHRENHEIT
- KELVIN_TO_CELSIUS
- FAHRENHEIT_TO_CELSIUS
- FAHRENHEIT_TO_KELVIN

** That    it!! **
