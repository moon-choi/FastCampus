package fc.java.course2.part2;

import fc.java.course2.model2.Converter;
import fc.java.course2.model2.IntegerUtils;

public class IntegerUtilsTest {
    public static void main(String[] args) {
        //정적메소드 참조.
        Converter<String, Integer> converter = IntegerUtils::stringToInt;
        int result = converter.convert("123");
        System.out.println(result);
    }
}
