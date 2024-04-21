package inheritance.single;

public class Son extends Father{   //Here Son class is child class, sub class or derived class
    //Father class is Parent class, Base class and Super class


    public void m2(){
        System.out.println("Child class contains m2 method");
    }

    public static void subtraction(){
        int a =50, b= 100;
        System.out.println("Subtraction of " +a+ " and " +b+ " = " +(b-a));
    }

    public static void main(String[] args) {
       addition();  //access directly and came from Parent class
       subtraction();  //access directly and came from Child class
       Son son = new Son();  // Create an object of child class
       son.m1();   //called method from parent class
       son.myName();  //called method from parent class
       son.m2();  //called method from child class


    }
}
