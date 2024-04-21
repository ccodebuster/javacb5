package methods;


public class NoReturnWithParameter {

    public static void main(String[] args) {
//      NoReturnWithParameter n = new NoReturnWithParameter();
//        n.displayName("code");
//        n.displayName("bhavesh");
//        n.displayName("shub");
//        n.displayName("Komal");
//        n.displayAge(24);
//        n.displayAge(23);

        int result = calculator(5, 6); // 11

        System.out.println(calculator(10, 20));
        System.out.println(calculator(5, 20));

        System.out.println(result); //one way
        System.out.println(calculator(100, 6)); //second way
    }
    private static int calculator(int m, int n) {  //way to declared static and type of method is With return type with parameter
      return m+n;
    }

    public void displayName(String name){   //Way to Declared:-Instance and Type of method :- No Return type with Parameter
        System.out.println(name);
    }

    public void displayAge(int age){  //Way to Declared:-Instance and Type of method :- No Return type with Parameter
        System.out.println(age);
    }

}
