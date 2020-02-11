//-----------------------------------------------------------------------------
// PersonTest.java
// Uses the Person class
//-----------------------------------------------------------------------------

class PersonTest{

    public static void main(String[] args){
       Person a = new Person("Dick", "123-456-7890", 6, 50.0);
       Person b = new Person("Jane", "123-456-7890");
 
       // print out vital statistics
       a.printPerson();
       b.printPerson();
 
       // initialize the rest of b
       b.age = 5;
       b.weight = 40.0;
 
       // print out b again
       b.printPerson();
 
       // compare ages
       if(a.isOlderThan(b))
          System.out.println(a.name + " is older than " + b.name);
       else if(b.isOlderThan(a))
          System.out.println(b.name + " is older than " + a.name);
       else
          System.out.println(a.name + " and " + b.name + " are the same age");
 
       // illustrates the default behavior of Object's toString() method
       System.out.println( a.toString() );
       System.out.println( a );
 
    }
 }
 