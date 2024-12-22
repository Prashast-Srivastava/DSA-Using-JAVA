import java.util.ArrayList;
import java.util.List;

public class FindAllDuplicates {
    public static void main(String[] args) {
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        List<Integer> duplicates = findAllDuplicates(nums);
        System.out.println(duplicates);
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    static List<Integer> findAllDuplicates(int[] arr) {
        List<Integer> duplicates = new ArrayList<>();
        int i = 0;

        while (i < arr.length) {
            if (arr[i] != i + 1) {
                int correct = arr[i] - 1;

                if (arr[i] != arr[correct]) {
                    swap(arr, i, correct);
                } else {
                    // If it's already in the correct position but repeated, it's a duplicate.
                    if (!duplicates.contains(arr[i])) {
                        duplicates.add(arr[i]);
                    }
                    i++;
                }
            } else {
                i++;
            }
        }

        return duplicates;
    }
}
