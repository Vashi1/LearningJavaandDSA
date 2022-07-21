package Assignments;

import java.util.Scanner;

public class A1_q3 {
    //to calculate SI
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int p, r, t;
        System.out.println("Enter the Principle");
        p = input.nextInt();
        System.out.println("Enter the Rate of Interest");
        r = input.nextInt();
        System.out.println("Enter the time in years");
        t = input.nextInt();
        float si = (float) (p * r * t) / 100;
        System.out.println("The Si is " + si);
    }
}
