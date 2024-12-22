import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter youe name: ");
        String name = in.next();
        String personalised = mygreet(name);
        System.out.println(personalised);
        
    }

    static String mygreet(String name) {
        String message = "hello" + name;
        return message;
    }

    static String greet(){
        String greeting = "how are you!!";
        return greeting;

    }

    static void greeting(){
        System.out.println("hello world");
    }
}
