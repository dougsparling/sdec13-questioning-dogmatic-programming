package branching;

abstract class SensorWrapper {
	
	abstract int getReading();
	
	static class TemperatureSensorWrapper extends SensorWrapper {
		private SensorPackage sensorPackage;
		public TemperatureSensorWrapper(SensorPackage sensorPackage) { /*...*/ }
		int getReading() { return sensorPackage.getTemperature(); }
	}
	
	static SensorWrapper create(SensorType sensorType, SensorPackage sensorPackage) {
		switch (sensorType) {
		case TEMPERATURE:
			return new TemperatureSensorWrapper(sensorPackage);
		default:
			throw new IllegalArgumentException("...");
		}
	}
}
