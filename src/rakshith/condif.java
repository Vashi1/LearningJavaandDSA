package rakshith;

import java.util.Scanner;

public class condif {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int salary = input.nextInt();
        if (salary > 10000){
            salary += 2000;
        }
        else{
            salary = 40000;
        }
        System.out.println("The salary is " + salary);
    }
}
