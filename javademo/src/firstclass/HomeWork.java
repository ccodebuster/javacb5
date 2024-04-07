package firstclass;

public class HomeWork {

    /*7. Write a Java program to print the sum of two numbers.
         Test Data: 74 + 36
         Expected Output: 110
         */

    public static void main(String[] args) {
     HomeWork h = new HomeWork();
     h.sum();

    }

    public void sum(){
        int x = 74;
        int y = 36;
        int sum = x+y;
        System.out.println("Expected Output: "+sum);
    }
}
