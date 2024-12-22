public class Position {
    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;
        Position obj = new Position();
        int[] result = obj.searchRange(nums, target);

        System.out.println("First and Last Positions: [" + result[0] + ", " + result[1] + "]");
    }

    public int[] searchRange(int[] nums, int target) {
        int[] ans = {-1, -1};

        // Check if the array is null or empty
        if (nums == null || nums.length == 0) {
            return ans;
        }

        // Find the first occurrence of the target
        ans[0] = search(nums, target, true);

        // If the target exists, find the last occurrence
        if (ans[0] != -1) {
            ans[1] = search(nums, target, false);
        }

        return ans;
    }

    // Function to find the index of target
    int search(int[] nums, int target, boolean findStartIndex) {
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            // Avoid overflow
            int mid = start + (end - start) / 2;

            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                // Potential answer found
                ans = mid;

                // Narrow search to find start or end index
                if (findStartIndex) {
                    end = mid - 1; // Look on the left side
                } else {
                    start = mid + 1; // Look on the right side
                }
            }
        }

        return ans;
    }
}
