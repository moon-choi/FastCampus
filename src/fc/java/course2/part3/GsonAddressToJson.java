package fc.java.course2.part3;

import com.google.gson.Gson;
import fc.java.course2.model3.Address;
import fc.java.course2.model3.Person;

public class GsonAddressToJson {
    public static void main(String[] args) {
        Address address = new Address("서울", "한국");
        Person person = new Person("홍길동", 30, "bit@empas.com", address);

        Gson gson = new Gson();
        String json = gson.toJson(person);
        System.out.println(json);
    }
}
