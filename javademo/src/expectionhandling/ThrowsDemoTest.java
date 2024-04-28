package expectionhandling;

public class ThrowsDemoTest {

    public void dhaval() {

        System.out.println(10 / 0);
    }

    public void dharsan() throws Exception {
        dhaval();

    }
    public void deval() throws Exception {
        try{
            dharsan();
        }catch (Exception e){
            System.out.println("ok");
        }

    }

    public static void main(String[] args) throws Exception {
        ThrowsDemoTest t = new ThrowsDemoTest();
        t.deval();
    }
}
