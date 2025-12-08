import org.junit.jupiter.api.Test;

public class palindromePermutation {

    public boolean isPalindromePermutation(String str) {
        int[] totalChars = new int[128];
        int oddCharCount = 0;
        for(char c: str.toCharArray()){
            //int charIndex = c - 'a'; // this solution if only a-z
            totalChars[c]++; // this solution if any ascii char
            if(totalChars[c]%2==1){
                oddCharCount++;
            }else{
                oddCharCount--;
            }
        }

        return oddCharCount <= 1;
    }

    @Test
    public void test(){
        System.out.println(isPalindromePermutation("tactcota"));
    }


}