public class SearchInRange {
    public static void main(String[] args) {
        int[] arr ={18,12,-7,3,14,28,22,6};
        System.out.println(Search(arr, -7, 1, 4));

    }

    static int Search(int[] arr , int target , int start ,int end){
        if (arr.length == 0) {
            return -1;
        }    
        for (int i = start; i < end; i++) {
            int element = target;
            if (element == arr[i]) {
                return i;
            }
        }
        return -1;
    }
}
