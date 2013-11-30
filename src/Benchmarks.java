import java.util.ArrayList;
import java.util.List;


public class Benchmarks {
	
	static List<Person> people = new ArrayList<Person>();
	static {
		for (int i = 0; i < 1000000; i++) {
			people.add(new Person(randomBetween(20, 70), randomBetween(150, 240)));
		}
	}
	
	static int randomBetween(int low, int high) {
		return (int)(Math.random() * (high - low) + low);
	}
	
	static class Person {
		private final int age;
		private final int height;
		public Person(int age, int height) {
			this.age = age;
			this.height = height;
		}
		public int getAge() {
			return age;
		}
		public int getHeight() {
			return height;
		}
	}
	
	private static void peopleMethod1() {
		
		double averageAge = averageAge(people);
		double averageHeight = averageHeight(people);
		
		System.out.println(String.format("average age %f, average height %f", averageAge, averageHeight));
	}

	private static double averageAge(List<Person> people) {
		long ageSum = 0;
		for (Person person : people) {
			ageSum += person.getAge();
		}
		return (double) (ageSum / people.size());
	}
	
	private static double averageHeight(List<Person> people) {
		long heightSum = 0;
		for (Person person : people) {
			heightSum += person.getHeight();
		}
		return (double) heightSum / people.size();
	}
	
	private static void peopleMethod2() {
		long ageSum = 0;
		long heightSum = 0;
		for (Person person : people) {
			ageSum += person.getAge();
			heightSum += person.getHeight();
		}
		double averageAge = (ageSum / people.size());
		double averageHeight = heightSum / people.size();
		
		System.out.println(String.format("average age %f, average height %f", averageAge, averageHeight));
	}
	
	public static void main(String... args) {
		int reps = 10;
		
		long totalRuntime = 0;
		
		for (int iteration = 0; iteration < 1500; iteration++) {
			peopleMethod2();
		}
		
		for (int iteration = 0; iteration < reps; iteration++) {
			long startTime = System.nanoTime();
			peopleMethod2();
			long endTime = System.nanoTime();
			totalRuntime += endTime - startTime;
		}
		
		long averageRuntimeNanos = totalRuntime / reps;
		long averageMillis = averageRuntimeNanos / 1000;
		
		System.out.println(String.format("Average runtime over %d reps: %d microseconds", reps, averageMillis));
	}

	
}
