package fc.java.course2.part2;

import java.util.*;

public class ArrayListGeneric {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("hello");
        list.add(3);
        //타입의 안정성이 보장되지 않음.

        List<String> list_ = new ArrayList<>();
        list_.add("world");
//        list_.add(4); //안됌.
        System.out.println(list.get(0));
        System.out.println(list.get(1));
    }
}
