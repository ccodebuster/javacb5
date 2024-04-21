package inheritance.hierarchical;

public class SonC extends Father{

    public static void m4(){  //Instance method
        System.out.println("Child Of class Father contain m4 method");
    }

    public static void main(String[] args) {
        m4();
        SonC sonC = new SonC();
        sonC.m1();
        addition();
    }
}
