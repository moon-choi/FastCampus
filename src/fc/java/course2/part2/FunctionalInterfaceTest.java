package fc.java.course2.part2;

import fc.java.course2.model2.MathOperationInterface;

public class FunctionalInterfaceTest implements MathOperationInterface {
    public static void main(String[] args) {
        MathOperationInterface mo = new FunctionalInterfaceTest();
        int result = mo.operation(10, 20);
        System.out.println("인터페이스 내부 구현: " + result);
    }

    @Override
    public int operation(int x, int y) {
        return x + y;
    }
}
