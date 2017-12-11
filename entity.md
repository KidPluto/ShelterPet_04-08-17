The entities exposed by this API are (constructors,accessors and mutators excluded for brevity):

````code
@Entity
public class Person {
  @Id
  private int id;
  private String name;
  private String email;
}
````
````code
@Entity
public class Pet {
  @Id
  private int id;
  private Date start;
  private Date finish;
  private String description;
  @OneToMany
  private Set<Person> attendees;
}
````
````code
@Entity
public class Shelter {
  @Id
  private int PetFinderDotComId;
  
  private int month;
  private int year;
  @OneToMany
  private Set<Meeting> meetings;
  @OneToMany
  private Set<Person> sharedWith;
}
````