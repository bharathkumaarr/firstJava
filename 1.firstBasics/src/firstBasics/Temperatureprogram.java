package firstBasics;

import java.util.Scanner;

public class Temperatureprogram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter your temperature in celsius: ");
        double c = in.nextDouble();
        double resultTemp = (1.8*c) + 32;
        System.out.println("result temperature in fahrenheit: " + (float)(resultTemp));

    }
}
