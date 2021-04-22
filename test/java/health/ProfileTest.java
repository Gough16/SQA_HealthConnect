package health;

import controllers.DoctorView;
import controllers.Profile;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProfileTest {

	private Profile profileTest;

	/**
	 * Test Case Id: UnitTest-Profile-001
	 * Runs the main method of Profile and checks if any exception was thrown.
	 * If an exception were thrown it would catch it.
	 */
	@Test
	public void runMain() {

		profileTest = new Profile("test");
		Assertions.assertDoesNotThrow(() -> profileTest.main(null));
	}

	/**
	 * Test Case Id: UnitTest-Profile-002
	 * Used to verify logging out doesn't throw an exception
	 */
	@Test
	public void logoutTest() {
		profileTest = new Profile("test");
		Assertions.assertDoesNotThrow(() -> profileTest.logoutActionPerformed(null));
	}

	/**
	 * Test Case Id: UnitTest-Profile-003
	 * Verify make a new request doesn't throw an exception
	 */
	@Test
	public void makeRequestTest() {
		profileTest = new Profile("test");
		Assertions.assertDoesNotThrow(() -> profileTest.makeRequestButtonActionPerformed(null));
	}

	/**
	 * Test Case Id: UnitTest-Profile-004
	 * Verify viewing requests doesn't throw an exception
	 */
	@Test
	public void viewRequestTest() {
		profileTest = new Profile("test");
		Assertions.assertDoesNotThrow(() -> profileTest.viewRequestButtonActionPerformed(null));
	}
}
