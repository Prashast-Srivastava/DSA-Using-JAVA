public class ChangeValue {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,66};
        change(arr);
        for (int i = 0;i<=arr.length;i++){
            System.out.print(i+" ");
        }
    }

    static void change(int[] nums) {
        nums[5] = 6;
    }
}