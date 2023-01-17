import java.text.NumberFormat;

public class MathClass {

    public static void main(String[] args) {
        // mathClassAndRandomNumbers();
        // formattingNumbers();
    }
    public static void readingInput() {

    }

    public  static void formattingNumbers() {
        // $1,234,567
        // 0.1  10%
        // NumberFormat currency = new NumberFormat() // abstract class, like a half backed cake
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String result = currency.format(1234567.891);
        System.out.println(result);

        NumberFormat percent = NumberFormat.getPercentInstance();
        String resultP = percent.format(0.1);
        System.out.println(resultP);

        String resultp1 = NumberFormat.getPercentInstance().format(0.1);
        System.out.println(resultp1);
    }

    public static void mathClassAndRandomNumbers() {

        int result = Math.round(1.1F);
        System.out.println(result);

        int result1 = (int)Math.ceil(1.1F);
        System.out.println(result1);

        int result2 = (int)Math.floor(1.1F);
        System.out.println(result2);

        int result3 = (int)Math.max(11, 22);
        System.out.println(result3);

        int result4 = (int)Math.min(11, 22);
        System.out.println(result4);

        double result5 = Math.random() ; // a randon number between 0 and 1
        System.out.println(result5);

        int result6 = (int) Math.round( Math.random() * 100 ); // a randon number between 0 and 100
        System.out.println(result6);

        int result7 = (int) (Math.random() * 100) ; // a randon number between 0 and 100
        System.out.println(result7);
    }
}