package constructor3;

public class Child {

    public static void main(String[] args) {
        Child c = new Child();
        c.display();
    }

    public void display(){
      Father f = new Father("selenium");
       f.details();
        Father f1 = new Father("api");
        f1.details();
    }
}
