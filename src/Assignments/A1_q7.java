package Assignments;

import java.util.Scanner;

public class A1_q7 {
    //to calculate fibonacci numbers
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int n1 = 0;
        int n2 = 1;
        System.out.println(n1);
        System.out.println(n2);
        for(int i = 2; i < n; i++){
//            int temp = n1;
            int n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.println(n2);
        }
    }
}
