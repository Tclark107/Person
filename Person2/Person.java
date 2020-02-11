//-----------------------------------------------------------------------------
// Person.java
// Includes a static method to print out a Person object
//-----------------------------------------------------------------------------

class Person{

    String name;
    String phoneNumber;
    int age;
    double weight;
 
    static void printPerson(Person x){
       System.out.println("Name: " + x.name);
       System.out.println("Phone Number: " + x.phoneNumber);
       System.out.println("Age: " + x.age);
       System.out.println("Weight: " + x.weight);
    }
 }
 