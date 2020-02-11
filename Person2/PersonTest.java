//-----------------------------------------------------------------------------
// PersonTest.java
// Uses the Person class
//-----------------------------------------------------------------------------

class PersonTest{

    public static void main(String[] args){
       Person a = new Person();
       Person b = new Person();
 
       // initialize a
       a.name = "Dick";
       a.phoneNumber = "123-456-7890";
       a.age = 6;
       a.weight = 50.0;
 
       // initialize b
       b.name = "Jane";
       b.phoneNumber = "123-456-7890";
       b.age = 5;
       b.weight = 40.0;
 
       // print out stats
       System.out.println();
       Person.printPerson(a);     // notice how printPerson() is called
       System.out.println();
       Person.printPerson(b);     // notice how printPerson() is called
       System.out.println();
    }
 }
 