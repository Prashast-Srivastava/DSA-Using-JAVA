import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        for(int i = 100; i < 1000;i++){
            if(isArmstrong(i)){
                System.out.println(i);
            }
        }
    }

    static boolean isArmstrong(int n){
        int originalNum = n;
        int sum = 0;
        while (n > 0) {
            int rem = n % 10;
            n = n/10;
            int cube = rem*rem*rem;
            sum += cube;

        }
        return sum == originalNum;
    }
}

