import java.awt.*;
import java.util.Arrays;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        // primitive type
        byte age = 30;
        long viewCount = 3_123_456_789L;
        float price = 10.99F;
        char letter = 'A';
        boolean isEligible = false;

        // reference type
        Date now = new Date();
        now.getTime();

        // System.out.println(now); // sout - shorthand

        byte x = 1;
        byte y = x;
        x = 2;
        // System.out.println(y);

        Point point1 = new Point(1,1); // variable hold the address in memory, not the value
        Point point2 = point1;
        point1.x = 2;
        // System.out.println(point2);

        String message = new String("Hello World"); // strings are reference types in java
        String message1 = " Hello World again" + "!! "; // short hand way

        System.out.println(message1.endsWith("!!"));
        System.out.println(message1.length());
        System.out.println(message1.indexOf("sky"));
        // in java string immutable, return a new string object
        System.out.println(message1.replace("!", "*"));
        System.out.println(message1.toLowerCase());
        System.out.println(message1.toUpperCase());
        System.out.println(message1.trim());
        System.out.println(message1);

        String message2 = "Hello \"Hudir\""; // use backslash to escape the "
        System.out.println(message2);

        String message3 = "c:\\Windows\\..."; // use backslash to escape the \
        System.out.println(message3);

        String message4 = "c:\nWindows\\..."; // use backslash + n to add new line
        System.out.println(message4);

        String message5 = "c:\tWindows\\..."; // use backslash + t to add a tab
        System.out.println(message5);

        // array
        int[] numbers = new int[5]; // length of the array is 5,
        numbers[0] = 1;
        numbers[1] = 2;
        // int[], default value is 0 for each element
        // String[], default value is ""
        // boolean[], default value is false

        System.out.println(numbers); // =>[I@36baf30c the address in RAM
        System.out.println(Arrays.toString(numbers)); // [1, 2, 0, 0, 0]

        int[] numbers1 = {2, 3, 5, 1, 4}; // short hand
        Arrays.sort(numbers1);

        System.out.println(Arrays.toString(numbers1));

        // multi dimensional array
        int [][][] twoDimension = new int[2][3][5];
        int [][] twoDimension1 = { { 1, 2, 3}, { 4, 5, 6} };
        twoDimension[0][0][4] = 1;
        System.out.println(Arrays.deepToString(twoDimension));
        System.out.println(Arrays.deepToString(twoDimension1));

        // arithmeticExpression();
        // castingAndTypeConvertion();
    }

    public static void constant() {
        final float PI = 3.14F;
    }

    public static void arithmeticExpression() {
        int willBeInt = 10 / 3;
        double result = (double)10 / (double) 3; // get a int
        System.out.println(willBeInt);
        System.out.println(result);

        int x = 1;
        int y = x++; // first y = x, then y =
        // y + 1
        System.out.println(x);
        System.out.println(y);
        int z = 1;
        // z = z + 2;
        // z += 2;
        // z -= 2;
        z = (10 + 3) * 3;
        System.out.println(z);
    }

    public static void castingAndTypeConvertion() {
        // byte > short > int > long > float > double
         int x = 1;
         // short y = x + 2; // implicit casting - automotive conversion
         // java: incompatible types: possible lossy conversion from int to short
         // System.out.println(y);
         double z = 1.1;
         int u = (int)z + 2; // explicit casting
        System.out.println(u);

        String x1 = "1";
        int y = Integer.parseInt(x1) + 6;
        // Short.parseShort();
        // Float.parseFloat();
        System.out.println(y);

        String x2 = "1.1";
        double y2 = Double.parseDouble(x2) + 11.1;
        System.out.println(y2);
    }



}

// run javac Main.java can get the javabite file -- compiltion
// run java fullpath/Main.class -- get nativ code and excutetion