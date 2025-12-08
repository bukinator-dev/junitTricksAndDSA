package leetCodeSolutionsTests;

import org.junit.jupiter.api.Test;

public class IsUnique {
    // Implement an algorithm to determine if a string has all unique characters.
    // What if you cannot use additional data structures?
    //Example: "abcda" -> false, "abcd" -> true
    private Boolean isUnique(String input){

        boolean[] charset = new boolean[128];

        for(int i=0; i< input.length();i++){
            char letterExists = input.charAt(i);
            if(charset[letterExists]){
                return false;
            }
            charset[letterExists] = true;
        }
       return true;
    }

    @Test
    public void testIsUnique(){
        String input = "abcda";
        System.out.println(isUnique(input));
    }

    @Test
    public void checkBooleanArr(){
        boolean[] arrBool = new  boolean[128];
        arrBool['a'] = true;
        arrBool['b'] = false;
        arrBool[2] = false;
        System.out.println(arrBool['a']);
        System.out.println(arrBool['b']);
        System.out.println(arrBool[2]);
    }

}
