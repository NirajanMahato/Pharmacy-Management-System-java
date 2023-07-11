package Testing;

import static org.junit.Assert.*;

public class RegisterTest {

    public static void main(String[] args) {
        // Set up test data
        String firstName = "Nirajan";
        String lastName = "Mahato";
        String email = "nirajanmahato44@gmail.com";
        int phoneNumber = 982587867;
        String password = "001234";
        String schoolName = "Monastic";
        
        // Invoke the register() method
        String result = register(firstName, lastName, email,phoneNumber, password, schoolName);

        // Verify the result
        assertEquals("Nirajan Mahato, nirajanmahato44@gmail.com, 982587867, 001234, Monastic", result);   
    }

    public static String register(String firstName,String lastName,String email,int phoneNumber,
            String password, String schoolName){
        return firstName + " " + lastName + ", " + email + ", " + phoneNumber + ", " + password + ", " + schoolName;
    }
}
