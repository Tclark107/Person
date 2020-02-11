//-----------------------------------------------------------------------------
// Person.java
// Includes a toString() method instead of printPerson()
//-----------------------------------------------------------------------------

class Person{

    // Fields
    String name;
    String phoneNumber;
    int age;
    double weight;
 
    // Constructors
    Person(String name){
       this.name = name;
    }
 
    Person(String name, String phoneNumber, int age, double weight){
       this.name = name;
       this.phoneNumber = phoneNumber;
       this.age = age;
       this.weight = weight;
    }
 
    // toString():  overrides Objects toString() method
    // try: (1) commenting out this definition, (2) leave out the keyword public,
    // or (3) leave out public and put in an int parameter n
    public String toString(){
       return (   "\nName: " + name 
                + "\nPhone Number: " + phoneNumber
                + "\nAge: " + age 
                + "\nWeight: " + weight  );
    }
 
    boolean isOlderThan(Person x){
       return (this.age>x.age);
    }
 }
 