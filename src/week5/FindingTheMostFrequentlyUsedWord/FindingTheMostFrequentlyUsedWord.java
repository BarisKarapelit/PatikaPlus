package week5.FindingTheMostFrequentlyUsedWord;

import java.util.HashMap;

public class FindingTheMostFrequentlyUsedWord {

    public static String findMostFrequentlyUsedWord(String text) {
        HashMap<String, Integer> wordCount = new HashMap<>();
        String[] words = text.split(" ");
        System.out.println("words: " + words);
        for (String word : words) {
            if (wordCount.containsKey(word)) {
                wordCount.put(word, wordCount.get(word) + 1);
            } else {
                wordCount.put(word, 1);
            }
        }
        return wordCount.entrySet().stream().max((entry1, entry2) -> entry1.getValue() > entry2.getValue() ? 1 : -1).get().getKey();
    }
}
