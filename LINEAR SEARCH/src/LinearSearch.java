public class LinearSearch {
    public static void main(String[] args) {
        int[] nums = {12,33,23,4,5,7,34};
        int target = 422;
        System.out.println(Search(nums, target));
    }

    // function that returns the index of target element 
    static int linearSearch(int[] arr,int target){
        if (arr.length == 0) {
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];
            if (element == target) {
                return i;
            }
        }
            return -1;
    }

    // function that returns the index of target element 
    static int linearSearch2(int[] arr,int target){
        if (arr.length == 0) {
            return -1;
        }
        for (int element : arr) {
               if (element == target) {
               return element;
            }
        }
            
        return Integer.MAX_VALUE;
    }

    // returns true if the element exist
    static boolean Search(int[] arr,int target){
        if (arr.length == 0) {
            return false;
        }
        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];
            if (element == target) {
                return true;
            }
        }
        return false;

    }
}
