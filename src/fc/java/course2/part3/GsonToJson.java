package fc.java.course2.part3;

import com.google.gson.Gson;
import fc.java.course2.model3.Member;

public class GsonToJson {
    public static void main(String[] args) {
        Member mvo = new Member("홍길동", 30, "bit@empas.com");
        Gson gson = new Gson(); //메소드를 쓰기 위해 일단 생성시켜줌.
        String json = gson.toJson(mvo);
        System.out.println("Object:" + mvo);
        System.out.println("JSON:" + json);
    }
}
