The entities exposed by this API are (constructors,accessors and mutators excluded for brevity):

````code
@Entity
public class Person {
  @Id
  private int id;
  private String name;
  private String email;
  private Address address;
}
````
````code
@Entity
public class Pet {
  @Id
  private int PetFinderDotComId;
    
}
````
````code
@Entity
public class Shelter {
  @Id
  private int PetFinderDotComId;
  
  private Address address;
 
  @OneToMany
  private Set<Pet> pets;
}
````