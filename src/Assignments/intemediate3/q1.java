package Assignments.intemediate3;

import java.util.Scanner;

public class q1 {
    //to write a factorial program in java
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1 = input.nextInt();
        int fact = 1;
        if (n1 == 0){
            fact = 0;
        }
        for (int i = 1; i <= n1; i++){
            fact *= i;
        }
        System.out.println("The value of factorial is: " + fact);
    }
}
