package Assignments;

import java.sql.SQLOutput;
import java.util.Scanner;

public class A3_q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float b = input.nextFloat();
        float h = input.nextFloat();
        float area = (float) 1/2 * b * h;
        System.out.println("The area of the triangle is " + area);
    }
}
