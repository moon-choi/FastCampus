package fc.java.course2.part2;

import java.util.HashMap;
import java.util.Map;

public class CharacterCount {
    public static void main(String[] args) {
        String str = "Hello, World";
        char[] strArr = str.toCharArray();

        Map<Character, Integer> charCountMap = new HashMap<>();

        for(char c : strArr) {
            if(charCountMap.containsKey(c)) {
                charCountMap.put(c, charCountMap.get(c) + 1);
            }
            charCountMap.put(c, 1);
        }

        //방법 1
        for(char c: charCountMap.keySet()) {
            System.out.println(c + ": " + charCountMap.get(c));
        }

        //방법 2
                        //key   //value
        for(Map.Entry<Character, Integer> entry : charCountMap.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

    }
}
