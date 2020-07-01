package sef.ATestTask.FirstActivity;

import static org.junit.Assert.assertThrows;

import junit.framework.TestCase;

public class PersonTest extends TestCase {
	
	private Person thePerson;

	protected void setUp() throws Exception {
		super.setUp();
		
		thePerson = new Person();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	
	
	public void testInputnumber() {
	
		assertThrows(CustomizedException.class, () -> {
			thePerson.setFirstName("Ivan6576");
		});
			
			
	}
	
	public void testInputLastNamenumber() {
		
		assertThrows(CustomizedException.class, () -> {
			thePerson.setSecondName("Blackstar23");
		});
			
			
	}
}
