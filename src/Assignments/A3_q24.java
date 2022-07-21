package Assignments;

import java.util.Scanner;

public class A3_q24 {
    //to print all the factors of a number
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n1 = input.nextInt();
        System.out.println("The factors of " + n1 + " are: ");
        for (int i = 1; i <= n1; i++){
            if (n1 % i == 0){
                System.out.println(i);
            }
        }
    }
}
