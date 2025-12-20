package leetCodeSolutionsTests;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.stream.Stream;

public class TwoPointers {

    @ParameterizedTest
    @MethodSource("twoSumTestCases")
    public void testTwoSum(int[] numbers, int target, int[] expected) {
        int[] result = twoSum(numbers, target);
        assert Arrays.equals(result, expected);
    }

    static Stream<Arguments> twoSumTestCases() {
        return Stream.of(
                Arguments.of(new int[]{2, 7, 11, 15}, 9, new int[]{0, 1}),
                Arguments.of(new int[]{3, 2, 4}, 6, new int[]{1, 2}),
                Arguments.of(new int[]{3, 3}, 6, new int[]{0, 1})
        );
    }

    //Two Sum II - Input Array unsorted.
    public int[] twoSum(int[] numbers, int target) {
         int[][] originalLocations = new int[numbers.length][2];
        for(int i=0; i<numbers.length;i++){
            originalLocations[i][0] = i; // Store original index
            originalLocations[i][1] = numbers[i];
        }
        Arrays.sort(originalLocations, (a,b) -> Integer.compare(a[1], b[1])); // Sort by values
        System.out.println(Arrays.deepToString(originalLocations));
        int left = 0;
        int right = numbers.length - 1;
        while (left < right) {
            int sum = originalLocations[left][1] + originalLocations[right][1];
            if (sum == target) {
                return new int[]{originalLocations[left][0], originalLocations[right][0]};
            } else if (sum < target) {
                left++; // Move left pointer to the right to increase sum
            } else {
                right--; // Move right pointer to the left to decrease sum
            }
        }
        return null;//new int[]{-1, -1}; // Return -1 if no solution is
    }

    //brute force
    public int[] twoSumBruteForce(int[] numbers, int target) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == target) {
                    return new int[]{i, j}; // Return 1-based indices
                }
            }
        }
        return new int[]{-1, -1}; // Return -1 if no solution is found
    }

    //hash map approach - not optimal for sorted array but works
    public int[] twoSumHashMap(int[] numbers, int target) {
        java.util.Map<Integer, Integer> map = new java.util.HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            int complement = target - numbers[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement) + 1, i + 1}; // Return 1-based indices
            }
            map.put(numbers[i], i);
        }
        return null;
    }

}
