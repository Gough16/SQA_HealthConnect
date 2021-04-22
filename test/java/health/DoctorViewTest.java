package health;

import controllers.DoctorView;
import controllers.Health;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DoctorViewTest {

	private DoctorView doctorTester;

	/**
	 * Test Case Id: UnitTest-DoctorTest-001
	 * Runs the main method of Doctor and checks if any exception was thrown.
	 * Health collects data from the database and displays it in the console.
	 * If an exception were thrown it would catch it.
	 */
	@Test
	public void runMain() {

		doctorTester = new DoctorView("test");
		Assertions.assertDoesNotThrow(() -> doctorTester.main(null));
	}

	@Test
	public void newRequestTest() {

		doctorTester = new DoctorView("test");
		Assertions.assertDoesNotThrow(() -> doctorTester.newRequestButtonActionPerformed(null));
	}




}
