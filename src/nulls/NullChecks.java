package nulls;

import java.util.Arrays;
import java.util.List;

public class NullChecks {
	
	// null with collection
	
	public List<String> parseNames(String names) {
		
		if (names == null) {
			return null;
		}
		
		return Arrays.asList(names.split(","));
	}
	
	public List<String> parseNames2(String names) {
		
		if (names == null) {
			return Collections.emptyList();
		}
		
		return Arrays.asList(names.split(","));
	}
	
	public List<String> parseNames3(String names) {
		
		if (names == null) {
			return null;
		}
		
		return Arrays.asList(names.split(","));
	}
	
	void readNames() {
		String line = System.console().readLine();
		List<String> names = parseNames(line);
		
		if (names != null)
		{
			for (String name : names) {
				// ...
			}
		}
	}
	
	public static void main(String... args) {
		new NullChecks().readNames();
	}
}
