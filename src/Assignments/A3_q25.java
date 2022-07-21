package Assignments;

import java.util.Scanner;

public class A3_q25 {
    // to take numbers till 0 is entered and print sum
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        while (true){
            int a = input.nextInt();
            sum += a;
            if (a == 0){
                System.out.println("The sum of the numbers is " + sum);
                break;
            }
        }
    }
}
