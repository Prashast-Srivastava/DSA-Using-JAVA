import java.util.Scanner;

public class Weekdays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter no(1-7) for days: ");
        int day = in.nextInt();
        switch(day){
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("enter valid day!!!");
        }
    }
}
