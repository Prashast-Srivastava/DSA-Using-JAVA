public class VarArgsExa{
    public static void main(String[] args) {
        showInfo("Alice", 95, 88, 76);
        showInfo("Bob");
    }
    static void showInfo(String name, int... scores) {
        System.out.println("Name: " + name);
        for (int score : scores) {
            System.out.println("Score: " + score);
        }
    }
}
 
