package abstraction;

public class Test extends Child {

    public static void main(String[] args) {
        Test t = new Test();
        t.age();
        t.m1();
    }

    @Override
    void age() {
        System.out.println("age implemented");
    }
}
