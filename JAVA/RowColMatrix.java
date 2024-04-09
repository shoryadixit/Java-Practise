package JAVA;

import java.util.Arrays;

public class RowColMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                { 10, 20, 30, 40 },
                { 15, 25, 35, 45 },
                { 28, 29, 37, 49 },
                { 33, 34, 38, 50 }
        };

        System.out.println(Arrays.toString(search(matrix, 0)));
    }

    public static int[] search(int[][] matrix, int target) {
        int r = 0;
        int c = matrix.length - 1;
        while (r < matrix.length && c >= 0) {
            if (matrix[r][c] == target) {
                return new int[] { r, c };
            }

            if (matrix[r][c] < target)
                r++;
            else
                c--;
        }

        return new int[] { -1, -1 };
    }

    public static int[] sortedSearch(int[][] matrix, int target) {
        int row = matrix.length;
        int col = matrix[0].length;

        if (row == 0) {
            return binarySearch(matrix, 0, 0, col - 1, target);
        }

        int rStart = 0;
        int rEnd = row - 1;
        int cMid = col / 2;

        while (rStart < (rEnd - 1)) {
            int mid = rStart + (rEnd - rStart) / 2;
            if (matrix[mid][cMid] == target)
                return new int[] { mid, cMid };

            if (matrix[mid][cMid] < target)
                rStart = mid;
            else
                rEnd = mid;
        }

        // Check wehther the target is in column
        if (matrix[rStart][cMid] == target) {
            return new int[] { rStart, cMid };
        }
        if (matrix[rStart + 1][cMid] == target) {
            return new int[] { rStart + 1, cMid };
        }
        
        return new int[] { -1, -1 };
    }

    public static int[] binarySearch(int[][] matrix, int row, int cStart, int cEnd, int target) {
        while (cStart <= cEnd) {
            int mid = cStart - (cEnd - cStart) / 2;
            if (matrix[row][mid] == target)
                return new int[] { row, mid };

            if (matrix[row][cStart] < target)
                cStart = mid + 1;
            else
                cStart = mid - 1;
        }
        return new int[] { -1, -1 };
    }
}
