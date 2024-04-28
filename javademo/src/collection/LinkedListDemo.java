package collection;

import java.util.LinkedList;

public class LinkedListDemo {

    public static void main(String[] args) {

        LinkedList<String> names = new LinkedList<>();
        names.add("code1");
        names.add("code2");
        names.add("code3");
        names.add("code4");
        names.add("code1");

        LinkedList<String> names2 = new LinkedList<>();
        names2.add("code7");
        names2.add("code8");
        names2.add("code9");

        System.out.println(names.getFirst()); // code1
        System.out.println(names.getLast()); // code1
        names.addAll(names2); // add names2 collection

        System.out.println("--------------------");
        for(String name:names){
            System.out.println(name);
        }

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
        names.removeAll(names2); // remove names2 collection
        for(String name:names){
            System.out.println(name);
        }
    }


}
