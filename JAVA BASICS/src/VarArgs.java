public class VarArgs{
    public static void printNumbers(int... numbers) {
        for (int number : numbers) {
            System.out.println(number);
        }
    }

    public static void main(String[] args) {
        printNumbers(1, 2, 3, 4);  // Passing multiple arguments
        printNumbers(5);           // Passing a single argument
        printNumbers();            // Passing no argument
    }
}

