package homework.h06;

// base
// https://leetcode.com/problems/reverse-words-in-a-string-iii/
public class Solution {
    public String reverseWords(String s) {
        String[] words = s.split("\\s+");
        StringBuilder reversed = new StringBuilder();
        for (String word : words) {
            StringBuilder reversedWord = new StringBuilder(word);
            reversedWord.reverse();
            reversed.append(reversedWord).append(" ");
        }
        return reversed.toString().trim();
    }
}