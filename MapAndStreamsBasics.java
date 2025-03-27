
import java.util.*;
import java.util.stream.*;
public class WordFrequencyList {

    public static void main(String[] args) {
        List<String> words = new ArrayList<>();

        // Add repeating words
        addRepeatedWords(words, "apple", 10);
        addRepeatedWords(words, "banana", 7);
        addRepeatedWords(words, "cherry", 5);
        addRepeatedWords(words, "date", 3);
        addRepeatedWords(words, "elderberry", 2);
        addRepeatedWords(words, "fig", 8);

        // Add unique words
        words.add("grape");
        words.add("honeydew");
        words.add("kiwi");
        words.add("lemon");
        words.add("mango");
        words.add("nectarine");
        words.add("orange");
        words.add("papaya");
        words.add("quince");
        words.add("raspberry");
        words.add("strawberry");
        words.add("tangerine");
        words.add("ugli");
        words.add("vanilla");
        words.add("watermelon");
        words.add("xigua");
        words.add("yam");
        words.add("zucchini");


        // Print the list
        words.forEach(System.out::println);
        System.out.println("Total words: " + words.size());
        
        Map<String,Integer> mapp=words.stream().collect(Collectors.toMap(
            word -> word,
            word -> 1,
            (oldVal,newVal) ->{
                newVal=oldVal+1;
                return newVal;
            }
            ));
        System.out.println(mapp);        

    }

    private static void addRepeatedWords(List<String> words, String word, int count) {
        for (int i = 0; i < count; i++) {
            words.add(word);
        }
    }
}