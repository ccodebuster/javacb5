package protectedaccessmodifier;

public class ClassBProtected {

    public static void main(String[] args) {
        ClassAProtected a = new ClassAProtected();
        System.out.println(a.name);
        System.out.println(a.a);
    }
}
