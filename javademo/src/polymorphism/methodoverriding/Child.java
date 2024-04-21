package polymorphism.methodoverriding;

public class Child extends Parent{


    public void marry(){  //overidding Method
        System.out.println("Birtish Girl");
    }

    public void women(){
        System.out.println("Mother");
    }

    public void addition(){
        System.out.println("Addition");
    }

    public static void main(String[] args) {
        Child c = new Child();
        c.printName("Testing");
        c.marry();
        c.person();
        c.women();
        c.addition();
    }


}
