package health;

import controllers.Health;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


/**
 * Test class for running the Health source class
 * Created By: Alan Norman
 */
public class HealthTest {

	private Health healthTester;

	/**
	 * Test Case Id: UnitTest-HealthTest-001
	 * Runs the main method of Health and checks if any exception was thrown.
	 * Health collects data from the database and displays it in the console.
	 * If an exception were thrown it would catch it.
	 */
	@Test
	public void runMain() {

		healthTester = new Health();
		Assertions.assertDoesNotThrow(() -> healthTester.main(null));
	}

}