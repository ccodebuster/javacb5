package methods;


import java.util.Scanner;

public class NoReturnWithParameter {

    public static void main(String[] args) {
//      NoReturnWithParameter n = new NoReturnWithParameter();
//        n.displayName("code");
//        n.displayName("bhavesh");
//        n.displayName("shub");
//        n.displayName("Komal");
//        n.displayAge(24);
//        n.displayAge(23);

       int result=calculator(5,6); // 11

        System.out.println(result); //one way
        System.out.println(calculator(5,6)); //second way

        calculatorWithScanner();

    }

    private static void calculatorWithScanner() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number");
        int x= scanner.nextInt();
        System.out.println("Enter second number");
        int y=scanner.nextInt();
         int sum = x+y;
        System.out.println(sum);

    }

    private static int calculator(int x, int y) {
      return x+y;
    }

    public void displayName(String name){
        System.out.println(name);
    }

    public void displayAge(int age){
        System.out.println(age);
    }

}
