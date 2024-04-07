package methods;

public class NoReturnWithParameter {

    public static void main(String[] args) {
      NoReturnWithParameter n = new NoReturnWithParameter();
        n.displayName("code");
        n.displayName("bhavesh");
        n.displayName("shub");
        n.displayName("Komal");
        n.displayAge(24);
        n.displayAge(23);

    }

    public void displayName(String name){
        System.out.println(name);
    }

    public void displayAge(int age){
        System.out.println(age);
    }

}
