package org.kidpluto;

/**
 * Created by Chris on 4/8/2017.
 */
abstract class Person {

    private String          firstName;
    private String          lastName;
    private ContactInfo     contactInfo;
    private Address         address;

    public Person() {
    }

    public Person(String firstName, String lastName, ContactInfo contactInfo, Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.contactInfo = contactInfo;
        this.address = address;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public ContactInfo getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(ContactInfo contactInfo) {
        this.contactInfo = contactInfo;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
