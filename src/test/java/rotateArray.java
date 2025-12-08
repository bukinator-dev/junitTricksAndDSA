import org.junit.jupiter.api.Test;

import java.util.List;

import static java.util.Collections.rotate;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class rotateArray {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n; // Handle cases where k > n

        // Reverse the entire array
        reverse(nums, 0, n - 1);
        // Reverse the first k elements
        reverse(nums, 0, k - 1);
        // Reverse the remaining elements
        reverse(nums, k, n - 1);
    }

    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    @Test
    public void rotateArrayTest() {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
        int k = 3;
        rotate(arr, k);
        // Expected output: [5, 6, 7, 1, 2, 3, 4]
        int[] expected = { 5, 6, 7, 1, 2, 3, 4 };
        assertArrayEquals(expected, arr);

        System.out.println("Result: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    private void reverseDouble(int[] arr, int start, int end){
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    } 
}
