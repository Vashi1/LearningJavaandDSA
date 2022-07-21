package Assignments;

import java.util.Scanner;

public class A1_q9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1 = input.nextInt();
        int n2 = input.nextInt();
        for (int i = n1; i <= n2; i++) {
//            System.out.println("check");
            int sum = 0;
            int t = i;
            while (t != 0){
                int temp = t % 10;
                sum += Math.pow(temp, 3);
                t = t / 10;
           }
           if (sum == i){
               System.out.println(i + " Is an armstrong number");
           }
        }
    }
}
