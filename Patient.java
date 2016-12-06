/*
 * Practical Exercise 2 developed by Diego Rivera for Programming Fundamentals class.
 * 16/08/2016
 * Professor ----------
 * This class has the following properties: Medicare number, last name, age and an address.
 * The address field is an object supplied by the Address class. Also this class has the conditinal to decide the
 * old of the patients.
 */
package practicalexercise2;

/**
 *
 * @author diegorivera
 */
public class Patient {

    private Address address;//declare address object
    private String lastName, medicare, type;
    private int age;

    public void Patient(Address address) {
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMedicare() {
        return medicare;
    }

    public void setMedicare(String medicare) {
        this.medicare = medicare;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
        validateAge();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    //conditional for consider children or adults according the age
    private void validateAge() {
        if (this.age >= 18) {
            this.type = "adult";
        } else if (this.age < 18) {
            this.type = "child";
        } else {
            this.type = "unknown";
        }
    }

    //for display in the main method with the address object incluided
    public String display() {
        return "Medicare No:" + medicare + ", Name:" + lastName + ", Age:" + age + ", " + address.display();
    }
}
