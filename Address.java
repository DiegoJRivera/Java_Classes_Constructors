/*
 * Practical Exercise 2 developed by Diego Rivera for Programming Fundamentals class.
 * 16/08/2016
 * Professor Rachel Jeikishore
 * This class has fields for: suburb and post code only. This class should also
 * have 2 constructors. A default constructor with the default values of (Melbourne, 3000)
 * and a second constructor that gets values as parameters.
 */
package practicalexercise2;

/**
 *
 * @author diegorivera
 */

public class Address {

    //constructor 1
    private String suburb, postCode;

    public Address() {
        this.suburb = "Melbourne";
        this.postCode = "3000";
    }

    //constructor 2
    public Address(String suburb, String postCode) {
        this.suburb = suburb;
        this.postCode = postCode;
    }
    //get and set methods
    public String getSuburb() {
        return suburb;
    }

    public void setSuburb(String suburb) {
        this.suburb = suburb;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    //return for patient class
    public String display() {
        return "Address:" + suburb + ", " + postCode;
    }

}
