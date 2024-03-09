package fc.java.part3;

public class AllStaticTest {
    public static void main(String[] args) {
//        AllStatic as = new AllStatic(); //불가능.
        System.out.println(AllStatic.hap(10, 20));
        System.out.println(AllStatic.max(10, 20));
        System.out.println(AllStatic.min(10, 20));
    }

    public static class StudentTest {
    }
}
