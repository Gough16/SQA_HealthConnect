package health;

import controllers.DoctorView;
import controllers.NewRequests;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Class for testing the methods in NewRequests
 * Created By: Alan Norman
 */
public class NewRequestsTest {

	private NewRequests requestTester;

	/**
	 * Test Case Id: UnitTest-NewRequests-001
	 * Runs the main method of NewRequests and checks if any exception was thrown.
	 * If an exception were thrown it would catch it.
	 */
	@Test
	public void runMain() {

		requestTester = new NewRequests("test");
		Assertions.assertDoesNotThrow(() -> requestTester.main(null));
	}

	/**
	 * Test Case Id: UnitTest-NewRequests-002
	 * Validates that valid request can be created.
	 */
	@Test
	public void createRequestTest() {
		requestTester = new NewRequests("test");
		Assertions.assertDoesNotThrow(() -> requestTester.createButtonActionPerformed(null));
	}

	/**
	 * Test Case Id: UnitTest-NewRequests-003
	 * Validates a request was cancelled successfully
	 */
	@Test
	public void cancelRequestTest() {
		requestTester = new NewRequests("test");
		Assertions.assertDoesNotThrow(() -> requestTester.CancelButtonActionPerformed(null));
	}


}
