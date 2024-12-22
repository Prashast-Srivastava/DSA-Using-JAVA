public class Search {
    public static void main(String[] args) {
        int[] arr = {-11,-5,-2,0,2,4,7,9,11,21,33,46};
        int ans = search(arr, 9);
        System.out.println(ans);
    }

    static int search(int[] arr,int target){
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start)/2;
            // int mid = (start + end)/2 
            // it might be possible that (start + end) exceeds the range of int
            if (target < arr[mid]) {
                end = mid - 1;
            }else if (target > arr[mid]) {
                start = mid + 1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}