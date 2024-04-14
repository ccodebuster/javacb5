package conditionalstatements;

/*  if(condition){
           if body; (true body)
           }else {
            else body; (false body)
             }        */
public class IfElse {

    public static void main(String[] args) {

        int m =100, n=200;

        if(m<n) {   //If condition
            System.out.println("Is less than   Or True body");   //True body (if body)
        }else {
            System.out.println("Is not less than or False body");   //False body (else body)
        }
        System.out.println("Hello Java");
    }
}
