package fc.java.course2.part2;

import java.util.Arrays;
import java.util.stream.IntStream;

public class StreamAPITest {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        /*
        int even = 0;
        for(int num : numbers){
            if (num % 2 == 0){
                even += num;
            }
        }
        System.out.println(even);
        */

        IntStream stream = Arrays.stream(numbers);
        int sumOfEvens = stream.filter(n -> n % 2 == 0)
                                .sum();
        System.out.println(sumOfEvens);

        IntStream stream_ = Arrays.stream(numbers);
        int[] evenNumbersArr = stream_.filter(n -> n % 2 == 0)
                                        .toArray();
        for(int even : evenNumbersArr) {
            System.out.println(even);
        }
    }
}
