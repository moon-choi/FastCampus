package fc.java.course2.part2;

import fc.java.course2.model2.Converter;
import fc.java.course2.model2.StringUtils;

public class StringUtilsTest {
    public static void main(String[] args) {
        StringUtils stringUtils = new StringUtils();
        //인스턴스 메소드 참조
        Converter<String, String> converter = stringUtils::reverse;
        String result = converter.convert("hello");
        System.out.println(result);
    }
}
