package Assignments;


import java.util.Scanner;

public class A1_q1 {
    public static void main(String[] args) {
        //To check whether a user input number is odd or even
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int a = input.nextInt();
        if (a % 2 == 0){
            System.out.println("The number is even.");
        }
        else{
            System.out.println("The number is odd.");
        }
    }
}