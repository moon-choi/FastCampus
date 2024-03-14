package fc.java.course2.part3;

import com.google.gson.Gson;
import fc.java.course2.model3.Address;
import fc.java.course2.model3.Person;

public class GsonAddressFromJson {
    public static void main(String[] args) {
        String json = "{\"name\":\"홍길동\",\"age\":30,\"email\":\"bit@empas.com\",\"address\":{\"city\":\"서울\",\"country\":\"한국\"}}";
        Gson gson = new Gson();
        Person person = gson.fromJson(json, Person.class);
        System.out.println(person.toString());
    }
}
