package inheritance.multilevel;

public class GrandSon extends Son {

    public void m3(){  //Instance method
        System.out.println("Child Of class Father contain m3 method");
    }

    public static  void addition(){
        int a =100, b= 250;
        System.out.println("Addition of " + a + " and " +b + " = " +(a+b));
    }

    public static void main(String[] args) {
        GrandSon classC = new GrandSon();
        classC.m1();
        multiplication();
        classC.m2();
        subtraction();
        classC.m3();
        addition();
    }
}
