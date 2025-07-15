package Map;
import java.util.Map;
import java.util.HashMap;
public class HashMapExample {
    public static void main(String[] args) {
        Map<String, Integer> vehicles = new HashMap<>();
        vehicles.put("MG Astor", 1);
        vehicles.put("Maruti Alto", 2);
        System.out.println("Total vehicles:" + vehicles.size());

        for (String key : vehicles.keySet()) {
            System.out.println(key + "->" + vehicles.get(key));
        }
    }
}