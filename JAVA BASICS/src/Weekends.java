import java.util.Scanner;

public class Weekends {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter no(1-7) for days: ");
        int day = in.nextInt();
        switch(day){
            case 1, 2, 3, 4, 5 -> System.out.println("Weekdays");
            case 6, 7 -> System.out.println("Weekends");
            default -> System.out.println("enter valid day!!!");
        }
    }
}
