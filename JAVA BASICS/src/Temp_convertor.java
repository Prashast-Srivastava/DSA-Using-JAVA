import java.util.Scanner;

public class Temp_convertor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter the temperatue in C: ");
        float tempC = in.nextFloat();
        float tempF = (tempC*9/5) + 32;
        System.out.print(tempF);
    }
}
