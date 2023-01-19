import java.util.Scanner;

public class comparisonOp {
    public static void main(String[] args){
        // first();
        // logical();
        // logical1();
        // ifStatement();
//        simplifyIfStatement();
//        theTernaryOp();
//        switchStatments();
//        switchStatments1();
        fizzBuzz();
    }

    public static void fizzBuzz() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a int: ");
        int num = scanner.nextInt();
        String result = num % 5 == 0 && num % 3 == 0 ? "FizzBuzz" :
                        num % 5 == 0 ? "Fizz" :
                        num % 3 == 0 ? "Buzz" :
                        "no";
        if (result != "no") System.out.println(result);
        else System.out.println(num);
    }

    public static void first() {
        int x = 1;
        int y = 1;
        System.out.println(x >= y);
    }

    public  static  void logical() {
        int temperature = 12;
        boolean isWarm = temperature > 20 && temperature < 30;
        System.out.println(isWarm);
    }

    public  static  void logical1() {
        boolean hasHighIncome = true;
        boolean hasGoodCredit = true;
        boolean hasCriminalRecord = false;
        boolean isEligible = (hasHighIncome || hasGoodCredit) && !hasCriminalRecord;
        System.out.println(isEligible);
    }

    public static void ifStatement() {
        int temp = 12;
        if (temp > 30) {
            System.out.println("It's a hot day");
            System.out.println("Drink water");
        }
        else if (temp > 20)
            System.out.println("Beautiful day");
        else System.out.println("Cold day");
    }

    public static void simplifyIfStatement() {
        int income = 120_000;
        boolean hasHighIncome = income > 100_000;
    }

    public static void  theTernaryOp(){
        int income = 90_000;
        String className = income > 100_000 ? "First Class" : "Economy Class";
        System.out.println(className);
    }

    public static void switchStatments() {
        String role = "admin";

        switch (role) {
            case "admin":
                System.out.println("You're an admin");
                break;

            case "moderator":
                System.out.println("You're a moderator");
                break;

            default:
                System.out.println("You're a guest");
        }
    }

    public static void switchStatments1() {
        int role = 2;

        switch (role) {
            case 1:
                System.out.println("You're an admin");
                break;

            case 2:
                System.out.println("You're a moderator");
                break;

            default:
                System.out.println("You're a guest");
        }
    }
}