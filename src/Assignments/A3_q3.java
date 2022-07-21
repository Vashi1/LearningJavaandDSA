package Assignments;

import java.util.Scanner;

public class A3_q3 {
    public static void main(String[] args) {
        //area of a rectangle
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length: ");
        int l = input.nextInt();
        System.out.println("Enter the breadth: ");
        int b = input.nextInt();
        int area = l * b;
        System.out.println("The area of the rectangle is " + area);
    }
}
