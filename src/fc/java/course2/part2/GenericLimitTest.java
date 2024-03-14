package fc.java.course2.part2;

import fc.java.course2.model2.AverageCalculator;

public class GenericLimitTest {
    public static void main(String[] args) {
        Integer[] integers = {1,2,3,4,5};
        Double[] doubles = {6.0, 7.0, 8.0, 9.0, 10.0};

        AverageCalculator<Integer> integerAverageCalculator = new AverageCalculator<>(integers);
        double integerAverage = integerAverageCalculator.calculateAverage();
        System.out.println(integerAverage);

        AverageCalculator<Double> doubleAverageCalculator = new AverageCalculator<>(doubles);
        double doubleAverage = doubleAverageCalculator.calculateAverage();
        System.out.println(doubleAverage);
    }
}
