package encapsulation;

public class Child {

    public static void main(String[] args) {
        Child c = new Child();
        c.employeeDetails();
    }


    public void employeeDetails() {
        Test t = new Test();
        t.setEmployee("code");
        t.setAge(20);
        t.setSalary(2000);
        System.out.println(t.getEmployee());
        System.out.println(t.getAge());
        System.out.println(t.getSalary());
    }
}

