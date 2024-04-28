package constructor2;

import variables.InstanceVariables;

public class Test2 {

    public static void main(String[] args) {
        Test1 t = new Test1("code", 67);
        System.out.println(t.name); // code
        System.out.println(t.rollNumber);  //67
        Test1 t1 = new Test1("codebuster"); // codebuster
        System.out.println(t.name);
        Test1 t3 = new Test1(23,10);
        System.out.println(t3.rollNumber);
        System.out.println(t3.age);
        InstanceVariables i = new InstanceVariables();
        Test1 t4 = new Test1(i.courseDuration());
        System.out.println(t4.getAge());

    }
}
