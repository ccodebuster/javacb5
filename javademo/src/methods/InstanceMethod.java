package methods;

public class InstanceMethod {

    public static void main(String[] args) {
      InstanceMethod a = new InstanceMethod();
      a.name(); // access userDefined instance method to main method
    }

    // Instance Methods
    public void name(){
        System.out.println("bhavesh");
    }
}
