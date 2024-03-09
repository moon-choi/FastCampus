package fc.java.part3;

public class StaticAccess {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int sum = MyUtil.hap(a, b); //클래스 이름으로 바로 접근. new를 이용해서 객체 사용할 필요 없음.
        System.out.println(sum);
    }
}
