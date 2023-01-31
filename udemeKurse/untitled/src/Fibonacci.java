import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an index for a Fibonacci number: ");
        int index = input.nextInt();

        System.out.println("The Fibonacci number at index " + index + " is " + fib(index));
    }

    private static Map map = new HashMap<>();

    public static long fib(long index) {
        if(map.containsKey(index)) return (long) map.get(index);
        else if (index == 0) return 0;
        else if(index == 1) return 1;
        else {
            long result = fib(index - 1)+ fib(index - 2);
            map.put(index, result);
            return result;
        }
    }
}
