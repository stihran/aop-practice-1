package homework.h06;

// base
// https://leetcode.com/problems/reverse-words-in-a-string-iii/
public class T1 {

  static String reverseWords(String s) {
    char[] chars = s.toCharArray();
    int start = 0;
    for (int i = 0; i <= chars.length; i++) {
      if (i == chars.length || chars[i] == ' ') {
        reverse(chars, start, i - 1);
        start = i + 1;
      }
    }
    return new String(chars);
  }

  private static void reverse(char[] chars, int left, int right) {
    while (left < right) {
      char tmp = chars[left];
      chars[left++] = chars[right];
      chars[right--] = tmp;
    }
  }

  static void main() {
    System.out.println(reverseWords("Let's take LeetCode contest")); // s'teL ekat edoCteeL tsetnoc
    System.out.println(reverseWords("Mr Ding")); // rM gniD
  }
}
