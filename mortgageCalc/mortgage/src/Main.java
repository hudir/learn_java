import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final byte monthsInYear = 12;
        final byte percent = 100;

        Scanner scanner = new Scanner(System.in);

        double principal;
        double annualInterestRate;
        double period;

        while (true) {
            System.out.print("Principal ($1K - %1M): ");
            principal = Double.parseDouble(scanner.nextLine().trim());
            if(principal >= 1000 && principal <= 1_000_000) break;
            System.out.println("Enter a number between 1,000 and 1,000,000.");
        }

        while (true) {
            System.out.print("Annual Interest Rate (percent, 1%-30%): ");
            annualInterestRate = Double.parseDouble(scanner.nextLine().trim());
            if(annualInterestRate >= 1 && annualInterestRate <= 30) {
                annualInterestRate = annualInterestRate / percent / monthsInYear;
                break;
            }
            System.out.println("Enter a number between 0 and 30.");
        }

        while (true) {
            System.out.print("Period (Years, 1-30): ");
            period = Double.parseDouble(scanner.nextLine().trim()) ;
            if(period >= 1 && period <= 30) {
                period = period * monthsInYear;
                break;
            }
            System.out.println("Enter a number between 0 and 30.");
        }


        final double pow = Math.pow(1 + annualInterestRate, period);
        final double result = principal * annualInterestRate * pow / (pow - 1);

        String mortage = NumberFormat.getCurrencyInstance().format(result);
        System.out.println("Mortgage: " + mortage);
    }
}