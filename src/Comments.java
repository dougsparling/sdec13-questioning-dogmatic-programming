import java.util.ArrayList;
import java.util.List;


public class Comments {
	private static final int MIN_AGE_FOR_PENSION_PAYOUT = 65;
	
	/**
	 * The person's name.
	 */
	private String name;

	/**
	 * Returns the person's name.
	 * 
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	
	class Person { int age;

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	
	/**
	 * @return Always returns true.
	 */
	public boolean isAvailable() {
		return false; // FIXME: temporary testing
	}

	public Object getAddress() {
		// TODO Auto-generated method stub
		return null;
	} }
	
	public void stuff() {
		
		List<Person> people = ...;
		
		// the what
		for (Person person : people) {
			if (person.getAge() >= 65) {
				sendCheque(person.getAddress());
			}
		}
		
		// the 'why'
		for (Person person : people) {
			if (person.getAge() >= 65) {
				sendCheque(person.getAddress());
			}
		}
		
		for (Person person : people) {
			if (person.getAge() >= MIN_AGE_FOR_PENSION_PAYOUT) {
				sendCheque(person.getAddress());
			}
		}
	}

	private void sendCheque(Object address) {
		// TODO Auto-generated method stub
		
	}

	public static void main(String... args) {
		for (int i = 1; i < 100; i++) {
			doSomething(i);
		}
	}
	
	public static boolean doSomething(int n) {
		//int n = 100;
		
		List<Integer> list = new ArrayList<Integer>();
		
		for (int i = 2; i * i < n; i++) {
			boolean temp = true;
			for (int j : list) {
				if (i % j == 0) {
					temp = false;
				}
			}
			if (temp) {
				list.add(i);
			}
		}
		
		boolean result = false;
		for (int i : list) {
			
		}
		
		boolean result = list.contains(n);
		
		System.out.println(result);
	}
}
