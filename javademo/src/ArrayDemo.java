public class ArrayDemo {

    public static void main(String[] args) {

        // Two ways of declaring array
        int[] x; // Preffered way
        int y[];


        int[] number = {3, 5, 6, 7, 8};
        double[] number1 = {3.3, 5.3, 6.2, 7.5, 7.7, 8.7};
        String[] name = {"bhav", "codebuster", "code1", "code2"};

        System.out.println(number[1]); // calling via index number
        System.out.println(name[2]);
        System.out.println(name.length);
        int lengthOfName = name.length;
        System.out.println(lengthOfName);
        System.out.println(number.length); // one way;

        int lengthOfNumber = number.length;
        System.out.println(lengthOfNumber);

        //Multidimensional array
        int[][] table = {{32, 52, 62, 72, 82},
                {33, 53, 63, 73, 83},
                {34, 54, 64, 74, 84},
                {35, 55, 65, 75, 85}};

        System.out.println(table[0][3]);
        System.out.println(table[3][2]);

    }
}
