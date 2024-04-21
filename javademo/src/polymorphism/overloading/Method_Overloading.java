package polymorphism.overloading;

 /*The class contains more than one method with the same name but different
    number of argument or same number of arguments with different data type. These
    called overloaded method*/

/*Rules:-a. Same method name with different number of arguments.
        b. Same method name with same number of arguments with different data type.
        c. Same method name with same number of arguments with different sequence
        of data type of arguments.   */
public class Method_Overloading {

    public void addition(int a, int b) {
        System.out.println("This method contains integer datatype with variable a and b");
        System.out.println("Addition of a and b " + (a + b));
    }


    public void addition(int a, int b, int c) {
        System.out.println("This method contains integer datatype with variable a,b and c");
        System.out.println("Addition of a and b and c " + (a + b + c));
    }

    public void addition(int a) {
        System.out.println("This method contains integer datatype with variable a");
        System.out.println(a);
    }

    public void addition(String fname, String lname) {
        System.out.println("This method contains string datatype with variable fname and lname");
        System.out.println(fname + lname);

    }

    public void addition(String fname, int a) {
        System.out.println("This method contains string datatype with variable fname and data type int with variable a");
        System.out.println(fname);
        System.out.println(a);
    }

    public void addition(int a, String fname) {
        System.out.println("This method contains string datatype with variable fname and data type int with variable a");
        System.out.println(fname);
        System.out.println(a);
    }

    public static void main(String[] args) {
        Method_Overloading m = new Method_Overloading();
        m.addition("vaidehi", 30);
        m.addition("Gaurang", 30);
        m.addition("Bhavesh", 30);
        m.addition(10, 20, 30);
        m.addition(25);
        m.addition(200, 200);
        m.addition("Codebuster", "Java");


    }
}