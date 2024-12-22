public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] arr = {90,77,66,44,33,21,3,2,-1,-3};
        int ans = orderAgnosticBS(arr, 21);
        System.out.println(ans);
    }
    
    static int orderAgnosticBS(int[] arr,int target){
        int start = 0;
        int end = arr.length - 1;

        boolean isAsc;
        if (arr[start] < arr[end]) {
            isAsc = true;
        }else {
            isAsc = false;
        }
        while (start <= end) {
            int mid = start + (end - start)/2;
            // int mid = (start + end)/2 
            // it might be possible that (start + end) exceeds the range of int
            if (arr[mid] == target) {
                return mid;
            }
            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                }else {
                    start = mid + 1;
                } 
            }
            else{
                if (target > arr[mid]) {
                    end = mid - 1;
                }else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
