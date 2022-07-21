package Assignments;

import java.util.Scanner;

public class A3_q4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of a: ");
        int a = input.nextInt();
        int area = (int) Math.pow(a, 2) / 4;
        System.out.println(area);
    }
}
