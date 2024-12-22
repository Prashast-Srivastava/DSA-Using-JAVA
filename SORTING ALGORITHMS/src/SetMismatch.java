import java.util.Arrays;

public class SetMismatch {
    public static void main(String[] args) {
        int[] nums = {2,1,4,2,6,5};
        int[] ans = set(nums);
        System.out.println(Arrays.toString(ans));
    }

    static void swap(int[] arr , int first , int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    static int[] set(int[] arr){
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                swap(arr, i, correct);
            }else {
                i++;
            }
        }

        // for first missing no..
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index + 1) {
                return new int[]{arr[index] , index + 1};
            }
        }
        return new int[]{-1,-1};
    }
}
