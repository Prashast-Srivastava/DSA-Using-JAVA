public class Shadow {
    static int x = 90;   // it is shadowed in line no.- 5
    public static void main(String[] args) {
        System.out.println(x);
        int x = 54;   // in this line class variable x is shadowed
        System.out.println(x);
    }
}
