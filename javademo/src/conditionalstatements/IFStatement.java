package conditionalstatements;

/*Syntax :- if(condition){
                   if body;
                     }  */

public class IFStatement {
    public static void main(String[] args) {


        //Declared variables
        int m =100, n = 200;
        String name = "java", name1 ="java";

        if (name==name1){  //If statements
            System.out.println("Is equal to");     //If body
        }
        System.out.println("Java Language");

        if(m<n){      //If statements
            System.out.println("Less than");            //If body
            System.out.println("Java");                    //If body
        }
        System.out.println("Hello World");
    }
}
