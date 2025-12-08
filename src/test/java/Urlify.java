import org.junit.jupiter.api.Test;

public class Urlify {
    // Write a method to replace all spaces in a string with '%20'.
    // You may assume that the string has sufficient
    // space at the end to hold the additional characters,
    // and that you are given the "true" length of the string.
    // (Note: If implementing in Java, please use a character array so that you can perform this operation in place.)
    // Example: "Mr John Smith    ", 13 -> "Mr%20John%20Smith"
    // Example: "Hello  World    ", 12 -> "Hello%20%20World"
    @Test
    public void urlify() {
        char[] str1 =   "Mr John Smith    ".toCharArray();
        int strLenAct = "Mr John Smith    ".toCharArray().length;
        int strLen =13;
        System.out.println(strLen);
        System.out.println(strLenAct);
        System.out.println(urlifyInPlace(str1, strLen));
    }

    //do not use str.replace(" ","%20")
    private String urlify(String str, int trueLength) {
        // Count spaces to calculate result array size
        int spaceCount = 0;
        for (int i = 0; i < trueLength; i++) {
            if (str.charAt(i) == ' ') {
                spaceCount++;
            }
        }

        // Create result array with exact size needed
        char[] result = new char[trueLength + (spaceCount * 2)];

        // Fill result array by moving forward
        int resultIndex = 0;
        for (int i = 0; i < trueLength; i++) {
            char currentChar = str.charAt(i);
            if (currentChar == ' ') {
                result[resultIndex] = '%';
                result[resultIndex + 1] = '2';
                result[resultIndex + 2] = '0';
                resultIndex += 3;
            } else {
                result[resultIndex] = currentChar;
                resultIndex++;
            }
        }

        return new String(result);
    }

    private char[] replaceSapces(char[] str, Integer length) {
        int numberOfSpaces = 2;
        int newLength = length + numberOfSpaces * 2;
        char[] newCharArr = new char[newLength];
        int indexInNewArray = 0;
        for (int i = 0; i < length; i++) {
            if (str[i] == ' ') {
                newCharArr[indexInNewArray] = '%';
                indexInNewArray++;
                newCharArr[indexInNewArray] = '2';
                indexInNewArray++;
                newCharArr[indexInNewArray] = '0';
                indexInNewArray++;
            } else {
                newCharArr[indexInNewArray] = str[i];
                indexInNewArray++;
            }
        }
        return newCharArr;
    }

    private char[] urlifyInPlace(char[] str, int trueLength) {
        // Count spaces in the true length portion
        int spaceCount = 0;
        for (int i = 0; i < trueLength; i++) {
            if (str[i] == ' ') {
                spaceCount++;
            }
        }
        // Calculate new end index
        int newLength = trueLength + (spaceCount * 2);
        // Start from the end and move backwards
        for (int i = trueLength - 1; i >= 0; i--) {
            if (str[i] == ' ') {
                str[newLength - 1] = '0';
                str[newLength - 2] = '2';
                str[newLength - 3] = '%';
                newLength = newLength - 3;
            } else {
                str[newLength - 1] = str[i];
                newLength = newLength - 1;
            }
        }
        return str;
    }

}
