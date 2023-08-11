package Testing;

import static org.junit.Assert.*;

public class DashboardAddControllerTest {

    public static void main(String[] args) {
        // Set up test data
        String medicinename = "Citamol";
        int rate = 5;
        int quantity = 20;
        int total = 100;

        // Invoke the medicine() method
        String result = medicine(medicinename, rate, quantity, total);

        // Verify the result
        assertEquals("Citamol, 5, 20, 100", result);   
    }

    public static String medicine(String medicinename, int rate, int quantity, int total){
        return medicinename + ", " + rate + ", " + quantity + ", " + total;
    }
}
