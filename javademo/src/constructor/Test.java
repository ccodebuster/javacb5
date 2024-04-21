package constructor;

public class Test {

    String name;
    int age;

    Test() {
        //0-args constructor
    }

    Test(String name) {
   //1-args constructor
        this.name=name;
    }

    Test(int age) {
   //1-args constructor
        this.age= age;
    }

    Test(int age, String name) {
    //2-args constructor
        this.name= name;
        this.age = age;
    }

    public String getName(){
        return name;
    }

}
