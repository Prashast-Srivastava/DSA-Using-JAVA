import java.util.Arrays;

public class SwapAnArray {
    public static void main(String[] args) {
        int[] arr = {2,3,56,654,22};
        
        swap(arr , 2 , 3);

        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] arr ,int index2 ,int index3){
        int temp = arr[index2];
        arr[index2] = arr[index3];
        arr[index3] = temp;
    }
}
