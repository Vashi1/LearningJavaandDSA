package Assignments;

import java.util.Scanner;

public class A3_q1 {
    public static void main(String[] args) {
        //Q1 area of circle
        Scanner input = new Scanner(System.in);
        float r = input.nextFloat();
        float pi = 3.14f;
        float area = (float) (pi * Math.pow(r, 2));
        System.out.println("The area is " + area);
    }
}
