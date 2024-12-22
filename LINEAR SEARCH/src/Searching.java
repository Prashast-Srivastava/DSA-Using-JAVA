import java.util.Arrays;

public class Searching {
    public static void main(String[] args) {
        int[][] arr = {
            {11, 22, 55, 33},
            {43, 23, 74},
            {10, 20, 79, 56},
            {6, 22}
        };
        int ans = max(arr); // Declare 'ans' as an int[] to match the return type of searching
        System.out.println(ans);
    }

    // searching an element in 2d array
    static int[] searching(int[][] arr, int target) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target) {
                    return new int[]{row, col};
                }
            }
        }
        return new int[]{-1, -1};
    }

    // function to find the max value in 2d array
    static int max(int[][] arr) {
        int max = Integer.MIN_VALUE;
        for (int[] element : arr) {
            for (int element2 : element) {
                    if (element2 > max) {
                            max = element2;
                    }
                }
        }
        return max;
    }
}
