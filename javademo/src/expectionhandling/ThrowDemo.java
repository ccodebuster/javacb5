package expectionhandling;

public class ThrowDemo {

    public static void main(String[] args) throws Exception {
        ValidAgeForDrinks(15);
    }

    public static void ValidAgeForDrinks(int age) throws Exception {
       if(age<=18){

           throw new Exception("Not allowed");

       } else{

           System.out.println(" allowed");
       }

    }
}
