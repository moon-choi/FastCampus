package fc.java.course2.part2;

import fc.java.course2.model2.Person;
import fc.java.course2.model2.PersonFactory;

public class PersonFactoryTest {
    public static void main(String[] args) {
        //생성자 참조 - 클래스명::new
        PersonFactory personFactory = Person::new;
        Person person = personFactory.create("홍길동", 40);
        System.out.println(person);

        //생성자 참조 - 익명 내부 클래스 사용(이전방법)
        PersonFactory personFactory_ = new PersonFactory() {
            @Override
            public Person create(String name, int age) {
                return new Person(name, age);
            }
        };
        Person person_ = personFactory_.create("나길동", 32);
        System.out.println(person_);
    }
}
