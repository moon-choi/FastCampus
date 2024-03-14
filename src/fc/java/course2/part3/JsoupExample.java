package fc.java.course2.part3;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class JsoupExample {
    public static void main(String[] args) {
        String url = "https://sum.su.or.kr:8888/bible/today?base_de=2023_03_20";
        try {
            Document document = Jsoup.connect(url).get();
            Element bibleText = (document.getElementById("bible_text"));
            Element bibleInfoBox = document.getElementById("bibleinfo_box");
            System.out.println(bibleText.text());
            System.out.println(bibleInfoBox.text());

            Elements nums = document.select(".num");
            Elements infos = document.select(".info");

            for(int i = 0; i < nums.size(); i++) {
                System.out.println(nums.get(i).text() + ": " + infos.get(i).text());
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
