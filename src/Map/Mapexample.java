package Map;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
public class Mapexample {
    public static void main(String[] args) {
Map m1=new HashMap(25);
m1.put("name","Arvind Kulkarni");
m1.put("Phone Number",9890364384L);
m1.put("Address","Pune");
System.out.println(m1);

Map m2=new LinkedHashMap();
m2.put("Name","Arvind");
m2.put("Phone",9890364384L);
System.out.println(m2);

Map m3=new TreeMap();
m3.put("First Name","Arvind");
m3.put("Last Name","Kulkarni");
m3.put("Phone",9890364384L);
System.out.println(m3);


    }
}
