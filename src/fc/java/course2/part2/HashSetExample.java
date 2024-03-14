package fc.java.course2.part2;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("apple");
        set.add("banana");
        set.add("cherry");
        set.add("apple"); //중복

        System.out.println(set.size());
        for(String fruit : set) {
            System.out.println(fruit);
        }

        set.remove("banana");

        System.out.println(set.size());
        for(String fruit : set) {
            System.out.println(fruit);
        }

        boolean hasCherry = set.contains("cherry");
        System.out.println(hasCherry);

        set.clear();
        boolean isEmpty = set.isEmpty();
        System.out.println(isEmpty);
    }
}
