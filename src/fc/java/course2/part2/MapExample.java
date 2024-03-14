package fc.java.course2.part2;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
            //key   //value
        Map<String, Integer> studentScores = new HashMap<>();
        studentScores.put("Kim", 95);
        studentScores.put("Lee", 85);
        studentScores.put("Park", 90);
        studentScores.put("Choi", 80);

        System.out.println(studentScores.get("Kim")); //95
        studentScores.put("Kim", 100);
        System.out.println(studentScores.get("Kim")); //100
        studentScores.remove("Choi");
        System.out.println(studentScores.get("Choi")); //null

        //방법 1
        for(String student: studentScores.keySet()) {
            System.out.println(student + "'s score: " + studentScores.get(student));
        }

        //방법 2
                    //key     //value
        for(Map.Entry<String, Integer> entry : studentScores.entrySet()) {
            System.out.println(entry.getKey() + "'s score: " + entry.getValue());

        }

        for(int score: studentScores.values()) {
            System.out.println(score);
        }
    }
}
