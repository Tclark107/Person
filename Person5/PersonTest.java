//-----------------------------------------------------------------------------
// PersonTest.java
// Uses the Person class
//-----------------------------------------------------------------------------

class PersonTest{

    public static void main(String[] args){
       Person a = new Person("Dick", "123-456-7890", 6, 50.0);
       Person b = new Person("Jane", "123-456-7890", 5, 40.0);
 
       // print out vital statistics
       System.out.println(a.toString());   // notice that these two lines
       System.out.println(a);              // each produce the same output
       System.out.println(b);
       System.out.println();
       
       // illustrates default behavior of Object's equals() method
       System.out.println(a.equals(b));
       System.out.println(a.equals(a));
       Person c = new Person("Dick", "123-456-7890", 6, 50.0);
       System.out.println(a.equals(c));
       Person d = a;
       System.out.println(a.equals(d));
       System.out.println();
 
       // illustrates == on reference types
       System.out.println(a==b);
       System.out.println(a==a);
       System.out.println(a==c);
       System.out.println(a==d);
       System.out.println();
 
       // compare ages
       if(a.isOlderThan(b))
          System.out.println(a.name + " is older than " + b.name);
       else if(b.isOlderThan(a))
          System.out.println(b.name + " is older than " + a.name);
       else
          System.out.println(a.name + " and " + b.name + " are the same age"); 
 
       // illustrates String's equals() method
       System.out.println();
       String s1 = new String("foo");
       String s2 = new String("foo");
       System.out.println(s1==s2);
       System.out.println(s1.equals(s2));
 
    }
 }
 