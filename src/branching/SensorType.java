package branching;

enum SensorType {
	TEMPERATURE {
		public int getReading(SensorPackage sensors) {
			return sensors.getTemperature();
		}
	}, HUMIDITY {
		public int getReading(SensorPackage sensors) {
			return sensors.getHumidity();
		}
	}, PRESSURE {
		public int getReading(SensorPackage sensors) {
			return sensors.getPressure();
		}
	};
	
	public abstract int getReading(SensorPackage sensors);
}

enum SensorType {
	TEMPERATURE, HUMIDITY, PRESSURE;
}