package fc.java.part3;

public class ClassObjectInstance {
    public static void main(String[] args) {
        AllStatic.Student st1;
        AllStatic.Student st2;
        AllStatic.Student st3;

        //st1은 메인에  //new Student()는 힙에 존재.
        st1 = new AllStatic.Student("홍길동", "컴공", 20, "a@a.com", 1234, "010-1234-1234");
        st2 = new AllStatic.Student("나길동", "컴공", 22, "b@b.com", 1234, "010-5678-5678");
        st3 = new AllStatic.Student("김길동", "컴공", 21, "c@c.com", 1234, "010-1357-2468");

        System.out.println(st1.toString());
        System.out.println(st2.toString());
        System.out.println(st3.toString());
    }
}
