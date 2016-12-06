/*
 * Practical Exercise 2 developed by Diego Rivera for Programming Fundamentals class.
 * 16/08/2016
 * Professor Rachel Jeikishore
 * This program generates an appointment list for a medical clinic by listing patient details according to
 * the age of the patient. Adults are 18 years of age or older and children are under 18. Currently the clinic
 * will generate a list for 3 patients in total.
 */
package practicalexercise2;

/**
 *
 * @author diegorivera
 */
import javax.swing.JOptionPane;

public class Appointments {

    //declare as constant the next three objects patients
    private static final int MAX = 3;
    private static final Patient[] patients = new Patient[MAX];

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //declare the object patient and call the method for input details three times
        Patient patient = new Patient();

        int count = 0;
        while (count < MAX) {
            patients[count] = inputPatientDetails();
            count++;
        }

        displayAllAppointments(patients);//calling displayAllAppointments method to display the answer
    }
    //method for input details for the patients, call inputAddress() method and return Patient object
    public static Patient inputPatientDetails() {

        Patient patient = new Patient();
       
        patient.setMedicare(JOptionPane.showInputDialog(null, "Enter medicare number"));
        patient.setLastName(JOptionPane.showInputDialog(null, "Enter patients last name"));
        patient.setAge(Integer.parseInt(JOptionPane.showInputDialog(null, "Enter patients age")));
        patient.setAddress(inputAddress());//calling the method inputAddress()
        return patient;
    }
    //method for input and return Address object
    public static Address inputAddress() {

        Address address = new Address();

        address.setSuburb(JOptionPane.showInputDialog(null, "Enter suburb"));
        address.setPostCode(JOptionPane.showInputDialog(null, "Enter post code"));

        return address;
    }
    //method display all the appointments ass required
    private static void displayAllAppointments(Patient[] patients) {

        String adults = ""; //to print adults result
        String children = "";//to print children result

        //conditional for display adults and/or children as appropriate
        for (int i = 0; i < patients.length; i++) {
            if (patients[i].getType().equalsIgnoreCase("adult")) {
                adults = adults + patients[i].display() + "\n";
            } else if (patients[i].getType().equalsIgnoreCase("child")) {
                children = children + patients[i].display() + "\n";
            } 
        }
        
        String message = "APPOINTMENTS\n\nAdults\n" + adults + "\n\nChildren\n" + children;
        
        JOptionPane.showMessageDialog(null, message);
    }

}
