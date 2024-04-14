package privateaccessmodifier;

public class ClassAPrivate {

    private String accountNumber = "454546abc";

    private  int sortCode = 1234;

    public static void main(String[] args) {
        ClassAPrivate a = new ClassAPrivate();
        System.out.println(a.accountNumber);
        System.out.println(a.sortCode);

    }
}
