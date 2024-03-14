package fc.java.course2.part3;

import com.google.gson.Gson;
import fc.java.course2.model3.Member;

public class GsonFromJson {
    public static void main(String[] args) {
        String json = "{\"name\":\"홍길동\",\"age\":30,\"email\":\"bit@empas.com\"}";
        Gson gson = new Gson(); //메소드를 쓰기 위해 일단 생성시켜줌.
        Member mvo = gson.fromJson(json, Member.class);
        System.out.println("JSON: " + json);
        System.out.println("Object: " + mvo);
    }
}
