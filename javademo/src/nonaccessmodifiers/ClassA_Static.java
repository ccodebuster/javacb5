package nonaccessmodifiers;

public class ClassA_Static {

    static String name = "Testing";
    static void myStaticMethod(){  //Declared static method

        System.out.println("Java is an Object-Oriented Programming Language");
    }

    public static void main(String[] args) {  //Main method
        myStaticMethod();
        System.out.println(name);
    }
}
