package leetCodeSolutionsTests;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringTest {
    //    Longest Substring Without Repeating Characters:
    //          Find the length of the longest substring without repeating characters.

    @Test
    void SumTask() {
        String input = "abbqwerty";
        System.out.println(checkString(input));

        // Function to find the length of the longest substring without repeating characters`

    }
    private int checkString(String input) {
        int length = 1;
        int startIndex = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (int i=0; i < input.length(); i++) {
            if(map.containsKey(input.charAt(i))){
                startIndex = Math.max(map.get(input.charAt(i))+1, startIndex);
            }
            map.put(input.charAt(i), i);
            var currentLength = i - startIndex + 1;

            length = Math.max(length, currentLength);
        }
        return length;
    }
}






