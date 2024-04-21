package inheritance.hierarchical;

public class SonB extends Father {

    public static void m3(){  //Instance method
        System.out.println("Child Of class Father contain m3 method");
    }

    public static void main(String[] args) {
        m3();
        SonB sonB = new SonB();
        sonB.m1();
        addition();
    }
}
