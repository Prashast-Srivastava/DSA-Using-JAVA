import java.util.Scanner;

public class Sum_method{
    public static void main(String[] args) {
        int ans = sum3(3,4);
        System.err.println(ans);
    }

    static int sum2(){
        Scanner in = new Scanner(System.in);
        System.out.print("enter 1st no.:");
        int num1 = in.nextInt();
        System.out.print("enter 2nd no.:");
        int num2 = in.nextInt();
        int sum = num1+num2;
        return sum;
    }


    static int sum3(int a , int b){
        int sum = a + b;
        return sum;
    }

    static void sum(){
        Scanner in = new Scanner(System.in);
        System.out.print("enter 1st no.:");
        int num1 = in.nextInt();
        System.out.print("enter 2nd no.:");
        int num2 = in.nextInt();
        int sum = num1+num2;
        System.out.println(sum);
    }
}