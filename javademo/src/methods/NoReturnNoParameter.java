package methods;

public class NoReturnNoParameter {
    public static void main(String[] args) {
        NoReturnNoParameter n = new NoReturnNoParameter();
        n.sum();

    }

    public void sum(){
        int x = 74;
        int y = 36;
        int sum = x+y;
        System.out.println("Expected Output: "+sum);
    }
}
