/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Testing;

import static org.junit.Assert.*;

public class LoginTest {

    public static void main(String[] args) {
        // Set up test data
        String email = "nirajanmahato44@gmail.com";
        String password = "password0123";

        // Invoke the login() method
        String result = login(email, password);

        // Verify the result
        assertEquals("nirajanmahato44@gmail.com, password123", result);   
    }

    public static String login(String email, String password){
        return email + ", " + password;
    }
}
