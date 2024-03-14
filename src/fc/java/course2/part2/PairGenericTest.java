package fc.java.course2.part2;

import fc.java.course2.model2.Pair;

import java.util.*;

public class PairGenericTest {
    public static void main(String[] args) {
        Pair<String, Integer> pair = new Pair<>("hello", 1);
        System.out.println(pair.getKey());
        System.out.println(pair.getValue());

        Map<String, Integer> map = new HashMap<>();
        map.put("kor", 60);
        map.put("eng", 50);
        map.put("math", 40);
        System.out.println(map.get("kor"));
        System.out.println(map.get("eng"));
        System.out.println(map.get("math"));
    }

}
