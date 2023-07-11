package Testing;

import static org.junit.Assert.*;

public class ForgetPasswordTest {
    public static void main(String[] args) {
        // Set up the test data
        String email = "sulavkatuwal01@gmail.com";
        String password = "001234";
        String schoolName = "Monastic";
        
        // Invoke the forgetPassword() method
        String result = forgetPassword(email, password, schoolName);

        // Verify the result
        assertEquals("sulavkatuwal01@gmail.com, 001234, Monastic", result);   
    }

    public static String forgetPassword(String email, String password, String schoolName){
        return email +  ", " + password + ", " + schoolName;
    }
}
