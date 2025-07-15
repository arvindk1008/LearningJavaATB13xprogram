package Map;
import java.util.*;

public class RealExample {
    public static void main(String[] args) {
Map<String,Object>student1=new HashMap();
student1.put("Name","Arvind Kulkarni");
student1.put("phone",9890364384L);
student1.put("Address","Pune");

Map<String,Object>student2=new HashMap();
student2.put("Name","Radhe");
student2.put("Phone",98989222L);
student2.put("Address","Pune");

List students=new ArrayList();
students.add(student1);
students.add(student2);
System.out.println(students);

        Set book_read_items = new HashSet();
        book_read_items.add("Rich dad Poor Dad");
        book_read_items.add("Sapaiens");
        book_read_items.add("Secret");
        book_read_items.add("Atomic Habit");
        book_read_items.add("Atomic Habit");
        book_read_items.add("Eat the Frog");

System.out.println(book_read_items);


    }
}
