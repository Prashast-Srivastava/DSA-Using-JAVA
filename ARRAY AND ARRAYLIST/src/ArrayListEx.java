import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEx {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> List = new ArrayList<>(10);
        // List.add(11);
        // List.add(23);
        // List.add(44);
        // List.add(787);
        // System.out.println(List.contains(11));

        // List.set(1, 22);

        // List.remove(2);

        // System.out.println(List);

        for (int i = 0; i < 5; i++) {
            List.add(in.nextInt());
        }

        for (int i = 0; i < 5; i++) {
            System.out.println(List.get(i));
        }

    }
}
