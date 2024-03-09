package fc.java.part3;

public class NonStaticTest {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        NonStaticTest nst = new NonStaticTest();
        int myHap = nst.hap(a, b);
        System.out.println(myHap);
    }

    //Q. 매개변수로 2개의 정수를 입력받아서 총합을 구하여 리턴하는 메소드 정의하기
    public int hap(int a, int b){
        int v = a + b;
        return v;
    }
}
