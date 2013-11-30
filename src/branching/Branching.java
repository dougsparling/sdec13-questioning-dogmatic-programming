package branching;


public class Branching implements WeatherStation {
	
	SensorPackage weatherSensor = new SensorPackage();
	
	
	
	public int readSensor(SensorType sensorType) {
		switch (sensorType) {
		case TEMPERATURE:
			return weatherSensor.getTemperature();
		case HUMIDITY:
			return weatherSensor.getTemperature();
		case PRESSURE:
			return weatherSensor.getTemperature();
		default:
			throw new IllegalArgumentException("...");
		}
	}
}

