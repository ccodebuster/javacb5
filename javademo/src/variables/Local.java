package variables;

public class Local {
    /*Every class contains
     * variables
     * methods
     * constructor
     * instance block
     * static blocks*/

    String name = "codebuster"; // global variable----> are of 2 types 1). instance variables and 2) static variables
    String name1 = "code1"; // instance variables
    static String name2 = "code2"; // static variables

    public static void main(String[] args) {
        String name = "bhavesh"; // local variable only access into same method
        System.out.println(name);
        Local a = new Local();
        a.m1();
        m2();
    }

    //instance method
    public void m1() { //
        String course = "java"; // local variable
        System.out.println(course); //accessing local variables
        System.out.println(name1); // accessing instance global variables
        System.out.println(name2); // access static variable into instance methods
    }

    //static method
    public static void m2() {
        System.out.println(name2); //accessing static global variables

        Local l = new Local();
        System.out.println(l.name1); //access instance variables into static methods
    }
}
