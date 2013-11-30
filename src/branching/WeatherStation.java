package branching;

import branching.Branching.SensorType;

interface WeatherStation {
	public int readSensor(SensorType sensorType);
}