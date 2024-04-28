package expectionhandling;

public class Test {

    public static void main(String[] args) {
        String [] name = {"code1", "code2", "code3", "code4"};

        try{
            System.out.println(name[4]); //risky code
        }catch(Exception a){
            System.out.println(a);
            System.out.println("array is out bound"); //safe code
        }
        System.out.println("code");
    }
}
