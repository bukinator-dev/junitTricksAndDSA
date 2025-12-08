package leetCodeSolutionsTests;

import org.junit.jupiter.api.Test;

import java.util.HashMap;

public class CheckPermutations {

    @Test
    public void checkPermuations() {
        String str1 = "";
        String str2 = " 1";
        System.out.println(arePermutationsASCII(str1, str2));
        System.out.println(arePermutationsUnicode(str1, str2));
    }

    private boolean arePermutationsASCII(String str1, String str2) {
        if (str1.length() != str2.length()) return false;
        int[] count_letter = new int[128];
        for (char s : str1.toCharArray()) {
            count_letter[s]++;
        }
        for (char s : str2.toCharArray()) {
            count_letter[s]--;
            if (count_letter[s] < 0) return false;
        }
        return true;
    }

    private boolean arePermutationsUnicode(String str1, String str2) {
        //if (str1.length() != str2.length()) return false;
        HashMap<Character, Integer> map = new HashMap<>();
        for (char charLeter : str1.toCharArray()) {
            map.merge(charLeter, 1, Integer::sum);
        }
        for (char charLeter : str2.toCharArray()) {
            if (map.containsKey(charLeter)) {
                map.merge(charLeter, -1, Integer::sum);
                if (map.get(charLeter) < 0) return false;
            } else {
                return false;
            }
        }
        return true;
    }
}
