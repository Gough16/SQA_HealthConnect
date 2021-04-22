package health;

import controllers.DoctorView;
import controllers.RequestConversation;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RequestConversationTest {

	private RequestConversation requestTester;

	/**
	 * Test Case Id: UnitTest-RequestConversation-001
	 * Runs the main method of RequestConversation and checks if any exception was thrown.
	 * If an exception were thrown it would catch it.
	 */
	@Test
	public void runMain() {

		requestTester = new RequestConversation(107,"test","Patient");
		Assertions.assertDoesNotThrow(() -> requestTester.main(null));
	}

	/**
	 * Test Case Id: UnitTest-RequestConversation-002
	 * Test for verifying a request has been added
	 */
	@Test
	public void addButtonTest() {

		requestTester = new RequestConversation(107,"test","Patient");
		Assertions.assertDoesNotThrow(() -> requestTester.addButtonActionPerformed(null));
	}

	/**
	 * Test Case Id: UnitTest-RequestConversation-003
	 * Test for verifying the close button was clicked without exception
	 */
	@Test
	public void closeButtonTest() {

		requestTester = new RequestConversation(107,"test","Patient");
		Assertions.assertDoesNotThrow(() -> requestTester.closeButtonActionPerformed(null));
	}

	/**
	 * Test Case Id: UnitTest-RequestConversation-004
	 * Test for determining if the user clicked the back button
	 */
	@Test
	public void backButtonTest() {

		requestTester = new RequestConversation(107,"test","Patient");
		Assertions.assertDoesNotThrow(() -> requestTester.backButtonActionPerformed(null));
	}



}
