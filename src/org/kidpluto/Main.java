package org.kidpluto;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        ContactInfo contactInfo1 = new ContactInfo("email@email.com", "617-765-9876");
        Address address1 = new Address("12 White Lane", "", "Milltown", "Connecticut", "12345-0987");
        Person adopter1 = new Adopter("Tony", "Hills", contactInfo1, address1);


    }
}
