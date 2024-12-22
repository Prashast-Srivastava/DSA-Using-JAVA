// nested switch case

import java.util.Scanner;

public class Nested {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter employee id no.: ");
        int empl_no = in.nextInt();
        String department = in.next();

        switch(empl_no){
            case 1 :
            System.out.println("Prashast Srivastava");
            break;
            case 2 :
            System.out.println("Priyanshu Ranjan");
            break;
            case 3:
            System.out.println("entered employee id no is 3!!!");
            switch (department) {
                case "IT" -> System.out.println("IT");
                case "Cyber Secruity" -> System.out.println("Cyber Secruity");
                default -> {
                }
            }
            default:
                break;
        }
    }
}
