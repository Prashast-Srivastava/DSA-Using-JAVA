public class Method_overloading {
    public static void main(String[] args) {
        fun(67);
        fun("Prashast");
    }

    private static void fun(String Name) {
        System.out.println(Name);
    }

    private static void fun(int i) {
        System.out.println(i);
    }
}

