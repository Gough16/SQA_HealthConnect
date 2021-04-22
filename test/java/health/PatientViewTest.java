package health;

import controllers.DoctorView;
import controllers.PatientView;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PatientViewTest {

	private PatientView patientTester;

	/**
	 * Test Case Id: UnitTest-PatientTest-001
	 * Runs the main method of Patient and checks if any exception was thrown.
	 * If an exception were thrown it would catch it.
	 */
	@Test
	public void runMain() {

		patientTester = new PatientView("test");
		Assertions.assertDoesNotThrow(() -> patientTester.main(null));
	}

	/**
	 * Test Case id: UnitTest-PatientTest-002
	 * Used to test that new requests button doesn't throw an error
	 * Relies on a real patient profile
	 */
	@Test
	public void newRequestTest() {

		patientTester = new PatientView("test");
		Assertions.assertDoesNotThrow(() -> patientTester.newButtonActionPerformed(null));
	}

	/**
	 * Test Case id: UnitTest-PatientTest-003
	 * Used to test that in progress button doesn't throw an error
	 * Relies on a real patient profile
	 */
	@Test
	public void inProgressRequestsTest() {

		patientTester = new PatientView("test");
		Assertions.assertDoesNotThrow(() -> patientTester.InProgressButtonActionPerformed(null));
	}

	/**
	 * Test Case id: UnitTest-PatientTest-004
	 * Used to assert that the closed button was clicked
	 * Relies on a real patient profile
	 */
	@Test
	public void closedRequestsTest() {

		patientTester = new PatientView("test");
		Assertions.assertDoesNotThrow(() -> patientTester.closedButtonActionPerformed(null));
	}

	/**
	 * Test Case id: UnitTest-PatientTest-005
	 * Used to assert that the back button was clicked
	 * Relies on a real patient profile
	 */
	@Test
	public void backButtonTest() {

		patientTester = new PatientView("test");
		Assertions.assertDoesNotThrow(() -> patientTester.backButtonActionPerformed(null));
	}

}
