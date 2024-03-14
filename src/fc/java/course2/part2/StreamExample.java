package fc.java.course2.part2;

import java.util.Arrays;
import java.util.List;

public class StreamExample {
    public static boolean isEven_(int number){
        return number % 2 == 0;
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(0,1,2,3,4,5,6,7,8,9);
//        Predicate<Integer> isEven = n -> n % 2 == 0;
        int sumOfSquares = numbers.stream()
//                            .filter(isEven) //Predicate 방식 (함수형 인터페이스)
                            .filter(StreamExample::isEven_) //static 방식
                            .sorted()
                            .map(n -> n * n)
                            .reduce(0, Integer::sum);

        System.out.println(sumOfSquares);
    }
}