package methodoverlad;

public class Test {

    public static void main(String[] args) {
      new Test().displayDetails("bhavesh");
        new Test().displayDetails("code");
    }

   public  void displayDetails(String name){
       System.out.println(name);
   }

    public  void displayDetails(int age){
        System.out.println(age);
    }

    public  void displayDetails(int age, String name){
        System.out.println(age);
        System.out.println(name);

    }

    public  void displayDetails( String name, int age){
        System.out.println(age);
        System.out.println(name);

    }

    public void name(){
        System.out.println("bhavesh,code");
    }
}
