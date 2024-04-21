package loops;


/*  for(initialization; condition; increment/decrement){
               code to be executed
               }
   */


public class For_Loop {


/*
   i=0 ---> 0<==5 true ---> It prints statement  -----> i++    so 0+1 =   1
   i = 1 ----> 1<==5 true ----> It prints statement -----> i++ s0 1+1 = 2
   i = 2 ----> 2<==5 true ----> It prints statement -----> i++ s0 2+1 = 3
   i = 3 ----> 3<==5 true ----> It prints statement -----> i++ s0 3+1 = 4
   i = 4 ----> 4<==5 true ----> It prints statement -----> i++ s0 4+1 = 5
 */
    public static void main(String[] args) {


        for (int i = 1; i <= 10; i++) {

            System.out.println(i);

            if (i == 8) {
               break;
            }

        }

           // System.out.println("8 * " +i+ " = " +(8*i));

        System.out.println("Java");
    }
}