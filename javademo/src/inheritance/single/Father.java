package inheritance.single;

public class Father {

    public void m1(){
        System.out.println("Parent Class contains m1 method");
    }


    public  void myName(){
        System.out.println("Codebuster");
    }

    public static  void addition(){
        int a =100, b= 250;
        System.out.println("Addition of " + a + " and " +b + " = " +(a+b));
    }

    public static void  main(String args[]){
        Father father = new Father();
        father.m1();
        father.myName();
        addition();
    }
}
