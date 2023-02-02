import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.stream.Stream;

public class stream {
    public static void main(String[] args) {
        String[] names = {"John", "Peter", "Susan", "Kim", "Jen", "George", "Alan", "Stacy", "Michelle", "john"};

        // get and print first 4 elements
        Stream.of(names).limit(4).sorted().forEach(e -> System.out.println(e + " "));
        System.out.println("+++++++++++");
        // skip first 4 ele and sort then print
        Stream.of(names).skip(4).sorted((e1, e2) -> e1.compareToIgnoreCase(e2)).forEach(e-> System.out.println(e));

        System.out.println("+++++++++++");
        Stream.of(names).skip(4).sorted(String::compareToIgnoreCase).forEach(e-> System.out.println(e));

        System.out.println("+++++++++++");
        // find a ele in array
        boolean result = Stream.of(names).anyMatch(e -> e.equals("Stacy"));
        System.out.println(result);

        System.out.println("+++++++++++");
        boolean allMathch = Stream.of(names).allMatch(e -> Character.isUpperCase(e.charAt(0)));
        System.out.println("every char started with upCase?  " + allMathch);

        System.out.println("+++++++++++");
        boolean noStartWithKo = Stream.of(names).noneMatch(e -> e.startsWith("Ko"));
        System.out.println("NO names started with 'Ko', that is: " + noStartWithKo);

        System.out.println("+++++++++++"); // find how many unico ele
        System.out.println(Stream.of(names).map(e-> e.toLowerCase()).distinct().count());

        System.out.println("+++++++++++");
        Object[] array = Stream.of(names).map(String::toLowerCase).toArray();
        System.out.println(Arrays.toString(array));

    }

//    public static void oldWay() {
//        Double[] numbers = {2.4, 55.6, 90.12, 26.6};
//        Set<Double> set = HashSet<>(Arrays.asList(numbers));
//        int count = 0;
//        for(double e:set)
//            if(e > 60) count++;
//        System.out.println("Count is " + count);
//    }
//
//    public static void newWay() {
//        Double[] numbers = {2.4, 55.6, 90.12, 26.6};
//        Set<Double> set = HashSet<>(Arrays.asList(numbers));
//        int count = 0;
//        System.out.println("Count is " + set.stream().filter(e-> (e > 60)).count());
//    }

}