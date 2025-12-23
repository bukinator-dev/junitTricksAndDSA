package leetCodeSolutionsTests;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class productOfArray {
    @Test
    void testSolution(){
        int[] t= new int[]{1,2,3,4};
        for(int i=0; i<t.length;i++){
            System.out.println(t[i]);
        }
        System.out.println(Arrays.toString
                (productExceptSelf(t)));
        System.out.println(Arrays.toString(solution2(t)));
    }
    //space complexity O(n)
    public int[] productExceptSelf(int[] nums) {
       int numL = nums.length;
       int[] leftProducts = new int[numL];
       int leftVal = 1;
       for(int i =0; i< numL;i++){
           leftProducts[i] = leftVal;
           leftVal = nums[i] * leftVal;
       }
        int[] rightProducts = new int[numL];
       int rightval = 1;
       for(int i=numL-1;i>=0;i--){
           rightProducts[i] = rightval;
           rightval *= nums[i];
       }

       int[] answer = new int[numL];
       for(int i =0; i< numL; i++)
       {
           answer[i] = leftProducts[i] * rightProducts[i];
       }
       return answer;
    }

    //O(1) space
    int[] solution2(int[] nums){
        int numL = nums.length;
        int [] answer = new int[numL];
        answer[0] = 1;
        for(int i =1; i< numL; i++){
            answer[i] = answer[i-1] * nums[i-1];
        }

        int suffix = 1;
        for(int i = numL-1; i>=0; i--){
            answer[i] = answer[i] * suffix;
            suffix = suffix * nums[i];
        }

        return answer;
    }

}
