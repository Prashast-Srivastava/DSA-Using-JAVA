public class SmallestLetter {
    public static void main(String[] args) {
        char[] letters = {'c','d','j'};
        char target = 'c';
        System.out.println(small(letters, target));
    }

    static char small(char[] letters , char target){
            int start = 0;
            int end = letters.length - 1;
    
            while (start <= end) {
                int mid = start + (end - start)/2;
                
                if (target < letters[mid]) {
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
        }
        return letters[start % letters.length];
    }
}


