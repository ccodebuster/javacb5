package methods;

public class ReturnTypeWithoutParameter {

    public static void main(String[] args) {

        String name1=displayName();
        System.out.println(displayName()); // one way
        System.out.println(name1); // second wa

    }

    private static String displayName() {  //way to declared static and methiod type is return type with no parameters
        String name = "codebuster";
        return name;
    }



}
