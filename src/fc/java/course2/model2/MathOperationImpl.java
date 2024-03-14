package fc.java.course2.model2;
//인터페이스를 구현한 구현체를 외부에 만들어 놓고 사용하는 방법.
public class MathOperationImpl implements MathOperationInterface {
    @Override
    public int operation(int x, int y) {
        return x + y;
    }
}
