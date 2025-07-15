package Map;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
public class L123Hashtable {
    public static void main(String[] args) {
        Hashtable<Integer,String> ht1 = new Hashtable();
        ht1.put(1, "one");
        ht1.put(1, "one");
        ht1.put(2, "two");
        ht1.put(3, "three");
        System.out.println(ht1);
        HashMap<Integer,String> ht2 = new HashMap<>();
        // Not Thread Safe, or Not Synchronised
        ht2.put(1, "one");
        ht2.put(2, "two");
        ht2.put(45, null);
        ht2.put(3, "three");
        ht2.put(3, null);
        ht2.put(null, null);
        System.out.println(ht2);

        System.out.println("  ---- ");


        Enumeration<Integer> e  = ht1.keys();
        while (e.hasMoreElements()) {
            System.out.println(e.nextElement());
        }
    }

}
