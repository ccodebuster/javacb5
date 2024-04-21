package abstraction;

public class Test extends Child {

    public static void main(String[] args) {
        Test t = new Test();
        t.age();
    }

    @Override
    void age() {
        System.out.println("age implemented");
    }
}
