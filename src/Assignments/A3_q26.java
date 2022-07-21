package Assignments;

import java.util.Scanner;

public class A3_q26 {
    //to take input till 0 and print the largest number
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int largest = 0;
        while (true){
            int a = input.nextInt();
            if (a > largest){
                largest = a;
            }
            if (a == 0){
                System.out.println("The largest number is " + largest);
                break;
            }
        }
    }
}
