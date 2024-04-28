package constructor2;

public class Test1 {

    String name;
    int rollNumber;
    int age;
    public Test1(int age) {
        this.age = age;
    }


    public Test1(int rollNumber, int age) {
        this.rollNumber = rollNumber;
        this.age = age;
    }

    public Test1(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }

    public Test1(String name) {
        this.name = name;
    }

    public int getAge(){
        return age;
    }

}
