package methods;

public class NoReturnNoParameter {
    public static void main(String[] args) {
        NoReturnNoParameter n = new NoReturnNoParameter();
        n.sum();

    }

    public void sum(){  //Way to Declared:-Instance and Type of method :- No Return type with No Parameter
        int x = 74;
        int y = 36;
        int sum = x+y;
        System.out.println("Expected Output: "+sum);
    }
}
