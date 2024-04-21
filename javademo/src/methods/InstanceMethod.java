package methods;

public class InstanceMethod {

    public static void main(String[] args) {
      InstanceMethod a = new InstanceMethod();
      /*
     * Instance method is a class name
     * a reference variable name
     * new is keyword
     * InstanceMethod() is a constructor
       */

      a.name(); // access userDefined instance method to main method
    }

    // Instance Methods
    public void name(){
        System.out.println("bhavesh");
    }

    public static void name1(){
        System.out.println("bhavesh");
    }
}
