package fc.java.part3;

public class AllStatic {

    private AllStatic() {
        //만약 모든 클래스가 가진 모든 메소드가 static인 경우,
        //생성자를 인위적으로 private으로 만듦.
        //그러면 인스턴스 만드는게 불가능해짐.
        //AllStatic as = new AllStatic(); - 불가능.
    }
    public static int hap(int a, int b) {
        int v = a + b;
        return v;
    }

    public static int max(int a, int b) {
        return a > b ? a : b;
    }

    public static int min(int a, int b) {
        return a < b ? a : b;
    }

    public static class Student {
        public String name;
        public String dept;
        public int age;
        public String email;
        public int year;
        public String phone;
        Student(String name, String dept, int age, String email, int year, String phone){
            this.name = name;
            this.dept = dept;
            this.age = age;
            this.email = email;
            this.year = year;
            this.phone = phone;
        }

    }
}
