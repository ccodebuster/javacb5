package variables;

public class InstanceVariables {

        String name = "codebuster"; // instance global variable

    public static void main(String[] args) {
        InstanceVariables d = new InstanceVariables();
        System.out.println(d.name); // access instance variable via object
    }

}
