package leetCodeSolutionsTests;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class biggesSumArrayTest {

    @Test
    void testSolutionBiggestSumArray(){
        int[] testArray = new int[] {1,-3,2,1,-1};
        returnMaxSum(testArray);
    }

    int[] returnMaxSum(int [] nums){
        int maxSum = nums[0];
        int tempSum = nums[0];
        int start =0;
        int end=0;
        for (int i=1; i<nums.length;i++){
            if(tempSum+nums[i] < nums[i]){
                //maxSum = nums[i];
                start = i;
            } else {
                end = i;
                tempSum = tempSum + nums[i];
            }
        }
        return Arrays.copyOfRange(nums, start, end);
    }
}
