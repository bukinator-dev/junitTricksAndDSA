package leetCodeSolutionsTests;

import org.junit.jupiter.api.Test;

public class oneAwayTest {
    @Test
    public void test() {
        System.out.println(oneAway("pale", "ple"));
        System.out.println(oneAway("pales", "pale"));
        System.out.println(oneAway("pale", "bale"));
        System.out.println(oneAway("pale", "bake"));
    }

    private boolean oneAway(String str1, String str2){
        //one insertion, one deletion, one replacement

        return false;
    }
    private boolean oneReplace(String str1, String str2){
        boolean foundDifference = false;
        for(int i=0; i<str1.length(); i++){
            if(str1.charAt(i) != str2.charAt(i)){
                if(foundDifference){
                    return false;
                }
                foundDifference = true;
            }
        }
        return true;
    }
}
