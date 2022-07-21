package functions_code;

import java.util.Scanner;

public class func1 {
    public static void main(String[] args) {
    sum();
    }
    static void sum(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int n1 = input.nextInt();
        System.out.println("Enter the second number: ");
        int n2 = input.nextInt();
        int n3 = n1 + n2;
        System.out.println("The sum is " + n3);

    }
}
