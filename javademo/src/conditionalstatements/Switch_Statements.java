package conditionalstatements;

import java.util.Scanner;

/* switch(expression){
                   case lable1:
                        sout();
                        break;
                   case lable2:
                        sout();
                         break;
                   case lable n:
                       sout();
                        break;
                        default:
                        sout();
                        }
  */
public class Switch_Statements {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter characters between A to D :");
        String city = sc.nextLine();
        //char city = sc.next().charAt(0);
       // int city;


        switch (city){
            case "A":
                System.out.println("Ahmedabad");
               break;
            case "B'":
                System.out.println("Baroda");
                break;
            case "C":
                System.out.println("Surat");
                break;
            case "D":
                System.out.println("Delhi");
                break;
                default:
                    System.out.println("INVALID DATA");
        }
    }
}