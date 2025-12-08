package leetCodeSolutionsTests;

import org.junit.jupiter.api.Test;

public class rotateMatrix {

    @Test
    public void rotateMatrix() {
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16, 78}
        };
        int n = matrix.length;
        System.out.println("Original Matrix lenght :" + n);
        for (int layer = 0; layer < n / 2; layer++) {
            int first = layer;
            int last = n - 1 - layer;
            System.out.println("last index:: " +last);
            for (int i = first; i < last; i++) {
                int offset = i - first;
                int top = matrix[first][i]; // save top
                // left -> top
                matrix[first][i] = matrix[last - offset][first];
                // bottom -> left
                matrix[last - offset][first] = matrix[last][last - offset];
                // right -> bottom
                matrix[last][last - offset] = matrix[i][last];
                // top -> right
                matrix[i][last] = top; // right <- saved top
            }
        }

        // Print the rotated matrix
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
