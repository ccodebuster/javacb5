package methodoverlad;

public class Child extends Test {

    public static void main(String[] args) {
        Child c = new Child();
        c.displayDetails("code");


    }

    public void displayDetails(String name) {
        System.out.println(name);
        System.out.println("hi");
        this.name();

    }

    public void name(){
        System.out.println("codebuster");
    }

}
