package org.kidpluto;

/**
 * Created by Chris on 4/10/2017.
 */
public class MyController {

    private AdoptionStatus applicationStatus;

    public MyController() {
    }

    public void requestApplicationLink(Adopter adopter) {
        applicationStatus = AdoptionStatus.REQUEST;
    }
    public void requestApplicationLink(Adopter adopter, Pet pet) {
        applicationStatus = AdoptionStatus.REQUEST;
    }

}
