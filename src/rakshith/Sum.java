package rakshith;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1 = input.nextInt();
        int n2 = input.nextInt();
        int n3 = n1 + n2;
        System.out.println("The sum of two numbers is " + n3);
    }
}
