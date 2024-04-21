package methods2;

public class Test {

    public static void main(String[] args) {

        displayName(); // without parameter
        displayNameWithParameter("code2"); // with parameter

        System.out.println(displayAge());// one way
        int age=displayAge();
        System.out.println(age); // second way of calling

        System.out.println(displayAge2(20)); // one way of calling
        int age2=displayAge2(20);
        System.out.println(age2); // second way of calling
    }

    private static void displayNameWithParameter(String code2) {
        System.out.println(code2);
    }

    public static void displayName() {
        System.out.println("code");
    }

    public static int displayAge(){
        int age = 20;
        return age;
    }


    public static int displayAge2(int age){
        return age;
    }
}
