public class Shadowing {
    static int x = 90;   // this variable x is a class variable 
    public static void main(String[] args) {
        System.out.println(x);    // variable x is defined inside the whole code
        num();
    }
    static void num() {
        System.out.println(x);    // this x variable can be called anywhere inside the public class block 
    }
}

