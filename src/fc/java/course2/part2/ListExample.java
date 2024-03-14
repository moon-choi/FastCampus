package fc.java.course2.part2;

import java.util.ArrayList;
//중복 O, 순서 O
public class ListExample {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("apple");
        list.add("banana");
        list.add("cherry");
        list.add("banana");
        list.add("grape");

        list.remove(1);
        list.set(1, "orange");
        for (String str : list) {
            System.out.println(str);
        }

        System.out.println(list.get(2));
        System.out.println(list.get(list.size() - 1));
    }
}
