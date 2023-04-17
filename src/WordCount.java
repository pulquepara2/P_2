import java.util.HashMap;

public class WordCount {
    private String text;
    private HashMap<String, Integer> wordcount = new HashMap<>();

    public WordCount(String text) {
        this.text = text;
    }

}
