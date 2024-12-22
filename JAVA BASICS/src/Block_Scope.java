public class Block_Scope {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        {
            // int a =88;          //already initilised outside the block in same method hence u cannot initialise again
            a = 100;              // reassign the original reference variable to some other value.
            System.out.println(a);
            int c = 99;            // values initialised in this block will remain in this block only.
                                  // u cannot use c outside this block but u can reintialise the c 
        }
        System.out.println(a);
        int c = 190;
        System.out.println(c);
    }
}
