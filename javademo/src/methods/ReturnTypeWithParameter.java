package methods;

public class ReturnTypeWithParameter {

    public static void main(String[] args) {
        ReturnTypeWithParameter r = new ReturnTypeWithParameter();
        int number  = r.calculator(3,8);
        System.out.println(r.calculator(3,8)); // one way
        System.out.println(number); // second way
        System.out.println(r.printName("Vaidehi","Patel"));

    }

    private  int calculator(int x, int y) {
        return x+y;
    }

    public String printName(String fname, String lname){
        return fname + lname ;
    }
}
