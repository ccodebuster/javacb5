package constructor;


public class TestConstructor {


    //Declared Global Variables
    String firstName;
    int realAge;
    String council;
    String city;

    public static void main(String[] args) {
        TestConstructor testConstructor= new TestConstructor("hillingdon","london", "ayan");
        testConstructor.displayAyanName();

    }

    TestConstructor(String council, String  city, String name){  //Declared Argunments Constructor
        this.council = council;   //reperesent current class object using this keyword
        this.city = city;       //reperesent current class object using this keyword
        this.firstName = name;  //reperesent current class object using this keyword
    }


    public void displayAyanName(){
        System.out.println(firstName);
        System.out.println(city);
    }


}
