import java.util.Scanner;

public class loop {

    public static void main(String[] args){
//        forLoop();
//        whileLoop();
//        userInput();
//        doWhileLoop();
//        breakAndContinue();
//        forEachLoop();
    }

    public static void mortgateCalulator(){}

    public static void forLoop(){
        for (int i = 0; i < 5; i++)
            System.out.println("Hello World " + i);
    }

    public static void whileLoop(){
        int i = 5;
        while (i > 0) {
            System.out.println("Hello World " + i);
            i--;
        }
    }

    public static void userInput(){
        Scanner scanner = new Scanner(System.in);
        String input = "";
        String result = "";
        while (!input.equals("quit")) {
            System.out.print("Input: ");
            input = scanner.next().toLowerCase();
            System.out.println(input);
            result += " " + input;
        }
        System.out.println(result);
    }

    public static void doWhileLoop(){
        Scanner scanner = new Scanner(System.in);
        String input = "";
        String result = "";
        do {
            System.out.print("Input: ");
            input = scanner.next().toLowerCase();
            System.out.println(input);
            result += " " + input;
        } while (!input.equals("quit"));
        System.out.println(result);
    }

    public static void breakAndContinue(){
        Scanner scanner = new Scanner(System.in);
        String input = "";
        String result = "";
        while (true) {
            System.out.print("Input: ");
            input = scanner.next().toLowerCase();
            if(input.equals("pass"))
                continue;
            if(input.equals("quit"))
                break;
            System.out.println(input);
            result += " " + input;
        }
        System.out.println(result);
    }

    public static void forEachLoop(){
        String[] fruits = {"Apple", "Mango", "Orange"};

        for(int i = fruits.length - 1; i >= 0 ; i--) System.out.println(fruits[i]);

        for(String fruit: fruits) System.out.println(fruit);
    }
}