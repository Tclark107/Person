//-----------------------------------------------------------------------------
// Person.java
// Includes constructors that perform initialization
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
 
    Person(String name, String phoneNumber){
       this.name = name;
       this.phoneNumber = phoneNumber;
    }
 
    Person(String name, String phoneNumber, int age, double weight){
       this.name = name;
       this.phoneNumber = phoneNumber;
       this.age = age;
       this.weight = weight;
    }
 
    // Instance methods
    void printPerson(){
       System.out.println("\nName: " + name);
       System.out.println("Phone Number: " + phoneNumber);
       System.out.println("Age: " + age);
       System.out.println("Weight: " + weight + "\n");
    }
 
    boolean isOlderThan(Person that){
       return (this.age>that.age);
    }
 }
 