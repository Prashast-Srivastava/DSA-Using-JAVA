
public class Typecasting {
    public static void main(String[] args) {
        
    
    // Scanner input = new Scanner(System.in);
    // float num = input.nextFloat();
    // System.out.println(num);
    
 // explicit or narrow conversion   
    // int num = (int)(65.877f);
    // System.out.println(num);
// automatic type promotion in expp
    //int a = 257;
    //byte b = (byte)(a);// 257 % 256 = 1
    //System.out.println(b);

    // byte a = 40;
    // byte b = 50;
    // byte c = 100;
    // int d = a*b/c;
    // System.out.println(d);

    // ASCII Value
    // int number = 'A';
    // System.out.println(number);

    byte b = 42;
    char c = 'c';
    short s = 1024;
    int i = 5000;
    float f = 5.676f;
    double d = 0.1234;
    double result = ((f*b)+(i/c)-(d-s));
    System.out.println((f*b)+" "+(i/c)+" "+(d-s));
    System.out.println(result);
    }
}
