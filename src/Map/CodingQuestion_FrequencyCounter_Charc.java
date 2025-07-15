package Map;
import java.util.HashMap;
import java.util.Map;
public class CodingQuestion_FrequencyCounter_Charc {
    public static void main(String[] args) {
        String input="Programming";
        Map<Character,Integer>freqMap=new HashMap<>();
        for (char c : input.toCharArray()){
            freqMap.put(c,freqMap.getOrDefault(c,0)+1);

        }
        System.out.println(freqMap);
    }

}
