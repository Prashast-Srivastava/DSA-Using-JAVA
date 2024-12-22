public class EvenDigits {
    // https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};
        System.out.println(findNo(nums));
    }

    static int findNo(int[] nums){
        
        int count = 0;
        for (int num : nums) {
            if (even(num)) {
                count++;
            }
        }
        return count;
    }

    static boolean even(int num){
        int n = digits(num);
        if (n % 2 == 0) {
            return true;
        }
        return false;
    }

    static int digits(int num){
        int count = 0;
        while (num > 0) {
            count++;
            num = num/10;
        }
        return count;
    }
}
