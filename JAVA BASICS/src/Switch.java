import java.util.Scanner;

public class Switch{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter a fruit: ");
        String fruits = in.next();

        // switch(fruits){
        //     case "Mango":
        //         System.out.print("King of the fruits");
        //         break;
         
        //     case "Apple":
        //         System.out.print("REd fruit");
        //         break;
            
        //     case "Orange":
        //         System.out.print("Round fruit");
        //         break;
            
        //     case "Grapes":
        //         System.out.print("Small fruit");
        //         break;

        //     default:
        //         System.out.print("enter valid fruit");
        // }



        switch(fruits){
            case "Mango" -> System.out.print("King of the fruits");
            case "Apple" -> System.out.print("REd fruit");
            case "Orange" -> System.out.print("Round fruit"); 
            case "Grapes" -> System.out.print("Small fruit");
            default -> System.out.print("enter valid fruit");
        }
    }
}