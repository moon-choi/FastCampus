package fc.java.course2.model2;
//Number의 하위클래스 타입 중 뭐가 들어올 지 모름.
public class AverageCalculator<T extends Number> {
    private T[] numbers;

    public AverageCalculator(T[] numbers){
        this.numbers = numbers;
    }

    public double calculateAverage(){
        double sum = 0.0;
        for(T num : numbers){
            sum += num.doubleValue();
        }
        return sum / numbers.length;
    }
}
