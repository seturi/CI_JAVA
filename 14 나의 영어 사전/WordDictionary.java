import java.util.HashMap;

public class WordDictionary { 
    private HashMap<String, String> words = new HashMap<>();
    
    public void addWord(String english, String korean) {
        // 코드를 작성하세요.
        words.put(english.toLowerCase(), korean);
    }

    public String find(String english) {
        // 코드를 작성하세요.
        String word = null;
        for (String key : words.keySet()) {
            if (english.toLowerCase().equals(key)) {
                word = words.get(key);
            }
        }
        return word;
    }
}