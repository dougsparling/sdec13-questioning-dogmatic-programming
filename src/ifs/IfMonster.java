package ifs;

import java.util.HashMap;
import java.util.Map;

public class IfMonster {
	
	public enum ProductType {
		WIDGET

	}

	public enum Province {
		MB, AB

	}

	public void taxes() {
		Province province = null;
		double tax = 0.0;
		ProductType productType = null;
		if (province == Province.MB && productType == ProductType.WIDGET) {
			tax = 0.05; // no PST on widgets in MB
		} else if (province == Province.MB) {
			tax = 0.13;
		} else if (province == Province.AB) {
			tax = 0.05;
		} else  {
			// and so on
		}
	}
	
	static Map<Province, Double> taxByProvince = new HashMap<>();
	new fj.data.HashMap<String, String>();
	
	static {
		taxByProvince.put(Province.MB, 0.13);
		taxByProvince.put(Province.AB, 0.13);
		// ... etc.
		
	
	public void refactored() {
		Province province = null;
		double tax = 0.0;
		ProductType productType = null;
		if (province == Province.MB && productType == ProductType.WIDGET) {
			tax = 0.05; // no PST on widgets in MB
		} else
			tax = taxByProvince.get(province);
		}
	}
	
	static Map<Province, Either<Double, Map<ProductType, Double>>> 
}
