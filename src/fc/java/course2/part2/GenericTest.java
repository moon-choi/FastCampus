package fc.java.course2.part2;

import fc.java.course2.model2.ObjectArr;

public class GenericTest {
    public static void main(String[] args) {
/*        ObjectArr<String> arr = new ObjectArr<>(5);
        arr.set(0, "Hello");
        arr.set(1, "World");
        arr.set(2, "Java");
        arr.set(3, "Generic");

        for(int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
        }*/

        ObjectArr<Integer> arr_ = new ObjectArr<>(4);
        arr_.set(0, 0);
        arr_.set(1, 1);
        arr_.set(2, 2);
        arr_.set(3, 3);

        for(int i = 0; i < arr_.size(); i++) {
            System.out.println(arr_.get(i));
        }
    }
}
