import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final byte monthsInYear = 12;
        final byte percent = 100;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Principal: ");
        double principal = Double.parseDouble(scanner.nextLine().trim());
        System.out.print("Annual Interest Rate (percent): ");
        double annualInterestRate = Double.parseDouble(scanner.nextLine().trim()) / percent / monthsInYear;
        System.out.print("Period (Years): ");
        double period = Double.parseDouble(scanner.nextLine().trim()) * monthsInYear;

        final double pow = Math.pow(1 + annualInterestRate, period);
        final double result = principal * annualInterestRate * pow / (pow - 1);

        String mortage = NumberFormat.getCurrencyInstance().format(result);
        System.out.println("Mortgage: " + mortage);
    }
}