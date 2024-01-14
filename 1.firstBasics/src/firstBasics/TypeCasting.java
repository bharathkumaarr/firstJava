package firstBasics;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        // automatic type casting
        Scanner input = new Scanner(System.in);
//        float num = input.nextInt();
//        System.out.println(num);

        // 1. two types should be compatible
        // 2. destination type > source type

        // type casting - converting incompatible types (int --> float)
        int num = (int)(45.2321);
        System.out.println(num);

        // automatic type promotion in expressions
        int a = 257;
        byte b = (byte)(a);
        System.out.println(b); // we get 1 because the size of byte type is just 256

        int c = 267;
        byte d = (byte)(c);
        System.out.println(d);

//        byte x = 40;
//        x = x*4; // gives error because the mathematical operations performed are converted into int, so here the result can not be stored in byte datatype


        int y = 'a';
        System.out.println(y); // gives ascii value of 'a'. that is 97

        System.out.println("नमस्ते"); // similarly because of unicode values

        //RULES for type promotion
//        1. all the byte, short, char values are promoted to integer
//        2. if any one operands is long, the whole exp converts to long
//        3. if float, whole to float
//        4. double , entire exp to double
    }
}
