package fc.java.course2.part2;

import java.util.ArrayList;
import java.util.List;

public class CollectionBasic {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10); //Auto boxing 없이 정확하게는 list.add(new Integer(10))
        list.add(20);
        list.add(30);
        list.add(40);
            //Auto unboxing. Integer -> int.
        for(int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        for(int data : list) {
            System.out.println(data);
        }
    }
}
