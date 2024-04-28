package collection;

import java.util.ArrayList;

public class ArrayListDemo {

    /*
     * ArrayList supports dynamic array that can grow as needed
     * It can contain duplicate element and it also maintains the insertion order
     * manipulation is slow because a lot of shifting to be occured if any elemet is removed from the array list
     * Arrylist not synchronised
     * Arraylist allows random access because it works on the index basis
     * */

    //String name = "code";
    String [] name = {"code1", "code2", "code3", "code4"}; // fixed
    public static void main(String[] args) {
        names();
    }

    public static void names(){
        ArrayList<String>names = new ArrayList<>();
        names.add("code1");
        names.add("code2");
        names.add("code3");
        names.add("code4");
        names.add("code1");
        System.out.println(names);  //[code1, code2, code3, code4]
        System.out.println(names.get(1)); //code2
        System.out.println(names.set(1,"code22")); // change value of index 1 to code 22
        System.out.println(names.get(1)); //code22
        System.out.println(names); //[code1, code22, code3, code4]
        System.out.println(names.remove(1));
        System.out.println(names);// [code1, code3, code4]

        for(int  i =0; i<names.size(); i++){
            System.out.println(names.get(i));
        }

        System.out.println("--------------------------");

        for(String name:names){
            System.out.println(name);
        }

    }

}
