package api;
import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

import api.Api.Person;
import api.Api.PersonRepository;



public class ApiTest {

	public static PersonRepository makeRepository(Person... people) {
		return null;
	}
	
	private static Person testPerson(String string) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Test
	public void testFindPeople() {
		
		Person bobJones = testPerson("Bob Jones");
		Person joelStevens = testPerson("Joel Stevens");
		Person shirleySmith = testPerson("Shirley Smith");
		
		PersonRepository exampleRepo = makeRepository(bobJones, joelStevens, shirleySmith);
		
		List<Person> persons = exampleRepo.findPeople("jo");
		
		assertEquals(bobJones, persons.get(0)); 
		assertEquals(joelStevens, persons.get(1);
	}

	
	
}
