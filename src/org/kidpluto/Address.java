package org.kidpluto;

/**
 * Created by Chris on 4/8/2017.
 */
public class Address {

    private String StreetAddr1;
    private String StreetAddr2;
    private String TownOrCity;
    private String State;
    private String ZipCode;

    public Address() {
    }

    public Address(String streetAddr1, String streetAddr2, String townOrCity, String state, String zipCode) {
        StreetAddr1 = streetAddr1;
        StreetAddr2 = streetAddr2;
        TownOrCity = townOrCity;
        State = state;
        ZipCode = zipCode;
    }

    public String getStreetAddr1() {
        return StreetAddr1;
    }

    public void setStreetAddr1(String streetAddr1) {
        StreetAddr1 = streetAddr1;
    }

    public String getStreetAddr2() {
        return StreetAddr2;
    }

    public void setStreetAddr2(String streetAddr2) {
        StreetAddr2 = streetAddr2;
    }

    public String getTownOrCity() {
        return TownOrCity;
    }

    public void setTownOrCity(String townOrCity) {
        TownOrCity = townOrCity;
    }

    public String getState() {
        return State;
    }

    public void setState(String state) {
        State = state;
    }

    public String getZipCode() {
        return ZipCode;
    }

    public void setZipCode(String zipCode) {
        ZipCode = zipCode;
    }
}
