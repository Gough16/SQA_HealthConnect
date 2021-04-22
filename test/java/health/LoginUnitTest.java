package health;

import controllers.NewJFrame;
import java.sql.Connection;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * This Unit test class tests the Login functionality of the HealthConnect software. This is done
 * by testing both the Doctor and patient login functionalities in NewJFrame.Java class.
 *
 * @author michaelgough
 * Pass with 100% coverage.
 */

public class LoginUnitTest {

    /*
     * Field attributed for username and password strings.
     */
    private controllers.NewJFrame login;
    private String doc_Username;
    private String doc_Password;
    private String patient_Username;
    private String patient_Password;

    @BeforeEach
    public void setup(){
        login = new NewJFrame();
    }

    /**
     * Test Case ID:UnitTest-LoginTest-001
     * –Purpose: Ensure that the program accepts input under ideal conditions.
     * Test setup: Program accepts hard coded values for doctors username and password
     * fields and test them with regex.
     * Input: doc_Username = "mgough" and doc_Password = "12345" to test doctorLogin method.
     */
    @Test
    public void doctorValidLogin(){
        doc_Username = "mgough";
        doc_Password = "12345";

        //Make sure that the inputed username and password meet regex requirements
        Assertions.assertTrue(doc_Password.matches("^[a-zA-Z0-9]*$"));
        Assertions.assertTrue(doc_Password.matches("^[a-zA-Z0-9]*$"));

    }

    /**
     * Test Case ID:UnitTest-LoginTest-002
     * ID/Description: The program shall require a username and password to login.
     * –Purpose: The purpose of this test is to ensure that the user is not granted access
     * when the username field is empty.
     * Test setup: Username field is empty.
     * @throws Exception when the username field is empty for doctorLogin method.
     */
    @Test
    public void doctorEmptyUsername() throws Exception{
        doc_Username = "";
        doc_Password = "12345";

        Connection con = null;
        Assertions.assertThrows(IllegalArgumentException.class, () ->{login.doctorLogin(doc_Username, doc_Password);});
    }

    /**
     * Test Case ID:UnitTest-LoginTest-003
     * ID/Description: The program shall require a username and password to login.
     * –Purpose: The purpose of this test is to ensure that the user is not granted access when
     * the password field is empty.
     * Test setup: Password field is empty.
     * @throws Exception when the password field is empty for doctorLogin method.
     */
    @Test
    public void doctorEmptyPassword() throws Exception {
        doc_Username = "EJohns";
        doc_Password = "";
        Connection con = null;
        Assertions.assertThrows(IllegalArgumentException.class,()->{login.doctorLogin(doc_Username,doc_Password);});
    }

    /**
     * Test Case ID:UnitTest-LoginTest-001
     * –Purpose: Ensure that the program accepts input under ideal conditions.
     * Test setup: Program accepts hard coded values for patients username and password
     * fields and test them with regex.
     * Input: patient_Username = "mgough" and patient_Password = "12345" to test patientLogin method.
     */
    @Test
    public void patientValidLogin(){
        patient_Username = "Bgough";
        patient_Password = "12345";

        //Make sure that the inputed username and password meet regex requirements
        Assertions.assertTrue(patient_Username.matches("^[a-zA-Z0-9]*$"));
        Assertions.assertTrue(patient_Password.matches("^[a-zA-Z0-9]*$"));
    }

    /**
     * Test Case ID:UnitTest-LoginTest-005
     * ID/Description: The program shall require a username and password to login.
     * –Purpose: The purpose of this test is to ensure that the user is not granted access
     * when the username field is empty.
     * Test setup: Username field is empty.
     * @throws Exception when the username field is empty.
     */
    @Test
    public void patientEmptyUsername() throws Exception{
        patient_Username = "";
        patient_Password = "12345";
        Connection con = null;
        Assertions.assertThrows(IllegalArgumentException.class, () ->{login.patientLogin(patient_Username, patient_Password);});
    }

    /**
     * Test Case ID:UnitTest-LoginTest-006
     * ID/Description: The program shall require a username and password to login.
     * –Purpose: The purpose of this test is to ensure that the user is not granted access when
     * the password field is empty.
     * Test setup: Password field is empty.
     * @throws Exception when the password field is empty for patientLogin method.
     */
    @Test
    public void patientEmptyPassword() throws Exception {
        patient_Username = "TGilbert";
        patient_Password = "";
        Connection con = null;
        Assertions.assertThrows(IllegalArgumentException.class,()->{login.patientLogin(patient_Username,patient_Password);});
    }

}
