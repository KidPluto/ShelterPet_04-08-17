package org.kidpluto;

import java.util.ArrayList;
import java.util.Set;

/**
 * Created by Chris on 4/8/2017.
 */
public class Shelter {

    private PetFinderDotComId id;
    private String name;
    private ArrayList<Pet> pets;

    public Shelter() {
        id = new PetFinderDotComId();
        name = "HiTop Pet Shelter";
        pets = new ArrayList<>();
    }

}
