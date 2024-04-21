package constructor;

public class Demo {

    public static void main(String[] args) {
      Demo d = new Demo();
      d.displayAge();
      d.displayName();

    }

    public void displayAge() {
       Test t = new Test();
        System.out.println(t.age);
    }

    public void displayName() {
        Test t = new Test();
        System.out.println(t.name);
    }
}
