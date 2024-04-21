package inheritance.hierarchical;

public class SonA extends Father{

    public void m2(){
        System.out.println("Parent Class contains m2 method");
    }

    public static void subtraction(){
        int a =50, b= 100;
        System.out.println("Subtraction of " +a+ " and " +b+ " = " +(b-a));
    }

    public static void main(String[] args) {
        SonA sonA = new SonA();
        sonA.m2();
        subtraction();
        sonA.m1();
        addition();
    }
}
