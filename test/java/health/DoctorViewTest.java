package health;

import controllers.DoctorView;
import controllers.Health;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Test class for the methods in the DoctorView source class
 * Created By: Alan Norman
 */
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

	/**
	 * Test Case id: UnitTest-DoctorTest-002
	 * Used to test that new requests button doesn't throw an error
	 * Relies on a real doctor profile
	 */
	@Test
	public void newRequestTest() {

		doctorTester = new DoctorView("test");
		Assertions.assertDoesNotThrow(() -> doctorTester.newRequestButtonActionPerformed(null));
	}

	/**
	 * Test Case id: UnitTest-DoctorTest-003
	 * Used to test that in progress button doesn't throw an error
	 * Relies on a real doctor profile
	 */
	@Test
	public void inProgressRequestsTest() {

		doctorTester = new DoctorView("test");
		Assertions.assertDoesNotThrow(() -> doctorTester.inProgressButtonActionPerformed(null));
	}

	/**
	 * Test Case id: UnitTest-DoctorTest-004
	 * Used to assert that the closed button was clicked
	 * Relies on a real doctor profile
	 */
	@Test
	public void closedRequestsTest() {

		doctorTester = new DoctorView("test");
		Assertions.assertDoesNotThrow(() -> doctorTester.closeRequestButtonActionPerformed(null));
	}

	/**
	 * Test Case id: UnitTest-DoctorTest-005
	 * Used to assert the doctor successfully logs out
	 * Relies on a real doctor profile
	 */
	@Test
	public void logoutTest() {

		doctorTester = new DoctorView("test");
		Assertions.assertDoesNotThrow(() -> doctorTester.logoutActionPerformed(null));
	}






}
