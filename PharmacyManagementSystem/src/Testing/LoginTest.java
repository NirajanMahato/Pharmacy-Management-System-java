package Testing;

import static org.junit.Assert.*;

public class LoginTest {

    public static void main(String[] args) {
        // Set up test data
        String email = "nirajanmahato44@gmail.com";
        String password = "001234";

        // Invoke the login() method
        String result = login(email, password);

        // Verify the result
        assertEquals("nirajanmahato44@gmail.com, 001234", result);   
    }

    public static String login(String email, String password){
        return email + ", " + password;
    }
}
