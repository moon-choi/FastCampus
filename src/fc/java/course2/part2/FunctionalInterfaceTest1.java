package fc.java.course2.part2;

import fc.java.course2.model2.MathOperationImpl;
import fc.java.course2.model2.MathOperationInterface;

public class FunctionalInterfaceTest1 {
    public static void main(String[] args) {
        MathOperationInterface mo = new MathOperationImpl();
        int result = mo.operation(10, 20);
        System.out.println("인터페이스 외부 구현체: " + result);
    }
}
