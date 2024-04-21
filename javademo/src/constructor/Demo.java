package constructor;

import variables.InstanceVariables;

public class Demo {

    public static void main(String[] args) {
      Demo d = new Demo();
     // d.displayAge();
      //d.displayName();
      //d.displayDetails();
      d.extra();

    }

    public void displayAge() {
       Test t = new Test(20);
        System.out.println(t.age);
    }

    public void displayName() {
        Test t = new Test("code");
        System.out.println(t.name);
    }

    public void displayDetails(){
        Test t = new Test(20, "code");
        System.out.println("my name is: "+ t.name );
        System.out.println("my age is: "+ t.age );
    }

    public void extra(){
        InstanceVariables i = new InstanceVariables();
        Test t = new Test(i.courseDuration(),i.courseName());
        System.out.println("my course is :"+ t.name);
        System.out.println("my course duration is  :"+ t.age);

        System.out.println(t.getName());

    }
}

