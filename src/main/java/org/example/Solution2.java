package org.example;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Solution2 {
    public int[] solution(int[] A) {
        int n = A.length;
        if (n <= 1) return A.clone();

        // Check for existing duplicate
        HashSet<Integer> seen = new HashSet<>();
        for (int v : A) {
            if (seen.contains(v)) return A.clone();
            seen.add(v);
        }

        // Pair value with original index
        int[][] pairs = new int[n][2];
        for (int i = 0; i < n; i++) {
            pairs[i][0] = A[i];
            pairs[i][1] = i;
        }

        // Sort descending by value
        Arrays.sort(pairs, (x, y) -> Integer.compare(y[0], x[0]));

        // Find adjacent pair with minimal difference
        int bestIdx = -1;
        int bestDiff = Integer.MAX_VALUE;
        for (int i = 0; i < n - 1; i++) {
            int diff = pairs[i][0] - pairs[i + 1][0];
            if (diff < bestDiff) {
                bestDiff = diff;
                bestIdx = i;
            }
        }

        // Construct result: copy A, reduce the larger of the chosen adjacent pair to the smaller value
        int[] B = A.clone();
        int largerIndex = pairs[bestIdx][1];
        int smallerValue = pairs[bestIdx + 1][0];
        B[largerIndex] = smallerValue;

        return B;

    }

}