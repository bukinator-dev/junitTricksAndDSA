import org.junit.jupiter.api.Test;

public class CompressString {
    private String compressString(String str){
        StringBuilder compressed = new StringBuilder();
        int countChar =0;
        for(int i=0; i<str.length(); i++){
            countChar++;
            if(i == str.length()-1 || str.charAt(i) != str.charAt(i+1)){
                compressed.append(str.charAt(i));
                compressed.append(countChar);
                countChar = 0;
            }
        }
        return compressed.length() > str.length() ? str : compressed.toString();
    }

    @Test
    void test(){
        System.out.println(compressString("aabbb"));
    }

}


