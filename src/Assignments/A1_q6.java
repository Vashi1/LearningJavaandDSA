package Assignments;

import java.util.Scanner;

public class A1_q6 {
    //to convert rupees to dollars
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value in rupees: ");
        int r = input.nextInt();
        float dollar = 80.75f;
        float cover = (float) r / dollar;
        System.out.println("The rate in dollars is " + cover);

    }
}
