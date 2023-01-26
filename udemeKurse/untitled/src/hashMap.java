import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class hashMap {
    public static void main(String[] args) {
        // xiaoMing -> 20000 key/value
        Map<String, Integer> incomeMap = new HashMap<>();

        // insert some key,value paars
        incomeMap.put("xiaoMing", 20000);
        incomeMap.put("xiaoWang", 30000);

        // get the data
        int incomeXM = incomeMap.get("xiaoMing");
        System.out.println(incomeXM);

        int incomeXW = incomeMap.get("xiaoWang");
        System.out.println(incomeXW);

        System.out.println("+++++++++++++++++++++++++++++");
        for (Map.Entry<String, Integer> entry: incomeMap.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }

        System.out.println("+++++++++lambda+++++++++++++");
        incomeMap.forEach((key, value)->{
            System.out.println(key + ": " + value);
        });

        System.out.println("+++++++++Iterator+++++++++++++");
        Set set = incomeMap.entrySet();
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            Map.Entry entry = (Map.Entry) iterator.next();
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // modify element
        incomeMap.put("xiaoMing", 25000);
        System.out.println(incomeMap);

        // delete element
        incomeMap.remove("xiaoMing");
        incomeMap.remove("xiaoWang", 30000); // if value is not correct, it will not delete
        System.out.println(incomeMap);
    }
}
