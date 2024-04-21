package stringmethods;

public class StringMethods {
    public static void main (String args []){
        String fName = "Vaidehi ";
        String lName = "Patel";
        System.out.println("Concate two String : " +fName.concat(lName));

        String name = "Java is Secure Language";
        String name1 = "Java is simple Language";
        String text = "Java is Robust Language";
        String name2 = "";

        System.out.println("Length of the String is = " +name.length());

        System.out.println("concate two Strings = " +name.concat(text));

        System.out.println("Convert string to Uppercase :" +name1.toUpperCase());

        System.out.println("To check String is empty or not : " +name2.isEmpty());

        System.out.println(lName.replace('P','c'));


}}
