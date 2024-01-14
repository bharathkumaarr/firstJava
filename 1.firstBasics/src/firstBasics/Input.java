package firstBasics;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("your input: ");
//        int rollno = input.nextInt();
//        System.out.println("your roll is " + rollno);

//        int a = 34_000_000;
//        System.out.println(a);

        String newstring = input.nextLine();
        System.out.println(newstring);
    }
}
