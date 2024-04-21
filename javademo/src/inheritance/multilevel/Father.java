package inheritance.multilevel;

import java.util.Scanner;

public class Father {

    public void m1(){
        System.out.println("Parent Class contains m1 method");
    }

    public static void multiplication(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter value of A: " );
        int a = scanner.nextInt();
        System.out.println("Enter value of B: " );
        int b = scanner.nextInt();

        int c =a*b;
        System.out.println("Multiplication of a and b is : " +c);


        //Print statements
        System.out.println("Java is an object oriented Programmingb Language");
    }

    public static void main(String[] args) {
        Father classA = new Father();
        classA.m1();
        multiplication();
    }
}
