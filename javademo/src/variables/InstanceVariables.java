package variables;

public class InstanceVariables {

        String name = "codebuster"; // instance global variable
        String course = "java";
        int duration= 6;
    public static void main(String[] args) {
        InstanceVariables d = new InstanceVariables();
        System.out.println(d.name); // access instance variable via object
    }

    public String courseName(){
        return course;
    }

    public int courseDuration(){
     return duration;
    }

}
