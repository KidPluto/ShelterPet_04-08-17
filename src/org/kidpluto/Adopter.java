package org.kidpluto;

/**
 * Created by Chris on 4/8/2017.
 */
public class Adopter extends Person {

    private Integer id;

    public Adopter () {

    }

    public Adopter(String firstName, String lastName, ContactInfo contactInfo, Address address) {
        super(firstName, lastName, contactInfo, address);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
