package collection;

import java.util.HashSet;

public class HashSetDemo {

    public static void main(String[] args) {

        /*
         *1.  Sets are unordered list(not store value in order)
         * 2. Sets only allow unique vale.If you enter duplicate it will override with the first value.
         * 3. You can't use get method because values are not stored in order.
         * It allows stored null Values
         */

        HashSet<String> names = new HashSet<>();
        names.add("code1");
        names.add("code2");
        names.add("");
        names.add("code3");
        names.add("code4");
        names.add("code1");
        System.out.println(names.contains("code3"));
        System.out.println(names.contains("code7"));

        for(String name:names){
            System.out.println(name);
        }
    }

}
