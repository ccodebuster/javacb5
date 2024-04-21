package interfacedemo;

public class Child implements Father{

    public static void main(String[] args) {

        Child c = new Child();
        c.name();
        c.age();
    }

    @Override
    public void name() {
        System.out.println("name");
    }

    @Override
    public void age() {
        System.out.println("age");
    }
}
