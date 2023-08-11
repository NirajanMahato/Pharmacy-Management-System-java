package Testing;

import static org.junit.Assert.*;

public class DashboardSaveControllerTest {

    public static void main(String[] args) {
        String name = "Nirajan Mahato";
        String address = "KTM";
        int patientID = 123;

        // Invoke the Details() method
        String result = Details(name, address, patientID);

        // Verify the result
        assertEquals("Nirajan Mahato, KTM", result);    
    }

    public static String Details(String name, String address , int ID){
        return name + ", " + address;
    }
}
