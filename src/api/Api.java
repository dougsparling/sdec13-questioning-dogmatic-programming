package api;
import java.util.List;


public class Api {
	class Person {
		
	}
	
	/**
	 * <p><b>Usage:</b></p>
	 * 
	 * <pre>
	 *  PersonRepository exampleRepo = makeRepository(bobJones, joelStevens, shirleySmith);
	 *  
	 *  List<Person> persons = exampleRepo.findPeople("jo");
	 *  
	 *  persons.get(0); // bobJones
	 *  persons.get(1); // joelStevens
	 * </pre>
	 * 
	 * @author Doug
	 */
	interface PersonRepository {
		
		List<Person> findPeople(String text);
	}
	
	public static PersonRepository makeRepository(Person... people) {
		return null;
	}
	
	public void test()
	{
		PersonRepository directory = makeRepository();
	}
	
	public static void blah()
	{
		Person bobJones = null;
		Person joelStevens = null;
		Person shirleySmith = null;
		
		PersonRepository exampleRepo = makeRepository(bobJones, joelStevens, shirleySmith);
		
		List<Person> persons = exampleRepo.findPeople("jo");
		
		persons.get(0); // bobJones
		persons.get(1); // joelStevens
	}
}
