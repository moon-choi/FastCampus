package fc.java.course2.part2;

import fc.java.course2.model2.MathOperationInterface;

public class FunctionalInterfaceTest2 {
    public static void main(String[] args) {
        //MathOperation 인터페이스를 내부 익명 내부 클래스로 구현해보기.
        MathOperationInterface mo = new MathOperationInterface(){
            @Override
            public int operation(int x, int y) {
                return x + y;
            }
        };
        int result = mo.operation(10, 20);
        System.out.println("익명클래스: " + result);
    }
}
