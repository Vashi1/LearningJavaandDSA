package Assignments.intemediate3;

import java.util.Scanner;

public class Q3 {
    // to calculate average of n numbers
    public static void main(String[] args) {
        int n = 0;
        int sum = 0;
        Scanner input = new Scanner(System.in);
        while (true){
            int a = input.nextInt();
            sum += n;
            if (a == 0) {
                int avg = sum / n;
                System.out.println("The average of the numbers is " + avg);
                break;
            }
            n++;
        }
    }
}
