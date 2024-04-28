package expectionhandling;

public class Test1 {

    public static void main(String[] args) {

        try{
            System.out.println("bhavesh");
            System.out.println(10/0);

        }catch(Exception e ){
            System.out.println("codebuster");
            System.out.println("patel");
            System.out.println(10/0);
        }
finally {
            System.out.println("api");
            System.out.println("selenium");
        }

    }
}
