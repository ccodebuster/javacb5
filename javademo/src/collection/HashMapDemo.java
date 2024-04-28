package collection;

import java.util.HashMap;

public class HashMapDemo {

    public static void main(String[] args) {
        HashMap<Integer, String>details = new HashMap<>();
        details.put(1, "selenium");
        details.put(2, "api");
        details.put(3, "postman");

        System.out.println(details.get(2));
       // System.out.println(details.remove(2));
        System.out.println(details.replace(2,"code1"));

        for(Integer a : details.keySet()){
            System.out.println(a);
        }

        System.out.println("----------------------");

        for(String a : details.values()){
            System.out.println(a);
        }

        System.out.println("----------------------");

        for(Object a : details.entrySet()){
            System.out.println(a);
        }

    }
}
