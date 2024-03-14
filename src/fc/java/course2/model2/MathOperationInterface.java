package fc.java.course2.model2;

@FunctionalInterface //함수형 인터페이스: 추상 메소드 1개만 갖고 있음.
public interface MathOperationInterface {
    public int operation(int x, int y); //추상메소드.
}
