package fc.java.part3;

public class NonStaticAccess {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        MyUtil1 mu = new MyUtil1(); //객체 생성 후 접근.
        int result = mu.hap(a, b);
        System.out.println(result);
    }
}
