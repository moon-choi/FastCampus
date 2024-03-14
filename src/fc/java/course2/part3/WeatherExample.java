package fc.java.course2.part3;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class WeatherExample {
    public static void main(String[] args) {
        String apiKey = "2cfcf5b421f9b8499b448a16229d42be";
        String city = "Seoul";
        String urlString = "https://api.openweathermap.org/data/2.5/weather?q=" + city + "&appid=" +
        apiKey + "&units=metric";

        try {
            URL url = new URL(urlString);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.setRequestProperty("Accept", "application/json");

            int responseCode = connection.getResponseCode();
            if (responseCode == 200) {
                //입출력과 관련된 스트림.

                //getInputStream: 바이트단위로 받음.
                //InputStreamReader: 문자열단위로 받음. 한글이 안깨지게 인코딩 해줌.
                //BufferedReader: 데이터를 모아서 한번에 처리해줌.
                BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                String inputLine;
                StringBuffer content = new StringBuffer(); //BufferedReader를 통해 읽어들인 라인단위 정보를 계속 붙임.

                //라인 단위로 읽음.
                while((inputLine = in.readLine()) != null){
                    content.append(inputLine);
                }
                in.close();
                System.out.println(content);
                //JsonParser: JSON 파싱하는 클래스
                //parseString: JSON을 파싱하여 String으로 변환.
                JsonObject weatherData = JsonParser.parseString(content.toString()).getAsJsonObject();
                JsonObject mainData = weatherData.getAsJsonObject("main");
                double temp = mainData.get("temp").getAsDouble();
                System.out.println("Temperature in Seoul: " + temp);

                connection.disconnect();
            } else {

            }

        } catch (Exception e){
            e.printStackTrace();
        }

    }
}
